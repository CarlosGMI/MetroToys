package GUI;

import java.awt.Color;
import Codigo.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MetroToys extends javax.swing.JFrame
{   
    private boolean botonN=true,botonM=true,botonB=true,botonBi=true,botonTr=true,botonR=true;
    private boolean botonIN=true,botonIM=true,botonIB=true,botonIBi=true,botonITr=true,botonIR=true;
    metroToys fabrica;
    
    public MetroToys() throws IOException 
    {
        initComponents();
        this.setTitle("MetroToys");
        this.getContentPane().setBackground(Color.decode("#CCFFFF")); //#368FBF #C0392B //129,193,227
        fabrica = new metroToys(this.cantidadProdNeum, this.cantidadProdBujes, this.cantidadProdMarcos, this.cantidadProdRuedas, this.cantidadEnsBici, this.cantidadEnsTrici, this.eventosBicicletas, this.eventosBujes, this.eventosMarcos, this.eventosNeumaticos, this.eventosRuedas, this.eventosTriciclos, this.cantidadTriciclos,this.cantidadBicicletas,this.cantidadBujes,this.cantidadMarcos,this.cantidadNeum,this.cantidadRuedas, this.diasTotales, this.diasBicicletas, this.diasTriciclos);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelProduccion = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        eventosNeumaticos = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cantidadProdNeum = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cantidadNeum = new javax.swing.JLabel();
        despedirProdNeum = new javax.swing.JButton();
        contratarProdNeum = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        eventosBujes = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        cantidadProdBujes = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cantidadBujes = new javax.swing.JLabel();
        despedirProdBujes = new javax.swing.JButton();
        contratarProdBujes = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        despedirProdMarcos = new javax.swing.JButton();
        contratarProdMarcos = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        cantidadMarcos = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cantidadProdMarcos = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        eventosMarcos = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        eventosRuedas = new javax.swing.JTextArea();
        cantidadProdRuedas = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        contratarProdRuedas = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        cantidadRuedas = new javax.swing.JLabel();
        despedirProdRuedas = new javax.swing.JButton();
        pausarReanudarNeum = new javax.swing.JButton();
        pausarReanudarBuje = new javax.swing.JButton();
        pausarReanudarMarco = new javax.swing.JButton();
        pausarReanudarRueda = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        diasTotales = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        diasBicicletas = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        diasTriciclos = new javax.swing.JLabel();
        panelEnsamblaje = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        eventosBicicletas = new javax.swing.JTextArea();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        cantidadEnsBici = new javax.swing.JLabel();
        cantidadBicicletas = new javax.swing.JLabel();
        despedirEnsBici = new javax.swing.JButton();
        contratarEnsBici = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        eventosTriciclos = new javax.swing.JTextArea();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        cantidadTriciclos = new javax.swing.JLabel();
        cantidadEnsTrici = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        contratarEnsTrici = new javax.swing.JButton();
        despedirEnsTrici = new javax.swing.JButton();
        IniciarEnsBici = new javax.swing.JButton();
        iniciarEnsTrici = new javax.swing.JButton();
        panelCalendario = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelProduccion.setBackground(new java.awt.Color(153, 204, 255));
        panelProduccion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Producción", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        eventosNeumaticos.setEditable(false);
        eventosNeumaticos.setColumns(20);
        eventosNeumaticos.setRows(5);
        jScrollPane1.setViewportView(eventosNeumaticos);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Neumáticos");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Productores disponibles:");

        cantidadProdNeum.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cantidadProdNeum.setText("x");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Cantidad de neumáticos:");

        cantidadNeum.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cantidadNeum.setText("x");

        despedirProdNeum.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        despedirProdNeum.setForeground(new java.awt.Color(255, 0, 0));
        despedirProdNeum.setText("-");
        despedirProdNeum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                despedirProdNeumActionPerformed(evt);
            }
        });

        contratarProdNeum.setForeground(new java.awt.Color(0, 204, 0));
        contratarProdNeum.setText("+");
        contratarProdNeum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contratarProdNeumActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/neumatico.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Bujes");

        eventosBujes.setEditable(false);
        eventosBujes.setColumns(20);
        eventosBujes.setRows(5);
        jScrollPane3.setViewportView(eventosBujes);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Productores disponibles:");

        cantidadProdBujes.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cantidadProdBujes.setText("x");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Cantidad de bujes:");

        cantidadBujes.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cantidadBujes.setText("x");

        despedirProdBujes.setForeground(new java.awt.Color(255, 0, 0));
        despedirProdBujes.setText("-");
        despedirProdBujes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                despedirProdBujesActionPerformed(evt);
            }
        });

        contratarProdBujes.setForeground(new java.awt.Color(0, 204, 0));
        contratarProdBujes.setText("+");
        contratarProdBujes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contratarProdBujesActionPerformed(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buje.png"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/marco.png"))); // NOI18N
        jLabel13.setText("foto");

        despedirProdMarcos.setForeground(new java.awt.Color(255, 0, 51));
        despedirProdMarcos.setText("-");
        despedirProdMarcos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                despedirProdMarcosActionPerformed(evt);
            }
        });

        contratarProdMarcos.setForeground(new java.awt.Color(0, 204, 0));
        contratarProdMarcos.setText("+");
        contratarProdMarcos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contratarProdMarcosActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Cantidad de marcos:");

        cantidadMarcos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cantidadMarcos.setText("x");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Productores disponibles:");

        cantidadProdMarcos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cantidadProdMarcos.setText("x");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Marcos");

        eventosMarcos.setEditable(false);
        eventosMarcos.setColumns(20);
        eventosMarcos.setRows(5);
        jScrollPane4.setViewportView(eventosMarcos);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("Ruedas");

        eventosRuedas.setEditable(false);
        eventosRuedas.setColumns(20);
        eventosRuedas.setRows(5);
        jScrollPane5.setViewportView(eventosRuedas);

        cantidadProdRuedas.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cantidadProdRuedas.setText("x");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Cantidad de ruedas:");

        contratarProdRuedas.setForeground(new java.awt.Color(0, 204, 0));
        contratarProdRuedas.setText("+");
        contratarProdRuedas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contratarProdRuedasActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Productores disponibles:");

        cantidadRuedas.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cantidadRuedas.setText("x");

        despedirProdRuedas.setForeground(new java.awt.Color(255, 0, 51));
        despedirProdRuedas.setText("-");
        despedirProdRuedas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                despedirProdRuedasActionPerformed(evt);
            }
        });

        pausarReanudarNeum.setText("Iniciar");
        pausarReanudarNeum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pausarReanudarNeumMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pausarReanudarNeumMouseEntered(evt);
            }
        });
        pausarReanudarNeum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pausarReanudarNeumActionPerformed(evt);
            }
        });

        pausarReanudarBuje.setText("Iniciar");
        pausarReanudarBuje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pausarReanudarBujeActionPerformed(evt);
            }
        });

        pausarReanudarMarco.setText("Iniciar");
        pausarReanudarMarco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pausarReanudarMarcoActionPerformed(evt);
            }
        });

        pausarReanudarRueda.setText("Iniciar");
        pausarReanudarRueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pausarReanudarRuedaActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel29.setText("Días totales:");

        diasTotales.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        diasTotales.setText("X");

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel31.setText("Días bicicletas:");

        diasBicicletas.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        diasBicicletas.setText("X");

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel32.setText("Días triciclos:");

        diasTriciclos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        diasTriciclos.setText("X");

        javax.swing.GroupLayout panelProduccionLayout = new javax.swing.GroupLayout(panelProduccion);
        panelProduccion.setLayout(panelProduccionLayout);
        panelProduccionLayout.setHorizontalGroup(
            panelProduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProduccionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelProduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelProduccionLayout.createSequentialGroup()
                        .addGroup(panelProduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelProduccionLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelProduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelProduccionLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelProduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)))
                            .addGroup(panelProduccionLayout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(cantidadProdNeum))
                            .addGroup(panelProduccionLayout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(cantidadNeum)))
                        .addGap(90, 90, 90)
                        .addGroup(panelProduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelProduccionLayout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(45, 45, 45)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelProduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelProduccionLayout.createSequentialGroup()
                                .addGroup(panelProduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelProduccionLayout.createSequentialGroup()
                                        .addGap(77, 77, 77)
                                        .addComponent(cantidadMarcos))
                                    .addGroup(panelProduccionLayout.createSequentialGroup()
                                        .addGap(76, 76, 76)
                                        .addComponent(cantidadProdMarcos)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelProduccionLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(panelProduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addGroup(panelProduccionLayout.createSequentialGroup()
                                        .addComponent(despedirProdMarcos, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(contratarProdMarcos, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel14))
                                .addGap(0, 8, Short.MAX_VALUE))))
                    .addGroup(panelProduccionLayout.createSequentialGroup()
                        .addGroup(panelProduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelProduccionLayout.createSequentialGroup()
                                .addGroup(panelProduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(panelProduccionLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(pausarReanudarNeum, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelProduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelProduccionLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(despedirProdNeum, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(contratarProdNeum, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelProduccionLayout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel29)
                                        .addGap(18, 18, 18)
                                        .addComponent(diasTotales))
                                    .addGroup(panelProduccionLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel31)
                                        .addGap(18, 18, 18)
                                        .addComponent(diasBicicletas, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(16, 16, 16))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelProduccionLayout.createSequentialGroup()
                                .addGroup(panelProduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panelProduccionLayout.createSequentialGroup()
                                        .addComponent(pausarReanudarBuje, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(despedirProdBujes, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(contratarProdBujes, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelProduccionLayout.createSequentialGroup()
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(panelProduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panelProduccionLayout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(jLabel10))
                                            .addGroup(panelProduccionLayout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addComponent(jLabel11))
                                            .addGroup(panelProduccionLayout.createSequentialGroup()
                                                .addGap(74, 74, 74)
                                                .addComponent(cantidadBujes))
                                            .addGroup(panelProduccionLayout.createSequentialGroup()
                                                .addGap(74, 74, 74)
                                                .addComponent(cantidadProdBujes)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(panelProduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelProduccionLayout.createSequentialGroup()
                                .addGroup(panelProduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pausarReanudarMarco, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelProduccionLayout.createSequentialGroup()
                                        .addGroup(panelProduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel17)
                                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panelProduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panelProduccionLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(panelProduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel19)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProduccionLayout.createSequentialGroup()
                                                        .addComponent(cantidadProdRuedas)
                                                        .addGap(71, 71, 71))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProduccionLayout.createSequentialGroup()
                                                        .addComponent(jLabel18)
                                                        .addGap(13, 13, 13))))
                                            .addGroup(panelProduccionLayout.createSequentialGroup()
                                                .addGap(78, 78, 78)
                                                .addComponent(cantidadRuedas))))
                                    .addGroup(panelProduccionLayout.createSequentialGroup()
                                        .addComponent(pausarReanudarRueda, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(despedirProdRuedas, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(contratarProdRuedas, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(5, 5, 5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProduccionLayout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addGap(18, 18, 18)
                                .addComponent(diasTriciclos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63))))))
        );
        panelProduccionLayout.setVerticalGroup(
            panelProduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProduccionLayout.createSequentialGroup()
                .addGroup(panelProduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelProduccionLayout.createSequentialGroup()
                        .addGroup(panelProduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(panelProduccionLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel16)))
                        .addGap(172, 172, 172))
                    .addGroup(panelProduccionLayout.createSequentialGroup()
                        .addGroup(panelProduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelProduccionLayout.createSequentialGroup()
                                .addGroup(panelProduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(panelProduccionLayout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel1)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panelProduccionLayout.createSequentialGroup()
                                .addGap(0, 101, Short.MAX_VALUE)
                                .addGroup(panelProduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelProduccionLayout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cantidadProdMarcos)
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cantidadMarcos))
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelProduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelProduccionLayout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cantidadProdNeum)
                                            .addGap(26, 26, 26)
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cantidadNeum))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(panelProduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(pausarReanudarNeum)
                                .addComponent(despedirProdNeum, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(contratarProdNeum))
                            .addGroup(panelProduccionLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(panelProduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pausarReanudarMarco)
                                    .addComponent(despedirProdMarcos)
                                    .addComponent(contratarProdMarcos))
                                .addGap(1, 1, 1)))))
                .addGroup(panelProduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProduccionLayout.createSequentialGroup()
                        .addGroup(panelProduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelProduccionLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelProduccionLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLabel9))
                            .addGroup(panelProduccionLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(panelProduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel32)
                                    .addComponent(diasTriciclos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addComponent(jLabel17)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProduccionLayout.createSequentialGroup()
                        .addGroup(panelProduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(diasBicicletas, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelProduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(diasTotales))
                        .addGap(26, 26, 26)))
                .addGroup(panelProduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProduccionLayout.createSequentialGroup()
                        .addGroup(panelProduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5)
                            .addGroup(panelProduccionLayout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidadProdRuedas)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cantidadRuedas)
                                .addGap(20, 20, 20)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelProduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pausarReanudarRueda)
                            .addComponent(despedirProdRuedas)
                            .addComponent(contratarProdRuedas))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelProduccionLayout.createSequentialGroup()
                        .addGroup(panelProduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelProduccionLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidadProdBujes)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addGap(15, 15, 15)
                                .addComponent(cantidadBujes))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelProduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pausarReanudarBuje)
                            .addComponent(despedirProdBujes)
                            .addComponent(contratarProdBujes))
                        .addContainerGap(26, Short.MAX_VALUE))))
        );

        panelEnsamblaje.setBackground(new java.awt.Color(153, 204, 255));
        panelEnsamblaje.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Ensamblaje", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        eventosBicicletas.setEditable(false);
        eventosBicicletas.setColumns(20);
        eventosBicicletas.setRows(5);
        jScrollPane6.setViewportView(eventosBicicletas);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setText("Bicicletas");

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bicicleta.png"))); // NOI18N
        jLabel22.setText("foto");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("Cantidad:");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("Ensambladores:");

        cantidadEnsBici.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cantidadEnsBici.setText("x");

        cantidadBicicletas.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cantidadBicicletas.setText("x");

        despedirEnsBici.setForeground(new java.awt.Color(255, 0, 0));
        despedirEnsBici.setText("-");
        despedirEnsBici.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                despedirEnsBiciActionPerformed(evt);
            }
        });

        contratarEnsBici.setForeground(new java.awt.Color(0, 204, 0));
        contratarEnsBici.setText("+");
        contratarEnsBici.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contratarEnsBiciActionPerformed(evt);
            }
        });

        eventosTriciclos.setEditable(false);
        eventosTriciclos.setColumns(20);
        eventosTriciclos.setRows(5);
        jScrollPane7.setViewportView(eventosTriciclos);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setText("Triciclos");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setText("Cantidad:");

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/triciclo.png"))); // NOI18N

        cantidadTriciclos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cantidadTriciclos.setText("x");

        cantidadEnsTrici.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cantidadEnsTrici.setText("x");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setText("Ensambladores:");

        contratarEnsTrici.setForeground(new java.awt.Color(0, 204, 0));
        contratarEnsTrici.setText("+");
        contratarEnsTrici.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contratarEnsTriciActionPerformed(evt);
            }
        });

        despedirEnsTrici.setForeground(new java.awt.Color(255, 0, 0));
        despedirEnsTrici.setText("-");
        despedirEnsTrici.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                despedirEnsTriciActionPerformed(evt);
            }
        });

        IniciarEnsBici.setText("Iniciar");
        IniciarEnsBici.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarEnsBiciActionPerformed(evt);
            }
        });

        iniciarEnsTrici.setText("Iniciar");
        iniciarEnsTrici.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarEnsTriciActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEnsamblajeLayout = new javax.swing.GroupLayout(panelEnsamblaje);
        panelEnsamblaje.setLayout(panelEnsamblajeLayout);
        panelEnsamblajeLayout.setHorizontalGroup(
            panelEnsamblajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEnsamblajeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEnsamblajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEnsamblajeLayout.createSequentialGroup()
                        .addComponent(IniciarEnsBici, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelEnsamblajeLayout.createSequentialGroup()
                        .addGroup(panelEnsamblajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelEnsamblajeLayout.createSequentialGroup()
                                .addGroup(panelEnsamblajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(panelEnsamblajeLayout.createSequentialGroup()
                                        .addGroup(panelEnsamblajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(iniciarEnsTrici, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(panelEnsamblajeLayout.createSequentialGroup()
                                                .addComponent(jLabel26)
                                                .addGap(18, 18, 18)
                                                .addComponent(cantidadTriciclos))
                                            .addGroup(panelEnsamblajeLayout.createSequentialGroup()
                                                .addComponent(jLabel28)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cantidadEnsTrici)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelEnsamblajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel25)
                                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelEnsamblajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(despedirEnsTrici, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(contratarEnsTrici, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel21)
                            .addGroup(panelEnsamblajeLayout.createSequentialGroup()
                                .addGroup(panelEnsamblajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelEnsamblajeLayout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addGroup(panelEnsamblajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panelEnsamblajeLayout.createSequentialGroup()
                                                .addComponent(jLabel24)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cantidadEnsBici))
                                            .addGroup(panelEnsamblajeLayout.createSequentialGroup()
                                                .addComponent(jLabel23)
                                                .addGap(18, 18, 18)
                                                .addComponent(cantidadBicicletas)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelEnsamblajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(despedirEnsBici, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(contratarEnsBici, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(73, Short.MAX_VALUE))))
        );
        panelEnsamblajeLayout.setVerticalGroup(
            panelEnsamblajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEnsamblajeLayout.createSequentialGroup()
                .addGroup(panelEnsamblajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEnsamblajeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEnsamblajeLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(panelEnsamblajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(cantidadBicicletas))
                        .addGap(17, 17, 17)
                        .addGroup(panelEnsamblajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(cantidadEnsBici))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEnsamblajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEnsamblajeLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(contratarEnsBici)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(despedirEnsBici))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IniciarEnsBici)
                .addGroup(panelEnsamblajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelEnsamblajeLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel27)
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEnsamblajeLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelEnsamblajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(cantidadTriciclos))
                        .addGap(21, 21, 21)
                        .addGroup(panelEnsamblajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(cantidadEnsTrici))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(iniciarEnsTrici)
                        .addGap(35, 35, 35)))
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEnsamblajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEnsamblajeLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(contratarEnsTrici)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(despedirEnsTrici))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelCalendario.setBackground(new java.awt.Color(153, 204, 255));
        panelCalendario.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Calendario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calendario.png"))); // NOI18N

        javax.swing.GroupLayout panelCalendarioLayout = new javax.swing.GroupLayout(panelCalendario);
        panelCalendario.setLayout(panelCalendarioLayout);
        panelCalendarioLayout.setHorizontalGroup(
            panelCalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCalendarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30)
                .addContainerGap(775, Short.MAX_VALUE))
        );
        panelCalendarioLayout.setVerticalGroup(
            panelCalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCalendarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelCalendario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelProduccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(panelEnsamblaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelEnsamblaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelProduccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelCalendario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pausarReanudarNeumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pausarReanudarNeumActionPerformed
        //Producción Inicial
        if(botonIN){
        fabrica.iniciarHilosNeumnatico();
        botonIN=false;
        }
        //Mouse click
        if(botonN)
        {
            pausarReanudarNeum.setText("Pausar");
            botonN=false;
            fabrica.ReanudarNeumatico();
        }
        else
        {
            pausarReanudarNeum.setText("Iniciar");
            fabrica.DetenerNeumatico();
            botonN=true;
        }
    }//GEN-LAST:event_pausarReanudarNeumActionPerformed

    private void despedirProdNeumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_despedirProdNeumActionPerformed
        fabrica.despedirNeumatico();
    }//GEN-LAST:event_despedirProdNeumActionPerformed

    private void pausarReanudarBujeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pausarReanudarBujeActionPerformed
        if(botonIB)
        {
            fabrica.iniciarHilosBuje();
            botonIB=false;
        }
        if(botonB)
        {
            pausarReanudarBuje.setText("Pausar");
            botonB=false;
            fabrica.ReanudarBuje();
        }
        else
        {
            pausarReanudarBuje.setText("Iniciar");
            botonB=true;
            fabrica.DetenerBuje();
        }
    }//GEN-LAST:event_pausarReanudarBujeActionPerformed

    private void pausarReanudarNeumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pausarReanudarNeumMouseClicked
    //ACCIÓN SIN USAR
    }//GEN-LAST:event_pausarReanudarNeumMouseClicked

    private void pausarReanudarNeumMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pausarReanudarNeumMouseEntered
    //ACCIÓN SIN USAR   
    }//GEN-LAST:event_pausarReanudarNeumMouseEntered

    private void pausarReanudarMarcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pausarReanudarMarcoActionPerformed
        // TBotonMarcosIniciarReanudar
        if(botonIM)
        {
            fabrica.iniciarHilosMarcos();
            botonIM=false;
        }
        if(botonM)
        {
            pausarReanudarMarco.setText("Pausar");
            botonM=false;
            fabrica.ReanudarMarco();
        }
        else
        {
            pausarReanudarMarco.setText("Iniciar");
            botonM=true;
            fabrica.DetenerMarco();
        }
    }//GEN-LAST:event_pausarReanudarMarcoActionPerformed

    private void pausarReanudarRuedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pausarReanudarRuedaActionPerformed
        if(botonIR)
        {
            fabrica.iniciarHiloRueda();
            botonIR=false;
        }
        if(botonR)
        {
            pausarReanudarRueda.setText("Pausar");
            botonR=false;
            fabrica.ReanudarRueda();
        }
        else
        {
            pausarReanudarRueda.setText("Iniciar");
            botonR=true;
            fabrica.DetenerRueda();
        }
    }//GEN-LAST:event_pausarReanudarRuedaActionPerformed

    private void IniciarEnsBiciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarEnsBiciActionPerformed
        if(botonIBi)
        {
            fabrica.iniciarHilosEnsambladorB();
            botonIBi=false;
        }
        if(botonBi)
        {
            IniciarEnsBici.setText("Pausar");
            botonBi=false;
            fabrica.ReanudarBici();
        }
        else
        {
            IniciarEnsBici.setText("Iniciar");
            botonBi=true;
            fabrica.DetenerBici();
        }
    }//GEN-LAST:event_IniciarEnsBiciActionPerformed

    private void iniciarEnsTriciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarEnsTriciActionPerformed
        if(botonITr)
        {
            fabrica.iniciarHilosEnsambladorT();
            botonITr=false;
        }
        if(botonTr)
        {
            iniciarEnsTrici.setText("Pausar");
            botonTr=false;
            fabrica.ReanudarTrici();
        }
        else
        {
            iniciarEnsTrici.setText("Iniciar");
            botonTr=true;
            fabrica.DetenerTrici();
        }
    }//GEN-LAST:event_iniciarEnsTriciActionPerformed

    private void contratarProdNeumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contratarProdNeumActionPerformed
        fabrica.contrarNeumatico();
    }//GEN-LAST:event_contratarProdNeumActionPerformed

    private void contratarProdBujesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contratarProdBujesActionPerformed
        fabrica.contrarBuje();
    }//GEN-LAST:event_contratarProdBujesActionPerformed

    private void despedirProdBujesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_despedirProdBujesActionPerformed
        fabrica.despedirBuje();
    }//GEN-LAST:event_despedirProdBujesActionPerformed

    private void contratarProdMarcosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contratarProdMarcosActionPerformed
        fabrica.contrarMarco();
    }//GEN-LAST:event_contratarProdMarcosActionPerformed

    private void despedirProdMarcosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_despedirProdMarcosActionPerformed
        fabrica.despedirMarco();
    }//GEN-LAST:event_despedirProdMarcosActionPerformed

    private void contratarEnsBiciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contratarEnsBiciActionPerformed
        fabrica.contratarBicicleta();
    }//GEN-LAST:event_contratarEnsBiciActionPerformed

    private void despedirEnsBiciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_despedirEnsBiciActionPerformed
        fabrica.despedirBicicleta();
    }//GEN-LAST:event_despedirEnsBiciActionPerformed

    private void contratarProdRuedasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contratarProdRuedasActionPerformed
        fabrica.contratarRueda();
    }//GEN-LAST:event_contratarProdRuedasActionPerformed

    private void despedirProdRuedasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_despedirProdRuedasActionPerformed
        fabrica.despedirRueda();
    }//GEN-LAST:event_despedirProdRuedasActionPerformed

    private void contratarEnsTriciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contratarEnsTriciActionPerformed
        fabrica.contratarTriciclo();
    }//GEN-LAST:event_contratarEnsTriciActionPerformed

    private void despedirEnsTriciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_despedirEnsTriciActionPerformed
        fabrica.despedirTriciclo();
    }//GEN-LAST:event_despedirEnsTriciActionPerformed

    public static void main(String args[]) 
    {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MetroToys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MetroToys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MetroToys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MetroToys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run()
            {
                try 
                {
                    new MetroToys().setVisible(true);
                } 
                catch (IOException ex) 
                {
                    Logger.getLogger(MetroToys.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton IniciarEnsBici;
    private javax.swing.JLabel cantidadBicicletas;
    private javax.swing.JLabel cantidadBujes;
    private javax.swing.JLabel cantidadEnsBici;
    private javax.swing.JLabel cantidadEnsTrici;
    private javax.swing.JLabel cantidadMarcos;
    private javax.swing.JLabel cantidadNeum;
    private javax.swing.JLabel cantidadProdBujes;
    private javax.swing.JLabel cantidadProdMarcos;
    private javax.swing.JLabel cantidadProdNeum;
    private javax.swing.JLabel cantidadProdRuedas;
    private javax.swing.JLabel cantidadRuedas;
    private javax.swing.JLabel cantidadTriciclos;
    private javax.swing.JButton contratarEnsBici;
    private javax.swing.JButton contratarEnsTrici;
    private javax.swing.JButton contratarProdBujes;
    private javax.swing.JButton contratarProdMarcos;
    private javax.swing.JButton contratarProdNeum;
    private javax.swing.JButton contratarProdRuedas;
    private javax.swing.JButton despedirEnsBici;
    private javax.swing.JButton despedirEnsTrici;
    private javax.swing.JButton despedirProdBujes;
    private javax.swing.JButton despedirProdMarcos;
    private javax.swing.JButton despedirProdNeum;
    private javax.swing.JButton despedirProdRuedas;
    private javax.swing.JLabel diasBicicletas;
    private javax.swing.JLabel diasTotales;
    private javax.swing.JLabel diasTriciclos;
    private javax.swing.JTextArea eventosBicicletas;
    private javax.swing.JTextArea eventosBujes;
    private javax.swing.JTextArea eventosMarcos;
    private javax.swing.JTextArea eventosNeumaticos;
    private javax.swing.JTextArea eventosRuedas;
    private javax.swing.JTextArea eventosTriciclos;
    private javax.swing.JButton iniciarEnsTrici;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JPanel panelCalendario;
    private javax.swing.JPanel panelEnsamblaje;
    private javax.swing.JPanel panelProduccion;
    private javax.swing.JButton pausarReanudarBuje;
    private javax.swing.JButton pausarReanudarMarco;
    private javax.swing.JButton pausarReanudarNeum;
    private javax.swing.JButton pausarReanudarRueda;
    // End of variables declaration//GEN-END:variables
}
