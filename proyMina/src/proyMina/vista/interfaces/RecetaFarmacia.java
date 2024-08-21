/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyMina.vista.interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import proyMina.modelo.clsConnection;
import proyMina.modelo.clsFunciones;
import proyMina.modelo.clsGlobales;
import proyMina.modelo.clsOperacionesUsuarios;

/**
 *
 * @author josue
 */
public class RecetaFarmacia extends javax.swing.JFrame {
    Date dateHoy = new Date();
    SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
    clsConnection oConn = new clsConnection();
    clsFunciones oFunc = new clsFunciones();
    clsOperacionesUsuarios oPe = new clsOperacionesUsuarios();
        DefaultTableModel model; 
    int dni=0;
    int dias=0, horas=0, cantidad=0, primaria=0,id_farmacia=0;
    String id_receta_medica="";
    boolean validador=true;
    /**
     * Creates new form RecetaFarmacia
     */
    public RecetaFarmacia() {
        initComponents();
        setLocationRelativeTo(null);  
        AutoCompleteDecorator.decorate(cboMedicamento1);
        primaria=idDiagnosticoPorEspecialidad();
        jButtonUpdate.setEnabled(false);
        btnRegistrar.setEnabled(true);
        cargarMedicamentos();
        jTextFieldDiagnostico.setEnabled(false);
        jTextFieldDiagnostico.setText(clsGlobales.descripcionDiagnostico);
        jTextFieldCodigoDiag.setEnabled(false);
        jTextFieldCodigoDiag.setText(clsGlobales.codigoDiagnostico);
        llenar_tabla_recetaFarmacia();
        popuptable();
    }
       public void popuptable(){
    JPopupMenu popupMenu=new JPopupMenu();
    JMenuItem menuItem1=new JMenuItem("Editar Registro");

    menuItem1.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae) {
     int a =jTable1.getSelectedRow();
     id_receta_medica=jTable1.getValueAt(a,0).toString();
           editarRegistro(id_receta_medica);
             //  JOptionPane.showMessageDialog(null, "Registro Eliminado");
        }
    
    });   
    

    popupMenu.add(menuItem1);   

    jTable1.setComponentPopupMenu(popupMenu);
  
    }  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cboMedicamento1 = new javax.swing.JComboBox();
        jTextFieldCantidad1 = new javax.swing.JTextField();
        jTextFieldHorario1 = new javax.swing.JTextField();
        jTextFieldFrecuencia1 = new javax.swing.JTextField();
        jTextFieldObserv1 = new javax.swing.JTextField();
        jTextFieldDiagnostico = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnLimpiarCancelarTriaje = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextFieldCodigoDiag = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        btnImprimir = new javax.swing.JButton();
        txtImp = new javax.swing.JTextField();
        jButtonUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        cboMedicamento1.setEditable(true);
        cboMedicamento1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "N/A" }));
        cboMedicamento1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cboMedicamento1PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cboMedicamento1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboMedicamento1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cboMedicamento1MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cboMedicamento1MousePressed(evt);
            }
        });
        cboMedicamento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMedicamento1ActionPerformed(evt);
            }
        });
        cboMedicamento1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cboMedicamento1KeyPressed(evt);
            }
        });

        jTextFieldCantidad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCantidad1ActionPerformed(evt);
            }
        });

        jTextFieldHorario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldHorario1ActionPerformed(evt);
            }
        });

        jTextFieldFrecuencia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFrecuencia1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Diagnostico:");

        jLabel2.setText("Medicamento:");

        jLabel3.setText("Horas:");

        jLabel4.setText("Fecuencia:");

        jLabel5.setText("Cantidad total:");

        jLabel6.setText("Instruccion:");

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnLimpiarCancelarTriaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiarCancelarTriaje.setText("Limpiar/Cancelar");
        btnLimpiarCancelarTriaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarCancelarTriajeActionPerformed(evt);
            }
        });

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

        jLabel7.setText("h");

        jLabel8.setText("dias");

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Imprimir"));

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/impresora.png"))); // NOI18N
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        txtImp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtImp, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtImp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        jButtonUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        jButtonUpdate.setText("Actualizar");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFieldDiagnostico, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboMedicamento1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addComponent(jTextFieldCodigoDiag, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFieldFrecuencia1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(jTextFieldHorario1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 6, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel5)
                                        .addGap(30, 30, 30)
                                        .addComponent(jTextFieldCantidad1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnRegistrar)
                                        .addGap(32, 32, 32)
                                        .addComponent(jButtonUpdate)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldObserv1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnLimpiarCancelarTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(44, 44, 44))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldCodigoDiag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboMedicamento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldHorario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFrecuencia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCantidad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldObserv1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnRegistrar)
                        .addComponent(btnLimpiarCancelarTriaje)
                        .addComponent(jButtonUpdate))
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboMedicamento1PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cboMedicamento1PopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_cboMedicamento1PopupMenuWillBecomeInvisible

    private void cboMedicamento1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboMedicamento1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cboMedicamento1MouseClicked

    private void cboMedicamento1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboMedicamento1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cboMedicamento1MouseEntered

    private void cboMedicamento1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboMedicamento1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboMedicamento1MousePressed

    private void cboMedicamento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMedicamento1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboMedicamento1ActionPerformed

    private void cboMedicamento1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboMedicamento1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboMedicamento1KeyPressed

    private void jTextFieldHorario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldHorario1ActionPerformed
        horas=Integer.valueOf(jTextFieldHorario1.getText().toString().trim());
        jTextFieldFrecuencia1.requestFocus();
    }//GEN-LAST:event_jTextFieldHorario1ActionPerformed

    private void jTextFieldFrecuencia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFrecuencia1ActionPerformed
        dias=Integer.valueOf(jTextFieldFrecuencia1.getText().toString().trim());
        cantidad=(dias*24)/horas;
        jTextFieldCantidad1.setText(""+cantidad);
        jTextFieldCantidad1.requestFocus();
    }//GEN-LAST:event_jTextFieldFrecuencia1ActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        id_farmacia=idInventarioFarmacia();
        if(validador){
        registrarRecetaFarmacia();
        limpiar();
        }
        
        
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnLimpiarCancelarTriajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCancelarTriajeActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarCancelarTriajeActionPerformed

    private void jTextFieldCantidad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCantidad1ActionPerformed
        System.out.println(primaria);
        jTextFieldObserv1.requestFocus();
    }//GEN-LAST:event_jTextFieldCantidad1ActionPerformed

    private void txtImpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImpActionPerformed
     
    }//GEN-LAST:event_txtImpActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
  
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        actualizarRecetaFarmacia();
        limpiar();
    }//GEN-LAST:event_jButtonUpdateActionPerformed
                private void cargarMedicamentos(){
            try {
                String sQuery;
                // Prepara el Query
                sQuery ="select nombre_producto from desktop_farmacia_inventario;";
                System.out.println(sQuery);
                if (oConn.FnBoolQueryExecute(sQuery))
                {
                    try
                    {
                        // Verifica resultados
                        while (oConn.setResult.next())
                        {
        
                                cboMedicamento1.addItem(oConn.setResult.getString ("nombre_producto"));

                           
                        }
                        
                        // Cierra Resultados
                        oConn.setResult.close();
                    }
                    catch (SQLException ex)
                    {
                        //JOptionPane.showMessageDialorootPane,ex);
                        oFunc.SubSistemaMensajeInformacion(ex.toString());
                        Logger.getLogger(RecetaFarmacia.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                // selecciona
                    cboMedicamento1.setSelectedIndex(0);
      
                oConn.sqlStmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(RecetaFarmacia.class.getName()).log(Level.SEVERE, null, ex);
            }
}
                
                                private void editarRegistro(String id){
            try {
                String sQuery;
                // Prepara el Query
                sQuery ="select id_medicamento_diag,cantidad_total_recetado,horas,frecuencia_dias, recomendacion,dfi.nombre_producto from desktop_medicamento_x_expecialidad_hc \n" +
"	as dmxe inner join desktop_farmacia_inventario as dfi on dmxe.id_farmacia=dfi.id_farmacia where dmxe.id_medicamento_diag="+id;
                System.out.println(sQuery);
                if (oConn.FnBoolQueryExecute(sQuery))
                {
                    try
                    {
                        // Verifica resultados
                        while (oConn.setResult.next())
                        {
                                jTextFieldHorario1.setText(oConn.setResult.getString ("horas"));
                                jTextFieldFrecuencia1.setText(oConn.setResult.getString ("frecuencia_dias"));
                                jTextFieldCantidad1.setText(oConn.setResult.getString ("cantidad_total_recetado"));
                                jTextFieldObserv1.setText(oConn.setResult.getString ("recomendacion"));
                                cboMedicamento1.setSelectedItem(oConn.setResult.getString ("nombre_producto"));
                                jButtonUpdate.setEnabled(true);
                                btnRegistrar.setEnabled(false);
                           
                        }
                        
                        // Cierra Resultados
                        oConn.setResult.close();
                    }
                    catch (SQLException ex)
                    {
                        //JOptionPane.showMessageDialorootPane,ex);
                        oFunc.SubSistemaMensajeInformacion(ex.toString());
                        Logger.getLogger(RecetaFarmacia.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                // selecciona
                    //cboMedicamento1.setSelectedIndex(0);
      
                oConn.sqlStmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(RecetaFarmacia.class.getName()).log(Level.SEVERE, null, ex);
            }
}
                
                   public int idDiagnosticoPorEspecialidad()
    {
        // Para devolver el resultado
        
        // Para el Query
        String sQuery="";
        int respuesta=0;
        // Prepara el Query
        
        sQuery  = "select id_diag_x_espe_hc from desktop_diagnostico_x_expecialidad_hc where n_orden="+clsGlobales.historiaClinica+" and tipo='"+clsGlobales.tipoEspecialidad+"'"+
        " AND codigo_cie10='"+clsGlobales.codigoDiagnostico+"'";
        System.out.println(sQuery);
   
        //Ejecuta el Query
        oConn.FnBoolQueryExecute(sQuery);
        
        // Capturo el Error
        try {
            
            // Verifico que haya habido resultados
            if (oConn.setResult.next())
            {
                
               respuesta=oConn.setResult.getInt("id_diag_x_espe_hc");

            }
            
            // Cierro los Resultados
            oConn.sqlStmt.close();
            
        } catch (SQLException ex) {
         
        }
        
        
        
        // Retorna el Resultado
        return respuesta;
    }             
                
                        public int idInventarioFarmacia()
    {
        // Para devolver el resultado
        
        // Para el Query
        String sQuery="";
        int respuesta=0;
        // Prepara el Query
        
        sQuery  = "select id_farmacia from desktop_farmacia_inventario where nombre_producto='"+cboMedicamento1.getSelectedItem().toString().trim()+"'";
        System.out.println(sQuery);
   
        //Ejecuta el Query
        oConn.FnBoolQueryExecute(sQuery);
        
        // Capturo el Error
        try {
            
            // Verifico que haya habido resultados
            if (oConn.setResult.next())
            {
                
               respuesta=oConn.setResult.getInt("id_farmacia");

            }
            
            // Cierro los Resultados
            oConn.sqlStmt.close();
            
        } catch (SQLException ex) {
         
        }
        
        
        
        // Retorna el Resultado
        return respuesta;
    }                  
           
    
    private void registrarRecetaFarmacia(){
                String strSqlStmt;
            String Query ;
            int key= oFunc.contadorPrimario("desktop_medicamento_x_expecialidad_hc");

            strSqlStmt="INSERT INTO desktop_medicamento_x_expecialidad_hc (";
            Query="Values(";
            strSqlStmt += "id_medicamento_diag";Query +=key;
            strSqlStmt += ",id_diag_x_espe_hc";Query += ","+primaria;
            strSqlStmt += ",id_farmacia";Query += ","+id_farmacia;    
            strSqlStmt += ",horas";Query += ","+Integer.valueOf(jTextFieldHorario1.getText().toString().trim());    
            strSqlStmt += ",frecuencia_dias";Query += ","+Integer.valueOf(jTextFieldFrecuencia1.getText().toString().trim());    
            strSqlStmt += ",cantidad_total_recetado";Query += ","+Integer.valueOf(jTextFieldCantidad1.getText().toString().trim());    
            strSqlStmt += ",recomendacion";Query += ",'"+jTextFieldObserv1.getText().toString().trim()+"'";    
            
            strSqlStmt += ",user_registro";Query += ",'"+clsGlobales.sUser+ "'";
            strSqlStmt += ",fecha_registro";Query += ",'"+formato.format(dateHoy)+ "'";
            System.out.println("el comando es: " + strSqlStmt.concat(") ") + Query.concat(")")); 
            if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt.concat(") ") + Query.concat(")"))){
     
                oFunc.SubSistemaMensajeInformacion("Se ha registrado con Éxito");
                llenar_tabla_recetaFarmacia();
            } else{
                    oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");
                    
                    }  
    }
    
    private void llenar_tabla_recetaFarmacia(){
               
            try {
                model = new DefaultTableModel(){
                    @Override
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return false;
                    }};
                String vSql="select dmxe.id_medicamento_diag,dfi.nombre_producto,dcie.descripcion from desktop_medicamento_x_expecialidad_hc as dmxe \n" +
"		inner join desktop_farmacia_inventario as dfi on dmxe.id_farmacia=dfi.id_farmacia\n" +
"		inner join desktop_diagnostico_x_expecialidad_hc as ddxe on ddxe.id_diag_x_espe_hc=dmxe.id_diag_x_espe_hc\n" +
"		inner join desktop_cie10 as dcie on  ddxe.codigo_cie10=dcie.codigo\n" +
"		inner join desktop_historia_clinica_detalle as dhcd on ddxe.n_orden=dhcd.n_orden\n" +
"		WHERE ddxe.n_orden="+clsGlobales.historiaClinica+" and dhcd.tipo='"+clsGlobales.tipoEspecialidad+"' and ddxe.codigo_cie10='" +jTextFieldCodigoDiag.getText().toString().trim()+"'"+
"		order by dmxe.id_medicamento_diag desc";
                
                if (oConn.FnBoolQueryExecute(vSql))
                {
                    try  {
                        java.sql.ResultSetMetaData rsmt = oConn.setResult.getMetaData();
                        int CantidaColumnas = rsmt.getColumnCount();
                        for (int i = 1; i <= CantidaColumnas; i++) {
                            model.addColumn(rsmt.getColumnLabel(i));
                        }
                        while (oConn.setResult.next())
                        {
                            Object [] Fila = new Object[CantidaColumnas];
                            for (int i = 0; i < CantidaColumnas; i++) {
                                Fila[i] = oConn.setResult.getObject(i+1);
                            }
                            model.addRow(Fila);
                        }
                        jTable1.setModel(model);
                        oConn.setResult.close();
                    }
                    catch (SQLException ex)
                    {
                        oFunc.SubSistemaMensajeError(ex.toString());
                        Logger.getLogger(RecetaFarmacia.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                oConn.sqlStmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(RecetaFarmacia.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
  
    private void limpiar(){
    jTextFieldHorario1.setText("");
    jTextFieldFrecuencia1.setText("");
    jTextFieldCantidad1.setText("");
    jTextFieldObserv1.setText("");
    cboMedicamento1.setSelectedItem("N/A");
    jButtonUpdate.setEnabled(false);
    btnRegistrar.setEnabled(true);
    }                 
      
    private void actualizarRecetaFarmacia(){
                id_farmacia=idInventarioFarmacia();

            String strSqlStmt;
            strSqlStmt="update desktop_medicamento_x_expecialidad_hc set id_farmacia="+ id_farmacia+",horas="+
                    jTextFieldHorario1.getText().trim()+",frecuencia_dias="+jTextFieldFrecuencia1.getText().trim()+",cantidad_total_recetado="+jTextFieldCantidad1.getText().trim()
                    +",fecha_actualizacion='"+formato.format(dateHoy)
                    +"',user_actualizacion='"+clsGlobales.sUser+"' "
                    +"where id_medicamento_diag="+id_receta_medica;
            System.out.println(strSqlStmt);
            if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)){
               oFunc.SubSistemaMensajeInformacion("Se ha actualizado con Éxito");
            }else{
                 oFunc.SubSistemaMensajeError("Error en registro");
                 }            
    
}
                        
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
            java.util.logging.Logger.getLogger(RecetaFarmacia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecetaFarmacia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecetaFarmacia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecetaFarmacia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecetaFarmacia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnLimpiarCancelarTriaje;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox cboMedicamento1;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldCantidad1;
    private javax.swing.JTextField jTextFieldCodigoDiag;
    private javax.swing.JTextField jTextFieldDiagnostico;
    private javax.swing.JTextField jTextFieldFrecuencia1;
    private javax.swing.JTextField jTextFieldHorario1;
    private javax.swing.JTextField jTextFieldObserv1;
    private javax.swing.JTextField txtImp;
    // End of variables declaration//GEN-END:variables
}
