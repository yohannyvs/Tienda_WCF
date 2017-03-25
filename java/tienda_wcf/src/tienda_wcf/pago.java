/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda_wcf;

import javax.swing.JOptionPane;

/**
 *
 * @author ismael
 */
public class pago extends javax.swing.JFrame {

    String nomDisc="Disco 1T";
    String nomFuente="Thermaltake Tr2-430";
    String nomPantalla="Acer Predator X34";
    String nomProcesador="Intel Core i5-7600K";
    String nomRam="Kingston HyperX";
    String nomTarjeta="LGA 1151";
    int precio=tienda.precio;
    
    public pago() {
        initComponents();
        
        precio=calcularPrecio(nomDisc, nomFuente, nomPantalla, nomProcesador, nomRam, nomTarjeta);
        lbl_precio.setText(""+precio);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_numtarjeta = new javax.swing.JTextField();
        txt_numseg = new javax.swing.JTextField();
        CBox_mes = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        Cbox_anio = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        lbl_precio = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Numero de Tarjeta:");

        jLabel2.setText("Numero de seguridad:");

        jLabel3.setText("Fecha de vencimiento:");

        CBox_mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        jLabel4.setText("/");

        Cbox_anio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27" }));

        jLabel5.setText("Monto:");

        lbl_precio.setText("0");

        jButton1.setText("Pagar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Atras");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(CBox_mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Cbox_anio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_numtarjeta)
                                    .addComponent(txt_numseg, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_precio))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_numtarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_numseg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CBox_mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(Cbox_anio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lbl_precio))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String numTarjeta=txt_numtarjeta.getText();
        String fecha=""+CBox_mes.getSelectedItem().toString()+"/"+Cbox_anio.getSelectedItem().toString()+"";
        String numSeguridad=txt_numseg.getText();
        /*String nomDisc=tienda.disco;
        String nomFuente=tienda.fuente;
        String nomPantalla=tienda.pantalla;
        String nomProcesador=tienda.procesador;
        String nomRam=tienda.ram;
        String nomTarjeta=tienda.tarjeta;
        int precio=tienda.precio;
        */
        
        
        
        int resultado;
        
        resultado=compra(numTarjeta, fecha, numSeguridad, nomDisc, nomFuente, nomPantalla, nomProcesador, nomRam, nomTarjeta, precio);
        
        if (resultado==1)
        {
            JOptionPane.showMessageDialog(this,"Compra realizada");
        }
        if (resultado==2)
        {
            JOptionPane.showMessageDialog(this,"Saldo insuficiente");
        }
        
        if (resultado==3)
        {
            JOptionPane.showMessageDialog(this,"Fecha y/o numero de seguridad incorrecto");
        }
        if (resultado==4)
        {
            JOptionPane.showMessageDialog(this,"Tarjeta inexistente");
        }
        if (resultado==5)
        {
            JOptionPane.showMessageDialog(this,"No hay suficiente inventario del los productos a comprar ");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBox_mes;
    private javax.swing.JComboBox<String> Cbox_anio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbl_precio;
    private javax.swing.JTextField txt_numseg;
    private javax.swing.JTextField txt_numtarjeta;
    // End of variables declaration//GEN-END:variables

    private static int compra(java.lang.String numTarjeta, java.lang.String fecha, java.lang.String numSeguridad, java.lang.String nomDisc, java.lang.String nomFuente, java.lang.String nomPantalla, java.lang.String nomProcesador, java.lang.String nomRam, java.lang.String nomTarjeta, java.lang.Integer precio) {
        int resultado;
        org.tempuri.Service1 service = new org.tempuri.Service1();
        org.tempuri.IService1 port = service.getBasicHttpBindingIService1();
        resultado=port.compra(numTarjeta, fecha, numSeguridad, nomDisc, nomFuente, nomPantalla, nomProcesador, nomRam, nomTarjeta, precio);
        return resultado;
    }

    private static Integer calcularPrecio(java.lang.String nomDisc, java.lang.String nomFuente, java.lang.String nomPantalla, java.lang.String nomProcesador, java.lang.String nomRam, java.lang.String nomTarjeta) {
        org.tempuri.Service1 service = new org.tempuri.Service1();
        org.tempuri.IService1 port = service.getBasicHttpBindingIService1();
        return port.calcularPrecio(nomDisc, nomFuente, nomPantalla, nomProcesador, nomRam, nomTarjeta);
    }
}
