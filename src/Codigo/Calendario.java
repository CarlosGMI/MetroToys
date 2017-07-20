package Codigo;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class Calendario extends Thread
{
    private int tipo, dia, diasTranscurridos, diasTranscurridosBici, diasTranscurridosTrici;
    private boolean alertaBici = false;
    private Almacen buffer;
    private JLabel diasTotales, diasBici, diasTrici;
    
    public Calendario(int dia, int tipo, Almacen buffer,JLabel diasTotales, JLabel diasBici, JLabel diasTrici)
    {
        this.dia = dia;
        this.tipo = tipo;
        this.buffer = buffer;
        this.diasTotales = diasTotales;
        this.diasBici = diasBici;
        this.diasTrici = diasTrici;
    }
    
    @Override
    public void run()
    {
        while(true)
        {
            if(tipo == 0)
            {
                try 
                {
                    sleep(dia*1000);
                } 
                catch (InterruptedException ex) 
                {
                    Logger.getLogger(Calendario.class.getName()).log(Level.SEVERE, null, ex);
                }
                diasTranscurridos++;
                diasTotales.setText(String.valueOf(diasTranscurridos));
                //System.out.println("DÍAS TOTALES: "+diasTranscurridos);
            }
            else if(tipo == 1 || buffer.isHilosBici() == true)
            {
                while(buffer.isAlertaBici() == false)
                {
                    try 
                    {
                        sleep(dia*1000);
                    } 
                    catch (InterruptedException ex) 
                    {
                        Logger.getLogger(Calendario.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    diasTranscurridosBici++;
                    diasBici.setText(String.valueOf(diasTranscurridosBici));
                    //System.out.println("DÍAS BICICLETA: "+diasTranscurridosBici);
                }
                tipo=2;
            }
            else if(tipo == 2)
            {
                while(buffer.isAlertaTrici() == false || buffer.isHilosTrici() == true)
                {
                    try 
                    {
                        sleep(dia*1000);
                    } 
                    catch (InterruptedException ex) 
                    {
                        Logger.getLogger(Calendario.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    diasTranscurridosTrici++;
                    diasTrici.setText(String.valueOf(diasTranscurridosTrici));
                    //System.out.println("DÍAS TRICICLO: "+diasTranscurridosTrici);
                }
                tipo=1;
            }
        }
    }
    
    public void alertaBici(boolean alerta)
    {
        alertaBici = true;
    }

    public int getDia()
    {
        return dia;
    }

    public void setDia(int dia) 
    {
        this.dia = dia;
    }

    public int getDiasTranscurridos() {
        return diasTranscurridos;
    }

    public void setDiasTranscurridos(int diasTranscurridos) {
        this.diasTranscurridos = diasTranscurridos;
    }

    public int getDiasTranscurridosBici() {
        return diasTranscurridosBici;
    }

    public void setDiasTranscurridosBici(int diasTranscurridosBici) {
        this.diasTranscurridosBici = diasTranscurridosBici+2;
        System.out.println("Días: "+diasTranscurridosBici);
    }

    public int getDiasTranscurridosTrici() {
        return diasTranscurridosTrici;
    }

    public void setDiasTranscurridosTrici(int diasTranscurridosTrici) {
        this.diasTranscurridosTrici = diasTranscurridosTrici;
    }
}
