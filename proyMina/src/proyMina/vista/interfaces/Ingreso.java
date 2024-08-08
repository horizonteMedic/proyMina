
package proyMina.vista.interfaces;


import java.awt.HeadlessException;
import java.awt.Image;
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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import proyMina.modelo.clsConnection;
import proyMina.modelo.clsFunciones;
import proyMina.modelo.clsGlobales;

public final class Ingreso extends javax.swing.JFrame {
   //variales Area Usuario
    public static String doctor;
    
   clsConnection oConn = new clsConnection();
   clsFunciones  oFunc = new clsFunciones();
   public String seded="";
   
   public JComboBox cboEmpresa;
   
      public static String  ipd;

       public Ingreso()  {
            
        initComponents(); 
           
        Properties props = new Properties();
       
        FileInputStream in = null;
        try {
            in = new FileInputStream("azure.properties");
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
       //    lbliduser.setVisible(false);
            fecha();
            CargarUsuarios();
        }
        AutoCompleteDecorator.decorate(this.cboUsuarios);
    }
       
       

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btIngreso = new javax.swing.ButtonGroup();
        lblUsuario_L = new javax.swing.JLabel();
        lblpass = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        btncancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        txtFechaLogin = new javax.swing.JTextField();
        lblHora = new javax.swing.JLabel();
        txtHoraLogin = new javax.swing.JTextField();
        cboUsuarios = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ingreso a \"MEDSOFT\"");
        setMinimumSize(new java.awt.Dimension(549, 263));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        lblUsuario_L.setText("Usuario :");

        lblpass.setText("Contraseña :");

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

        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyMina/vista/imagenes/cerrar.png"))); // NOI18N
        btncancelar.setText("Cerrar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Datos de Acceso al Sistema");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carnet.png"))); // NOI18N

        lblFecha.setText("Fecha :");

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

        lblHora.setText("Hora :");

        txtHoraLogin.setEditable(false);
        txtHoraLogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHoraLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHoraLoginKeyPressed(evt);
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

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyMina/vista/imagenes/entrar.png"))); // NOI18N
        jButton1.setText("Entrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(lblUsuario_L)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel4)
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFecha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFechaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblpass)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblHora)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtHoraLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(45, 45, 45)
                                .addComponent(btncancelar)))))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUsuario_L))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblpass))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFechaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFecha))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHora)
                            .addComponent(txtHoraLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btncancelar))
                .addGap(0, 28, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(531, 246));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  
 private void validar() {
        if (cboUsuarios.getSelectedIndex() > 0) {           
            
           //doctor = cboUsuarios.getSelectedItem().toString();
            // System.out.println("nombre de la sede :"+nombresede);
            String sqlStmt;
            //String area;
            //Prepara Variable para realizar el Query
            sqlStmt = "Select name_user from desktop_empleado Where name_user='" + cboUsuarios.getSelectedItem().toString().trim()
                    + "' And pass='" + String.valueOf(txtpass.getPassword()) + "'";
            System.out.println(sqlStmt);
            oConn.FnBoolQueryExecute(sqlStmt);
            try{
             if (oConn.setResult.next()){
                         PrincipalMina s = new PrincipalMina();
                         s.setVisible(true);
                         Ingreso.this.dispose();
                         clsGlobales.sUser=cboUsuarios.getSelectedItem().toString().trim();
             }
             else 
              oFunc.SubSistemaMensajeInformacion("Usuario o Contraseña incorrectos!");

            }catch(Exception e){
                
            }
                    
           

       
        }else {
               oFunc.SubSistemaMensajeInformacion("No Tiene Autorización para Ingresar a Sistema");
              } 

 }
    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btncancelarActionPerformed

   private void cboUsuariosPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cboUsuariosPopupMenuWillBecomeInvisible
       
   }//GEN-LAST:event_cboUsuariosPopupMenuWillBecomeInvisible

   private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
 enter(evt);
   }//GEN-LAST:event_formKeyPressed

   private void txtpassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassKeyPressed
enter(evt);
   }//GEN-LAST:event_txtpassKeyPressed

   private void cboUsuariosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboUsuariosKeyPressed
 enter(evt); 
 evt.getSource().toString().toUpperCase();
   }//GEN-LAST:event_cboUsuariosKeyPressed

   private void txtFechaLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaLoginKeyPressed
enter(evt);        
   }//GEN-LAST:event_txtFechaLoginKeyPressed

   private void txtHoraLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoraLoginKeyPressed
enter(evt);
   }//GEN-LAST:event_txtHoraLoginKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       

    //DemoButtons camara=new DemoButtons();
   // camara.setVisible(true);
    
   // FirmaDigital camara=new FirmaDigital();
    //camara.setVisible(true);
    
    validar();
      
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpassActionPerformed
      validar();
    }//GEN-LAST:event_txtpassActionPerformed

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

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        cerrarVentana();
    }//GEN-LAST:event_formWindowClosing

    private void txtFechaLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaLoginActionPerformed
    public static void main(String args[]) {
             new Ingreso().setVisible(true);
    }
    
    public void cerrarVentana(){
        // JOptionPane.showMessageDialog(null, "probando para cerrar el stament");
        System.out.println("cerro esta ventana");
        try {
            oConn.sqlStmt.close();
        }  catch (SQLException ex) {
            Logger.getLogger(Ingreso.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    this.dispose();
      //  System.exit(0);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btIngreso;
    private javax.swing.JButton btncancelar;
    private javax.swing.JComboBox cboUsuarios;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblUsuario_L;
    private javax.swing.JLabel lblpass;
    private javax.swing.JTextField txtFechaLogin;
    private javax.swing.JTextField txtHoraLogin;
    private javax.swing.JPasswordField txtpass;
    // End of variables declaration//GEN-END:variables
private void enter(java.awt.event.KeyEvent evt){
int key = evt.getKeyCode();
     if (key == KeyEvent.VK_ENTER) {
        Toolkit.getDefaultToolkit().beep(); 
      //  validar();
        }
}
/*
    private void validar() {
        if (cboUsuarios.getSelectedIndex() > 0) {
            nombresede = cboSede.getSelectedItem().toString();
            doctor = cboUsuarios.getSelectedItem().toString();
            // System.out.println("nombre de la sede :"+nombresede);
            String sqlStmt;
            String area;
            // Prepara Variable para realizar el Query
            sqlStmt = "Select rol_user, sistema, admision, farmacia, cmp_user, dni_user, nombre_user, apellido_user, usuario_user, pass_user from usuarios Where usuario_user='" + cboUsuarios.getSelectedItem() + "' And pass_user='" + String.valueOf(txtpass.getPassword()) + "'";

            oConn.FnBoolQueryExecute(sqlStmt);

            try {
                if (oConn.setResult.next()) {
                    clsGlobales.sNomOperador = oConn.setResult.getString("nombre_user").concat(" ").concat(oConn.setResult.getString("apellido_user"));
                    //area=oConn.setResult.getString("area");
                    clsGlobales.sDniOperador = oConn.setResult.getString("dni_user");
                    clsGlobales.sCMPOperador = oConn.setResult.getString("cmp_user");
                    clsGlobales.sRol = oConn.setResult.getString("rol_user");

                    if (chkAdmision.isSelected() == true) {
                        if (ADMISION_CODIGO == oConn.setResult.getBoolean("admision")) {
                            Ingreso.this.dispose();
                            JOptionPane.showMessageDialog(null, "Bienvenido al Sistema " + clsGlobales.sNomOperador);
                            System.out.println("salto el mensaje de bienvenida ");
                            Admision c = new Admision();
                            System.out.println("instancia admision ");
                            c.setVisible(true);
                            System.out.println("lo manda hacer visible ");
                            c.setExtendedState(JFrame.MAXIMIZED_BOTH);
                            oConn.setResult.close();
                        } else {
                            oFunc.SubSistemaMensajeInformacion("No Tiene Autorización para Ingresar a Admisión");
                        }
                    }
                    if (chkFarmacia.isSelected() == true) {
                        if (FARMACIA_CODIGO == oConn.setResult.getBoolean("farmacia")) {
//                            IngresoConsultas s = new IngresoConsultas();
                            Ingreso.this.dispose();
                            Asistencial s=new Asistencial();
                            s.setVisible(true);
                            s.setExtendedState(JFrame.MAXIMIZED_BOTH);
                            oConn.setResult.close();
                        } else {
                            oFunc.SubSistemaMensajeInformacion("No Tiene Autorización para Ingresar a Farmacia");
                        }
                        oConn.setResult.close();
                    }
                    if (chkSistema.isSelected() == true) {
                        if (PROCESO_CODIGO == oConn.setResult.getBoolean("sistema")) {
                            Ingreso.this.dispose();
                            JOptionPane.showMessageDialog(null, "Bienvenido al Sistema " + clsGlobales.sNomOperador);
                            String user = oConn.setResult.getString("usuario_user");
                            if ("JAZABACHE".equals(user) || "HM".equals(user) || "AGARCIA".equals(user) || "KREYES".equals(user)
                                    || "MHERRERA".equals(user) || "JPOMA".equals(user) || "VERAG".equals(user)
                                    || "MPAZ".equals(user) || "MMARIÑOS".equals(user) || "JCARDENAS".equals(user)
                                    || "HCERNA".equals(user) || "JCERQUIN".equals(user) || "JCORDOVAP".equals(user)
                                    || "JCORDOVA".equals(user) || "KGUEVARA".equals(user) || "lobo".equals(user) || "MGAMBOA".equals(user)
                                    || "KCANTARO".equals(user)|| "JBRINGAS".equals(user)||"PQUISPE".equals(user)||"developer".equals(user)) {
                                Ocupacional1 s = new Ocupacional1();
                                s.setVisible(true);

                            } else {
                                Ocupacional s = new Ocupacional();
                                s.setVisible(true);
                            }

                            oConn.setResult.close();
                        } else {
                            oFunc.SubSistemaMensajeInformacion("No Tiene Autorización para Ingresar a Sistema");
                        }
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Error: usuario o contraseña incorrectos");

                }
                System.out.println("llego al setment close");
                oConn.setResult.close();
                oConn.sqlStmt.close();
            } catch (SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, e);
                oConn.SubConnectionClose();
            }
        } else {
            oFunc.SubSistemaMensajeError("Usuario incorrecto");
        }

    }
*/
 public void fecha(){
Date dateHoy = new Date();
Date dateHora = new Date();    
        // Variable para dar formato
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat FormatoHora = new SimpleDateFormat("hh:mm:ss a");
        // Inicializa Folio y Fecha
        txtFechaLogin.setText(formato.format(dateHoy));
        txtHoraLogin.setText(FormatoHora.format(dateHora));
}


 private void CargarUsuarios(){
      String sQuery;        
        // Prepara el Query
        sQuery ="SELECT name_user FROM desktop_empleado";
        
        if (oConn.FnBoolQueryExecute(sQuery))
        {
            try 
            {
                // Verifica resultados
                 while (oConn.setResult.next())
                 {                     
                     // Obtiene los datos de la Consulta
                     cboUsuarios.addItem(oConn.setResult.getString ("name_user"));
                     
                 }
                 
                 // Cierra Resultados
               
            } 
            catch (SQLException ex) 
            {
                //JOptionPane.showMessageDialorootPane,ex);
                oFunc.SubSistemaMensajeInformacion(ex.toString());
                Logger.getLogger(Ingreso.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            oConn.setResult.close();
            oConn.sqlStmt.close(); 

        } catch (SQLException ex) {
            Logger.getLogger(Ingreso.class.getName()).log(Level.SEVERE, null, ex);
        }
        // selecciona
        cboUsuarios.setSelectedIndex(0);

}
 

public void CerrarJF(){
this.dispose();
}

}

