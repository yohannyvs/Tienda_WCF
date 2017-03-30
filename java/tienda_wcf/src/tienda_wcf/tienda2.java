/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda_wcf;

import javax.swing.table.DefaultTableModel;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author ismael
 */
public class tienda2 extends javax.swing.JFrame {

    public static String disco;
    public static String fuente;
    public static String pantalla;
    public static String procesador;
    public static String ram;
    public static String tarjeta;
    public static int precio;
    
    boolean marca=false;
    
    DefaultTableModel model = new DefaultTableModel();
    
    
    public tienda2() {
        initComponents();
        
        //llenar nombres
        String nombredisco= selectDisco();
        String nombrefuente= selectFuente();
        String nombrepantalla= selectPantalla();
        String nombreprocesador=selectProcesador();
        String nombreram=selectRam();
        String nombretarjeta=selectTarjeta();
        
        model = (DefaultTableModel) jTable1.getModel();
        	
      try{
          
          // objeto para nombre
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(nombredisco);
        JSONArray array = (JSONArray)obj;
        JSONObject jo=new JSONObject();
        
        jo=(JSONObject)array.get(0);
        int contadordisco=array.size();
        
        ////////////////fuente
        
        JSONParser parser2 = new JSONParser();
        Object obj2 = parser.parse(nombrefuente);
        JSONArray array2 = (JSONArray)obj2;
        JSONObject jo2=new JSONObject();
        
        jo2=(JSONObject)array2.get(0);
        int contadorfuente=array2.size();
        //////////////////////////////////////// pantalla
        
        JSONParser parser3 = new JSONParser();
        Object obj3 = parser.parse(nombrepantalla);
        JSONArray array3 = (JSONArray)obj3;
        JSONObject jo3=new JSONObject();
        
        jo3=(JSONObject)array3.get(0);
        int contadorpantalla=array3.size();
        /////////////////////////////////////procesador
        JSONParser parser4 = new JSONParser();
        Object obj4 = parser.parse(nombreprocesador);
        JSONArray array4 = (JSONArray)obj4;
        JSONObject jo4=new JSONObject();
        
        jo4=(JSONObject)array4.get(0);
        int contadorprocesador=array4.size();
        /////////////////////////////////ram
        JSONParser parser5 = new JSONParser();
        Object obj5 = parser.parse(nombreram);
        JSONArray array5 = (JSONArray)obj5;
        JSONObject jo5=new JSONObject();
        
        jo5=(JSONObject)array5.get(0);
        int contadorram=array5.size();
        //////////////tarjeta de memoria 
        JSONParser parser6 = new JSONParser();
        Object obj6 = parser.parse(nombretarjeta);
        JSONArray array6 = (JSONArray)obj6;
        JSONObject jo6=new JSONObject();
        
        jo6=(JSONObject)array6.get(0);
        int contadortarjeta=array6.size();
        
        
        
        
          for (int i = 0; i < contadordisco; i++) {
                jo=(JSONObject)array.get(i);
                System.out.println(jo.get("Nombre"));
                Cbox_disco.addItem(jo.get("Nombre").toString());
          }
        
          for (int i = 0; i < contadorfuente; i++) {
                jo2=(JSONObject)array2.get(i);
                System.out.println(jo2.get("Nombre"));
                Cbox_fuente.addItem(jo2.get("Nombre").toString());
          }
          
          for (int i = 0; i < contadorpantalla; i++) {
                jo3=(JSONObject)array3.get(i);
                System.out.println(jo3.get("Nombre"));
                Cbox_pantalla.addItem(jo3.get("Nombre").toString());
          }
          
          for (int i = 0; i < contadorprocesador; i++) {
                jo4=(JSONObject)array4.get(i);
                System.out.println(jo4.get("Nombre"));
                Cbox_procesador.addItem(jo4.get("Nombre").toString());
          }
          
          for (int i = 0; i < contadorram; i++) {
                jo5=(JSONObject)array5.get(i);
                System.out.println(jo5.get("Nombre"));
                Cbox_ram.addItem(jo5.get("Nombre").toString());
          }
          
          for (int i = 0; i < contadortarjeta; i++) {
                jo6=(JSONObject)array6.get(i);
                System.out.println(jo6.get("Nombre"));
                Cbox_tarjeta.addItem(jo6.get("Nombre").toString());
          }
          
          marca=true;
          

      }catch(ParseException pe){
		
         System.out.println(pe);
      }
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Cbox_procesador = new javax.swing.JComboBox<>();
        Cbox_ram = new javax.swing.JComboBox<>();
        Cbox_tarjeta = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_comprar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lbl_precio = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Cbox_disco = new javax.swing.JComboBox<>();
        Cbox_fuente = new javax.swing.JComboBox<>();
        Cbox_pantalla = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        rbtn_disco = new javax.swing.JRadioButton();
        rbtn_fuente = new javax.swing.JRadioButton();
        rbtn_pantalla = new javax.swing.JRadioButton();
        rbtn_procesador = new javax.swing.JRadioButton();
        rbtn_ram = new javax.swing.JRadioButton();
        rbtn_tarjeta = new javax.swing.JRadioButton();
        btn_buscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Cbox_procesador.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Cbox_procesadorItemStateChanged(evt);
            }
        });

        Cbox_ram.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Cbox_ramItemStateChanged(evt);
            }
        });

        Cbox_tarjeta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Cbox_tarjetaItemStateChanged(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Descripcion", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btn_comprar.setText("Comprar");
        btn_comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_comprarActionPerformed(evt);
            }
        });

        jLabel7.setText("Precio Total:");

        lbl_precio.setText("0");

        jLabel1.setText("Disco duro:");

        jLabel2.setText("Fuente de poder:");

        jLabel3.setText("Pantalla:");

        jLabel4.setText("Procesador:");

        jLabel5.setText("Memoria RAM:");

        jLabel6.setText("Tarjeta madre:");

        Cbox_disco.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Cbox_discoItemStateChanged(evt);
            }
        });

        Cbox_fuente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Cbox_fuenteItemStateChanged(evt);
            }
        });

        Cbox_pantalla.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Cbox_pantallaItemStateChanged(evt);
            }
        });

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtn_disco);
        rbtn_disco.setSelected(true);

        buttonGroup1.add(rbtn_fuente);

        buttonGroup1.add(rbtn_pantalla);

        buttonGroup1.add(rbtn_procesador);

        buttonGroup1.add(rbtn_ram);

        buttonGroup1.add(rbtn_tarjeta);

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(49, 49, 49)
                        .addComponent(Cbox_disco, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtn_disco))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_precio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addComponent(Cbox_tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cbox_ram, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cbox_procesador, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cbox_pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cbox_fuente, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(btn_buscar))
                            .addComponent(rbtn_fuente)
                            .addComponent(rbtn_pantalla)
                            .addComponent(rbtn_procesador)
                            .addComponent(rbtn_ram)
                            .addComponent(rbtn_tarjeta)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_comprar)
                            .addGap(115, 115, 115))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Cbox_disco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbtn_disco)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Cbox_fuente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtn_fuente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Cbox_pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtn_pantalla))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Cbox_procesador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtn_procesador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Cbox_ram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtn_ram))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Cbox_tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtn_tarjeta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lbl_precio)
                    .addComponent(jButton1)
                    .addComponent(btn_buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_comprar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Cbox_procesadorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Cbox_procesadorItemStateChanged

    }//GEN-LAST:event_Cbox_procesadorItemStateChanged

    private void Cbox_ramItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Cbox_ramItemStateChanged

    }//GEN-LAST:event_Cbox_ramItemStateChanged

    private void Cbox_tarjetaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Cbox_tarjetaItemStateChanged

    }//GEN-LAST:event_Cbox_tarjetaItemStateChanged

    private void btn_comprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_comprarActionPerformed

        disco=Cbox_disco.getSelectedItem().toString();
        fuente=Cbox_fuente.getSelectedItem().toString();
        pantalla=Cbox_pantalla.getSelectedItem().toString();
        procesador=Cbox_procesador.getSelectedItem().toString();
        ram=Cbox_ram.getSelectedItem().toString();
        tarjeta=Cbox_tarjeta.getSelectedItem().toString();

        pago p=new pago();
        p.show();
        this.hide();

    }//GEN-LAST:event_btn_comprarActionPerformed

    private void Cbox_discoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Cbox_discoItemStateChanged
        
    }//GEN-LAST:event_Cbox_discoItemStateChanged

    private void Cbox_fuenteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Cbox_fuenteItemStateChanged

    }//GEN-LAST:event_Cbox_fuenteItemStateChanged

    private void Cbox_pantallaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Cbox_pantallaItemStateChanged

    }//GEN-LAST:event_Cbox_pantallaItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        disco=Cbox_disco.getSelectedItem().toString();
        fuente=Cbox_fuente.getSelectedItem().toString();
        pantalla=Cbox_pantalla.getSelectedItem().toString();
        procesador=Cbox_procesador.getSelectedItem().toString();
        ram=Cbox_ram.getSelectedItem().toString();
        tarjeta=Cbox_tarjeta.getSelectedItem().toString();
        precio=calcularPrecio(disco, fuente, pantalla, procesador, ram, tarjeta);
        lbl_precio.setText("$"+precio);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        
        int filas = model.getRowCount();
        for (int i = filas-1; i>=0;i--){
            model.removeRow(i);
        }
        
        if(rbtn_disco.isSelected()){
            String info_disco=sfDisco();
            System.out.println(info_disco);
            try{
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(info_disco);
            JSONArray array = (JSONArray)obj;
            JSONObject jo=new JSONObject();

            jo=(JSONObject)array.get(0);
            int contadordisco=array.size();
            
            for (int i = 0; i < contadordisco; i++) {
                jo=(JSONObject)array.get(i);
                System.out.println(jo.get("Nombre"));
                model.addRow(new Object[]{jo.get("Nombre"),jo.get("Descripcion"),jo.get("Precio")});
                
            }
                
            }
            catch(ParseException pe){
		
                System.out.println(pe);
            }
            
            
            
            
        }
        if(rbtn_fuente.isSelected()){
            String info_fuente=sfFuente();
            try{
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(info_fuente);
            JSONArray array = (JSONArray)obj;
            JSONObject jo=new JSONObject();

            jo=(JSONObject)array.get(0);
            int contadordisco=array.size();
            
            for (int i = 0; i < contadordisco; i++) {
                jo=(JSONObject)array.get(i);
                System.out.println(jo.get("Nombre"));
                model.addRow(new Object[]{jo.get("Nombre"),jo.get("Descripcion"),jo.get("Precio")});
                
            }
                
            }
            catch(ParseException pe){
		
                System.out.println(pe);
            }
            
        }
        
        if(rbtn_pantalla.isSelected()){
            String info_pantalla=sfPantalla();
            try{
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(info_pantalla);
            JSONArray array = (JSONArray)obj;
            JSONObject jo=new JSONObject();

            jo=(JSONObject)array.get(0);
            int contadordisco=array.size();
            
            for (int i = 0; i < contadordisco; i++) {
                jo=(JSONObject)array.get(i);
                System.out.println(jo.get("Nombre"));
                model.addRow(new Object[]{jo.get("Nombre"),jo.get("Descripcion"),jo.get("Precio")});
                
            }
                
            }
            catch(ParseException pe){
		
                System.out.println(pe);
            }
            
            
        }
        
        if(rbtn_procesador.isSelected()){
            String info_procesador=sfProcesador();
            try{
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(info_procesador);
            JSONArray array = (JSONArray)obj;
            JSONObject jo=new JSONObject();

            jo=(JSONObject)array.get(0);
            int contadordisco=array.size();
            
            for (int i = 0; i < contadordisco; i++) {
                jo=(JSONObject)array.get(i);
                System.out.println(jo.get("Nombre"));
                model.addRow(new Object[]{jo.get("Nombre"),jo.get("Descripcion"),jo.get("Precio")});
                
            }
                
            }
            catch(ParseException pe){
		
                System.out.println(pe);
            }
            
        }
        
        if(rbtn_ram.isSelected()){
            String info_ram=sfRam();
            try{
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(info_ram);
            JSONArray array = (JSONArray)obj;
            JSONObject jo=new JSONObject();

            jo=(JSONObject)array.get(0);
            int contadordisco=array.size();
            
            for (int i = 0; i < contadordisco; i++) {
                jo=(JSONObject)array.get(i);
                System.out.println(jo.get("Nombre"));
                model.addRow(new Object[]{jo.get("Nombre"),jo.get("Descripcion"),jo.get("Precio")});
                
            }
                
            }
            catch(ParseException pe){
		
                System.out.println(pe);
            }
            
        }
        
        if(rbtn_tarjeta.isSelected()){
            String info_tarjeta=sfTarjeta();
            try{
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(info_tarjeta);
            JSONArray array = (JSONArray)obj;
            JSONObject jo=new JSONObject();

            jo=(JSONObject)array.get(0);
            int contadordisco=array.size();
            
            for (int i = 0; i < contadordisco; i++) {
                jo=(JSONObject)array.get(i);
                System.out.println(jo.get("Nombre"));
                model.addRow(new Object[]{jo.get("Nombre"),jo.get("Descripcion"),jo.get("Precio")});
                
            }
                
            }
            catch(ParseException pe){
		
                System.out.println(pe);
            }
        }
        
    }//GEN-LAST:event_btn_buscarActionPerformed

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
            java.util.logging.Logger.getLogger(tienda2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tienda2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tienda2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tienda2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tienda2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Cbox_disco;
    private javax.swing.JComboBox<String> Cbox_fuente;
    private javax.swing.JComboBox<String> Cbox_pantalla;
    private javax.swing.JComboBox<String> Cbox_procesador;
    private javax.swing.JComboBox<String> Cbox_ram;
    private javax.swing.JComboBox<String> Cbox_tarjeta;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_comprar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_precio;
    private javax.swing.JRadioButton rbtn_disco;
    private javax.swing.JRadioButton rbtn_fuente;
    private javax.swing.JRadioButton rbtn_pantalla;
    private javax.swing.JRadioButton rbtn_procesador;
    private javax.swing.JRadioButton rbtn_ram;
    private javax.swing.JRadioButton rbtn_tarjeta;
    // End of variables declaration//GEN-END:variables
private static int calcularPrecio(java.lang.String nomDisc, java.lang.String nomFuente, java.lang.String nomPantalla, java.lang.String nomProcesador, java.lang.String nomRam, java.lang.String nomTarjeta) {
        int resultado;
        org.tempuri.Service1 service = new org.tempuri.Service1();
        org.tempuri.IService1 port = service.getBasicHttpBindingIService1();
        resultado=port.calcularPrecio(nomDisc, nomFuente, nomPantalla, nomProcesador, nomRam, nomTarjeta);
        return resultado;
    }

    

    private static String selectFuente() {
        org.tempuri.Service1 service = new org.tempuri.Service1();
        org.tempuri.IService1 port = service.getBasicHttpBindingIService1();
        return port.selectFuente();
    }

    private static String selectPantalla() {
        org.tempuri.Service1 service = new org.tempuri.Service1();
        org.tempuri.IService1 port = service.getBasicHttpBindingIService1();
        return port.selectPantalla();
    }

    private static String selectProcesador() {
        org.tempuri.Service1 service = new org.tempuri.Service1();
        org.tempuri.IService1 port = service.getBasicHttpBindingIService1();
        return port.selectProcesador();
    }

    private static String selectRam() {
        org.tempuri.Service1 service = new org.tempuri.Service1();
        org.tempuri.IService1 port = service.getBasicHttpBindingIService1();
        return port.selectRam();
    }

    private static String selectTarjeta() {
        org.tempuri.Service1 service = new org.tempuri.Service1();
        org.tempuri.IService1 port = service.getBasicHttpBindingIService1();
        return port.selectTarjeta();
    }

    private static String selectDisco() {
        org.tempuri.Service1 service = new org.tempuri.Service1();
        org.tempuri.IService1 port = service.getBasicHttpBindingIService1();
        return port.selectDisco();
    }

    private static String sfDisco() {
        org.tempuri.Service1 service = new org.tempuri.Service1();
        org.tempuri.IService1 port = service.getBasicHttpBindingIService1();
        return port.sfDisco();
    }

    private static String sfFuente() {
        org.tempuri.Service1 service = new org.tempuri.Service1();
        org.tempuri.IService1 port = service.getBasicHttpBindingIService1();
        return port.sfFuente();
    }

    private static String sfPantalla() {
        org.tempuri.Service1 service = new org.tempuri.Service1();
        org.tempuri.IService1 port = service.getBasicHttpBindingIService1();
        return port.sfPantalla();
    }

    private static String sfProcesador() {
        org.tempuri.Service1 service = new org.tempuri.Service1();
        org.tempuri.IService1 port = service.getBasicHttpBindingIService1();
        return port.sfProcesador();
    }

    private static String sfRam() {
        org.tempuri.Service1 service = new org.tempuri.Service1();
        org.tempuri.IService1 port = service.getBasicHttpBindingIService1();
        return port.sfRam();
    }

    private static String sfTarjeta() {
        org.tempuri.Service1 service = new org.tempuri.Service1();
        org.tempuri.IService1 port = service.getBasicHttpBindingIService1();
        return port.sfTarjeta();
    }



}



