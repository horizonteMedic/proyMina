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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("AGREGAR NUEVA SEDE");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 119, -1));

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
        jPanel1.add(nomenclatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 305, -1));

        jLabel2.setText("Nombre de Sede :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 110, -1));

        jLabel3.setText("Codigo :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 50, -1));

        nombre_sede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_sedeActionPerformed(evt);
            }
        });
        jPanel1.add(nombre_sede, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 305, -1));

        jLabel4.setText("Descripcion :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 80, -1));

        capacidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                capacidadKeyTyped(evt);
            }
        });
        jPanel1.add(capacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 305, -1));

        estado.setText("Activar");
        jPanel1.add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/chek.gif"))); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 119, -1));

        jLabel6.setText("fecha :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 40, -1));

        descripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descripcionActionPerformed(evt);
            }
        });
        jPanel1.add(descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 305, -1));

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 119, -1));

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lapiz.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 119, -1));

        jLabel7.setText("Capacidad :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 80, -1));
        jPanel1.add(fecha_campaña, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 160, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
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
    private javax.swing.JTextField nombre_sede;
    private javax.swing.JTextField nomenclatura;
    // End of variables declaration//GEN-END:variables
}


