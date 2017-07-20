package Codigo;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class EnsambladorRueda extends Thread
{
    private Almacen buffer;
    private Semaphore semaBufferNeu;
    private Semaphore semaProducExcluN;
    private Semaphore semaEnsambladorRuedaN;
    private Semaphore semaBufferBuje;
    private Semaphore semaProducExcluB;
    private Semaphore semaEnsambladorRuedaB;
    private Semaphore semaEnsambladorRueda;
    private Semaphore semaBufferRueda;
    private Semaphore semaRuedaExclu;
    private JTextArea textoRueda;
    private JLabel cantidadRuedas;
    private Rueda r;
    int idR, dia;
    private boolean infR=true,DetReaRueda=false;

    public EnsambladorRueda(Almacen buffer, Semaphore semaBufferNeu, Semaphore semaProducExcluN, Semaphore semaEnsambladorRuedaN, Semaphore semaBufferBuje, Semaphore semaProducExcluB, Semaphore semaEnsambladorRuedaB, JTextArea textoRueda, int idR, int dia,Semaphore semaEnsambladorRueda, Semaphore semaBufferRueda, Semaphore semaRuedaExclu, Rueda r,JLabel cantidadRuedas) 
    {
        this.buffer = buffer;
        this.semaBufferNeu = semaBufferNeu;
        this.semaProducExcluN = semaProducExcluN;
        this.semaEnsambladorRuedaN = semaEnsambladorRuedaN;
        this.semaBufferBuje = semaBufferBuje;
        this.semaProducExcluB = semaProducExcluB;
        this.semaEnsambladorRuedaB = semaEnsambladorRuedaB;
        this.textoRueda = textoRueda;
        this.idR = idR;
        this.dia=dia;
        this.semaEnsambladorRueda=semaEnsambladorRueda;
        this.cantidadRuedas=cantidadRuedas;
        this.semaRuedaExclu=semaRuedaExclu;
        this.semaBufferRueda=semaBufferRueda;
        this.r=r;
    }
    
    @Override
    public void run()
    {
        while(infR)
        {
            while(DetReaRueda)
            {
                System.out.println(".");
            }
            try 
            {
                
                this.semaEnsambladorRuedaN.acquire();
                this.semaProducExcluN.acquire();
                this.buffer.SacarNeumatico();
                this.semaProducExcluN.release();
                this.semaBufferNeu.release();
                //textoRueda.append("Productor "+idR+" ha extraído un neumático\n");
                 
                this.semaEnsambladorRuedaB.acquire();
                this.semaProducExcluB.acquire();
                this.buffer.SacarBuje();
                this.semaProducExcluB.release();
                this.semaBufferBuje.release();
                //textoRueda.append("Productor "+idR+" ha extraído un buje\n");
                sleep((buffer.getDia()/2)*1000);
                this.semaBufferRueda.acquire();
                this.semaRuedaExclu.acquire();
                this.buffer.CrearR(r);
                textoRueda.append("Se produjo una rueda por el ensamblador: "+idR+"\n");
                this.semaRuedaExclu.release();
                
                
                this.semaEnsambladorRueda.release();
                
                cantidadRuedas.setText(Integer.toString(semaEnsambladorRueda.availablePermits()));
            } 
            catch (InterruptedException ex) 
            {
                Logger.getLogger(EnsambladorRueda.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void DeteneEnsamblajeRuedas()
    {   
        infR=false;
    }
    public void DeteneRueda()
    {   
        DetReaRueda=true;
    }
    public void ReanudarRueda()
    {   
        DetReaRueda=false;
    }
}
