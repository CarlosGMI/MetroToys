package Codigo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class metroToys 
{
    private Neumatico n = new Neumatico();
    private Buje b = new Buje();
    private Marco m = new Marco();
    private Rueda r = new Rueda();
    private Almacen buffer;
    
    private Semaphore semaBufferNeu; //Semáforo de espacios vacíos en el buffer de neumáticos
    private Semaphore semaProducExcluN; //Semáforo de exclusión mutua de neumáticos
    private Semaphore semaEnsambladorRuedaN; //Semáforo de espacios llenos en el buffer de neumáticos
    
    private Semaphore semaBufferBuje; //Semáforo de espacios vacíos en el buffer de bujes
    private Semaphore semaProducExcluB; //Semáforo de exclusión mutua de bujes
    private Semaphore semaEnsambladorRuedaB; //Semáforo de espacios llenos en el buffer de bujes
    
    private Semaphore semaBufferMarco; //Semáforo de espacios vacíos en el buffer de marcos
    private Semaphore semaProducExcluM; //Semáforo de exclusión mutua de marcos
    private Semaphore semaEnsambladorM; //Semáforo de espacios llenos en el buffer de marcos
    
    private Semaphore semaEnsambladorRueda; //Semáforo de espacios vacíos en el buffer de ruedas
    private Semaphore semaBufferRueda; //Semáforos de exclusión mutua de ruedas
    private Semaphore semaRuedaExclu; //Semáforo de espacios llenos de ruedas
    
    private Semaphore semaCantidadBici; //Semáforo que controla la cantidad de bicicletas a producir
    private Semaphore semaCantidadTrici; //Semáforo que controla la cantidad de triciclos a producir
    private Semaphore semaCantidadMAXB; //Semáforo que controla cuántos son las bicicletas máximas que pueden pasar a la sección crítica
    private Semaphore semaCantidadMAXT; //Semáforo que controla cuántos son los triciclos máximos que pueden pasar a la sección crítica
    
    private ArrayList<Productor> productoresN; //Lista de productores de neumáticos
    private ArrayList<Productor> productoresB; //Lista de productores de bujes
    private ArrayList<Productor> productoresM; //Lista de productores de marcos
    private ArrayList<EnsambladorRueda> ensambladoresRueda; //Lista de productores/ensambladores de ruedas
    private ArrayList<Ensamblador> ensambladoresBici; //Lista de ensambladores de bicicletas
    private ArrayList<Ensamblador> ensambladoresTrici; //Lista de ensambladores de triciclos
    private Calendario[] calendario; //Vector de los diferentes hilos de calendario que existen
    
    public JLabel cantidadTriciclos, cantidadBicicletas, cantidadBujes, cantidadMarcos, cantidadNeum, cantidadRuedas, diasTotales, diasBici, diasTrici, cantidadProdNeum, cantidadProdBujes, cantidadProdMarcos, cantidadProdRuedas, cantidadEnsBici, cantidadEnsTrici;
    private JTextArea textoRueda, textoMarco, textoNeuma, TextoBuje, textoBic, textoTri;
    private int dia,MaxHB, bicletasAProducir, triciclosAProducir, prodNeum, prodBuje, prodRueda, prodMarco, ensRueda, ensBici, ensTrici; //Variables de validación en el TXT
    private int MaxHT,HNeuMAX,HBujeMAX, HMarcMAX, HRueMAX, i=0,o=0,p=0,a=0,s=0,d=0; //Cantidades máximas para validaciones e índices de productores y ensambladores
    private boolean BN=false,BB=false,BM=false,BR=false,BBi=false,BTr=false; //Booleans para validar producciones y ensamblajes activos
    
    
    public metroToys(JLabel cantidadProdNeum, JLabel cantidadProdBujes, JLabel cantidadProdMarcos, JLabel cantidadProdRuedas, JLabel cantidadEnsBici, JLabel cantidadEnsTrici, JTextArea eventosBicicletas, JTextArea eventosBujes, JTextArea eventosMarcos, JTextArea eventosNeumaticos, JTextArea eventosRuedas, JTextArea eventosTriciclos, JLabel cantidadTriciclos,JLabel cantidadBicicletas,JLabel cantidadBujes,JLabel cantidadMarcos,JLabel cantidadNeum,JLabel cantidadRuedas,JLabel diasTotales, JLabel diasBici, JLabel diasTrici) throws IOException
    {
        //Inicialización de la fábrica por archivo de texto
        this.inicializarFabrica();
        //Inicialización de labels con valores de productores en el TXT
        this.cantidadProdNeum = cantidadProdNeum;
        cantidadProdNeum.setText(String.valueOf(prodNeum));
        this.cantidadProdBujes = cantidadProdBujes;
        cantidadProdBujes.setText(String.valueOf(prodBuje));
        this.cantidadProdMarcos = cantidadProdMarcos;
        cantidadProdMarcos.setText(String.valueOf(prodMarco));
        this.cantidadProdRuedas = cantidadProdRuedas;
        cantidadProdRuedas.setText(String.valueOf(prodRueda));
        this.cantidadEnsBici = cantidadEnsBici;
        cantidadEnsBici.setText(String.valueOf(ensBici));
        this.cantidadEnsTrici = cantidadEnsTrici;
        cantidadEnsTrici.setText(String.valueOf(ensTrici));
        //Inicialización de semáforos
            //Semáforos de neumáticos
        semaBufferNeu = new Semaphore(n.getCantMaxNeumaticos());
        semaProducExcluN = new Semaphore(1);
        semaEnsambladorRuedaN= new Semaphore(0);
            //Semáforos de bujes
        semaBufferBuje = new Semaphore(b.getCantMaxBujes());
        semaProducExcluB= new Semaphore(1);
        semaEnsambladorRuedaB= new Semaphore(0);
            //Semáforos de marcos
        semaBufferMarco= new Semaphore(m.getMaxMarcos());
        semaProducExcluM= new Semaphore(1);
        semaEnsambladorM= new Semaphore(0);
            //Semáforos de ruedas
        semaEnsambladorRueda= new Semaphore(0);
        semaBufferRueda= new Semaphore(r.getCantMaxRueda());
        semaRuedaExclu= new Semaphore(1);
            //Semáforos de ensambladores
        semaCantidadBici=new Semaphore(0);
        semaCantidadTrici=new Semaphore(0);
        semaCantidadMAXB=new Semaphore(MaxHB);
        semaCantidadMAXT=new Semaphore(MaxHT);
        //JLabels y JTextAreas
        this.textoRueda=eventosRuedas;
        this.textoNeuma=eventosNeumaticos;
        this.textoMarco=eventosMarcos;
        this.textoTri=eventosTriciclos;
        this.TextoBuje=eventosBujes;
        this.textoBic=eventosBicicletas;
        this.cantidadTriciclos=cantidadTriciclos;
        this.cantidadBicicletas=cantidadBicicletas;
        this.cantidadBujes =cantidadBujes;
        this.cantidadMarcos=cantidadMarcos;
        this.cantidadNeum =cantidadNeum;
        this.cantidadRuedas=cantidadRuedas;
        this.diasTotales = diasTotales;
        this.diasBici = diasBici;
        this.diasTrici = diasTrici;
        //Inicialización del calendario
        calendario = new Calendario[3];
        this.llenarCalendario(dia,buffer);
        calendario[0].start();
    }
   
    public void llenarCalendario(int dia, Almacen alm)
    {
        for(int i=0;i<calendario.length;i++)
        {
            calendario[i] = new Calendario(dia,i,alm,diasTotales, diasBici, diasTrici);
        }
    }
    
    public void contrarNeumatico()
    {
        if(BN)
        {
           if (i<HNeuMAX) 
           {
              textoNeuma.append("Se ha contratado al productor: "+(i+1)+"\n");
              productoresN.add(i ,new Productor(buffer,semaBufferNeu,semaProducExcluN,semaEnsambladorRuedaN,n,1,i+1,this.textoNeuma,cantidadBujes, cantidadMarcos, cantidadNeum));
              cantidadProdNeum.setText(String.valueOf(productoresN.size()));
              productoresN.get(i).start();
              i++;
           }
           else
           {
               textoNeuma.append("No se puede contratar mas productores\nEl máximo es de: "+HNeuMAX+"\n");
           }
        }
        else
        {
            textoNeuma.append("No se ha iniciado la producción\n");
        }
    }
    
    public void despedirNeumatico()
    {
        if(i>0)
        {
           i--;
           productoresN.get(i).DespedirNeumatico();
           productoresN.remove(i);
           cantidadProdNeum.setText(String.valueOf(productoresN.size()));
           textoNeuma.append("Se ha despedido al productor: "+(i+1)+"\n");
        }
       else
       {
           textoNeuma.append("No hay productores a despedir\n");
       }
    }
    
    public void iniciarHilosNeumnatico()
    {
        BN=true;
        while(i<prodNeum && prodNeum<=HNeuMAX)
        {
            productoresN.add(i ,new Productor(buffer,semaBufferNeu,semaProducExcluN,semaEnsambladorRuedaN,n,1,i+1,this.textoNeuma,cantidadBujes, cantidadMarcos, cantidadNeum));
            productoresN.get(i).start();
            i++;
        }
    }
    
    public void DetenerNeumatico()
    {
        for (int j = 0; j < productoresN.size(); j++) 
        {
            productoresN.get(j).DeteneNeumatico();
        }
    }
    
    public void ReanudarNeumatico()
    {
        for (int j = 0; j < productoresN.size(); j++) 
        {
            productoresN.get(j).ReanudarNeumatico();
        }
    }
    
    public void contrarBuje()
    {
        if(BB)
        {
            if (o<HBujeMAX) 
            {
                TextoBuje.append("Se ha contratado al productor: "+(o+1)+"\n");
                productoresB.add(o ,new Productor(buffer,semaBufferBuje,semaProducExcluB,semaEnsambladorRuedaB,b,2,o+1,this.TextoBuje,cantidadBujes, cantidadMarcos, cantidadNeum));
                cantidadProdBujes.setText(String.valueOf(productoresB.size()));
                productoresB.get(o).start();
                o++;
            }
            else
            {
                 TextoBuje.append("No se puede contratar mas productores\nEl máximo es de: "+HBujeMAX+"\n");
            }
        }
        else
        {
            TextoBuje.append("No se ha iniciado la producción\n");
        }
    }
 
    public void despedirBuje()
    {
        if(o>0)
        {
            o--;
            productoresB.get(o).DespedirBujes();
            productoresB.remove(o);
            cantidadProdBujes.setText(String.valueOf(productoresB.size()));
            TextoBuje.append("Se ha despedido al productor: "+(o+1)+"\n");
        }
        else
            TextoBuje.append("No hay productores a despedir\n");
    }
    
   public void iniciarHilosBuje()
   {
        BB=true;
        while(o< prodBuje)
        { 
            productoresB.add(o,new Productor(buffer,semaBufferBuje,semaProducExcluB,semaEnsambladorRuedaB,b,2,o+1,this.TextoBuje,cantidadBujes, cantidadMarcos, cantidadNeum));
            productoresB.get(o).start();
            o++;
        }
   }
    
    public void DetenerBuje()
    {
        for (int j = 0; j < productoresB.size(); j++) 
        {
            productoresB.get(j).DeteneBuje();
        }
    }
    public void ReanudarBuje()
    {
        for (int j = 0; j < productoresB.size(); j++) 
        {
            productoresB.get(j).ReanudarBuje();
        }
    }
    
    public void contrarMarco()
    {
        if(BM)
        {
            if (p<HMarcMAX) 
            {
                textoMarco.append("Se ha contratado al productor: "+(p+1)+"\n");
                productoresM.add(p,new Productor(buffer,semaBufferMarco,semaProducExcluM,semaEnsambladorM,m,3,p+1,this.textoMarco,cantidadBujes, cantidadMarcos, cantidadNeum));
                cantidadProdMarcos.setText(String.valueOf(productoresM.size()));
                productoresM.get(p).start();
                p++;
            }
            else
                textoMarco.append("No se puede contratar mas productores\nEl máximo es de: "+HMarcMAX+"\n");
        }
        else
            textoMarco.append("No se ha iniciado la producción\n");
    }
 
    public void despedirMarco()
    {
        if(p>0)
        {
            p--;
            productoresM.get(p).DespedirMarco();
            productoresM.remove(p);
            cantidadProdMarcos.setText(String.valueOf(productoresM.size()));
            textoMarco.append("Se ha despedido al productor: "+(p+1)+"\n");
        }
        else
            textoMarco.append("No hay productores a despedir\n");
    }
   
    public void iniciarHilosMarcos()
    {
        BM=true;
        while(p<prodMarco)
        { 
            productoresM.add(p,new Productor(buffer,semaBufferMarco,semaProducExcluM,semaEnsambladorM,m,3,p+1,this.textoMarco,cantidadBujes, cantidadMarcos, cantidadNeum));
            productoresM.get(p).start();
            p++;
        }
    }
  
    public void DetenerMarco()
    {
        for (int j = 0; j < productoresM.size(); j++) 
        {
            productoresM.get(j).DeteneMarco();
        }
    }
    
    public void ReanudarMarco()
    {
        for (int j = 0; j < productoresM.size(); j++) 
        {
            productoresM.get(j).ReanudarMarco();
        }
    }
    
    public void contratarRueda()
    {
        if(BR)
        {
            if (a<HRueMAX) 
            {
                textoRueda.append("Se ha contratado al productor: "+(a+1)+"\n");
                ensambladoresRueda.add(a,new EnsambladorRueda(buffer,semaBufferNeu,semaProducExcluN,semaEnsambladorRuedaN,semaBufferBuje,semaProducExcluB,semaEnsambladorRuedaB,textoRueda,a+1,dia, semaEnsambladorRueda, semaBufferRueda, semaRuedaExclu,r,cantidadRuedas));
                cantidadProdRuedas.setText(String.valueOf(ensambladoresRueda.size()));
                ensambladoresRueda.get(a).start();
                a++;
            }
            else
                textoRueda.append("No se puede contratar mas productores\nEl máximo es de: "+HRueMAX+"\n");
        }
        else
            textoRueda.append("No se ha iniciado la producción\n");
    }
 
    public void despedirRueda()
    {
        if(a>0)
        {
            a--;
            ensambladoresRueda.get(a).DeteneEnsamblajeRuedas();
            ensambladoresRueda.remove(a);
            cantidadProdRuedas.setText(String.valueOf(ensambladoresRueda.size()));
            textoRueda.append("Se ha despedido al productor: "+(a+1)+"\n");
        }
        else
            textoRueda.append("No hay productores a despedir\n");
    }
   
    public void iniciarHiloRueda()
    {
        BR=true;
        while(a<ensRueda)
        { 
            ensambladoresRueda.add(a,new EnsambladorRueda(buffer,semaBufferNeu,semaProducExcluN,semaEnsambladorRuedaN,semaBufferBuje,semaProducExcluB,semaEnsambladorRuedaB,textoRueda,a+1,dia, semaEnsambladorRueda, semaBufferRueda, semaRuedaExclu,r,cantidadRuedas));
            ensambladoresRueda.get(a).start();
            a++;
        }
    }
  
    public void DetenerRueda()
    {
        for (int j = 0; j < ensambladoresRueda.size(); j++)
        {
            ensambladoresRueda.get(j).DeteneRueda();
        }
    }
    
    public void ReanudarRueda()
    {
        for (int j = 0; j < ensambladoresRueda.size(); j++) 
        {
            ensambladoresRueda.get(j).ReanudarRueda();
        }
    }
    
    public void contratarBicicleta()
    {
        if(BBi)
        {
            if (s<MaxHB) 
            {
                this.textoBic.append("Se ha contratado al ensamblador: "+(s+1)+"\n");
                ensambladoresBici.add(s,new Ensamblador(buffer, semaEnsambladorRueda, semaBufferRueda, semaRuedaExclu , semaBufferMarco,semaProducExcluM,semaEnsambladorM,4,"Bicicleta", textoBic, textoTri,bicletasAProducir,semaCantidadBici,semaCantidadTrici ,triciclosAProducir,s+1,semaCantidadMAXB, semaCantidadMAXT,cantidadTriciclos, cantidadBicicletas));
                cantidadEnsBici.setText(String.valueOf(ensambladoresBici.size()));
                ensambladoresBici.get(s).start();
                s++;
            }
            else
                textoBic.append("No se puede contratar mas ensambladores\nEl máximo es de: "+MaxHB+"\n");
        }
        else
            textoBic.append("No se ha iniciado el ensamblaje\n");
    }
 
    public void despedirBicicleta()
    {
        if(s>0)
        {
            s--;
            ensambladoresBici.get(s).pausarEnsBici();
            ensambladoresBici.remove(s);
            cantidadEnsBici.setText(String.valueOf(ensambladoresBici.size()));
            textoBic.append("Se ha despedido al ensamblador: "+(s+1)+"\n");
        }
        else
            textoBic.append("No hay ensambladores a despedir\n");
    }
   
    public void iniciarHilosEnsambladorB()
    {
        calendario[1].start();
        BBi=true;
        while(s<ensBici)
        { 
            ensambladoresBici.add(s,new Ensamblador(buffer, semaEnsambladorRueda, semaBufferRueda, semaRuedaExclu , semaBufferMarco,semaProducExcluM,semaEnsambladorM,4,"Bicicleta", textoBic, textoTri,bicletasAProducir,semaCantidadBici,semaCantidadTrici ,triciclosAProducir,s+1,semaCantidadMAXB, semaCantidadMAXT,cantidadTriciclos, cantidadBicicletas));
            ensambladoresBici.get(s).start();
            s++;
        }
    }
  
    public void DetenerBici()
    {
        for (int j = 0; j < ensambladoresBici.size(); j++) 
        {
            ensambladoresBici.get(j).DeteneBici();
        }
    }
    
    public void ReanudarBici()
    {
        for (int j = 0; j < ensambladoresBici.size(); j++)
        {
            ensambladoresBici.get(j).ReanudarBici();
        }
    }
    
    public void contratarTriciclo()
    {
        if(BTr)
        {
            if (d<MaxHT) 
            {
                this.textoTri.append("Se ha contratado al ensamblador: "+(d+1)+"\n");
                ensambladoresTrici.add(d,new Ensamblador(buffer, semaEnsambladorRueda, semaBufferRueda, semaRuedaExclu , semaBufferMarco,semaProducExcluM,semaEnsambladorM,5,"Triciclo", textoBic, textoTri,bicletasAProducir,semaCantidadBici,semaCantidadTrici, triciclosAProducir,d+1,semaCantidadMAXB, semaCantidadMAXT,cantidadTriciclos, cantidadBicicletas));
                cantidadEnsTrici.setText(String.valueOf(ensambladoresTrici.size()));
                ensambladoresTrici.get(d).start();
                d++;
            }
            else
                textoTri.append("No se puede contratar mas ensambladores\nEl máximo es de: "+MaxHT+"\n");
        }
        else
            textoTri.append("No se ha iniciado el ensamblaje\n");
    }
 
    public void despedirTriciclo()
    {
        if(d>0)
        {
            d--;
            ensambladoresTrici.get(d).pausarEnsTrici();
            ensambladoresTrici.remove(d);
            cantidadEnsTrici.setText(String.valueOf(ensambladoresTrici.size()));
            textoTri.append("Se ha despedido al ensamblador: "+(d+1)+"\n");
        }
        else
            textoTri.append("No hay ensambladores a despedir\n");
    }
   
    public void iniciarHilosEnsambladorT()
    {
        calendario[2].start();
        this.BTr=true;
        while(d<ensTrici)
        { 
            ensambladoresTrici.add(d,new Ensamblador(buffer, semaEnsambladorRueda, semaBufferRueda, semaRuedaExclu , semaBufferMarco,semaProducExcluM,semaEnsambladorM,5,"Triciclo", textoBic, textoTri,bicletasAProducir,semaCantidadBici,semaCantidadTrici, triciclosAProducir,d+1,semaCantidadMAXB, semaCantidadMAXT,cantidadTriciclos, cantidadBicicletas));
            ensambladoresTrici.get(d).start();
            d++;
        }
    }
  
    public void DetenerTrici()
    {
        for (int j = 0; j < ensambladoresTrici.size(); j++) 
        {
            ensambladoresTrici.get(j).DeteneTrici();
        }
    }
    
    public void ReanudarTrici()
    {
        for (int j = 0; j < ensambladoresTrici.size(); j++)
        {
            ensambladoresTrici.get(j).ReanudarTrici();
        }
    }
    
    public void inicializarFabrica() throws FileNotFoundException, IOException
    {
        String palabra1;
        int cont = 1;
        
        BufferedReader br = new BufferedReader(new FileReader("inicio.txt"));
        while(br.ready())
        {
            palabra1 = br.readLine();
            if(cont == 1)
            {
                dia = Integer.parseInt(palabra1); //Segundos que dura el día
            }
            else if(cont == 2)
            {
                this.bicletasAProducir = Integer.parseInt(palabra1); //Bicicletas solicitadas
            }
            else if(cont == 3)
            {
                this.triciclosAProducir = Integer.parseInt(palabra1); //Triciclos solicitados
            }
            else if(cont == 4)
            {
                n.setCantMaxNeumaticos(Integer.parseInt(palabra1)); //Buffer neumáticos
            }
            else if(cont == 5)
            {
                b.setCantMaxBujes(Integer.parseInt(palabra1)); //Buffer bujes
            }
            else if(cont == 6)
            {
                r.setCantMaxRueda(Integer.parseInt(palabra1));//Buffer ruedas
            }
            else if(cont == 7)
            {
                m.setMaxMarcos(Integer.parseInt(palabra1)); //Buffer marcos
                buffer = new Almacen(n.getCantMaxNeumaticos(),b.getCantMaxBujes(),r.getCantMaxRueda(),m.getMaxMarcos(),dia);
            }
            else if(cont == 8)
            {
                prodNeum = Integer.parseInt(palabra1); //Productores iniciales neumáticos
            }
            else if(cont == 9)
            {
               
                productoresN = new ArrayList<Productor>(Integer.parseInt(palabra1)); //Productores máximos neumáticos
                HNeuMAX=Integer.parseInt(palabra1);
            }
            else if(cont == 10)
            {
                prodBuje = Integer.parseInt(palabra1); //Productores iniciales bujes
            }
            else if(cont == 11)
            {
                productoresB = new ArrayList<Productor>(Integer.parseInt(palabra1)); //Productores máximos bujes
                HBujeMAX=Integer.parseInt(palabra1);
            }
            else if(cont == 12)
            {
                prodRueda = Integer.parseInt(palabra1); //Productores iniciales ruedas
                ensRueda = prodRueda;
            }
            else if(cont == 13)
            {
                ensambladoresRueda = new ArrayList<EnsambladorRueda>(Integer.parseInt(palabra1)); //Productores máximos ruedas
                HRueMAX=Integer.parseInt(palabra1);
            }
            else if(cont == 14)
            {
                prodMarco = Integer.parseInt(palabra1); //Productores iniciales marcos
            }
            else if(cont == 15)
            {
                productoresM = new ArrayList<Productor>(Integer.parseInt(palabra1)); //Productores máximos marcos
                HMarcMAX=Integer.parseInt(palabra1);
            }
            else if(cont == 16)
            {
                ensBici = Integer.parseInt(palabra1); //Ensambladores iniciales bicicletas
            }
            else if(cont == 17)
            {
                ensambladoresBici = new ArrayList<Ensamblador>(Integer.parseInt(palabra1)); //Ensambladores máximos bicicletas
                MaxHB=Integer.parseInt(palabra1);
            }
            else if(cont == 18)
            {
                ensTrici = Integer.parseInt(palabra1); //Ensambladores iniciales triciclos
            }
            else if(cont == 19)
            {
                ensambladoresTrici = new ArrayList<Ensamblador>(Integer.parseInt(palabra1)); //Ensambladores máximos triciclos
                 MaxHT=Integer.parseInt(palabra1);
            }
            cont++;
        }
        br.close();
    }

    

  
   
   
}
