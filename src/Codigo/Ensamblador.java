package Codigo;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Ensamblador extends Thread
{
    private Almacen buffer;
    private Semaphore semaEnsambladorRueda;
    private Semaphore semaBufferRueda;
    private Semaphore semaRuedaExclu;
    private Semaphore semaBufferMarco;
    private Semaphore semaProducExcluM;
    private Semaphore semaEnsambladorM;
    private Semaphore semaCantidadBici;
    private Semaphore semaCantidadTrici;
    private Semaphore semaCantidadMAXB;
    private Semaphore semaCantidadMAXT;
    private int objeto,bicletasAProducir, triciclosAProducir,numTrab;
    private JTextArea textoBic, textoTri;
    private String idH;
    private boolean goBici = true, goTrici = true, DetReaBici=false, DetReaTrici=false;
    JLabel cantidadTriciclos, cantidadBicicletas;
    
    public Ensamblador(Almacen buffer, Semaphore semaEnsambladorRueda, Semaphore semaBufferRueda, Semaphore semaRuedaExclu, Semaphore semaBufferMarco, Semaphore semaProducExcluM, Semaphore semaEnsambladorM, int objeto, String idH, JTextArea textoBic, JTextArea textoTri, int bicletasAProducir, Semaphore semaCantidadBici, Semaphore semaCantidadTrici,int triciclosAProducir,int numTrab,Semaphore semaCantidadMAXB,Semaphore semaCantidadMAXT,JLabel cantidadTriciclos,JLabel cantidadBicicletas) 
    {
        this.buffer = buffer;
        this.semaEnsambladorRueda = semaEnsambladorRueda;
        this.semaBufferRueda = semaBufferRueda;
        this.semaRuedaExclu = semaRuedaExclu;
        this.semaBufferMarco = semaBufferMarco;
        this.semaProducExcluM = semaProducExcluM;
        this.semaEnsambladorM = semaEnsambladorM;
        this.semaCantidadBici=semaCantidadBici;
        this.objeto = objeto;
        this.idH = idH;
        this.numTrab=numTrab;
        this.textoBic = textoBic;
        this.textoTri = textoTri;
        this.bicletasAProducir=bicletasAProducir;
        this.semaCantidadTrici=semaCantidadTrici;
        this.triciclosAProducir=triciclosAProducir;
        this.semaCantidadMAXB=semaCantidadMAXB;
        this.semaCantidadMAXT=semaCantidadMAXT;
        this.cantidadTriciclos=cantidadTriciclos;
        this.cantidadBicicletas=cantidadBicicletas;
    }
    
    public void run()
    {
        while(true)
        {
            if(objeto==4)
            {
                try 
                {
                    this.semaCantidadMAXB.acquire();  //Controla el máximo de hilos a entrar
                    while(this.semaCantidadBici.availablePermits()<bicletasAProducir && goBici == true)
                    {
                        while(DetReaBici)
                        {
                            System.out.println(".");
                        }
                        
                        
                        this.semaEnsambladorRueda.acquire(2);
                        this.semaRuedaExclu.acquire();
                        this.buffer.sacarR(2); 
                        textoBic.append("El productor de "+idH+" "+numTrab+" ha tomado 2 ruedas\n");
                        this.semaRuedaExclu.release();
                        this.semaBufferRueda.release(2);
                        
                        
                        this.semaEnsambladorM.acquire();
                        this.semaProducExcluM.acquire();
                        this.buffer.sacarM(); 
                        textoBic.append("El productor de "+idH+" "+numTrab+" ha tomado 1 marco\n");
                        this.semaProducExcluM.release();
                        this.semaBufferMarco.release();
                       
                        
                        sleep((buffer.getDia()*2)*1000);
                        textoBic.append("El productor de "+idH+" "+numTrab+" ha ensamblado 1 bicicleta\n");
                     
                        buffer.setBiciEns(buffer.getBiciEns());
                        this.semaCantidadBici.release();//Cuenta Bici Creada
                        cantidadBicicletas.setText(Integer.toString(buffer.getBiciEns()));
                        
                        
                        if(buffer.getBiciEns() == bicletasAProducir)
                        {
                            buffer.setAlertaBici(true);
                            buffer.setHilosTrici(true);
                        }
                    }
                    if (this.semaCantidadBici.availablePermits()>=bicletasAProducir) 
                    {
                        objeto=5;
                    }
                } 
                catch (InterruptedException ex) 
                {
                    Logger.getLogger(Ensamblador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            else if(objeto==5)
            {
                try 
                {
                    this.semaCantidadMAXT.acquire(); //Controla el máximo de hilos a entrar
                    while(this.semaCantidadTrici.availablePermits()<triciclosAProducir && goTrici == true)
                    {
                        while(DetReaTrici)
                        {
                            System.out.println(".");
                        }
                        
                        this.semaEnsambladorRueda.acquire(3);
                        this.semaRuedaExclu.acquire();
                        this.buffer.sacarR(3); 
                        textoTri.append("El productor de "+idH+" "+numTrab+" ha tomado 3 ruedas\n");
                        this.semaRuedaExclu.release();
                        this.semaBufferRueda.release(3);
                        
                        
                        this.semaEnsambladorM.acquire();
                        this.semaProducExcluM.acquire();
                        this.buffer.sacarM(); 
                        textoTri.append("El productor de "+idH+" "+numTrab+" ha tomado 1 marco\n");
                        this.semaProducExcluM.release();
                        this.semaBufferMarco.release();
                        
                        
                        sleep((buffer.getDia()*3)*1000);
                       
                        buffer.setTriciEns(buffer.getTriciEns());
                        this.semaCantidadTrici.release();//cuenta los Trici Creados
                        cantidadTriciclos.setText(Integer.toString(buffer.getTriciEns()));
                        textoTri.append("El productor de "+idH+" "+numTrab+" ha ensamblado 1 triciclo\n");
                        
                        if(buffer.getTriciEns() == triciclosAProducir)
                        {
                            buffer.setAlertaTrici(true);
                        }
                    }
                    if(this.semaCantidadTrici.availablePermits()>=triciclosAProducir) 
                    {
                        objeto=4;
                    }
                } 
                catch (InterruptedException ex) 
                {
                    Logger.getLogger(Ensamblador.class.getName()).log(Level.SEVERE, null, ex);
                }
            } 
        }
    }
    
    public void pausarEnsBici()
    {
        goBici = false;
    }
    
    public void pausarEnsTrici()
    {
        goTrici = false;
    }
    
    public void DeteneBici()
    {   
        DetReaBici=true;
    }
    public void ReanudarBici()
    {   
        DetReaBici=false;
    }
    
    public void DeteneTrici()
    {   
        DetReaTrici=true;
    }
    public void ReanudarTrici()
    {   
        DetReaTrici=false;
    }
    
}
