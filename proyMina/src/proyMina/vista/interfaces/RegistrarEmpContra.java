/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyMina.vista.interfaces;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import proyMina.modelo.clsConnection;
import proyMina.modelo.clsFunciones;
import proyMina.modelo.clsGlobales;
import proyMina.modelo.clsOperacionesUsuarios;


public class RegistrarEmpContra extends javax.swing.JFrame {

    Date dateHoy = new Date();
    SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
    clsConnection oConn = new clsConnection();
    clsFunciones oFunc = new clsFunciones();
    clsOperacionesUsuarios oPe = new clsOperacionesUsuarios();
    public RegistrarEmpContra() {       
        initComponents();        
        setLocationRelativeTo(null);          
    }  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RegistrarEmpresaoContrata = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ruc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        razon_social = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        celular = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        responsable = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        correo = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        tipo_emp_cont = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("AGREGAR  UNA EMPRESA O CONTRATA");
        setResizable(false);

        RegistrarEmpresaoContrata.setToolTipText("SSS");

        jLabel6.setText("Tipo : ");

        jLabel1.setText("Ruc :");

        ruc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rucActionPerformed(evt);
            }
        });
        ruc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rucKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rucKeyTyped(evt);
            }
        });

        jLabel2.setText("Razon Social : ");

        razon_social.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                razon_socialActionPerformed(evt);
            }
        });

        jLabel3.setText("Direccion : ");

        direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionActionPerformed(evt);
            }
        });

        jLabel4.setText("Telefono : ");

        celular.setText(" ");
        celular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celularActionPerformed(evt);
            }
        });
        celular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                celularKeyTyped(evt);
            }
        });

        jLabel7.setText("Respondable : ");

        responsable.setText(" ");
        responsable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                responsableActionPerformed(evt);
            }
        });

        jLabel5.setText("Email : ");

        correo.setText(" ");
        correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoActionPerformed(evt);
            }
        });

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/chek.gif"))); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lapiz.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        tipo_emp_cont.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion", "EMPRESA", "CONTRATA" }));
        tipo_emp_cont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo_emp_contActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel5)
                                .addGap(12, 12, 12)
                                .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(direccion))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(celular))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(13, 13, 13)
                                .addComponent(responsable, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(tipo_emp_cont, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(razon_social, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(ruc, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(ruc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tipo_emp_cont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(razon_social, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnLimpiar)))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(responsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnRegistrar))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout RegistrarEmpresaoContrataLayout = new javax.swing.GroupLayout(RegistrarEmpresaoContrata);
        RegistrarEmpresaoContrata.setLayout(RegistrarEmpresaoContrataLayout);
        RegistrarEmpresaoContrataLayout.setHorizontalGroup(
            RegistrarEmpresaoContrataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistrarEmpresaoContrataLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        RegistrarEmpresaoContrataLayout.setVerticalGroup(
            RegistrarEmpresaoContrataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RegistrarEmpresaoContrata, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RegistrarEmpresaoContrata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        RegistrarEmpresaoContrata.getAccessibleContext().setAccessibleName("AGREGAR EMPRESA O CONTRATA");

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    private void rucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rucActionPerformed
        tipo_emp_cont.requestFocus();        
        if(!ruc.getText().isEmpty()){
            if(!oPe.validar(ruc, "desktop_empresa_contrata","ruc"))  {
             oFunc.SubSistemaMensajeError("El Ruc no se encuentra Registrado ");
                    btnEditar.setEnabled(false);
                    btnActualizar.setEnabled(false);
                    btnRegistrar.setEnabled(true);
                    btnLimpiar.setEnabled(true);
            }
            else
                { oFunc.SubSistemaMensajeError("El Ruc si existe si desea actualizar - click en Editar");
                    btnEditar.setEnabled(true);
                    btnActualizar.setEnabled(true);
                    btnLimpiar.setEnabled(true);
                    btnRegistrar.setEnabled(false);
                }
            }           
    }//GEN-LAST:event_rucActionPerformed

    private void razon_socialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_razon_socialActionPerformed
        direccion.requestFocus();
    }//GEN-LAST:event_razon_socialActionPerformed

    private void celularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celularActionPerformed
       responsable.requestFocus();
    }//GEN-LAST:event_celularActionPerformed

    private void responsableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_responsableActionPerformed
        correo.requestFocus();
    }//GEN-LAST:event_responsableActionPerformed

    private void direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionActionPerformed
        celular.requestFocus();
    }//GEN-LAST:event_direccionActionPerformed

    private void correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        btnActualizar();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        btnLimpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        btnRegistrar();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if(!ruc.getText().isEmpty()){
          String Sql="select ruc,razon_social,tipo_emp_cont,responsable,direccion,correo ,celular "                
                +"FROM desktop_empresa_contrata as r "                
                +"WHERE ruc ='"+ruc.getText().trim()+"'"; 
                System.out.println(Sql);                
          oConn.FnBoolQueryExecute(Sql);
          try {
                if (oConn.setResult.next()) {
                    ruc.setText(oConn.setResult.getString("ruc"));                    
                    razon_social.setText(oConn.setResult.getString("razon_social"));
                    responsable.setText(oConn.setResult.getString("responsable"));
                    direccion.setText(oConn.setResult.getString("direccion"));
                    correo.setText(oConn.setResult.getString("correo"));
                    celular.setText(oConn.setResult.getString("celular"));
                    
                    String tipo_E_C=oConn.setResult.getString("tipo_emp_cont").trim().toUpperCase();  
                    System.out.println("tipo de empresa y contrata: "+tipo_E_C);
                    tipo_emp_cont.setSelectedItem(tipo_E_C);  
                    
                    btnRegistrar.setEnabled(false);
                    btnActualizar.setEnabled(true);
                    btnEditar.setEnabled(false);
                    btnLimpiar.setEnabled(true);
                    }else{
                    oFunc.SubSistemaMensajeError("No se encuentra registro del ruc ");
                }
                oConn.sqlStmt.close();
            } catch (SQLException ex) {
                oFunc.SubSistemaMensajeInformacion("Error:" + ex.getMessage());
            }
      }      
    }//GEN-LAST:event_btnEditarActionPerformed

    private void rucKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rucKeyPressed
    
    }//GEN-LAST:event_rucKeyPressed

    private void rucKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rucKeyTyped
    int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;        
    if (!numeros)
    {
        evt.consume();
    }        
    if(ruc.getText().length()>=10)
     {
       evt.consume();
     }
    }//GEN-LAST:event_rucKeyTyped

    private void celularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_celularKeyTyped
       int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;        
    if (!numeros)
    {
        evt.consume();
    }        
    if(ruc.getText().length()>=9)
     {
       evt.consume();
     }
    }//GEN-LAST:event_celularKeyTyped

    private void tipo_emp_contActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo_emp_contActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipo_emp_contActionPerformed

        
    private void btnActualizar(){
    String Key=ruc.getText();
         if(!ruc.getText().isEmpty()){                
            String strSqlStmt;
            String Query ;
            strSqlStmt="UPDATE desktop_empresa_contrata ";
            Query="SET ";          
            Query += "ruc='"+ruc.getText().toUpperCase().trim()+ "'";
            Query += ",tipo_emp_cont='"+tipo_emp_cont.getSelectedItem().toString().trim()+ "'";
            Query += ",razon_social='"+razon_social.getText().toUpperCase().trim()+ "'";
            Query += ",direccion='"+direccion.getText().toUpperCase().trim()+ "'";
            Query += ",responsable='"+responsable.getText().toUpperCase().trim()+ "'";
            Query += ",correo='"+correo.getText().toUpperCase().trim()+ "'";
            Query += ",celular='"+celular.getText()+ "'"; 
            
            Query += ",user_actualizacion='"+clsGlobales.sUser+ "'";
            Query += ",fecha_actualizacion='"+formato.format(dateHoy)+ "'";

            Query +=" WHERE ruc='" + Key + "'";
            System.out.println("El comando es :" + strSqlStmt + Query );
            if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt + Query)){
                oFunc.SubSistemaMensajeInformacion("Se ha actualizado con Éxito");
                btnLimpiar();                                             
            }else{
                 oFunc.SubSistemaMensajeError("error en registro");
                 }            
    }
    }
    
    private void btnRegistrar(){
    if (!ruc.getText().isEmpty()){
            if(!oPe.validar(ruc,"desktop_empresa_contrata","ruc")){
            if (Validar()){
                int key= oFunc.contadorPrimario("desktop_empresa_contrata");
            String strSqlStmt;
            String Query ;
            strSqlStmt="INSERT INTO desktop_empresa_contrata (";
            Query="Values(";
            strSqlStmt += "id_emp_contrata";Query +=key+",";
            strSqlStmt += ",ruc";Query += ruc.getText().trim();
            strSqlStmt += ",razon_social";Query += ",'"+razon_social.getText().toString().toUpperCase().trim()+ "'";
            strSqlStmt += ",tipo_emp_cont";Query += ",'"+tipo_emp_cont.getSelectedItem().toString().trim()+ "'";
            strSqlStmt += ",direccion";Query += ",'"+direccion.getText().toString().toUpperCase().trim()+ "'";
            strSqlStmt += ",responsable";Query += ",'"+responsable.getText().toString().toUpperCase().trim()+ "'";
            strSqlStmt += ",correo";Query += ",'"+correo.getText().toString().toUpperCase().trim()+ "'";
            strSqlStmt += ",celular";Query += ",'"+celular.getText().toString().toUpperCase().trim()+ "'";     
            strSqlStmt += ",user_registro";Query += ",'"+clsGlobales.sUser+ "'";
            strSqlStmt += ",fecha_registro";Query += ",'"+formato.format(dateHoy)+ "'";
            
            System.out.println("el comando es: " + strSqlStmt.concat(") ") + Query.concat(")")); 
            if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt.concat(") ") + Query.concat(")"))){
                oFunc.SubSistemaMensajeInformacion("Se ha registrado con Éxito");
                btnLimpiar();
            } else{
                    oFunc.SubSistemaMensajeError("No se pudo Registrar");
                    btnEditar.setEnabled(false);
                    btnActualizar.setEnabled(false);
                       }         
            }        
        }   
            else                     
                oFunc.SubSistemaMensajeError("El Ruc ya se encuentra Registrado ");
    }
    
    }
    private boolean Validar(){
   boolean bResultado=true;
   if ( ruc.getText().trim().length() <= 11 )
       {
       } else {  
       oFunc.SubSistemaMensajeError("El Ruc debe tener 11 digitos");
       bResultado = false;
        }
   if(ruc.toString().isEmpty()){
          oFunc.SubSistemaMensajeError("El ruc es necesario");
       bResultado = false;
   }
       
  return bResultado;
}
    
    private void btnLimpiar(){
        ruc.setText(null);
        razon_social.setText(null);
        direccion.setText(null);
        responsable.setText(null);
        correo.setText(null);
        celular.setText(null);
        tipo_emp_cont.setSelectedItem(null);
        btnActualizar.setEnabled(true);
        btnEditar.setEnabled(true);
        btnRegistrar.setEnabled(true);
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
            java.util.logging.Logger.getLogger(RegistrarEmpContra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarEmpContra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarEmpContra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarEmpContra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarEmpContra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel RegistrarEmpresaoContrata;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JTextField celular;
    private javax.swing.JTextField correo;
    private javax.swing.JTextField direccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField razon_social;
    private javax.swing.JTextField responsable;
    private javax.swing.JTextField ruc;
    private javax.swing.JComboBox<String> tipo_emp_cont;
    // End of variables declaration//GEN-END:variables

    void setFrameIcon(ImageIcon ticon) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void moveToFront() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
