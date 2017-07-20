package Codigo;

public class Almacen 
{
    private Neumatico[] neumaticos;
    private Buje[] bujes;
    private Rueda[] ruedas;
    private Marco[] marcos;
    private int crearN, sacarN, crearB, sacarB, crearM, sacarM, dia, crearR, sacarR, biciEns, triciEns;
    private boolean alertaBici = false, alertaTrici = false, hilosBici = false, hilosTrici = false;

    public Almacen(int maxN, int maxB, int maxR, int maxM, int dia)
    {
        this.neumaticos = new Neumatico[maxN];
        this.bujes = new Buje[maxB];
        this.ruedas = new Rueda[maxR];
        this.marcos = new Marco[maxM];
        crearN=0;
        sacarN=0;
        crearB=0;
        sacarB=0;
        crearM=0;
        sacarM=0;
        crearR=0;
        sacarR=0;
        this.dia=dia;
    }
    
    public void alertaBici(boolean alerta)
    {
        this.setAlertaBici(alerta);
    }

    public boolean isAlertaBici() 
    {
        return alertaBici;
    }

    public boolean isAlertaTrici() 
    {
        return alertaTrici;
    }

    public void setAlertaTrici(boolean alertaTrici) 
    {
        this.alertaTrici = alertaTrici;
    }

    public void setAlertaBici(boolean alertaBici)
    {
        this.alertaBici = alertaBici;
    }

    public boolean isHilosBici() 
    {
        return hilosBici;
    }

    public void setHilosBici(boolean hilosBici) 
    {
        System.out.println("lakslakslkals");
        this.hilosBici = hilosBici;
    }

    public boolean isHilosTrici() 
    {
        return hilosTrici;
    }

    public void setHilosTrici(boolean hilosTrici) 
    {
        this.hilosTrici = hilosTrici;
    }

    public int getBiciEns()
    {
        return biciEns;
    }

    public void setBiciEns(int biciEns) 
    {
        this.biciEns = biciEns+1;
    }

    public int getTriciEns() 
    {
        return triciEns;
    }

    public void setTriciEns(int triciEns) 
    {
        this.triciEns = triciEns+1;
    }
     
     
     public void sacarM()
    {
        this.marcos[this.sacarM]= null;
        this.sacarM=(sacarM+1)%this.marcos.length;
    }
     
    public void SacarNeumatico()
    {
       this.neumaticos[this.sacarN]= null;
       this.sacarN=(sacarN+1)%this.neumaticos.length;
    }
     public void SacarBuje()
    {
       this.bujes[this.sacarB]= null;
       this.sacarB=(sacarB+1)%this.bujes.length;
    }
     
    public void sacarR(int x)
    {   
        for ( int i = 0; i < x; i++) 
        {
            this.ruedas[this.sacarR]= null;
            this.sacarR=(sacarR+1)%this.ruedas.length;
        }
    }
     
    public void CrearR(Rueda r)
    {
        this.ruedas[this.crearR]= r;
        this.crearR=(crearR+1)%this.ruedas.length;
    }
    
    public void CrearN(Neumatico n)
    {
        this.neumaticos[this.crearN]= n;
        this.crearN=(crearN+1)%this.neumaticos.length;
    }
    
    public void CrearB(Buje b)
    {
        this.bujes[this.crearB]= b;
        this.crearB=(crearB+1)%this.bujes.length;
    }
    
    public void CrearM(Marco m)
    {
        this.marcos[this.crearM]= m;
        this.crearM=(crearM+1)%this.marcos.length;
    }

    public Neumatico[] getNeumaticos() 
    {
        return neumaticos;
    }

    public void setNeumaticos(Neumatico[] neumaticos) {
        this.neumaticos = neumaticos;
    }

    public Buje[] getBujes() {
        return bujes;
    }

    public void setBujes(Buje[] bujes) {
        this.bujes = bujes;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public Marco[] getMarcos() {
        return marcos;
    }

    public void setMarcos(Marco[] marcos) {
        this.marcos = marcos;
    }

    public int getDia() {
        return dia;
    }
    
    
    
    
    
}
