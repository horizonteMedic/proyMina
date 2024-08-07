/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyMina.vista.interfaces;

import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import org.json.JSONObject;
import proyMina.modelo.DisableSSLVerification;
import proyMina.modelo.clsConnection;
import static proyMina.modelo.clsConnection.oConnection;
import proyMina.modelo.clsFunciones;
import proyMina.modelo.clsGlobales;
import proyMina.modelo.clsOperacionesUsuarios;


public class RegistrarPaciente extends javax.swing.JFrame {
    Date dateHoy = new Date();
    SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
    clsConnection oConn = new clsConnection();
    clsFunciones oFunc = new clsFunciones();
    clsOperacionesUsuarios oPe = new clsOperacionesUsuarios();
    
    
    public RegistrarPaciente() {
        initComponents();
        AutoCompleteDecorator.decorate(this.cboDepartamento);
        AutoCompleteDecorator.decorate(this.cboProvincia);
        AutoCompleteDecorator.decorate(this.cboDistrito);

        CargarDepartamentos();
        btnLimpiar();
        
        this.setLocationRelativeTo(null);
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        RegistrarEmpresaoContrata = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dni = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lugar_nacimiento = new javax.swing.JTextField();
        correo_elect = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        btnRegistrar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        MASCULINO = new javax.swing.JRadioButton();
        FEMENINO = new javax.swing.JRadioButton();
        nombres = new javax.swing.JTextField();
        apellidos = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cargo = new javax.swing.JTextField();
        direccion = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        fecha_nacimiento = new com.toedter.calendar.JDateChooser();
        btnActualizar = new javax.swing.JButton();
        cboDistrito = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cboDepartamento = new javax.swing.JComboBox();
        cboProvincia = new javax.swing.JComboBox();
        cboNivelEstudios = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cboEstadoCivil = new javax.swing.JComboBox<>();
        celular = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Agregar Nuevo Empleado"));
        jPanel1.setToolTipText("Agregar Nuevo Paciente");

        RegistrarEmpresaoContrata.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        RegistrarEmpresaoContrata.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 74, -1, -1));

        dni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dniActionPerformed(evt);
            }
        });
        RegistrarEmpresaoContrata.add(dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 120, -1));

        jLabel3.setText("Fecha Nacimiento :");
        RegistrarEmpresaoContrata.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel4.setText("Provincia :");
        RegistrarEmpresaoContrata.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        jLabel5.setText("Email  :");
        RegistrarEmpresaoContrata.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 50, -1));

        lugar_nacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lugar_nacimientoActionPerformed(evt);
            }
        });
        lugar_nacimiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lugar_nacimientoKeyTyped(evt);
            }
        });
        RegistrarEmpresaoContrata.add(lugar_nacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, 180, -1));

        correo_elect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correo_electActionPerformed(evt);
            }
        });
        RegistrarEmpresaoContrata.add(correo_elect, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, 250, -1));

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lapiz.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        RegistrarEmpresaoContrata.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 80, 130, -1));

        jLabel6.setText("Dni :");
        RegistrarEmpresaoContrata.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));
        RegistrarEmpresaoContrata.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agegar.png"))); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        RegistrarEmpresaoContrata.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 50, 130, -1));

        jLabel7.setText("Apellidos : ");
        RegistrarEmpresaoContrata.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 90, -1));

        jLabel8.setText("Sexo : ");
        RegistrarEmpresaoContrata.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        MASCULINO.setText("M");
        MASCULINO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MASCULINOMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MASCULINOMouseEntered(evt);
            }
        });
        MASCULINO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MASCULINOActionPerformed(evt);
            }
        });
        RegistrarEmpresaoContrata.add(MASCULINO, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        FEMENINO.setText("F");
        FEMENINO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FEMENINOMouseClicked(evt);
            }
        });
        FEMENINO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FEMENINOActionPerformed(evt);
            }
        });
        RegistrarEmpresaoContrata.add(FEMENINO, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, -1));

        nombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombresActionPerformed(evt);
            }
        });
        RegistrarEmpresaoContrata.add(nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 250, -1));

        apellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidosActionPerformed(evt);
            }
        });
        RegistrarEmpresaoContrata.add(apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 250, -1));

        jLabel9.setText("Nombres : ");
        RegistrarEmpresaoContrata.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        jLabel10.setText("Cargo :");
        RegistrarEmpresaoContrata.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, -1, -1));

        jLabel11.setText("Nivel de Estudios  :");
        RegistrarEmpresaoContrata.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, -1, -1));

        jLabel13.setText("Direccion :");
        RegistrarEmpresaoContrata.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, -1, -1));

        cargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargoActionPerformed(evt);
            }
        });
        RegistrarEmpresaoContrata.add(cargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, 250, -1));

        direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionActionPerformed(evt);
            }
        });
        RegistrarEmpresaoContrata.add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 250, -1));

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        RegistrarEmpresaoContrata.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 140, 130, -1));
        RegistrarEmpresaoContrata.add(fecha_nacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 160, -1));

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        RegistrarEmpresaoContrata.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 110, 130, -1));

        cboDistrito.setEditable(true);
        cboDistrito.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione un Distrito" }));
        cboDistrito.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cboDistritoPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cboDistrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDistritoActionPerformed(evt);
            }
        });
        cboDistrito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cboDistritoKeyPressed(evt);
            }
        });
        RegistrarEmpresaoContrata.add(cboDistrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 200, -1));

        jLabel15.setText("Celular :");
        RegistrarEmpresaoContrata.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, -1, -1));

        jLabel16.setText("Lugar de Nacimiento :");
        RegistrarEmpresaoContrata.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, -1, -1));

        jLabel17.setText("Departamento : ");
        RegistrarEmpresaoContrata.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        cboDepartamento.setEditable(true);
        cboDepartamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione un Departamento" }));
        cboDepartamento.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cboDepartamentoPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cboDepartamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboDepartamentoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cboDepartamentoMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cboDepartamentoMousePressed(evt);
            }
        });
        cboDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDepartamentoActionPerformed(evt);
            }
        });
        cboDepartamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cboDepartamentoKeyPressed(evt);
            }
        });
        RegistrarEmpresaoContrata.add(cboDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 200, -1));

        cboProvincia.setEditable(true);
        cboProvincia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione un Provincia" }));
        cboProvincia.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cboProvinciaPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cboProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboProvinciaActionPerformed(evt);
            }
        });
        cboProvincia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cboProvinciaKeyPressed(evt);
            }
        });
        RegistrarEmpresaoContrata.add(cboProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 200, -1));

        cboNivelEstudios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion", "ANALFABETO", "PRIMARIA COMPLETA", "PRIMARIA INCOMPLETA", "SECUNDARIA COMPLETA", "SECUNDARIA INCOMPLETA", "UNIVERSITARIO", "TECNICO" }));
        cboNivelEstudios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNivelEstudiosActionPerformed(evt);
            }
        });
        RegistrarEmpresaoContrata.add(cboNivelEstudios, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, 240, -1));

        jLabel18.setText("Distrito : ");
        RegistrarEmpresaoContrata.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        jLabel19.setText("Estado Civil :");
        RegistrarEmpresaoContrata.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, -1, -1));

        cboEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion", "SOLTERO", "CASADO", "VIUDO", "DIVORCIADO", "CONVIVIENTE" }));
        cboEstadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEstadoCivilActionPerformed(evt);
            }
        });
        RegistrarEmpresaoContrata.add(cboEstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, 200, -1));

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
        RegistrarEmpresaoContrata.add(celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 180, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RegistrarEmpresaoContrata, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(RegistrarEmpresaoContrata, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Agregar Nuevos Paciente");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniActionPerformed
        MASCULINO.requestFocus();

        if(!dni.getText().isEmpty()){
            if(!oPe.validar(dni, "desktop_datos_pacientes","dni"))  {
             oFunc.SubSistemaMensajeError("El 1paciente no se encuentra Registrado ");
                try {
                    comunirApiConsultaReserva(dni.getText().toString().trim());
                } catch (Exception ex) {
                    Logger.getLogger(RegistrarPaciente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else
                { oFunc.SubSistemaMensajeError("El Paciente si existe si desea actualizar - click Editar");
                    btnEditar.setEnabled(true);
                    btnActualizar.setEnabled(true);
                    btnRegistrar.setEnabled(false);
                }
            }        
                  
        


    }//GEN-LAST:event_dniActionPerformed

    private void lugar_nacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lugar_nacimientoActionPerformed
        celular.requestFocus();
    }//GEN-LAST:event_lugar_nacimientoActionPerformed

    private void correo_electActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correo_electActionPerformed
        cargo.requestFocus();
        cargo.setText("");
    }//GEN-LAST:event_correo_electActionPerformed

    private void nombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombresActionPerformed
        apellidos.requestFocus();
        apellidos.setText("");
    }//GEN-LAST:event_nombresActionPerformed

    private void apellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidosActionPerformed
        fecha_nacimiento.requestFocus();
        fecha_nacimiento.getDate();
    }//GEN-LAST:event_apellidosActionPerformed

    private void cargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargoActionPerformed
       
        
    }//GEN-LAST:event_cargoActionPerformed

    private void direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionActionPerformed
        lugar_nacimiento.requestFocus();
        cargo.setText("");
    }//GEN-LAST:event_direccionActionPerformed

    private void MASCULINOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MASCULINOActionPerformed
        
        if (MASCULINO.isSelected())
            {
            FEMENINO.setSelected(false);
            
            }
    }//GEN-LAST:event_MASCULINOActionPerformed

    private void FEMENINOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FEMENINOActionPerformed
        if (FEMENINO.isSelected()) 
            {
            MASCULINO.setSelected(false);         
            }
    }//GEN-LAST:event_FEMENINOActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        btnRegistrar();       
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void lugar_nacimientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lugar_nacimientoKeyTyped
    
    }//GEN-LAST:event_lugar_nacimientoKeyTyped

    private void MASCULINOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MASCULINOMouseClicked
        nombres.requestFocus();
        nombres.setText("");
    }//GEN-LAST:event_MASCULINOMouseClicked

    private void FEMENINOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FEMENINOMouseClicked
        nombres.requestFocus();
        cargo.setText("");
    }//GEN-LAST:event_FEMENINOMouseClicked

    private void MASCULINOMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MASCULINOMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_MASCULINOMouseEntered

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
       btnLimpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if(!dni.getText().isEmpty()){
          String Sql="select translate(des_ubi_dis.nombre_distrito,'áéíóúÁÉÍÓÚäëïöüÄËÏÖÜ','aeiouAEIOUaeiouAEIOU') as nombre_distrito, "
                  + "translate(des_ubi_pro.nombre_provincia,'áéíóúÁÉÍÓÚäëïöüÄËÏÖÜ','aeiouAEIOUaeiouAEIOU') as nombre_provincia ,"
                  + "translate(des_ubi_dep.nombre_departamento,'áéíóúÁÉÍÓÚäëïöüÄËÏÖÜ','aeiouAEIOUaeiouAEIOU') as nombre_departamento,"+ 
                "dni,apellidos,nombres,celular, sexo, cargo, correo_elect,dat_pa.nivel_estudio,lugar_nacimiento,\n" +
                "direccion, fecha_nacimiento, dat_pa.estado_civil from desktop_datos_pacientes as dat_pa \n" +
                "left join desktop_ubigeo_distrito as des_ubi_dis on dat_pa.ubigeo=des_ubi_dis.id_distrito_ubigeo \n" +
                "left join desktop_ubigeo_provincia as des_ubi_pro on des_ubi_dis.id_provincia_ubigeo=des_ubi_pro.id_provincia_ubigeo\n" +
                "left join desktop_ubigeo_departamento as des_ubi_dep on des_ubi_pro.id_departamento_ubigeo=des_ubi_dep.id_departamento_ubigeo\n" +
                "Where dni='" +dni.getText().toUpperCase()+"'"; 
                System.out.println(Sql);                
          oConn.FnBoolQueryExecute(Sql);
          try {
                if (oConn.setResult.next()) {
                    dni.setText(oConn.setResult.getString("dni"));
                    apellidos.setText(oConn.setResult.getString("apellidos"));
                    nombres.setText(oConn.setResult.getString("nombres"));                    
                    lugar_nacimiento.setText(oConn.setResult.getString("lugar_nacimiento"));
                    direccion.setText(oConn.setResult.getString("direccion"));                    
                    celular.setText(oConn.setResult.getString("celular"));                    
                    cargo.setText(oConn.setResult.getString("cargo"));                    
                    fecha_nacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento"));
                    correo_elect.setText(oConn.setResult.getString("correo_elect"));                    
                    if(oConn.setResult.getString("sexo").contains("MASCULINO"))
                    MASCULINO.setSelected(true);
                    else
                    FEMENINO.setSelected(true);
                    String provincia=oConn.setResult.getString("nombre_provincia").trim().toUpperCase();
                    String distrito=oConn.setResult.getString("nombre_distrito").trim().toUpperCase();

                    
                    

                    String estadoCivil=oConn.setResult.getString("estado_civil").trim().toUpperCase();
                                    System.out.println(estadoCivil);                
                    String nivelEstudio=oConn.setResult.getString("nivel_estudio").trim().toUpperCase();
                                    System.out.println(nivelEstudio);      

                    cboDepartamento.setSelectedItem(oConn.setResult.getString("nombre_departamento").trim().toUpperCase());
                    cboProvincia.setSelectedItem(provincia);
                    cboDistrito.setSelectedItem(distrito);
                    cboEstadoCivil.setSelectedItem(estadoCivil);
                    cboNivelEstudios.setSelectedItem(nivelEstudio);
                    btnActualizar.setEnabled(true);
                    btnEditar.setEnabled(false);
                    btnRegistrar.setEnabled(false);
                    }else{
                    oFunc.SubSistemaMensajeError("No se encuentra registro de Paciente ");
                }
                oConn.sqlStmt.close();
            } catch (SQLException ex) {
                oFunc.SubSistemaMensajeInformacion("Error:" + ex.getMessage());
            }
      }
      else
            oFunc.SubSistemaMensajeError("Debes Registrar al Paciente");
    }//GEN-LAST:event_btnEditarActionPerformed

    private void cboDistritoPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cboDistritoPopupMenuWillBecomeInvisible

    }//GEN-LAST:event_cboDistritoPopupMenuWillBecomeInvisible

    private void cboDistritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDistritoActionPerformed
  
        
    }//GEN-LAST:event_cboDistritoActionPerformed

    private void cboDistritoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboDistritoKeyPressed
        enter(evt);
        evt.getSource().toString().toUpperCase();
    }//GEN-LAST:event_cboDistritoKeyPressed

    private void cboDepartamentoPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cboDepartamentoPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_cboDepartamentoPopupMenuWillBecomeInvisible

    private void cboDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDepartamentoActionPerformed
             cboDepartamento.getEditor().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if(cboDepartamento.getSelectedIndex()<=-1 )
                {

                }else{

                }

            }});
      System.out.println("EventoActionPerformed");
      //cboProvincia.removeAllItems();
       CargarProvincias();

    }//GEN-LAST:event_cboDepartamentoActionPerformed

    private void cboDepartamentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboDepartamentoKeyPressed

        int key = evt.getKeyCode();
     if (key == KeyEvent.VK_ENTER) {
      
        }
    }//GEN-LAST:event_cboDepartamentoKeyPressed

    private void cboProvinciaPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cboProvinciaPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_cboProvinciaPopupMenuWillBecomeInvisible

    private void cboProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboProvinciaActionPerformed
        cboProvincia.getEditor().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if(cboProvincia.getSelectedIndex()<=-1 )
                {

                }else{

                }

            }});
      System.out.println("EventoActionPerformed");
            CargarDistrito();

    }//GEN-LAST:event_cboProvinciaActionPerformed

    private void cboProvinciaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboProvinciaKeyPressed
               int key = evt.getKeyCode();
     if (key == KeyEvent.VK_ENTER) {
      
        }
    }//GEN-LAST:event_cboProvinciaKeyPressed

    private void cboDepartamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboDepartamentoMouseClicked
                
    }//GEN-LAST:event_cboDepartamentoMouseClicked

    private void cboDepartamentoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboDepartamentoMousePressed
   
    }//GEN-LAST:event_cboDepartamentoMousePressed

    private void cboDepartamentoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboDepartamentoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cboDepartamentoMouseEntered

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        btnActualizar();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void cboNivelEstudiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNivelEstudiosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboNivelEstudiosActionPerformed

    private void cboEstadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEstadoCivilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboEstadoCivilActionPerformed

    private void celularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celularActionPerformed
       correo_elect.requestFocus();
    }//GEN-LAST:event_celularActionPerformed

    private void celularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_celularKeyTyped
      int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;        
    if (!numeros)
    {
        evt.consume();
    }        
    if(lugar_nacimiento.getText().length()>=9)
     {
       evt.consume();
     }
    }//GEN-LAST:event_celularKeyTyped

    /**
     * @param args the command line arguments
     */
    
       
      public void comunirApiConsultaReserva(String dni) throws Exception {
      SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
         try {
            DisableSSLVerification.disableSSL();  
            URL url = new URL("https://hmintegracion.azurewebsites.net/api/v01/st/registros/consumoApis/"+dni);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Content-Type", "application/json; utf-8");
            con.setRequestProperty("Accept", "application/json");
            con.setDoOutput(true);


            int code = con.getResponseCode();
            System.out.println("Response Code: " + code);
            try (BufferedReader br = new BufferedReader(
                    new InputStreamReader(con.getInputStream(), "utf-8"))) {
                StringBuilder response = new StringBuilder();
                String responseLine;
                while ((responseLine = br.readLine()) != null) {
                System.out.println("Response line: " + responseLine.trim());
                    response.append(responseLine.trim());
                }
                  System.out.println("Response: " + response.toString());
                     JSONObject objectJson = new JSONObject(response.toString());
                     JSONObject objectJsonData=objectJson.getJSONObject("data");
                     nombres.setText(objectJsonData.getString("nombres"));
                     apellidos.setText(objectJsonData.getString("apellido_paterno")+ " "+objectJsonData.getString("apellido_materno"));
                     fecha_nacimiento.setDate(formato.parse(objectJsonData.getString("fecha_nacimiento")));
                     cboDepartamento.setSelectedItem(objectJsonData.getString("departamento"));
                     cboProvincia.setSelectedItem(objectJsonData.getString("provincia"));
                     cboDistrito.setSelectedItem(objectJsonData.getString("distrito"));
                     direccion.setText(objectJsonData.getString("direccion"));
                     cboNivelEstudios.setSelectedItem(objectJsonData.getString("estado_civil"));
                     if(objectJsonData.getString("sexo").contains("M")){
                         MASCULINO.setSelected(true);
                     }
                     else
                         FEMENINO.setSelected(true);


                    /*
                    System.out.println("el campo es:"+objectJson.getLong("id_resp"));
                    
                    System.out.println("el campo es:"+objectJson.getString("rucEmpresa"));
                    System.out.println("el campo es:"+objectJson.getString("rucContrata"));
                    System.out.println("el campo es:"+objectJson.getString("cargo"));
                    System.out.println("el campo es:"+objectJson.getString("area"));
                    System.out.println("el campo es:"+objectJson.getString("tipoExamen"));
                    System.out.println("el campo es:"+objectJson.getString("fechaReserva"));
                      */
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }
   
   
   
   
    
    
    private void btnActualizar (){
    String Key=dni.getText();
         if(!dni.getText().isEmpty()){                
            String strSqlStmt;
            String Query ;
            strSqlStmt="UPDATE desktop_datos_pacientes ";
            Query="SET "; 
            Query += "dni="+dni.getText();
            Query += ",nombres='"+nombres.getText().toString().toUpperCase().trim()+ "'";
            Query += ",apellidos='"+apellidos.getText().toString().toUpperCase().trim()+ "'";            
            Query += ",celular='"+celular.getText()+ "'";
            Query += ",cargo='"+cargo.getText().toUpperCase().trim()+ "'";
            Query += ",correo_elect='"+correo_elect.getText()+ "'";
            Query += ",Ubigeo='"+Ubigeo()+ "'";
            if(MASCULINO.isSelected()){
               Query += ",sexo='MASCULINO'";
            }else {
               Query += ",sexo='FEMENINO'";
            }
            Query += ",estado_civil='"+cboEstadoCivil.getSelectedItem().toString().trim()+ "'";
            Query += ",nivel_estudio='"+cboNivelEstudios.getSelectedItem().toString().trim()+ "'";
            Query += ",direccion='"+direccion.getText().toUpperCase().trim()+ "'";
            Query += ",lugar_nacimiento='"+lugar_nacimiento.getText().toUpperCase().trim()+ "'";
            Query += ",fecha_nacimiento='"+fecha_nacimiento.getDate()+ "'";            
            Query += ",user_actualizacion='"+clsGlobales.sUser+ "'";
            Query += ",fecha_actualizacion='"+formato.format(dateHoy)+ "'";
            Query +=" WHERE dni='" + Key + "'";
            System.out.println("El comando es :" + strSqlStmt + Query );
            if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt + Query)){
                oFunc.SubSistemaMensajeInformacion("Se ha actualizado con Éxito");
                btnLimpiar();                                             
            }else{
                 oFunc.SubSistemaMensajeError("error en registro");
                 }            
    }
    
    
    }
    private void enter(java.awt.event.KeyEvent evt){
    int key = evt.getKeyCode();
     if (key == KeyEvent.VK_ENTER) {
      
        Toolkit.getDefaultToolkit().beep(); 
      //  validar();
        }
    }
    
     private void CargarDepartamentos(){
      String sQuery;        
        // Prepara el Query
        sQuery ="SELECT translate(nombre_departamento,'áéíóúÁÉÍÓÚäëïöüÄËÏÖÜ','aeiouAEIOUaeiouAEIOU') as nombre_departamento FROM desktop_ubigeo_departamento";
        
        if (oConn.FnBoolQueryExecute(sQuery))
        {
            try 
            {
                // Verifica resultados
                 while (oConn.setResult.next())
                 {                     
                     // Obtiene los datos de la Consulta
                     cboDepartamento.addItem(oConn.setResult.getString ("nombre_departamento").toUpperCase());
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
        cboDepartamento.setSelectedIndex(0);

}
     private void CargarProvincias(){
      String sQuery; 
      System.out.println("llego al metodo cargar provincias");
      if(cboDepartamento.getSelectedIndex()>0){
      cboProvincia.removeAllItems();
      cboProvincia.addItem("Seleccione Provincia");
        // Prepara el Query
        sQuery ="select translate(nombre_provincia,'áéíóúÁÉÍÓÚäëïöüÄËÏÖÜ','aeiouAEIOUaeiouAEIOU') as nombre_provincia from desktop_ubigeo_departamento as ubi_dep inner join desktop_ubigeo_provincia as ubi_prov\n" +
"	on ubi_dep.id_departamento_ubigeo=ubi_prov.id_departamento_ubigeo where TRIM(UPPER(ubi_dep.nombre_departamento))='"+cboDepartamento.getSelectedItem().toString().trim()+"'";
        System.out.println("la consulta "+sQuery);
        if (oConn.FnBoolQueryExecute(sQuery))
        {
            try 
            {
                // Verifica resultados
                 while (oConn.setResult.next())
                 {                     
                     // Obtiene los datos de la Consulta
                     cboProvincia.addItem(oConn.setResult.getString ("nombre_provincia").toUpperCase());
                     
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
        cboProvincia.setSelectedIndex(0);
      }
}
     
private void CargarDistrito(){
      String sQuery;     
      if(cboProvincia.getSelectedIndex()>0){
      cboDistrito.removeAllItems();
    //cboDistrito.addItem("Seleccione");

        // Prepara el Query
        sQuery ="select translate(nombre_distrito,'áéíóúÁÉÍÓÚäëïöüÄËÏÖÜ','aeiouAEIOUaeiouAEIOU') as nombre_distrito from desktop_ubigeo_provincia as ubi_prov inner join desktop_ubigeo_distrito as ubi_dis\n" +
"	on ubi_prov.id_provincia_ubigeo=ubi_dis.id_provincia_ubigeo where TRIM(UPPER(ubi_prov.nombre_provincia))='" +cboProvincia.getSelectedItem().toString().trim()+"'";
        System.out.println("la consulta "+sQuery);
        if (oConn.FnBoolQueryExecute(sQuery))
        {
            try 
            {
                // Verifica resultados
                 while (oConn.setResult.next())
                 {                     
                     // Obtiene los datos de la Consulta
                     cboDistrito.addItem(oConn.setResult.getString ("nombre_distrito").toUpperCase());
                     
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
        cboDistrito.setSelectedIndex(0);
      }
}
public String Ubigeo(){
    String sQuery;      
    String ubigeo = "";
    sQuery ="select des_ubi_dis.id_distrito_ubigeo "+                 
            "from  desktop_ubigeo_distrito as des_ubi_dis  \n" +
            "left join desktop_ubigeo_provincia as des_ubi_pro on des_ubi_dis.id_provincia_ubigeo=des_ubi_pro.id_provincia_ubigeo\n" +
            "left join desktop_ubigeo_departamento as des_ubi_dep on des_ubi_pro.id_departamento_ubigeo=des_ubi_dep.id_departamento_ubigeo\n" +
            " Where translate(TRIM(UPPER(nombre_departamento)),'áéíóúÁÉÍÓÚäëïöüÄËÏÖÜ','aeiouAEIOUaeiouAEIOU')='" +cboDepartamento.getSelectedItem().toString().trim()+"'"+
            " AND translate(TRIM(UPPER(nombre_provincia)),'áéíóúÁÉÍÓÚäëïöüÄËÏÖÜ','aeiouAEIOUaeiouAEIOU') = '" + cboProvincia.getSelectedItem().toString().trim()+ "'" +
            " AND translate(TRIM(UPPER(nombre_distrito)),'áéíóúÁÉÍÓÚäëïöüÄËÏÖÜ','aeiouAEIOUaeiouAEIOU') = '" + cboDistrito.getSelectedItem().toString().trim()+ "'";
    System.out.println(sQuery);
              oConn.FnBoolQueryExecute(sQuery);
          try {
                if (oConn.setResult.next()) {
                    ubigeo= oConn.setResult.getString("id_distrito_ubigeo");

                    }else{
                    oFunc.SubSistemaMensajeError("No se encuentra ubigeo ");
                }
                oConn.sqlStmt.close();
            } catch (SQLException ex) {
                oFunc.SubSistemaMensajeInformacion("Error:" + ex.getMessage());
            }
          return ubigeo;
}
    private void btnRegistrar(){
        if (!dni.getText().isEmpty()){
            if(!oPe.validar(dni,"desktop_datos_pacientes","dni")){
            if (Validar()){
                
            String strSqlStmt;
            String Query ;
            strSqlStmt="INSERT INTO desktop_datos_pacientes (";
            Query="Values(";
            if (!dni.getText().isEmpty() )
            {strSqlStmt += "dni";Query += dni.getText();}
            strSqlStmt += ",nombres";Query += ",'"+nombres.getText().toString().toUpperCase().trim()+ "'";
            strSqlStmt += ",apellidos";Query += ",'"+apellidos.getText().toString().toUpperCase().trim()+ "'";
            if(MASCULINO.isSelected()){
               strSqlStmt += ",sexo";Query += ",'MASCULINO'";
            }else {
               strSqlStmt += ",sexo";Query += ",'FEMENINO'";
            }
            strSqlStmt += ",estado_civil";Query += ",'"+cboEstadoCivil.getSelectedItem().toString().trim()+ "'";
            strSqlStmt += ",celular";Query += ",'"+celular.getText()+ "'";

            strSqlStmt += ",lugar_nacimiento";Query += ",'"+lugar_nacimiento.getText().toString().toUpperCase().trim()+ "'";
            strSqlStmt += ",cargo";Query += ",'"+cargo.getText().toString().toUpperCase().trim()+ "'";
            strSqlStmt += ",nivel_estudio";Query += ",'"+cboNivelEstudios.getSelectedItem().toString().trim()+ "'";
            strSqlStmt += ",correo_elect";Query += ",'"+correo_elect.getText().toString().toUpperCase().trim()+ "'";
            strSqlStmt += ",ubigeo";Query += ",'"+Ubigeo()+ "'";
            strSqlStmt += ",direccion";Query += ",'"+direccion.getText()+ "'";
            strSqlStmt += ",fecha_nacimiento";Query += ",'"+fecha_nacimiento.getDate()+ "'";
          
            strSqlStmt += ",user_registro";Query += ",'"+clsGlobales.sUser+ "'";
            strSqlStmt += ",fecha_registro";Query += ",'"+formato.format(dateHoy)+ "'";
            System.out.println("el comando es: " + strSqlStmt.concat(") ") + Query.concat(")")); 
            if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt.concat(") ") + Query.concat(")"))){
                oFunc.SubSistemaMensajeInformacion("Se ha registrado el empleado con Éxito");
            } else{
                    oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");
                    btnEditar.setEnabled(false);
                    btnActualizar.setEnabled(false);
                    
                    }         
            }        
        }   
            else                     
                oFunc.SubSistemaMensajeError("El Dni ya se encuentra Registrado ");
    }
    }
private boolean Validar(){
   boolean bResultado=true;
   if ( dni.getText().trim().length() <= 8 )
       {
       } else {  
       oFunc.SubSistemaMensajeError("Complete los datos correctamente ");
       bResultado = false;
        }
   if(MASCULINO.isSelected() || FEMENINO.isSelected())
       bResultado = true;
   else {  
       oFunc.SubSistemaMensajeError("Debes Selecionar un Sexo ");
       bResultado = false;
        }
       
  return bResultado;
}

private void btnLimpiar(){
    
dni.setText(null);
MASCULINO.setSelected(false);
FEMENINO.setSelected(false);
nombres.setText(null);
apellidos.setText(null);
celular.setText(null);
cargo.setText(null);
lugar_nacimiento.setText(null);
correo_elect.setText(null);
dni.setText(null);
direccion.setText(null);
fecha_nacimiento.setDate(new Date());
cboDepartamento.setSelectedItem(null);
cboProvincia.setSelectedItem(null);
cboDistrito.setSelectedItem(null);
cboNivelEstudios.setSelectedItem(null);
cboEstadoCivil.setSelectedItem(null);
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
            java.util.logging.Logger.getLogger(RegistrarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton FEMENINO;
    private javax.swing.JRadioButton MASCULINO;
    private javax.swing.JPanel RegistrarEmpresaoContrata;
    private javax.swing.JTextField apellidos;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JTextField cargo;
    private javax.swing.JComboBox cboDepartamento;
    private javax.swing.JComboBox cboDistrito;
    private javax.swing.JComboBox<String> cboEstadoCivil;
    private javax.swing.JComboBox<String> cboNivelEstudios;
    private javax.swing.JComboBox cboProvincia;
    private javax.swing.JTextField celular;
    private javax.swing.JTextField correo_elect;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField dni;
    private com.toedter.calendar.JDateChooser fecha_nacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField lugar_nacimiento;
    private javax.swing.JTextField nombres;
    // End of variables declaration//GEN-END:variables
}
