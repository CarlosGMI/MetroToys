package Codigo;
import static java.lang.Thread.sleep;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Productor extends Thread
{
   
    private Almacen buffer;
    private Semaphore semaBufferNeu;
    private Semaphore semaProducExcluN;
    private Semaphore semaEnsambladorRuedaN;
  
    
    private Semaphore semaBufferBuje;
    private Semaphore semaProducExcluB;
    private Semaphore semaEnsambladorRuedaB;
   
    
    private Semaphore semaBufferMarco;
    private Semaphore semaProducExcluM;
    private Semaphore semaEnsambladorM;
    private JLabel cantidadBujes, cantidadMarcos, cantidadNeum;
    private Neumatico n;
    private Buje b;
    private Marco m;
    private int objeto,idM, idN,idB;
    private boolean infM=true,infN=true,infB=true,DetReaM=false,DetReaB=false,DetReaN=false;
    private JTextArea textoMarco, textoNeuma, TextoBuje;
    
    public Productor(Almacen buffer, Semaphore semaBufferNeu, Semaphore semaProducExcluN, Semaphore semaEnsambladorRuedaN, Neumatico n, int objeto,int idN,JTextArea textoNeuma,JLabel cantidadBujes, JLabel cantidadMarcos,JLabel cantidadNeum) {
        this.buffer = buffer;
        this.semaBufferNeu = semaBufferNeu;
        this.semaProducExcluN = semaProducExcluN;
        this.semaEnsambladorRuedaN = semaEnsambladorRuedaN;
        this.cantidadBujes=cantidadBujes;
        this.cantidadMarcos=cantidadMarcos;
        this.cantidadNeum=cantidadNeum;
        this.n = n;
        this.objeto = objeto;
        this.idN=idN;
        this.textoNeuma=textoNeuma;
    }

    public Productor(Almacen buffer, Semaphore semaBufferBuje, Semaphore semaProducExcluB, Semaphore semaEnsambladorRuedaB, Buje b, int objeto, int idB, JTextArea TextoBuje,JLabel cantidadBujes, JLabel cantidadMarcos,JLabel cantidadNeum) {
        this.buffer = buffer;
        this.semaBufferBuje = semaBufferBuje;
        this.semaProducExcluB = semaProducExcluB;
        this.semaEnsambladorRuedaB = semaEnsambladorRuedaB;
        this.cantidadBujes=cantidadBujes;
        this.cantidadMarcos=cantidadMarcos;
        this.cantidadNeum=cantidadNeum;
        this.b = b;
        this.objeto = objeto;
        this.idB=idB;
        this.TextoBuje=TextoBuje;
    }

    public Productor(Almacen buffer, Semaphore semaBufferMarco, Semaphore semaProducExcluM, Semaphore semaEnsambladorM, Marco m, int objeto, int idM, JTextArea textoMarco,JLabel cantidadBujes, JLabel cantidadMarcos,JLabel cantidadNeum) {
        this.buffer = buffer;
        this.semaBufferMarco = semaBufferMarco;
        this.semaProducExcluM = semaProducExcluM;
        this.cantidadBujes=cantidadBujes;
        this.cantidadMarcos=cantidadMarcos;
        this.cantidadNeum=cantidadNeum;
        this.semaEnsambladorM = semaEnsambladorM;
        this.m = m;
        this.objeto = objeto;
        this.idM=idM;
        this.textoMarco=textoMarco;
    }
    /*
    La variable int Objeto su objetivo es indicar que va a producir.
    Neumatico=1
    Buje=2
    Marco=3
    */

    @Override
    public void run()
    {
        if(objeto==1)
        {
            while(infN)
            {
                
                try 
                {
                    while(DetReaN)
                    {
                        System.out.println(".");
                        //sleep(50*1000);
                    }
                    sleep(buffer.getDia()*1000);
                    this.semaBufferNeu.acquire();
                    this.semaProducExcluN.acquire();
                    buffer.CrearN(n);
                    this.textoNeuma.append("Productor "+idN+" produjo 1 neumático\n");
                    this.semaProducExcluN.release();
                    
                    
                    this.semaEnsambladorRuedaN.release();
                    
                    cantidadNeum.setText(Integer.toString(semaEnsambladorRuedaN.availablePermits()));
                } 
                catch (InterruptedException ex) 
                {
                    Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }   
        }
        else if(objeto==2)
        {
            while(infB)
            {
                try 
                {
                    while(DetReaB)
                    {
                        System.out.println(" ");
                        //sleep(50*1000);
                    }
                    sleep(buffer.getDia()*1000);
                    this.semaBufferBuje.acquire();
                    this.semaProducExcluB.acquire();
                    buffer.CrearB(b);
                    this.TextoBuje.append("Productor "+idB+" produjo 1 neumático\n");
                    this.semaProducExcluB.release();
                    
                    this.semaEnsambladorRuedaB.release();
                    
                    cantidadBujes.setText(Integer.toString(semaEnsambladorRuedaB.availablePermits()));
                } 
                catch (InterruptedException ex) 
                {
                    Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        else if(objeto==3)
        {
            while(infM)
            {
                try 
                {
                    while(DetReaM)
                    {
                        System.out.println(" ");
                        //sleep(50*1000);
                    }
                    sleep(buffer.getDia()*1000);
                    this.semaBufferMarco.acquire();
                    this.semaProducExcluM.acquire();
                    buffer.CrearM(m);
                    this.textoMarco.append("Productor "+idM+" produjo 1 neumático\n");
                    this.semaProducExcluM.release();
                    this.semaEnsambladorM.release();
                    cantidadMarcos.setText(Integer.toString(semaEnsambladorM.availablePermits()));
                } 
                catch (InterruptedException ex) 
                {
                    Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    public void DespedirNeumatico()
    {   
         infN=false;
    }
    public void DespedirBujes()
    {   
        infB=false;
    }
    public void DespedirMarco()
    {   
        infM=false;
    }
    public void DeteneNeumatico()
    {   
        DetReaN=true;
    }
    public void ReanudarNeumatico()
    {   
        DetReaN=false;
    }
   
    public void DeteneBuje()
    {   
        DetReaB=true;
    }
    public void ReanudarBuje()
    {   
        DetReaB=false;
    }
    public void DeteneMarco()
    {   
        DetReaM=true;
    }
    public void ReanudarMarco()
    {   
        DetReaM=false;
    }
    
}
