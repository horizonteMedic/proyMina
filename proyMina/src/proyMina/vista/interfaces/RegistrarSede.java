/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyMina.vista.interfaces;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import proyMina.modelo.clsConnection;
import proyMina.modelo.clsFunciones;
import proyMina.modelo.clsGlobales;
import proyMina.modelo.clsOperacionesUsuarios;

public class RegistrarSede extends javax.swing.JFrame {
    clsConnection oConn = new clsConnection();
    clsFunciones oFunc = new clsFunciones();
    clsOperacionesUsuarios oPe = new clsOperacionesUsuarios();
    Date dateHoy = new Date();
    SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");  
    
    public RegistrarSede() {
        initComponents();
        estado.setEnabled(true);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnActualizar = new javax.swing.JButton();
        nomenclatura = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombre_sede = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        capacidad = new javax.swing.JTextField();
        estado = new javax.swing.JCheckBox();
        btnRegistrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        descripcion = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JToggleButton();
        btnEditar = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        fecha_campaña = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("AGREGAR NUEVA SEDE");
        setResizable(false);

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        nomenclatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomenclaturaActionPerformed(evt);
            }
        });
        nomenclatura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nomenclaturaKeyTyped(evt);
            }
        });

        jLabel2.setText("Nombre de Sede :");

        jLabel3.setText("Codigo :");

        nombre_sede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_sedeActionPerformed(evt);
            }
        });

        jLabel4.setText("Descripcion :");

        capacidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                capacidadKeyTyped(evt);
            }
        });

        estado.setText("Activar");

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/chek.gif"))); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jLabel6.setText("fecha :");

        descripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descripcionActionPerformed(evt);
            }
        });

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lapiz.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jLabel7.setText("Capacidad :");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(nombre_sede, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(nomenclatura, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(capacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(fecha_campaña, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(estado))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(nombre_sede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(nomenclatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(capacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(fecha_campaña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estado))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomenclaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomenclaturaActionPerformed
        descripcion.requestFocus();
    }//GEN-LAST:event_nomenclaturaActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        btnActualizar();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        btnRegistrar();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
       btnLimpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
   if(!nombre_sede.getText().isEmpty()){
          String Sql="select nombre_sede,nomenclatura,fecha_campaña,capacidad,descripcion ,estado FROM desktop_sede "                
                +"WHERE nombre_sede ='"+nombre_sede.getText().toUpperCase().trim()+"'"; 
                System.out.println(Sql);                
          oConn.FnBoolQueryExecute(Sql);
          try {
                if (oConn.setResult.next()) {
                    nombre_sede.setText(oConn.setResult.getString("nombre_sede"));
                    nomenclatura.setText(oConn.setResult.getString("nomenclatura"));                    
                    capacidad.setText(oConn.setResult.getString("capacidad"));
                    descripcion.setText(oConn.setResult.getString("descripcion"));
                    fecha_campaña.setDate(oConn.setResult.getDate("fecha_campaña"));
                    estado.setSelected(oConn.setResult.getBoolean("estado"));                   
                    btnRegistrar.setEnabled(false);
                    btnActualizar.setEnabled(true);
                    btnEditar.setEnabled(false);
                    btnLimpiar.setEnabled(true);
                    }else{
                    oFunc.SubSistemaMensajeError("No se encuentra registro de sede ");
                }
                oConn.sqlStmt.close();
            } catch (SQLException ex) {
                oFunc.SubSistemaMensajeInformacion("Error:" + ex.getMessage());
            }
      }
      else
            oFunc.SubSistemaMensajeError("debes crear una nueva sede");
    }//GEN-LAST:event_btnEditarActionPerformed

    private void nombre_sedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_sedeActionPerformed
        nomenclatura.requestFocus();
        
        if(!nombre_sede.getText().isEmpty()){
            if(!oPe.validarText(nombre_sede, "desktop_sede","nombre_sede"))  {
             oFunc.SubSistemaMensajeError("El nombre de sede no se encuentra Registrado ");
                    btnEditar.setEnabled(false);
                    btnActualizar.setEnabled(false);
                    btnRegistrar.setEnabled(true);
                    btnLimpiar.setEnabled(true);
            }
            else
                { oFunc.SubSistemaMensajeError("La Sede si existe si desea actualizar - click en Editar");
                    btnEditar.setEnabled(true);
                    btnActualizar.setEnabled(true);
                    btnRegistrar.setEnabled(false);
                    btnLimpiar.setEnabled(true);
                }
            }        
    }//GEN-LAST:event_nombre_sedeActionPerformed

    private void nomenclaturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomenclaturaKeyTyped
    int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;        
    if (!numeros)
    {
        evt.consume();
    }        
    if(nomenclatura.getText().length()>=20)
     {
       evt.consume();
     }
    }//GEN-LAST:event_nomenclaturaKeyTyped

    private void capacidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_capacidadKeyTyped
     int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;        
    if (!numeros)
    {
        evt.consume();
    }        
    if(capacidad.getText().length()>=3000)
     {
       evt.consume();
     }  
    }//GEN-LAST:event_capacidadKeyTyped

    private void descripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descripcionActionPerformed
        capacidad.requestFocus();
    }//GEN-LAST:event_descripcionActionPerformed

    /**
     * @param args the command line arguments
     */

private void btnActualizar(){
String Key=nombre_sede.getText();
         if(!nombre_sede.getText().isEmpty()){                
            String strSqlStmt;
            String Query ;
            strSqlStmt="UPDATE desktop_sede ";
            Query="SET ";          
            Query += "nombre_sede='"+nombre_sede.getText().toUpperCase().trim()+ "'";
            Query += ",nomenclatura='"+nomenclatura.getText().toUpperCase().trim()+ "'";
            Query += ",descripcion='"+descripcion.getText().toUpperCase().trim()+ "'";
            Query += ",capacidad='"+capacidad.getText()+ "'";          
            Query += ",estado='"+estado.isSelected()+ "'";
            Query += ",fecha_campaña='"+fecha_campaña.getDate()+ "'";            
            Query += ",user_actualizacion='"+clsGlobales.sUser+ "'";
            Query += ",fecha_actualizacion='"+formato.format(dateHoy)+ "'";

            Query +=" WHERE nombre_sede='" + Key + "'";
            System.out.println("El comando es :" + strSqlStmt + Query );
            if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt + Query)){
                oFunc.SubSistemaMensajeInformacion("Se ha actualizado con Éxito");
                btnLimpiar();                                             
            }else{
                 oFunc.SubSistemaMensajeError("Error en registro");
                 }            
    }
}

private void btnRegistrar(){
if (!nombre_sede.getText().isEmpty()){
            String strSqlStmt;
            String Query ;
            strSqlStmt="INSERT INTO desktop_sede (";
            Query="Values(";
            if (!nombre_sede.getText().isEmpty() )
                {strSqlStmt += "nombre_sede";Query += "'"+nombre_sede.getText().toUpperCase().trim()+"'";}
                strSqlStmt += ",nomenclatura";Query += ",'"+nomenclatura.getText().trim()+ "'";
                strSqlStmt += ",descripcion";Query += ",'"+descripcion.getText().toUpperCase().trim()+ "'";
                strSqlStmt += ",capacidad";Query += ",'"+capacidad.getText().toUpperCase().trim()+ "'";  
                strSqlStmt += ",fecha_campaña";Query += ",'"+fecha_campaña.getDate()+ "'";
                strSqlStmt += ",estado";Query += ",'"+estado.isSelected()+ "'";
                //Auditoria
                strSqlStmt += ",user_registro";Query += ",'"+clsGlobales.sUser+ "'";
                strSqlStmt += ",fecha_registro";Query += ",'"+formato.format(dateHoy)+ "'";
                
            System.out.println("el comando es: " + strSqlStmt.concat(") ") + Query.concat(")")); 
            if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt.concat(") ") + Query.concat(")"))){
                oFunc.SubSistemaMensajeInformacion("Se ha agregado con Éxito");
                    btnLimpiar();
            } else{
                    oFunc.SubSistemaMensajeError("Error en registro de sede ");
                       }                         
            }

}

private void btnLimpiar(){
        nomenclatura.setText(null);
        nombre_sede.setText(null);
        capacidad.setText(null);
        descripcion.setText(null);
        estado.setSelected(true);
        btnEditar.setEnabled(true);
        btnRegistrar.setEnabled(true);
        btnActualizar.setEnabled(true);
        fecha_campaña.setDate(new Date());

}


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
            java.util.logging.Logger.getLogger(RegistrarSede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarSede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarSede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarSede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarSede().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JToggleButton btnEditar;
    private javax.swing.JToggleButton btnLimpiar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JTextField capacidad;
    private javax.swing.JTextField descripcion;
    private javax.swing.JCheckBox estado;
    private com.toedter.calendar.JDateChooser fecha_campaña;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nombre_sede;
    private javax.swing.JTextField nomenclatura;
    // End of variables declaration//GEN-END:variables
}


