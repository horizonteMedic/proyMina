/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyMina.vista.interfaces;

import java.awt.TextField;
import java.sql.SQLException;
import javax.swing.JTextField;
import java.text.SimpleDateFormat;
import java.util.Date;
import proyMina.modelo.clsConnection;
import proyMina.modelo.clsFunciones;
import proyMina.modelo.clsGlobales;
import proyMina.modelo.clsOperacionesUsuarios;
import static proyMina.modelo.clsConnection.oConnection;

public final class RegistrarRol extends javax.swing.JFrame {
    clsConnection oConn = new clsConnection();
    clsFunciones oFunc = new clsFunciones();
    clsOperacionesUsuarios oPe = new clsOperacionesUsuarios();
    Date dateHoy = new Date();
    SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");  
    public RegistrarRol() {
        initComponents();
        limpiar();
        agregar();
        btnEditar.setEnabled(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        agregar = new javax.swing.JButton();
        nombre_rol = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        descripcion = new javax.swing.JTextField();
        estado = new javax.swing.JCheckBox();
        btnEditar = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar Nuevo Rol");

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/chek.gif"))); // NOI18N
        agregar.setText("Guardar / Actualizar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        nombre_rol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_rolActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre de Rol : ");

        jLabel2.setText("Descripción : ");

        estado.setText("Activo");

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(estado)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nombre_rol, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(btnEditar)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombre_rol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(limpiar))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(estado)
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(agregar)
                        .addContainerGap())))
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
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombre_rolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_rolActionPerformed
        descripcion.requestFocus();
        descripcion.setText(""); 
        // enter para buscar si existe el rol
        if(!nombre_rol.getText().isEmpty()){
            if(!oPe.validarText(nombre_rol, "desktop_rol","nombre_rol"))  {
            String Sql="select nombre_rol, descripcion , estado "                
                +"FROM desktop_rol "                
                +"WHERE nombre_rol ='"+nombre_rol.getText().toUpperCase()+"'";                      
          oConn.FnBoolQueryExecute(Sql);
          try {
                if (oConn.setResult.next()) {
                    nombre_rol.setText(oConn.setResult.getString("nombre_rol"));
                    descripcion.setText(oConn.setResult.getString("descripcion"));
                    estado.setSelected(oConn.setResult.getBoolean("estado"));
                    }else{
                    oFunc.SubSistemaMensajeError("No se encuentra registro del rol ");
                }
                oConn.sqlStmt.close();
            } catch (SQLException ex) {
              oFunc.SubSistemaMensajeInformacion("Error :" + ex.getMessage());
            }
            }
            else
                { oFunc.SubSistemaMensajeError("El rol si existe si desea actualizar - click Editar");
                    btnEditar.setEnabled(true);
                    agregar.setEnabled(false);
                }
            }        
    }//GEN-LAST:event_nombre_rolActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_limpiarActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
      if(oPe.validarText(nombre_rol, "desktop_rol","nombre_rol"))  {
        actualizar();
       }else{
        agregar();
       }
    }//GEN-LAST:event_agregarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
      if(!nombre_rol.getText().isEmpty()){
          String Sql="select nombre_rol,descripcion ,estado , r.*"                
                +"FROM desktop_rol as r "                
                +"WHERE nombre_rol ='"+nombre_rol.getText().toUpperCase()+"'"; 
                System.out.println(Sql);                
          oConn.FnBoolQueryExecute(Sql);
          try {
                if (oConn.setResult.next()) {
                    nombre_rol.setText(oConn.setResult.getString("nombre_rol"));
                    descripcion.setText(oConn.setResult.getString("descripcion"));
                    estado.setSelected(oConn.setResult.getBoolean("estado"));
                    agregar.setEnabled(true);
                    btnEditar.setEnabled(false);
                    }else{
                    oFunc.SubSistemaMensajeError("No se encuentra registro del rol ");
                }
                oConn.sqlStmt.close();
            } catch (SQLException ex) {
                oFunc.SubSistemaMensajeInformacion("Error:" + ex.getMessage());
            }
      }
      else
            oFunc.SubSistemaMensajeError("debes crear un nuevo rol");
    }//GEN-LAST:event_btnEditarActionPerformed

    /**
     */
   
    
    private void agregar(){
             
        if (!nombre_rol.getText().isEmpty()){
            String strSqlStmt;
            String Query ;
            strSqlStmt="INSERT INTO desktop_rol (";
            Query="Values(";
            if (!nombre_rol.getText().isEmpty() )
                {strSqlStmt += "nombre_rol";Query += "'"+nombre_rol.getText().toUpperCase().trim()+"'";}
                strSqlStmt += ",descripcion";Query += ",'"+descripcion.getText().toUpperCase().trim()+ "'";
                strSqlStmt += ",estado";Query += ",'"+estado.isSelected()+ "'";
                //Auditoria
                strSqlStmt += ",user_registro";Query += ",'"+clsGlobales.sUser+ "'";
                strSqlStmt += ",fecha_registro";Query += ",'"+formato.format(dateHoy)+ "'";
                
            System.out.println("el comando es: " + strSqlStmt.concat(") ") + Query.concat(")")); 
            if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt.concat(") ") + Query.concat(")"))){
                oFunc.SubSistemaMensajeInformacion("Se ha agregado un nuevo rol con Éxito");
                limpiar();
            } else{
                    oFunc.SubSistemaMensajeError("Error en registro del rol ");
                       }                         
            }
            }

    public void actualizar(){
        String Key=nombre_rol.getText();
         if(!nombre_rol.getText().isEmpty()){                
            String strSqlStmt;
            String Query ;
            strSqlStmt="UPDATE desktop_rol ";
            Query="SET ";          
            Query += "nombre_rol='"+nombre_rol.getText().toUpperCase().trim()+ "'";
            Query += ",descripcion='"+descripcion.getText().toUpperCase().trim()+ "'";
            Query += ",estado='"+estado.isSelected()+ "'";
            Query += ",user_actualizacion='"+clsGlobales.sUser+ "'";
            Query += ",fecha_actualizacion='"+formato.format(dateHoy)+ "'";

            Query +=" WHERE nombre_rol='" + Key + "'";
            System.out.println("El comando es :" + strSqlStmt + Query );
            if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt + Query)){
                oFunc.SubSistemaMensajeInformacion("Se ha actualizado con Éxito");
                limpiar();                                             
            }else{
                 oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");
                 }            
    }
    }
   
    public void limpiar(){
        nombre_rol.setText(null);
        descripcion.setText(null);
        estado.setSelected(true);
        btnEditar.setEnabled(false);
        agregar.setEnabled(true);
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
            java.util.logging.Logger.getLogger(RegistrarRol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarRol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarRol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarRol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarRol().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JTextField descripcion;
    private javax.swing.JCheckBox estado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField nombre_rol;
    // End of variables declaration//GEN-END:variables


}
