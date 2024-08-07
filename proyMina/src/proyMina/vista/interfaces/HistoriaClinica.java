/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyMina.vista.interfaces;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import proyMina.modelo.clsConnection;
import proyMina.modelo.clsFunciones;
import proyMina.modelo.clsOperacionesUsuarios;

public class HistoriaClinica extends javax.swing.JFrame {

    clsConnection oConn = new clsConnection();
    clsFunciones oFunc = new clsFunciones();
    clsOperacionesUsuarios oPe = new clsOperacionesUsuarios();
    
    public HistoriaClinica() {
        initComponents();
        AutoCompleteDecorator.decorate(this.cboEmpresa);
        AutoCompleteDecorator.decorate(this.cboContrata); 
        cargarEmpresaContrata("EMPRESA");
        cargarEmpresaContrata("CONTRATA");
              
        
        this.setLocationRelativeTo(null);
    }

    private void cargarEmpresaContrata(String tipo){
            try {
                String sQuery;
                // Prepara el Query
                sQuery ="SELECT UPPER(razon_social) AS razon_social FROM desktop_empresa_contrata where tipo_emp_cont = '"+tipo+"'";
                System.out.println(sQuery);
                if (oConn.FnBoolQueryExecute(sQuery))
                {
                    try
                    {
                        // Verifica resultados
                        while (oConn.setResult.next())
                        {
                            if(tipo.contains("EMPRESA")){
                                String tipo_E_C=oConn.setResult.getString("razon_social").trim().toUpperCase();                                   
                               
                                cboEmpresa.addItem(tipo_E_C);
                                 
                            }else
                                cboContrata.addItem(oConn.setResult.getString ("razon_social"));
                            
                        }
                        
                        // Cierra Resultados
                        oConn.setResult.close();
                    }
                    catch (SQLException ex)
                    {
                        //JOptionPane.showMessageDialorootPane,ex);
                        oFunc.SubSistemaMensajeInformacion(ex.toString());
                        Logger.getLogger(HistoriaClinica.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                // selecciona
               if(tipo.contains("EMPRESA")){
                    cboEmpresa.setSelectedIndex(0);
                    }else
                    cboContrata.setSelectedIndex(0);
                oConn.sqlStmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(HistoriaClinica.class.getName()).log(Level.SEVERE, null, ex);
            }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        BuscarPaciente = new javax.swing.JToggleButton();
        dni_paciente = new javax.swing.JTextField();
        nombres = new javax.swing.JTextField();
        edad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JToggleButton();
        jLabel6 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JToggleButton();
        btnEditar = new javax.swing.JToggleButton();
        cboEmpresa = new javax.swing.JComboBox();
        cboContrata = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("HISTORIA CLINICA ");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS DEL PACIENTE"));

        BuscarPaciente.setBackground(new java.awt.Color(222, 116, 17));
        BuscarPaciente.setForeground(new java.awt.Color(243, 131, 5));
        BuscarPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        BuscarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarPacienteActionPerformed(evt);
            }
        });

        dni_paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dni_pacienteActionPerformed(evt);
            }
        });
        dni_paciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dni_pacienteKeyTyped(evt);
            }
        });

        nombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombresActionPerformed(evt);
            }
        });

        jLabel1.setText("DNI :");

        jLabel2.setText("NOMBRES Y APELLIDOS :");

        jLabel3.setText("EDAD :");

        jLabel4.setText("años");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nombres)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(dni_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BuscarPaciente)
                                .addGap(0, 40, Short.MAX_VALUE)))
                        .addGap(12, 12, 12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dni_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BuscarPaciente))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jLabel5.setText("EMPRESA :");

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel6.setText("CONTRATA :");

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/chek.gif"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lapiz.png"))); // NOI18N
        btnEditar.setText("Editar");

        cboEmpresa.setEditable(true);
        cboEmpresa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "seleccione una opcion" }));
        cboEmpresa.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cboEmpresaPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cboEmpresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboEmpresaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cboEmpresaMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cboEmpresaMousePressed(evt);
            }
        });
        cboEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEmpresaActionPerformed(evt);
            }
        });
        cboEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cboEmpresaKeyPressed(evt);
            }
        });

        cboContrata.setEditable(true);
        cboContrata.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "seleccione una opcion" }));
        cboContrata.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cboContrataPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cboContrata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboContrataMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cboContrataMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cboContrataMousePressed(evt);
            }
        });
        cboContrata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboContrataActionPerformed(evt);
            }
        });
        cboContrata.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cboContrataKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboEmpresa, 0, 343, Short.MAX_VALUE)
                            .addComponent(cboContrata, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cboEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cboContrata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnAgregar)
                    .addComponent(btnEditar))
                .addContainerGap(9, Short.MAX_VALUE))
        );

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarPacienteActionPerformed
    if(!dni_paciente.getText().isEmpty()){
            BuscarPaciente();
       }  
       
    }//GEN-LAST:event_BuscarPacienteActionPerformed

    private void dni_pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dni_pacienteActionPerformed
        nombres.requestFocus();
        BuscarPaciente();
        
    }//GEN-LAST:event_dni_pacienteActionPerformed

    private void nombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombresActionPerformed

    private void cboEmpresaPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cboEmpresaPopupMenuWillBecomeInvisible

    }//GEN-LAST:event_cboEmpresaPopupMenuWillBecomeInvisible

    private void cboEmpresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboEmpresaMouseClicked

    }//GEN-LAST:event_cboEmpresaMouseClicked

    private void cboEmpresaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboEmpresaMouseEntered

    }//GEN-LAST:event_cboEmpresaMouseEntered

    private void cboEmpresaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboEmpresaMousePressed

    }//GEN-LAST:event_cboEmpresaMousePressed

    private void cboEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEmpresaActionPerformed

    }//GEN-LAST:event_cboEmpresaActionPerformed

    private void cboEmpresaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboEmpresaKeyPressed

    }//GEN-LAST:event_cboEmpresaKeyPressed

    private void cboContrataPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cboContrataPopupMenuWillBecomeInvisible

    }//GEN-LAST:event_cboContrataPopupMenuWillBecomeInvisible

    private void cboContrataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboContrataMouseClicked

    }//GEN-LAST:event_cboContrataMouseClicked

    private void cboContrataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboContrataMouseEntered

    }//GEN-LAST:event_cboContrataMouseEntered

    private void cboContrataMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboContrataMousePressed

    }//GEN-LAST:event_cboContrataMousePressed

    private void cboContrataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboContrataActionPerformed

    }//GEN-LAST:event_cboContrataActionPerformed

    private void cboContrataKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboContrataKeyPressed

    }//GEN-LAST:event_cboContrataKeyPressed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void dni_pacienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dni_pacienteKeyTyped
       int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;        
    if (!numeros)
    {
        evt.consume();
    }        
    if(dni_paciente.getText().length()>=8)
     {
       evt.consume();
     }
    }//GEN-LAST:event_dni_pacienteKeyTyped

    public void BuscarPaciente(){
    if(!dni_paciente.getText().isEmpty()){
          String Sql="SELECT dni, p.nombres ||' '|| p.apellidos as nombres, EXTRACT(YEAR FROM age(current_date,p.fecha_nacimiento)) AS  edad from desktop_datos_pacientes as p  "                
                +"WHERE dni ='"+dni_paciente.getText().trim()+"'"; 
                System.out.println(Sql);                
          oConn.FnBoolQueryExecute(Sql);
          try {
                if (oConn.setResult.next()) {
                    dni_paciente.setText(oConn.setResult.getString("dni"));
                    nombres.setText(oConn.setResult.getString("nombres"));                    
                    edad.setText(oConn.setResult.getString("edad"));
                                     
                    btnAgregar.setEnabled(true);                    
                    btnEditar.setEnabled(false);
                    btnLimpiar.setEnabled(true);
                    }else{
                    oFunc.SubSistemaMensajeError("No se encuentra registro del paciente");
                }
                oConn.sqlStmt.close();
            } catch (SQLException ex) {
                oFunc.SubSistemaMensajeInformacion("Error:" + ex.getMessage());
            }
      }
      else
            oFunc.SubSistemaMensajeError("Debes crear al paciente");
    
    
    
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
            java.util.logging.Logger.getLogger(HistoriaClinica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HistoriaClinica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HistoriaClinica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HistoriaClinica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HistoriaClinica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BuscarPaciente;
    private javax.swing.JToggleButton btnAgregar;
    private javax.swing.JToggleButton btnEditar;
    private javax.swing.JToggleButton btnLimpiar;
    private javax.swing.JComboBox cboContrata;
    private javax.swing.JComboBox cboEmpresa;
    private javax.swing.JTextField dni_paciente;
    private javax.swing.JTextField edad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nombres;
    // End of variables declaration//GEN-END:variables
}
