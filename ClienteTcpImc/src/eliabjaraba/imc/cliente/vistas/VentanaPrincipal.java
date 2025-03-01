
package eliabjaraba.imc.cliente.vistas;

import java.awt.Color;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class VentanaPrincipal extends javax.swing.JFrame {

   Socket servidor;
    DataOutputStream out;
    DataInputStream in;
    
    public VentanaPrincipal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        CONEXION = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoIPServidor = new javax.swing.JTextField();
        txtEstado = new javax.swing.JLabel();
        campoPuertoServidor = new javax.swing.JTextField();
        btnIniciar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnIniciar1 = new javax.swing.JButton();
        campoPeso = new javax.swing.JTextField();
        campoAltura = new javax.swing.JTextField();
        txtResultado = new javax.swing.JLabel();
        txtMensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CLIENTE IMC");

        jLabel2.setText("DIRECCION IP :");

        jLabel3.setText("PUERTOS DE RED :");

        jLabel4.setText("ESTADO:");

        campoIPServidor.setText("jTextField1");

        txtEstado.setForeground(new java.awt.Color(255, 0, 0));
        txtEstado.setText("Desconectado");

        campoPuertoServidor.setText("jTextField2");

        btnIniciar.setForeground(new java.awt.Color(0, 255, 0));
        btnIniciar.setText("CONECTAR");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtEstado)))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoPuertoServidor)
                    .addComponent(campoIPServidor)
                    .addComponent(btnIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoIPServidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoPuertoServidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtEstado))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(btnIniciar)
                        .addGap(16, 16, 16))))
        );

        CONEXION.addTab("CONEXION", jPanel1);

        jLabel6.setText("PESO:");

        jLabel7.setText("ALTURA:");

        jLabel8.setText("IMC:");

        btnIniciar1.setForeground(new java.awt.Color(0, 255, 0));
        btnIniciar1.setText("CALCULAR");
        btnIniciar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciar1ActionPerformed(evt);
            }
        });

        campoPeso.setText("jTextField3");

        campoAltura.setText("jTextField4");

        txtResultado.setBackground(new java.awt.Color(255, 255, 255));
        txtResultado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(255, 0, 0));
        txtResultado.setText("0.0");

        txtMensaje.setText("jLabel10");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(16, 16, 16)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtResultado)
                        .addGap(63, 63, 63)
                        .addComponent(txtMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 43, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoPeso, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(campoAltura))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addComponent(btnIniciar1))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(campoPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(campoAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnIniciar1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtResultado)
                    .addComponent(txtMensaje))
                .addGap(15, 15, 15))
        );

        CONEXION.addTab("CALCULAR IMC", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CONEXION)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CONEXION, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        int puerto = Integer.parseInt(campoPuertoServidor.getText());
        String ip = campoIPServidor.getText();
        try {
            if (btnIniciar.getText().equalsIgnoreCase("Conectar")) {
                servidor = new Socket(ip, puerto);
                out = new DataOutputStream(servidor.getOutputStream());
                in = new DataInputStream(servidor.getInputStream());
                btnIniciar.setText("Desconectar");
                btnIniciar.setForeground(Color.RED);
                txtEstado.setText("Conectar");
                txtEstado.setForeground(Color.GREEN);
            } else if (btnIniciar.getText().equalsIgnoreCase("Desconectar")) {
                if (servidor.isConnected()) {
                    servidor.close();
                }
                btnIniciar.setText("Conectar");
                txtEstado.setText("Desconectado");
                btnIniciar.setForeground(Color.GREEN);
                txtEstado.setForeground(Color.RED);
            }
        } catch (Exception ex) {
            System.out.println("ERROR AL CONECTAR");
            ex.printStackTrace();
        }

    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnIniciar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciar1ActionPerformed
        if (!servidor.isConnected()) {
            JOptionPane.showConfirmDialog(this, "Cliente OffLine, Conecte con elServidor ");
            return;
        }
        float peso = Float.parseFloat(campoPeso.getText());
        float altura = Float.parseFloat(campoAltura.getText());
        Thread hilo = new Thread() {
            @Override
            public void run() {
                try {
                    System.out.println("Peso: " + peso);
                    System.out.println("Altura: " + altura);
                    out.writeFloat(peso);
                    out.writeFloat(altura);
                    out.flush();
                    System.out.println("Enviados los datos\nEsperando respuesta");
                    float imc = in.readFloat();
                    String msj = in.readUTF();
                    System.out.println("IMC: " + imc + "\nMensaje: " + msj);
                    txtResultado.setText(imc + "");
                    txtMensaje.setText(msj);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(VentanaPrincipal.this, "ERROR con el cliente " + ex.getMessage());
                    System.out.println("ERROR con el cliente " + ex.getMessage());
                    ex.printStackTrace();
                }
            }
        };
        hilo.start();
    }

    public JLabel getTxtEstado() {
        return txtEstado;
    }

    public JButton getBtnIniciar() {
        return btnIniciar;
    

    }//GEN-LAST:event_btnIniciar1ActionPerformed

   
    public static void main(String args[]) {
    /* Set the Nimbus look and feel */
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
        java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new VentanaPrincipal().setVisible(true);
        }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane CONEXION;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnIniciar1;
    private javax.swing.JTextField campoAltura;
    private javax.swing.JTextField campoIPServidor;
    private javax.swing.JTextField campoPeso;
    private javax.swing.JTextField campoPuertoServidor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtEstado;
    private javax.swing.JLabel txtMensaje;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables
}
