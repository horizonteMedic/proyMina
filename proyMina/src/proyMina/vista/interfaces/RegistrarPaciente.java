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
import javax.swing.table.DefaultTableModel;
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
    DefaultTableModel model;        

    
    public RegistrarPaciente() {
        initComponents();
        AutoCompleteDecorator.decorate(this.cboDepartamento);
        AutoCompleteDecorator.decorate(this.cboProvincia);
        AutoCompleteDecorator.decorate(this.cboDistrito);
        AutoCompleteDecorator.decorate(this.cboEmpresa);
        AutoCompleteDecorator.decorate(this.cboContrata); 
        cargarEmpresaContrata("EMPRESA");
        cargarEmpresaContrata("CONTRATA");  
        llenar_tabla_hc();
        

        CargarDepartamentos();
        btnLimpiar();
        
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
                        Logger.getLogger(RegistrarPaciente.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                // selecciona
               if(tipo.contains("EMPRESA")){
                    cboEmpresa.setSelectedIndex(0);
                    }else
                    cboContrata.setSelectedIndex(0);
                oConn.sqlStmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(RegistrarPaciente.class.getName()).log(Level.SEVERE, null, ex);
            }
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        BuscarPaciente = new javax.swing.JToggleButton();
        dni_paciente = new javax.swing.JTextField();
        nombres_hcpaciente = new javax.swing.JTextField();
        edad = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        btnLimpiar2 = new javax.swing.JToggleButton();
        jLabel28 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JToggleButton();
        btnEditar2 = new javax.swing.JToggleButton();
        cboEmpresa = new javax.swing.JComboBox();
        cboContrata = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_HC = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PACIENTE");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("AGREGAR PACIENTE"));
        jPanel1.setToolTipText("Agregar Nuevo Paciente");

        dni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dniActionPerformed(evt);
            }
        });

        jLabel3.setText("*Fecha Nacimiento :");

        jLabel4.setText("*Provincia :");

        jLabel5.setText("Email :");

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

        correo_elect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correo_electActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lapiz.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jLabel6.setText("* Dni :");

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agegar.png"))); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jLabel7.setText("*Apellidos :");

        jLabel8.setText("Sexo : ");

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

        nombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombresActionPerformed(evt);
            }
        });

        apellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidosActionPerformed(evt);
            }
        });

        jLabel9.setText("*Nombres :");

        jLabel10.setText("Cargo :");

        jLabel11.setText("*Nivel de Estudios :");

        jLabel13.setText("*Direccion :");

        cargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargoActionPerformed(evt);
            }
        });

        direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionActionPerformed(evt);
            }
        });

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

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

        jLabel15.setText("Celular :");

        jLabel16.setText("*Lugar de Nacimiento :");

        jLabel17.setText("*Departamento :");

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

        cboNivelEstudios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion", "ANALFABETO", "PRIMARIA COMPLETA", "PRIMARIA INCOMPLETA", "SECUNDARIA COMPLETA", "SECUNDARIA INCOMPLETA", "UNIVERSITARIO", "TECNICO" }));
        cboNivelEstudios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNivelEstudiosActionPerformed(evt);
            }
        });

        jLabel18.setText("*Distrito :");

        jLabel19.setText("*Estado Civil :");

        cboEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion", "SOLTERO", "CASADO", "VIUDO", "DIVORCIADO", "CONVIVIENTE" }));
        cboEstadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEstadoCivilActionPerformed(evt);
            }
        });

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

        jButton1.setText("Camara");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Firma");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RegistrarEmpresaoContrataLayout = new javax.swing.GroupLayout(RegistrarEmpresaoContrata);
        RegistrarEmpresaoContrata.setLayout(RegistrarEmpresaoContrataLayout);
        RegistrarEmpresaoContrataLayout.setHorizontalGroup(
            RegistrarEmpresaoContrataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistrarEmpresaoContrataLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(RegistrarEmpresaoContrataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistrarEmpresaoContrataLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dni, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8)
                        .addGap(6, 6, 6)
                        .addComponent(MASCULINO)
                        .addGap(6, 6, 6)
                        .addComponent(FEMENINO))
                    .addGroup(RegistrarEmpresaoContrataLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RegistrarEmpresaoContrataLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RegistrarEmpresaoContrataLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fecha_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RegistrarEmpresaoContrataLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(RegistrarEmpresaoContrataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(RegistrarEmpresaoContrataLayout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(cboDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(RegistrarEmpresaoContrataLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18)
                                .addComponent(cboDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(RegistrarEmpresaoContrataLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(cboProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(13, 13, 13)
                .addGroup(RegistrarEmpresaoContrataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistrarEmpresaoContrataLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel19))
                    .addGroup(RegistrarEmpresaoContrataLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel11))
                    .addGroup(RegistrarEmpresaoContrataLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel13))
                    .addComponent(jLabel16)
                    .addGroup(RegistrarEmpresaoContrataLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(RegistrarEmpresaoContrataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel15)
                            .addComponent(jLabel10))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(RegistrarEmpresaoContrataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboNivelEstudios, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lugar_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(celular, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(correo_elect, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(RegistrarEmpresaoContrataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        RegistrarEmpresaoContrataLayout.setVerticalGroup(
            RegistrarEmpresaoContrataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistrarEmpresaoContrataLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(RegistrarEmpresaoContrataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistrarEmpresaoContrataLayout.createSequentialGroup()
                        .addGroup(RegistrarEmpresaoContrataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RegistrarEmpresaoContrataLayout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(14, 14, 14)
                                .addComponent(jLabel11)
                                .addGap(14, 14, 14)
                                .addComponent(jLabel13)
                                .addGap(14, 14, 14)
                                .addComponent(jLabel16))
                            .addGroup(RegistrarEmpresaoContrataLayout.createSequentialGroup()
                                .addComponent(cboEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(cboNivelEstudios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(lugar_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addGroup(RegistrarEmpresaoContrataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15))
                                .addGap(8, 8, 8)
                                .addGroup(RegistrarEmpresaoContrataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(correo_elect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addGroup(RegistrarEmpresaoContrataLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButton1)
                                .addGap(17, 17, 17)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(RegistrarEmpresaoContrataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RegistrarEmpresaoContrataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10))
                            .addComponent(jButton2)))
                    .addGroup(RegistrarEmpresaoContrataLayout.createSequentialGroup()
                        .addGroup(RegistrarEmpresaoContrataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(MASCULINO)
                            .addComponent(FEMENINO))
                        .addGap(8, 8, 8)
                        .addGroup(RegistrarEmpresaoContrataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(8, 8, 8)
                        .addGroup(RegistrarEmpresaoContrataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RegistrarEmpresaoContrataLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel1))
                            .addGroup(RegistrarEmpresaoContrataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)))
                        .addGap(8, 8, 8)
                        .addGroup(RegistrarEmpresaoContrataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fecha_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGroup(RegistrarEmpresaoContrataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RegistrarEmpresaoContrataLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(RegistrarEmpresaoContrataLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(RegistrarEmpresaoContrataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cboDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(RegistrarEmpresaoContrataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(RegistrarEmpresaoContrataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))))
                .addContainerGap(328, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RegistrarEmpresaoContrata, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(RegistrarEmpresaoContrata, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("REGISTRAR DATOS DEL PACIENTE", jPanel1);
        jPanel1.getAccessibleContext().setAccessibleName("Agregar Nuevos Paciente");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS DEL PACIENTE"));

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

        nombres_hcpaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombres_hcpacienteActionPerformed(evt);
            }
        });

        jLabel23.setText("* DNI :");

        jLabel24.setText("NOMBRES Y APELLIDOS :");

        jLabel25.setText("EDAD :");

        jLabel26.setText("años");

        jLabel27.setText("EMPRESA :");

        btnLimpiar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiar2.setText("Limpiar");
        btnLimpiar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar2ActionPerformed(evt);
            }
        });

        jLabel28.setText("CONTRATA :");

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/chek.gif"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEditar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lapiz.png"))); // NOI18N
        btnEditar2.setText("Editar");
        btnEditar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditar2ActionPerformed(evt);
            }
        });

        cboEmpresa.setEditable(true);
        cboEmpresa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "N/A" }));
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
        cboContrata.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "N/A" }));
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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnEditar2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar2)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregar))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboEmpresa, 0, 343, Short.MAX_VALUE)
                            .addComponent(cboContrata, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel27)
                    .addComponent(cboEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(cboContrata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar2)
                    .addComponent(btnAgregar)
                    .addComponent(btnEditar2))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        Tabla_HC.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Tabla_HC);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel24))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(dni_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BuscarPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel26))
                            .addComponent(nombres_hcpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BuscarPaciente)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(dni_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel23)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombres_hcpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 352, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane2.addTab("HISTORIA CLINICA PACIENTE", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1099, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniActionPerformed
        MASCULINO.requestFocus();

        if(!dni.getText().isEmpty()){
            if(!oPe.validar(dni, "desktop_datos_pacientes","dni"))  {
             oFunc.SubSistemaMensajeError("El Paciente no se encuentra Registrado ");
               btnEditar.setEnabled(false);
               btnActualizar.setEnabled(false);
               btnRegistrar.setEnabled(true);
               btnLimpiar.setEnabled(true);
             
                try {
                    comunirApiConsultaReserva(dni.getText().toString().trim());
                } catch (Exception ex) {
                    Logger.getLogger(RegistrarPaciente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else
                { oFunc.SubSistemaMensajeError("El Paciente existente si desea actualizar click Editar");
                    btnEditar.setEnabled(true);
                    btnActualizar.setEnabled(false);
                    btnRegistrar.setEnabled(false);
                    btnLimpiar.setEnabled(true);
                    
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
                    btnLimpiar.setEnabled(true);
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

    private void BuscarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarPacienteActionPerformed
       if(!dni_paciente.getText().isEmpty()){
            BuscarPaciente();
       }  
       
    }//GEN-LAST:event_BuscarPacienteActionPerformed

    private void dni_pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dni_pacienteActionPerformed
         nombres.requestFocus();
        BuscarPaciente();
    }//GEN-LAST:event_dni_pacienteActionPerformed

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

    private void nombres_hcpacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombres_hcpacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombres_hcpacienteActionPerformed

    private void btnLimpiar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar2ActionPerformed
       btnLimpiar2();
    }//GEN-LAST:event_btnLimpiar2ActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
           if (!dni_paciente.getText().isEmpty()){
            if(!oPe.validarHistoriaClinica(dni_paciente,formato.format(dateHoy),"desktop_datos_historia_clinica","dni_paciente","fecha_registro")){
            if (ValidarHist_cli()){
                int key= oFunc.contadorPrimario("desktop_datos_historia_clinica");
            String strSqlStmt;
            String Query ;
            strSqlStmt="INSERT INTO desktop_datos_historia_clinica (";
            Query="Values(";
            strSqlStmt += "n_orden";Query +=key+",";
            strSqlStmt += ",dni_paciente";Query += dni_paciente.getText().trim();
            if(cboEmpresa.getSelectedItem().toString().trim().contains("N/A")){
            strSqlStmt += ",ruc_empresa";Query += "," + null;
            }else{
            strSqlStmt += ",ruc_empresa";Query += ","+cargaRuc("EMPRESA",cboEmpresa.getSelectedItem().toString().trim());
            }
            if(cboContrata.getSelectedItem().toString().trim().contains("N/A")){
            strSqlStmt += ",ruc_contrata";Query += "," + null;
            }else{            
            strSqlStmt += ",ruc_contrata";Query += ","+cargaRuc("CONTRATA",cboContrata.getSelectedItem().toString().trim())+ "";  
            }
            strSqlStmt += ",user_registro";Query += ",'"+clsGlobales.sUser+ "'";
            strSqlStmt += ",fecha_registro";Query += ",'"+formato.format(dateHoy)+ "'";
            
            System.out.println("el comando es: " + strSqlStmt.concat(") ") + Query.concat(")")); 
            if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt.concat(") ") + Query.concat(")"))){
                oFunc.SubSistemaMensajeInformacion("Se ha registrado con Éxito");
                btnLimpiar2();
                llenar_tabla_hc();
            } else{
                    oFunc.SubSistemaMensajeError("No se pudo Registrar");
                    btnEditar2.setEnabled(false);
                    
                       }         
                    
        }   
            else                     
                oFunc.SubSistemaMensajeError("El Ruc ya se encuentra Registrado ");
    }
           }
    
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void cboEmpresaPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cboEmpresaPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_cboEmpresaPopupMenuWillBecomeInvisible

    private void cboEmpresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboEmpresaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cboEmpresaMouseClicked

    private void cboEmpresaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboEmpresaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cboEmpresaMouseEntered

    private void cboEmpresaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboEmpresaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboEmpresaMousePressed

    private void cboEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboEmpresaActionPerformed

    private void cboEmpresaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboEmpresaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboEmpresaKeyPressed

    private void cboContrataPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cboContrataPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_cboContrataPopupMenuWillBecomeInvisible

    private void cboContrataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboContrataMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cboContrataMouseClicked

    private void cboContrataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboContrataMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cboContrataMouseEntered

    private void cboContrataMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboContrataMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboContrataMousePressed

    private void cboContrataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboContrataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboContrataActionPerformed

    private void cboContrataKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboContrataKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboContrataKeyPressed

    private void btnEditar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditar2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Camara cama= new Camara();
        cama.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       DemoButtons demo=new DemoButtons();
       demo.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed
public void BuscarPaciente(){
    if(!dni_paciente.getText().isEmpty()){
        String Sql="SELECT dni, p.nombres ||' '|| p.apellidos as nombres, EXTRACT(YEAR FROM age(current_date,p.fecha_nacimiento)) AS  edad from desktop_datos_pacientes as p  "                
                +"WHERE dni ='"+dni_paciente.getText().trim()+"'"; 
                System.out.println(Sql);                
        oConn.FnBoolQueryExecute(Sql);
          try {
                if (oConn.setResult.next()) {
                    dni_paciente.setText(oConn.setResult.getString("dni"));
                    nombres_hcpaciente.setText(oConn.setResult.getString("nombres"));                    
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
        if (oConn.FnBoolQueryExecute(sQuery)){
            try{
                // Verifica resultados
                while (oConn.setResult.next()){                     
                     // Obtiene los datos de la Consulta
                     cboDepartamento.addItem(oConn.setResult.getString ("nombre_departamento").toUpperCase());
                }
            } 
            catch (SQLException ex){
                //JOptionPane.showMessageDialorootPane,ex);
                oFunc.SubSistemaMensajeInformacion(ex.toString());
                Logger.getLogger(Ingreso.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            oConn.setResult.close();
            oConn.sqlStmt.close(); 
        } 
        catch (SQLException ex) {
            Logger.getLogger(Ingreso.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        if (oConn.FnBoolQueryExecute(sQuery)){
            try{
                // Verifica resultados
                while (oConn.setResult.next()){                     
                     // Obtiene los datos de la Consulta
                    cboProvincia.addItem(oConn.setResult.getString ("nombre_provincia").toUpperCase());
                }  
            } 
            catch (SQLException ex){
                //JOptionPane.showMessageDialorootPane,ex);
                oFunc.SubSistemaMensajeInformacion(ex.toString());
                Logger.getLogger(Ingreso.class.getName()).log(Level.SEVERE, null, ex);
            }
        } try {
            oConn.setResult.close();
            oConn.sqlStmt.close(); 

            } catch (SQLException ex) {
            Logger.getLogger(Ingreso.class.getName()).log(Level.SEVERE, null, ex);
            }
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

public String cargaRuc(String tipo , String razon_soc){
    String sQuery;      
    String cargaruc = "";
    sQuery ="select ruc from desktop_empresa_contrata where tipo_emp_cont = '"+tipo +"' AND razon_social = '"+razon_soc+"'";
    System.out.println(sQuery);
              oConn.FnBoolQueryExecute(sQuery);
          try {
                if (oConn.setResult.next()) {
                    cargaruc= oConn.setResult.getString("ruc");

                    }else{
                    oFunc.SubSistemaMensajeError("no se encuentra ruc ");
                }
                oConn.sqlStmt.close();
            } catch (SQLException ex) {
                oFunc.SubSistemaMensajeInformacion("Error:" + ex.getMessage());
            }
          return cargaruc;
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
                btnLimpiar();
            } else{
                    oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");
                    
                    
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

private boolean ValidarHist_cli(){
   boolean bResultado=true;
   if ( dni.getText().trim().length() <= 8 ){
       } else {  
       oFunc.SubSistemaMensajeError("Complete los datos correctamente ");
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
cboDepartamento.setSelectedItem("Seleccione una opcion");
cboProvincia.setSelectedItem("Seleccione una opcion");
cboDistrito.setSelectedItem("Seleccione una opcion");
cboNivelEstudios.setSelectedItem("Seleccione una opcion");
cboEstadoCivil.setSelectedItem("Seleccione una opcion");
btnActualizar.setEnabled(true);
btnEditar.setEnabled(true);
btnRegistrar.setEnabled(true);
btnLimpiar.setEnabled(true);
}
private void btnLimpiar2(){
 
nombres_hcpaciente.setText(null);
dni_paciente.setText(null);
edad.setText(null);
cboEmpresa.setSelectedItem("Seleccione una opcion");
cboContrata.setSelectedItem("Seleccione una opcion");

btnAgregar.setEnabled(true);
btnEditar2.setEnabled(true);


}
private void llenar_tabla_hc(){
               
            try {
                model = new DefaultTableModel(){
                    @Override
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return false;
                    }};
                String vSql="select n_orden , EXTRACT(YEAR FROM age(current_date,dat_pa.fecha_nacimiento)) AS  edad, dni_paciente,dat_pa.nombres ||' '|| dat_pa.apellidos as nombres, (case when ruc_empresa is null then 'N/A' \n" +
                    "else (select razon_social from desktop_empresa_contrata where tipo_emp_cont = 'EMPRESA' \n" +
                    "AND ruc=ruc_empresa) end ) as razon_social_empresa ,(case when ruc_contrata is null then 'N/A' \n" +
                    "else (select razon_social from desktop_empresa_contrata where tipo_emp_cont = 'CONTRATA' \n" +
                    "AND ruc=ruc_contrata) end ) as razon_social_contrata from desktop_datos_historia_clinica as hist_clini \n" +
                    "inner join desktop_datos_pacientes as dat_pa on hist_clini.dni_paciente=dat_pa.dni";
                
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
                        Tabla_HC.setModel(model);
                        oConn.setResult.close();
                    }
                    catch (SQLException ex)
                    {
                        oFunc.SubSistemaMensajeError(ex.toString());
                        Logger.getLogger(RegistrarPaciente.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                oConn.sqlStmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(RegistrarPaciente.class.getName()).log(Level.SEVERE, null, ex);
            }
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
    private javax.swing.JToggleButton BuscarPaciente;
    private javax.swing.JRadioButton FEMENINO;
    private javax.swing.JRadioButton MASCULINO;
    private javax.swing.JPanel RegistrarEmpresaoContrata;
    private javax.swing.JTable Tabla_HC;
    private javax.swing.JTextField apellidos;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JToggleButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JToggleButton btnEditar2;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JToggleButton btnLimpiar2;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JTextField cargo;
    private javax.swing.JComboBox cboContrata;
    private javax.swing.JComboBox cboDepartamento;
    private javax.swing.JComboBox cboDistrito;
    private javax.swing.JComboBox cboEmpresa;
    private javax.swing.JComboBox<String> cboEstadoCivil;
    private javax.swing.JComboBox<String> cboNivelEstudios;
    private javax.swing.JComboBox cboProvincia;
    private javax.swing.JTextField celular;
    private javax.swing.JTextField correo_elect;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField dni;
    private javax.swing.JTextField dni_paciente;
    private javax.swing.JTextField edad;
    private com.toedter.calendar.JDateChooser fecha_nacimiento;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField lugar_nacimiento;
    private javax.swing.JTextField nombres;
    private javax.swing.JTextField nombres_hcpaciente;
    // End of variables declaration//GEN-END:variables
}
