/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyMina.vista.interfaces;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import proyMina.modelo.clsConnection;
import proyMina.modelo.clsFunciones;
import proyMina.modelo.clsGlobales;
import static proyMina.vista.interfaces.Ingreso.ipd;

/**
 *
 * @author josue
 */
public class LoginProyMina extends javax.swing.JFrame {

    
   clsConnection oConn = new clsConnection();
   clsFunciones  oFunc = new clsFunciones();
      public String seded="";
      public static String  nombresede;
      public static String  ipd;
    /**
     * Creates new form LoginProyMina
     */
    public LoginProyMina() {
        initComponents();
        Properties props = new Properties();
       
        FileInputStream in = null;
        try {
            in = new FileInputStream("pierola.properties");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ingreso.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            props.load(in);
        } catch (IOException ex) {
            Logger.getLogger(Ingreso.class.getName()).log(Level.SEVERE, null, ex);
        }
           String url = props.getProperty("dataBaseServer");
           String db = props.getProperty("dataBaseCatalog");
           String username = props.getProperty("dataBaseUser");
           String password = props.getProperty("dataBasePassword");
           seded=props.getProperty("nameSede");
           clsGlobales.sedeSede=props.getProperty("nameSede");
           clsGlobales.ipIp=props.getProperty("dataBaseServer");
           ipd= props.getProperty("dataBaseServer");
      if (! oConn.FnBoolConnectionOpen("org.postgresql.Driver", "jdbc:postgresql://"+url+ ":5432/"+ db,username,password))
        {
          JOptionPane.showMessageDialog(null,"No se logro la conexion al Host");
          System.exit(0);
        }
        else
        {
           initComponents(); 
          // lbliduser.setVisible(false);
            fecha();
            CargarUsuarios();
           // CargarSedes();
        }
        AutoCompleteDecorator.decorate(this.cboUsuarios);

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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cboUsuarios = new javax.swing.JComboBox();
        txtpass = new javax.swing.JPasswordField();
        txtFechaLogin = new javax.swing.JTextField();
        txtHoraLogin = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel1.setText("Log In");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        jLabel2.setText("Hora:");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyMina/vista/imagenes/Logo.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        jLabel4.setText("Usuario:");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        jLabel5.setText("Contraseña:");

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        jLabel6.setText("Fecha:");

        jButton1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyMina/vista/imagenes/entrar.png"))); // NOI18N
        jButton1.setText("Entrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyMina/vista/imagenes/cerrar.png"))); // NOI18N
        jButton2.setText("Cerrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        cboUsuarios.setEditable(true);
        cboUsuarios.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione algun usuario" }));
        cboUsuarios.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cboUsuariosPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cboUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboUsuariosActionPerformed(evt);
            }
        });
        cboUsuarios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cboUsuariosKeyPressed(evt);
            }
        });

        txtpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpassActionPerformed(evt);
            }
        });
        txtpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpassKeyPressed(evt);
            }
        });

        txtFechaLogin.setEditable(false);
        txtFechaLogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFechaLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaLoginActionPerformed(evt);
            }
        });
        txtFechaLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFechaLoginKeyPressed(evt);
            }
        });

        txtHoraLogin.setEditable(false);
        txtHoraLogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHoraLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHoraLoginKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(133, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFechaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHoraLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(174, 174, 174))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(284, 284, 284))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(85, 85, 85)
                        .addComponent(jButton2)
                        .addGap(185, 185, 185))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtFechaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cboUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtHoraLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(39, 39, 39))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cboUsuariosPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cboUsuariosPopupMenuWillBecomeInvisible

    }//GEN-LAST:event_cboUsuariosPopupMenuWillBecomeInvisible

    private void cboUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboUsuariosActionPerformed
        cboUsuarios.getEditor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(cboUsuarios.getSelectedIndex()<=-1 )
                {

                }else{

                    txtpass.requestFocus();
                }

            }});
    }//GEN-LAST:event_cboUsuariosActionPerformed

    private void cboUsuariosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboUsuariosKeyPressed
        enter(evt);
        evt.getSource().toString().toUpperCase();
    }//GEN-LAST:event_cboUsuariosKeyPressed

    private void txtpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpassActionPerformed
        //validar();
    }//GEN-LAST:event_txtpassActionPerformed

    private void txtpassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassKeyPressed
        enter(evt);
    }//GEN-LAST:event_txtpassKeyPressed

    private void txtFechaLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaLoginActionPerformed

    private void txtFechaLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaLoginKeyPressed
        enter(evt);
    }//GEN-LAST:event_txtFechaLoginKeyPressed

    private void txtHoraLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoraLoginKeyPressed
        enter(evt);
    }//GEN-LAST:event_txtHoraLoginKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed


 

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
            java.util.logging.Logger.getLogger(LoginProyMina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginProyMina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginProyMina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginProyMina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginProyMina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cboUsuarios;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtFechaLogin;
    private javax.swing.JTextField txtHoraLogin;
    private javax.swing.JPasswordField txtpass;
    // End of variables declaration//GEN-END:variables

    private void enter(java.awt.event.KeyEvent evt){
int key = evt.getKeyCode();
     if (key == KeyEvent.VK_ENTER) {
        Toolkit.getDefaultToolkit().beep(); 
     //   validar();
        }
}
    
     public void fecha(){
        Date dateHoy = new Date();
   
        // Variable para dar formato
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                txtFechaLogin.setText(formato.format(dateHoy));

        // Inicializa Folio y Fecha
         System.out.println("la fecha es :" + formato.format(dateHoy));


}
 
 public void hora(){
         Date dateHora = new Date(); 
        SimpleDateFormat FormatoHora = new SimpleDateFormat("hh:mm:ss a");
        txtHoraLogin.setText(FormatoHora.format(dateHora));
         System.out.println("la hora es :" + txtHoraLogin.getText());
         System.out.println("la hora es :" + FormatoHora.format(dateHora));
 }
 private void CargarUsuarios(){
      String sQuery;        
        // Prepara el Query
        sQuery ="SELECT usuario_user FROM usuarios";
        
        if (oConn.FnBoolQueryExecute(sQuery))
        {
            try 
            {
                // Verifica resultados
                 while (oConn.setResult.next())
                 {                     
                     // Obtiene los datos de la Consulta
                     cboUsuarios.addItem(oConn.setResult.getString ("usuario_user"));
                     System.out.println(oConn.setResult.getString ("usuario_user"));
                 }
                 
                 // Cierra Resultados
               
            } 
            catch (SQLException ex) 
            {
                //JOptionPane.showMessageDialorootPane,ex);
                oFunc.SubSistemaMensajeInformacion(ex.toString());
                Logger.getLogger(LoginProyMina.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            oConn.setResult.close();
            oConn.sqlStmt.close(); 

        } catch (SQLException ex) {
            Logger.getLogger(LoginProyMina.class.getName()).log(Level.SEVERE, null, ex);
        }
        // selecciona
        cboUsuarios.setSelectedIndex(0);

}
}
