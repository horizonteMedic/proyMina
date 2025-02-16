/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyMina.vista.interfaces;

import java.awt.Point;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import proyMina.modelo.clsConnection;
import proyMina.modelo.clsFunciones;
/*import java.awt.HeadlessException;
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
import javax.swing.JOptionPane;*/
/*import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;*/
/*import proyMina.modelo.clsConnection;
import proyMina.modelo.clsFunciones;*/
import proyMina.modelo.clsGlobales;


   //variales Area Usuario
    
public class PrincipalMina extends javax.swing.JFrame {
    
    clsFunciones  oFunc = new clsFunciones();
    clsConnection oConn = new clsConnection();    
    clsGlobales oGlob = new clsGlobales();
    

    //jFrame
   
    
    javax.swing.ImageIcon oIconoSi = new javax.swing.ImageIcon(ClassLoader.getSystemResource("imagenes/chek.gif"));
    
    
    public PrincipalMina() {
        initComponents();
        this.setSize(816,501);
        setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Paciente_Triaje = new javax.swing.JButton();
        Triaje = new javax.swing.JButton();
        Configuraciones = new javax.swing.JButton();
        Especialidad = new javax.swing.JButton();
        Reportes = new javax.swing.JButton();
        Accesos = new javax.swing.JButton();
        PorAsignar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Farmacia = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        salir_Sistema = new javax.swing.JMenuItem();
        CambiarUser = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setName(""); // NOI18N

        Paciente_Triaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgmenu/admision.png"))); // NOI18N
        Paciente_Triaje.setMaximumSize(new java.awt.Dimension(70, 70));
        Paciente_Triaje.setMinimumSize(new java.awt.Dimension(70, 70));
        Paciente_Triaje.setPreferredSize(new java.awt.Dimension(94, 72));
        Paciente_Triaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Paciente_TriajeActionPerformed(evt);
            }
        });

        Triaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgmenu/triaje.png"))); // NOI18N
        Triaje.setMaximumSize(new java.awt.Dimension(70, 70));
        Triaje.setMinimumSize(new java.awt.Dimension(70, 70));
        Triaje.setPreferredSize(new java.awt.Dimension(39, 39));
        Triaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TriajeActionPerformed(evt);
            }
        });

        Configuraciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgmenu/Configuracionprincipal.png"))); // NOI18N
        Configuraciones.setMaximumSize(new java.awt.Dimension(70, 70));
        Configuraciones.setMinimumSize(new java.awt.Dimension(70, 70));
        Configuraciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfiguracionesActionPerformed(evt);
            }
        });

        Especialidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgmenu/especialidad.png"))); // NOI18N
        Especialidad.setMaximumSize(new java.awt.Dimension(70, 70));
        Especialidad.setMinimumSize(new java.awt.Dimension(70, 70));
        Especialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EspecialidadActionPerformed(evt);
            }
        });

        Reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgmenu/reportes.png"))); // NOI18N
        Reportes.setMaximumSize(new java.awt.Dimension(70, 70));
        Reportes.setMinimumSize(new java.awt.Dimension(70, 70));
        Reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportesActionPerformed(evt);
            }
        });

        Accesos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgmenu/privilegio.png"))); // NOI18N
        Accesos.setMaximumSize(new java.awt.Dimension(70, 70));
        Accesos.setMinimumSize(new java.awt.Dimension(70, 70));
        Accesos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccesosActionPerformed(evt);
            }
        });

        PorAsignar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgmenu/contratas.png"))); // NOI18N
        PorAsignar.setMaximumSize(new java.awt.Dimension(70, 70));
        PorAsignar.setMinimumSize(new java.awt.Dimension(70, 70));
        PorAsignar.setPreferredSize(new java.awt.Dimension(70, 70));
        PorAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PorAsignarActionPerformed(evt);
            }
        });

        jLabel1.setText("Configuración");

        jLabel2.setText("Triaje");

        jLabel4.setText("Paciente y Triaje");

        jLabel3.setText("Accesos");

        jLabel8.setText("Reportes");

        jLabel6.setText("POR ASIGNAR");

        jLabel10.setText("Especialidad");

        jLabel7.setText("Farmacia");

        Farmacia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgmenu/medicamento.png"))); // NOI18N
        Farmacia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Farmacia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Farmacia.setMaximumSize(new java.awt.Dimension(70, 70));
        Farmacia.setMinimumSize(new java.awt.Dimension(70, 70));
        Farmacia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FarmaciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Paciente_Triaje, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Farmacia, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Especialidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Triaje, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(41, 41, 41)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Configuraciones, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Accesos, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Reportes, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(jLabel8)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel6))
                                    .addComponent(PorAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel2)
                        .addGap(71, 71, 71)
                        .addComponent(jLabel1)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel3)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Paciente_Triaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Triaje, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Configuraciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Accesos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Especialidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Reportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Farmacia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PorAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel7))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 440));

        jMenu1.setText("INICIO");

        salir_Sistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png"))); // NOI18N
        salir_Sistema.setText("Salir");
        salir_Sistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salir_SistemaActionPerformed(evt);
            }
        });
        jMenu1.add(salir_Sistema);

        CambiarUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        CambiarUser.setText("Cambiar de Usuario");
        CambiarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CambiarUserActionPerformed(evt);
            }
        });
        jMenu1.add(CambiarUser);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Paciente_TriajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Paciente_TriajeActionPerformed
      RegistrarPaciente rp =new RegistrarPaciente();
       rp.setVisible(true);
    }//GEN-LAST:event_Paciente_TriajeActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        TicketHistoriaClinica hc=new TicketHistoriaClinica();
        hc.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    }
    
    private void PorAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PorAsignarActionPerformed
       // CargaMasiva carga=new CargaMasiva();
       // carga.setVisible(true);
    }//GEN-LAST:event_PorAsignarActionPerformed

    private void ConfiguracionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfiguracionesActionPerformed
 //      Configuracion conf = new Configuracion();
   //     conf.setVisible(true);
    }//GEN-LAST:event_ConfiguracionesActionPerformed

    private void FarmaciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FarmaciaActionPerformed
         FarmaciaInventario fi =new FarmaciaInventario();
          fi.setVisible(true);
    }//GEN-LAST:event_FarmaciaActionPerformed

    private void TriajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TriajeActionPerformed
        Ficha_triaje_panel_principal ft =new Ficha_triaje_panel_principal();
         ft.setVisible(true);
    }//GEN-LAST:event_TriajeActionPerformed

    private void ReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportesActionPerformed
        
    }//GEN-LAST:event_ReportesActionPerformed

    private void salir_SistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir_SistemaActionPerformed
     System.exit(0);
    }//GEN-LAST:event_salir_SistemaActionPerformed

    private void CambiarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CambiarUserActionPerformed
       Ingreso i = new Ingreso();
        i.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CambiarUserActionPerformed

    private void AccesosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccesosActionPerformed
       if(clsGlobales.sUser.contains("caguirre"))
       {
        RegistrarEmpleUser reu = new RegistrarEmpleUser();
        reu.setVisible(true);
        //this.dispose();
       }
    }//GEN-LAST:event_AccesosActionPerformed

    private void EspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EspecialidadActionPerformed
        TicketHistoriaClinica hc=new TicketHistoriaClinica();
        hc.setVisible(true);
       
    }//GEN-LAST:event_EspecialidadActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalMina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalMina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalMina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalMina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalMina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Accesos;
    private javax.swing.JMenuItem CambiarUser;
    private javax.swing.JButton Configuraciones;
    private javax.swing.JButton Especialidad;
    private javax.swing.JButton Farmacia;
    private javax.swing.JButton Paciente_Triaje;
    private javax.swing.JButton PorAsignar;
    private javax.swing.JButton Reportes;
    private javax.swing.JButton Triaje;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuItem salir_Sistema;
    // End of variables declaration//GEN-END:variables

    
    private static class ph {

        public ph() {
        }
    }
}
