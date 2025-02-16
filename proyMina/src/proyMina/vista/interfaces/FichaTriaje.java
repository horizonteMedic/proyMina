/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyMina.vista.interfaces;

import proyMina.modelo.clsConnection;
import proyMina.modelo.clsFunciones;
import proyMina.modelo.clsOperacionesUsuarios;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import org.json.JSONObject;
import proyMina.modelo.DisableSSLVerification;
import proyMina.modelo.clsGlobales;
import sun.misc.BASE64Decoder;
public final class FichaTriaje extends javax.swing.JInternalFrame {
        Date dateHoy = new Date();
    SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
 clsConnection oConn = new clsConnection();
   clsFunciones  oFunc = new clsFunciones();
   clsOperacionesUsuarios oPe = new clsOperacionesUsuarios();
   javax.swing.ImageIcon oIconoSi = new javax.swing.ImageIcon(ClassLoader.getSystemResource("imagenes/chek.gif"));
        javax.swing.ImageIcon oIconoNo = new javax.swing.ImageIcon(ClassLoader.getSystemResource("imagenes/xx.png"));
        javax.swing.ImageIcon oNo = null;
String[]Triaje = new String[]{};
     DefaultTableModel model;
     int dni=0;
     String base64String="";
     
   public FichaTriaje() {
      initComponents();
     // jTextFieldNro.setEnabled(false);

       // CargarEmpresas();
      //CargarContratas();
       HabilitaReOr();
       sbCargarDatosOcupacional("");
       jtTriaje.setIconAt(0, new ImageIcon(ClassLoader.getSystemResource("imagenes/reportes.png")));
       calcularDniUser();
       cargarEspecialidades();
       AutoCompleteDecorator.decorate(this.cboEspecialidad);
       jRadioButton1.setSelected(true);
               popuptable();
               ocultar(false);
                       if(clsGlobales.historiaClinica>0){
            txtNumero.setText(String.valueOf(clsGlobales.historiaClinica));
        }
   }
   
   public void ocultar (boolean estado){
   txtCinturaTriaje.setVisible(estado);
   jLabel13.setVisible(estado);
   txtPerimetroCuelloTriaje.setVisible(estado);
   jLabel19.setVisible(estado);
   txtIccTriaje.setVisible(estado);
   jLabel18.setVisible(estado);
   
   }
   
       public void popuptable(){
    JPopupMenu popupMenu=new JPopupMenu();
    JMenuItem menuItem1=new JMenuItem("Eliminar Registro");

    menuItem1.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae) {
     int a =jTableEspecialidad.getSelectedRow();
     
           eliminarTicketTriaje((String)jTableEspecialidad.getValueAt(a,1),Integer.valueOf((String)jTableEspecialidad.getValueAt(a,0)));
             //  JOptionPane.showMessageDialog(null, "Registro Eliminado");
        }
    
    });   
    

    popupMenu.add(menuItem1);   

    jTableEspecialidad.setComponentPopupMenu(popupMenu);
  
    }  
   
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgTriaje = new javax.swing.ButtonGroup();
        btBuscar = new javax.swing.ButtonGroup();
        tipoPaciente = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cboEmpresa = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        cboContratas = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        FechaNacimiento = new com.toedter.calendar.JDateChooser();
        FechaTriaje = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txtHistorial = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel28 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        lblBuscarID1 = new javax.swing.JLabel();
        rbRecibo = new javax.swing.JRadioButton();
        rbOrden = new javax.swing.JRadioButton();
        jLabel33 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtPesoTriaje = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtImcTriaje = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtCinturaTriaje = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtCaderaTriaje = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtTemperaturaTriaje = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtFcardiacaTriaje = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtSatTriaje = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtIccTriaje = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtPerimetroCuelloTriaje = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        txtSistolicaTriaje = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtDiastolicaTriaje = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtFRespiratoriaTriaje = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtTalla = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtFvcTriaje = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtFevTriaje = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtFevFvcTriaje = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtFefTriaje = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtConclusionTriaje = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jtTriaje = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTriaje = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cboEspecialidad = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableEspecialidad = new javax.swing.JTable();
        jLabel31 = new javax.swing.JLabel();
        jTextFieldNro = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jButton4 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        btnDiagnostico = new javax.swing.JButton();
        txtEditar = new javax.swing.JButton();
        atxtObservacionesAltura = new javax.swing.JScrollPane();
        txtDiagnostico = new javax.swing.JTextArea();
        btnRegistrar = new javax.swing.JButton();
        btnLimpiarCancelarTriaje = new javax.swing.JButton();

        setClosable(true);
        setTitle("Ingreso datos Triaje");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos"));

        jLabel1.setText("Empresa:");

        cboEmpresa.setEditable(true);
        cboEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEmpresaActionPerformed(evt);
            }
        });

        jLabel2.setText("Contrata:");

        cboContratas.setEditable(true);
        cboContratas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboContratasActionPerformed(evt);
            }
        });

        jLabel5.setText("Nombres:");

        jLabel7.setText("Fecha Nac:");

        FechaNacimiento.setDateFormatString("dd-MM-yyyy");

        FechaTriaje.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                FechaTriajePropertyChange(evt);
            }
        });

        jLabel8.setText("Fecha Triaje:");

        jLabel32.setText("N° Historial :");

        txtHistorial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHistorialKeyPressed(evt);
            }
        });

        jLabel28.setText("Nro:");

        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });
        txtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroKeyTyped(evt);
            }
        });

        lblBuscarID1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        lblBuscarID1.setText("buscar");
        lblBuscarID1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBuscarID1MouseClicked(evt);
            }
        });

        bgTriaje.add(rbRecibo);
        rbRecibo.setText("Recibo");
        rbRecibo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbReciboActionPerformed(evt);
            }
        });

        bgTriaje.add(rbOrden);
        rbOrden.setSelected(true);
        rbOrden.setText("N° Orden");
        rbOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbOrdenActionPerformed(evt);
            }
        });

        jLabel33.setText("Edad:");

        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2))
                            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(cboContratas, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblBuscarID1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rbRecibo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbOrden))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel32))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FechaTriaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(FechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel33)
                                .addGap(18, 18, 18)
                                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel28)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBuscarID1)
                    .addComponent(rbRecibo)
                    .addComponent(rbOrden))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cboEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboContratas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel32)
                        .addComponent(txtHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addComponent(FechaTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel33)
                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addComponent(FechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("")));

        jLabel10.setText("Talla:");

        txtPesoTriaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoTriajeActionPerformed(evt);
            }
        });
        txtPesoTriaje.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPesoTriajeFocusLost(evt);
            }
        });
        txtPesoTriaje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesoTriajeKeyTyped(evt);
            }
        });

        jLabel11.setText("Peso:");

        txtImcTriaje.setEditable(false);
        txtImcTriaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImcTriajeActionPerformed(evt);
            }
        });

        jLabel12.setText("IMC:");

        txtCinturaTriaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCinturaTriajeActionPerformed(evt);
            }
        });
        txtCinturaTriaje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCinturaTriajeKeyTyped(evt);
            }
        });

        jLabel13.setText("Cintura:");

        txtCaderaTriaje.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCaderaTriajeFocusLost(evt);
            }
        });
        txtCaderaTriaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCaderaTriajeActionPerformed(evt);
            }
        });

        jLabel14.setText("Cadera:");

        txtTemperaturaTriaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTemperaturaTriajeActionPerformed(evt);
            }
        });

        jLabel15.setText("Temperatura:");

        txtFcardiacaTriaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFcardiacaTriajeActionPerformed(evt);
            }
        });

        jLabel16.setText("F. Cardiaca:");

        jLabel17.setText("SAT. 02:");

        txtSatTriaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSatTriajeActionPerformed(evt);
            }
        });

        jLabel18.setText("ICC:");

        txtIccTriaje.setEditable(false);
        txtIccTriaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIccTriajeActionPerformed(evt);
            }
        });

        jLabel19.setText("Perimetro Cuello:");

        txtPerimetroCuelloTriaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPerimetroCuelloTriajeActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Presión Sistemica"));

        jLabel20.setText("Sistólica:");

        txtSistolicaTriaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSistolicaTriajeActionPerformed(evt);
            }
        });

        jLabel21.setText("mm Hg");

        jLabel22.setText("Diastólica:");

        txtDiastolicaTriaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiastolicaTriajeActionPerformed(evt);
            }
        });

        jLabel23.setText("mm Hg");

        jLabel24.setText("F. Respiratoria:");

        txtFRespiratoriaTriaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFRespiratoriaTriajeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtSistolicaTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFRespiratoriaTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtDiastolicaTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel24)
                        .addComponent(txtFRespiratoriaTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel20)
                        .addComponent(txtSistolicaTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel21)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtDiastolicaTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel29.setText("m.");

        jLabel30.setText("Kg.");

        txtTalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTallaActionPerformed(evt);
            }
        });
        txtTalla.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTallaFocusLost(evt);
            }
        });
        txtTalla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTallaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel11)
                                .addComponent(jLabel10)
                                .addComponent(jLabel12)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtCinturaTriaje, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                        .addComponent(txtIccTriaje))
                                    .addComponent(txtPesoTriaje)
                                    .addComponent(txtTalla))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel30)))
                            .addComponent(txtImcTriaje))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPerimetroCuelloTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSatTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFcardiacaTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTemperaturaTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCaderaTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel29)
                            .addComponent(txtTalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtPesoTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtImcTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtCinturaTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtCaderaTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtTemperaturaTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtFcardiacaTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtSatTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtIccTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(txtPerimetroCuelloTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ingresar Informacion Triaje", jPanel3);

        jLabel4.setText("FVC:");

        txtFvcTriaje.setEditable(false);

        jLabel9.setText("FEV1:");

        txtFevTriaje.setEditable(false);

        jLabel25.setText("FEV1/FVC:");

        txtFevFvcTriaje.setEditable(false);

        jLabel26.setText("FEF 25 - 75%:");

        txtFefTriaje.setEditable(false);

        jLabel27.setText("Conclusión:");

        txtConclusionTriaje.setEditable(false);
        txtConclusionTriaje.setColumns(20);
        txtConclusionTriaje.setRows(5);
        txtConclusionTriaje.setEnabled(false);
        jScrollPane2.setViewportView(txtConclusionTriaje);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFvcTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFevTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFevFvcTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFefTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFvcTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtFevTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtFevFvcTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txtFefTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Espirometría", jPanel6);

        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        tbTriaje.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbTriaje.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbTriaje.getTableHeader().setReorderingAllowed(false);
        tbTriaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTriajeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbTriajeMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbTriaje);

        jtTriaje.addTab("Revisar si registro paciente correctamente", jScrollPane1);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setText("TICKET SEGUN ESPECIALIDAD");

        cboEspecialidad.setEditable(true);
        cboEspecialidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "N/A" }));
        cboEspecialidad.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cboEspecialidadPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cboEspecialidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboEspecialidadMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cboEspecialidadMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cboEspecialidadMousePressed(evt);
            }
        });
        cboEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEspecialidadActionPerformed(evt);
            }
        });
        cboEspecialidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cboEspecialidadKeyPressed(evt);
            }
        });

        jLabel6.setText("ESPECIALIDAD:");

        jTableEspecialidad.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jTableEspecialidad);

        jLabel31.setText("Nro:");

        jTextFieldNro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNroActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        jButton2.setText("Actualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        jButton3.setText("Limpiar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jRadioButton1.setText("ESTADO");

        jButton4.setText("refresh");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(31, 31, 31)
                                        .addComponent(jButton2)
                                        .addGap(30, 30, 30)
                                        .addComponent(jButton3))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jTextFieldNro, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cboEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jRadioButton1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(jLabel3)
                        .addGap(111, 111, 111)
                        .addComponent(jButton4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jButton4))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel31)
                            .addComponent(jTextFieldNro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton1)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3))
                        .addGap(16, 16, 16))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(12, Short.MAX_VALUE))))
        );

        jLabel34.setText("Diagnostico:");

        btnDiagnostico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnDiagnostico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagnosticoActionPerformed(evt);
            }
        });

        txtEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion.png"))); // NOI18N
        txtEditar.setText("Editar");
        txtEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditarActionPerformed(evt);
            }
        });

        txtDiagnostico.setColumns(20);
        txtDiagnostico.setRows(2);
        atxtObservacionesAltura.setViewportView(txtDiagnostico);

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnRegistrar.setText("Registar/Actualizar");
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

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDiagnostico))
                    .addComponent(atxtObservacionesAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiarCancelarTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDiagnostico)
                    .addComponent(txtEditar)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(atxtObservacionesAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btnRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiarCancelarTriaje)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   private void cboEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEmpresaActionPerformed
      cboEmpresa.getEditor().addActionListener(new ActionListener() {
         @Override
     public void actionPerformed(ActionEvent e) {
          cboContratas.requestFocus();
     }
});
   }//GEN-LAST:event_cboEmpresaActionPerformed
   
   private void cboContratasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboContratasActionPerformed
      cboContratas.getEditor().addActionListener(new ActionListener() {
         @Override
     public void actionPerformed(ActionEvent e) {
          txtHistorial.setEnabled(true);  
          txtHistorial.requestFocus();
     }});
   }//GEN-LAST:event_cboContratasActionPerformed

   private void txtHistorialKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHistorialKeyPressed
     if(txtHistorial.getText().equals("")){
        if (evt.getKeyCode()== KeyEvent.VK_ENTER){

        }
     }
   }//GEN-LAST:event_txtHistorialKeyPressed

   private void lblBuscarID1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuscarID1MouseClicked
      // TODO add your handling code here:
   }//GEN-LAST:event_lblBuscarID1MouseClicked

   private void rbOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbOrdenActionPerformed
   if(rbOrden.isSelected()){txtNumero.requestFocus();}
       
   }//GEN-LAST:event_rbOrdenActionPerformed

   private void rbReciboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbReciboActionPerformed
       if(rbRecibo.isSelected()){txtNumero.requestFocus();}
      
   }//GEN-LAST:event_rbReciboActionPerformed

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
     
              System.out.println("entro a ocupacional");
            if (!txtNumero.getText().isEmpty()) {
                 System.out.println("entro a txt numero con datos");
                if (!OrdenExiste()) {
                     System.out.println("funcion orden existe");
                    if (rbOrden.isSelected()) {
                            System.out.println("entrando a la consulta"); 
                        String Sql = "select n_orden ,fecha_nacimiento, EXTRACT(YEAR FROM age(current_date,dat_pa.fecha_nacimiento)) AS  edad, dni_paciente,dat_pa.nombres ||' '|| dat_pa.apellidos as nombres, (case when ruc_empresa is null then 'N/A' \n" +
                    "else (select razon_social from desktop_empresa_contrata where tipo_emp_cont = 'EMPRESA' \n" +
                    "AND ruc=ruc_empresa) end ) as razon_social_empresa ,(case when ruc_contrata is null then 'N/A' \n" +
                    "else (select razon_social from desktop_empresa_contrata where tipo_emp_cont = 'CONTRATA' \n" +
                    "AND ruc=ruc_contrata) end ) as razon_social_contrata from desktop_datos_historia_clinica as hist_clini \n" +
                    "inner join desktop_datos_pacientes as dat_pa on hist_clini.dni_paciente=dat_pa.dni"
                    + " WHERE hist_clini.n_orden=" + txtNumero.getText() + ";";
                        System.out.println(Sql);
                        oConn.FnBoolQueryExecute(Sql);

                        try {
                            if (oConn.setResult.next()) {
                                txtNombre.setText(oConn.setResult.getString("nombres"));
                                FechaNacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento"));
                                cboEmpresa.setSelectedItem(oConn.setResult.getString("razon_social_empresa"));
                                cboContratas.setSelectedItem(oConn.setResult.getString("razon_social_contrata"));
                                FechaTriaje.requestFocusInWindow();
                                txtNumero.setEnabled(false);
                                txtEdad.setText(oConn.setResult.getString("edad"));
                                
                                fecha();
                                habilitaTriaje(true);
                                oConn.setResult.close();
                            } else {
                                oFunc.SubSistemaMensajeError("No se encuentraa Registro: \n 1- Intente de nuevo \n 2- Si el error sigue Registre Usuario o \n    Aperture EX-Preocupacional de new");
                                oConn.setResult.close();
                            }
                            oConn.sqlStmt.close();
                        } catch (SQLException ex) {
                            oFunc.SubSistemaMensajeInformacion("Tríaje:" + ex.getMessage().toString());
                        }
                    }
                }
                
            
        }
         
      
        
    }//GEN-LAST:event_txtNumeroActionPerformed
  public void habilitaTriaje(boolean r){
   txtTalla.setEnabled(r);
   txtPesoTriaje.setEditable(r);
   txtCinturaTriaje.setEditable(r);
   txtCaderaTriaje.setEditable(r);
   txtPerimetroCuelloTriaje.setEnabled(r);
   txtTemperaturaTriaje.setEditable(r);
   txtSatTriaje.setEnabled(r);
   txtFRespiratoriaTriaje.setEnabled(r);
   txtFcardiacaTriaje.setEditable(r);
   txtSistolicaTriaje.setEditable(r);
   txtDiastolicaTriaje.setEnabled(r);
  }
    public void fecha(){
Date dateHoy = new Date();
       // SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
       FechaTriaje.setDate(dateHoy);
        
}
  /* private void CargarAsistencial(){
        if (!txtNumero.getText().isEmpty()) {
                if (!OrdenExiste()) {
                        if (rbOrden.isSelected()) {
                        String Sql = "select d.nombres_pa,d.edad \n" +
                        "FROM datos_paciente_asistencial as d \n" +
                        "WHERE d.n_hcl='" + txtNumero.getText() + "'";
                        oConn.FnBoolQueryExecute(Sql);
                        try {
                            if (oConn.setResult.next()) {
                                txtNombre.setText(oConn.setResult.getString("nombres_pa"));
                                txtEdad.setText(oConn.setResult.getString("edad"));
                                FechaTriaje.requestFocusInWindow();
                                txtNumero.setEnabled(false);
                                
                                fecha();

                                oConn.setResult.close();
                            } else {
                                oFunc.SubSistemaMensajeError("No se encuentra Registro: \n 1- Intente de nuevo \n 2- Si el error sigue Registre Usuario o \n ");
                                oConn.setResult.close();
                            }
                            oConn.sqlStmt.close();
                        } catch (SQLException ex) {
                            oFunc.SubSistemaMensajeInformacion("Tríaje asistencial:" + ex.getMessage().toString());
                        }
                    }
                        
                    
               }
            }
   }*/
    private void txtNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyTyped
          
        int k=(int)evt.getKeyChar();
        if (k >= 97 && k <= 122 || k>=65 && k<=90){
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null,"No puede ingresar letras!!!","Ventana Error Datos",JOptionPane.ERROR_MESSAGE);
            }
        if(k==241 || k==209){
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null,"No puede ingresar letras!!!","Ventana Error Datos",JOptionPane.ERROR_MESSAGE);
            }
        if(k==32){
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null,"No puede ingresar Espacios!!!","Ventana Error Datos",JOptionPane.ERROR_MESSAGE);
            }
        if(k==10){
    
//txtnombreApellido.transferFocus();
}
    }//GEN-LAST:event_txtNumeroKeyTyped

    private void btnLimpiarCancelarTriajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCancelarTriajeActionPerformed
       LimpiarFichaTriaje();
      
       txtNumero.setEnabled(true);
       txtNumero.requestFocus();
    }//GEN-LAST:event_btnLimpiarCancelarTriajeActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
         if (OrdenExiste()) {
             Actualizar();
         }else{
             AgregarTriaje();
         }
        
    
      
            
    }//GEN-LAST:event_btnRegistrarActionPerformed
   private void AgregarTriaje(){
           if(!txtNumero.getText().isEmpty()){
                 if(!OrdenExiste()){
                     if(validar()){
            String strSqlStmt;
             String Query ;
            strSqlStmt="INSERT INTO desktop_triaje(";
            Query="Values('";
            if (txtNumero.getText().trim().length()>= 1 ){strSqlStmt += "n_orden";Query += txtNumero.getText().toString()+ "'";}
              if (txtEdad.getText().trim().length()>= 1 ){strSqlStmt += ",edad";Query += ",'"+txtEdad.getText().toString()+ "'";}
              if (((JTextField)FechaTriaje.getDateEditor().getUiComponent()).getText().trim().length()> 1 ){strSqlStmt+= ",fecha_triaje";Query+= ",'"+FechaTriaje.getDate().toString()+ "'";}
              if (txtTalla.getText().trim().length()>= 1 ){strSqlStmt += ",talla";Query += ",'"+txtTalla.getText().toString()+ "'";}
              if (txtPesoTriaje.getText().trim().length()>= 1 ){strSqlStmt += ",peso";Query += ",'"+txtPesoTriaje.getText().toString()+ "'";}
              if (txtImcTriaje.getText().trim().length()>= 1 ){strSqlStmt += ",imc";Query += ",'"+txtImcTriaje.getText().toString()+ "'";}
              if (txtCinturaTriaje.getText().trim().length()>= 1 ){strSqlStmt += ",cintura";Query += ",'"+txtCinturaTriaje.getText().toString()+ "'";}
              if (txtIccTriaje.getText().trim().length()>= 1 ){strSqlStmt += ",icc";Query += ",'"+ txtIccTriaje.getText().toString()+ "'";}
              if (txtCaderaTriaje.getText().trim().length()>= 1 ){strSqlStmt += ",cadera";Query += ",'"+txtCaderaTriaje.getText().toString()+ "'";}
              if (txtTemperaturaTriaje.getText().trim().length()>= 1 ){strSqlStmt += ",temperatura";Query += ",'"+txtTemperaturaTriaje.getText().toString()+ "'";}
              if (txtFcardiacaTriaje.getText().trim().length()>= 1 ){strSqlStmt += ",f_cardiaca";Query += ",'"+txtFcardiacaTriaje.getText().toString()+ "'";}
              if (txtSatTriaje.getText().trim().length()>= 1 ){strSqlStmt += ",sat_02";Query += ",'"+txtSatTriaje.getText().toString()+ "'";}
              if (txtPerimetroCuelloTriaje.getText().trim().length()>= 1 ){strSqlStmt += ",perimetro_cuello";Query += ",'"+txtPerimetroCuelloTriaje.getText().toString()+ "'";}
              if (txtSistolicaTriaje.getText().trim().length()>= 1 ){strSqlStmt += ",sistolica";Query += ",'"+txtSistolicaTriaje.getText().toString()+ "'";}
              if (txtDiastolicaTriaje.getText().trim().length()>= 1 ){strSqlStmt += ",diastolica";Query += ",'"+txtDiastolicaTriaje.getText().toString()+ "'";}
              if (txtFRespiratoriaTriaje.getText().trim().length()>= 1 ){strSqlStmt += ",f_respiratoria";Query += ",'"+txtFRespiratoriaTriaje.getText().toString()+ "'";}
              if (txtFvcTriaje.getText().trim().length()>= 1 ){strSqlStmt += ",fvc";Query += ",'"+txtFvcTriaje.getText().toString()+ "'";}
              if (txtFevTriaje.getText().trim().length()>= 1 ){strSqlStmt += ",fev_1";Query += ",'"+txtFevTriaje.getText().toString()+ "'";}
              if (txtFevFvcTriaje.getText().trim().length()>= 1 ){strSqlStmt += ",fev1_fvc";Query += ",'"+txtFevFvcTriaje.getText().toString()+ "'";}
              if (txtFefTriaje.getText().trim().length()>= 1 ){strSqlStmt += ",fef25_75";Query += ",'"+txtFefTriaje.getText().toString()+ "'";}
              if (txtDiagnostico.getText().trim().length()>= 1 ){strSqlStmt += ",conclusion";Query += ",'"+txtDiagnostico.getText().toString()+ "'";}
               
               if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt.concat(") ") + Query.concat(")"))){
             oFunc.SubSistemaMensajeInformacion("Se ha registrado la Entrada con Éxito");
             jTextFieldNro.setText(txtNumero.getText().toString().trim());
             LimpiarFichaTriaje();
             txtNumero.setEnabled(true);
             txtNumero.requestFocus();
             sbCargarDatosOcupacional("");
                try {
                    oConn.sqlStmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(FichaTriaje.class.getName()).log(Level.SEVERE, null, ex);
                }
        }else{
             oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");
               }
                         try {
                             oConn.sqlStmt.close();
                         } catch (SQLException ex) {
                             Logger.getLogger(FichaTriaje.class.getName()).log(Level.SEVERE, null, ex);
                         }
        }
        }else{ oFunc.SubSistemaMensajeError("Número de Orden Utilizado");}
        }else {  oFunc.SubSistemaMensajeError("Llene los Campos correctamente");txtNumero.requestFocus();}
       
   } 

    private boolean validar(){
boolean bResultado=true;
  
    if (((JTextField)FechaTriaje.getDateEditor().getUiComponent()).getText().trim().length()< 2 ) 
        {oFunc.SubSistemaMensajeError("Ingrese Fecha ");bResultado = false;}
    else if(txtTalla.getText().isEmpty()){oFunc.SubSistemaMensajeError("Ingrese Talla");bResultado=false; }
    else if(txtPesoTriaje.getText().isEmpty()){oFunc.SubSistemaMensajeError("Ingrese Peso");bResultado=false; }
  //   else if(txtCinturaTriaje.getText().isEmpty()){oFunc.SubSistemaMensajeError("Ingrese Cintura");bResultado=false; }
    
     else if(txtCaderaTriaje.getText().isEmpty()){oFunc.SubSistemaMensajeError("Ingrese Cadera");bResultado=false; }
     else if(txtTemperaturaTriaje.getText().isEmpty()){oFunc.SubSistemaMensajeError("Ingrese Temperatura");bResultado=false; }
     else if(txtFcardiacaTriaje.getText().isEmpty()){oFunc.SubSistemaMensajeError("Ingrese Frecuencia Cardica");bResultado=false; }
     else if(txtSatTriaje.getText().isEmpty()){oFunc.SubSistemaMensajeError("Ingrese Sat02");bResultado=false; }
  //   else if(txtPerimetroCuelloTriaje.getText().isEmpty()){oFunc.SubSistemaMensajeError("Ingrese Perimetro Cuello");bResultado=false; }
     else if(txtSistolicaTriaje.getText().isEmpty()){oFunc.SubSistemaMensajeError("Ingrese Sistólica");bResultado=false; }
     else if(txtDiastolicaTriaje.getText().isEmpty()){oFunc.SubSistemaMensajeError("Ingrese Diastólica");bResultado=false; }
     else if(txtFRespiratoriaTriaje.getText().isEmpty()){oFunc.SubSistemaMensajeError("Ingrese Función respiratoria");bResultado=false; }
     else  if (((JTextField)FechaTriaje.getDateEditor().getUiComponent()).getText().trim().length()< 2 ) 
        {oFunc.SubSistemaMensajeError("Ingrese Fecha de cita");bResultado = false;}
   
  
   return bResultado;
}
    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
       txtTalla.requestFocus();
    }//GEN-LAST:event_txtEdadActionPerformed
    
    private void FechaTriajePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_FechaTriajePropertyChange
       txtTalla.requestFocus();
               
    }//GEN-LAST:event_FechaTriajePropertyChange




    private void tbTriajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTriajeMouseClicked
        
       if (evt.getClickCount() == 2) 
        {  
            Integer cod  = Integer.valueOf( tbTriaje.getValueAt(tbTriaje.getSelectedRow(),0).toString());
           try {
               print(cod);
           } catch (Exception ex) {
               Logger.getLogger(FichaTriaje.class.getName()).log(Level.SEVERE, null, ex);
           }
            
        }
       
    }//GEN-LAST:event_tbTriajeMouseClicked
       private void print(Integer cod) throws Exception{
                consumirApiSello();
                Map parameters = new HashMap(); 
                parameters.put("Norden",cod);      
                String direccionReporte="";
              //  InputStream targetStream = IOUtils.toInputStream(base64String);  
              //
              if(!base64String.contains("OTROJASPER"))
              {
                BufferedImage image = null;
                byte[] imageByte;

                BASE64Decoder decoder = new BASE64Decoder();
                    imageByte = decoder.decodeBuffer(base64String);
                ByteArrayInputStream bis = new ByteArrayInputStream(imageByte);
                image = ImageIO.read(bis);
                bis.close();
                
                
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ImageIO.write(image, "png", baos); 
                InputStream stream = new ByteArrayInputStream(baos.toByteArray());
                
                
                parameters.put("Firma",stream);             
              }
                System.out.println("los parametros son: "+parameters);
                  try 
                {   
                    if(!base64String.contains("OTROJASPER"))
                    direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"Triaje_1.jasper";
                    else
                    direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"Triaje_1_sinfirma.jasper";
                       
                    JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                    JasperPrint myPrint = JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
                    JasperViewer viewer = new JasperViewer(myPrint, false);
                    viewer.setTitle("FORMATO TRIAJE");
                   // viewer.setAlwaysOnTop(true);
                    viewer.setVisible(true);
                 } catch (JRException ex) {
                    Logger.getLogger(FichaTriaje.class.getName()).log(Level.SEVERE, null, ex);
                }
 }
    private void btnDiagnosticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagnosticoActionPerformed
//       if(!txtIccTriaje.getText().isEmpty() && !txtIccTriaje.getText().isEmpty()
//               &&!txtSistolicaTriaje.getText().isEmpty()&&!txtDiastolicaTriaje.getText().isEmpty()
//               && !txtFcardiacaTriaje.getText().isEmpty()){ 
//        diagnostico();
//       }else {
//        oFunc.SubSistemaMensajeInformacion("Debe ingresar todos los campos necesarios");
//    }
    }//GEN-LAST:event_btnDiagnosticoActionPerformed

    private void txtTallaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTallaKeyTyped
        oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtTallaKeyTyped

    private void txtTallaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTallaFocusLost
        if(!txtTalla.getText().isEmpty()){
            JFormattedTextField talla = new JFormattedTextField(oFunc.setMascara("#.##"));
            talla.setText(txtTalla.getText());
            txtTalla.setText(talla.getText());
            talla.setText(null);
        }
    }//GEN-LAST:event_txtTallaFocusLost

    private void txtTallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTallaActionPerformed
        txtPesoTriaje.requestFocus();
    }//GEN-LAST:event_txtTallaActionPerformed

    private void txtFRespiratoriaTriajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFRespiratoriaTriajeActionPerformed
       
    }//GEN-LAST:event_txtFRespiratoriaTriajeActionPerformed

    private void txtDiastolicaTriajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiastolicaTriajeActionPerformed
        if(!txtSistolicaTriaje.getText().isEmpty() && !txtDiastolicaTriaje.getText().isEmpty()){
            float sistolica = Float.parseFloat(txtSistolicaTriaje.getText().toString());
            float diastolica = Float.parseFloat(txtDiastolicaTriaje.getText().toString());
            if (sistolica < 120 && diastolica < 80) {
                txtDiagnostico.append("- PRESION ARTERIAL: NORMAL." + '\n');
            } else if ((sistolica >= 120 && sistolica < 140) && (diastolica >= 80 && diastolica <= 90)) {
                txtDiagnostico.append("- PRESION ARTERIAL: PREHIPERTENSION." + '\n');
            } else if ((sistolica >= 140 && sistolica < 160) && (diastolica > 90 && diastolica < 100)) {
                txtDiagnostico.append("- PRESION ARTERIAL: HTA-1." + '\n');
            } else if ((sistolica >= 160) && (diastolica >= 100)) {
                txtDiagnostico.append("- PRESION ARTERIAL: HTA-2." + '\n');
            }
        }
        txtFRespiratoriaTriaje.requestFocus();
    }//GEN-LAST:event_txtDiastolicaTriajeActionPerformed

    private void txtSistolicaTriajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSistolicaTriajeActionPerformed

        txtDiastolicaTriaje.requestFocus();
    }//GEN-LAST:event_txtSistolicaTriajeActionPerformed

    private void txtPerimetroCuelloTriajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPerimetroCuelloTriajeActionPerformed
        if (!txtPerimetroCuelloTriaje.getText().isEmpty()) {
            String sql = "SELECT dp.sexo FROM desktop_datos_paciente as dp "
            + "inner join desktop_datos_historia_clinica AS n ON(dp.dni = n.dni_paciente) "
            + "where n.n_orden='" + txtNumero.getText().toString() + "'";
            oConn.FnBoolQueryExecute(sql);

            try {
                if (oConn.setResult.next()) {
                    String sexo = oConn.setResult.getString("sexo");
                    float cuello = Float.parseFloat(txtPerimetroCuelloTriaje.getText().toString());
                    if ("M".equals(sexo)) {
                        if (cuello < 43.2) {
                            txtDiagnostico.append("- CIRCUNFERENCIA DE CUELLO: NORMAL." + '\n');
                        } else {
                            txtDiagnostico.append("- CIRCUNFERENCIA DE CUELLO: ANORMAL." + '\n');
                        }
                    }
                    if ("F".equals(sexo)) {
                        if (cuello < 40.6) {
                            txtDiagnostico.append("- CIRCUNFERENCIA DE CUELLO: NORMAL." + '\n');
                        } else {
                            txtDiagnostico.append("- CIRCUNFERENCIA DE CUELLO: ANORMAL." + '\n');
                        }
                    }
                }
                oConn.sqlStmt.close();
            } catch (SQLException ex) {
                oFunc.SubSistemaMensajeError("No existe registros del cliente");
            }
        }
        txtSistolicaTriaje.requestFocus();
    }//GEN-LAST:event_txtPerimetroCuelloTriajeActionPerformed

    private void txtIccTriajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIccTriajeActionPerformed

    }//GEN-LAST:event_txtIccTriajeActionPerformed

    private void txtSatTriajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSatTriajeActionPerformed
        txtPerimetroCuelloTriaje.requestFocus();
    }//GEN-LAST:event_txtSatTriajeActionPerformed

    private void txtFcardiacaTriajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFcardiacaTriajeActionPerformed
        if(!txtFcardiacaTriaje.getText().isEmpty()){
            float frecuencia = Float.parseFloat(txtFcardiacaTriaje.getText().toString());
            if(frecuencia>100){
                txtDiagnostico.append("- FRECUENCIA CARDIACA: TAQUICARDIA."+'\n');
            }else if(frecuencia<60){
                txtDiagnostico.append("- FRECUENCIA CARDIACA: BRAQUICARDIA."+'\n');
            }else{txtDiagnostico.append("- FRECUENCIA CARDIACA: NORMAL."+'\n');}
        }
        txtSatTriaje.requestFocus();
    }//GEN-LAST:event_txtFcardiacaTriajeActionPerformed

    private void txtTemperaturaTriajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTemperaturaTriajeActionPerformed
        /*if(!txtIccTriaje.getText().isEmpty()){
            String sql="SELECT dp.sexo FROM desktop_datos_paciente as dp "
            +"inner join desktop_datos_historia_clinica AS n ON(dp.dni = n.dni_paciente) "
            + "where n.n_orden='"+txtNumero.getText().toString()+"'";
            oConn.FnBoolQueryExecute(sql);

            try {
                if (oConn.setResult.next())
                {
                    String sexo=oConn.setResult.getString("sexo");
                    float icc = Float.parseFloat(txtIccTriaje.getText().toString());
                    if ("M".equals(sexo)) {
                        if (icc >= 0.78 && icc < 0.95) {
                            txtDiagnostico.append("- INDICE DE CINTRUA CADERA: NORMAL." + '\n');
                        } else if(icc >= 0.95 ){
                            txtDiagnostico.append("- INDICE DE CINTRUA CADERA: OBESIDAD ABDOMIO VISCERAL." + '\n');
                        }
                    }
                    if ("F".equals(sexo)) {
                        if (icc >= 0.71 && icc < 0.86) {
                            txtDiagnostico.append("- INDICE DE CINTRUA CADERA: NORMAL." + '\n');
                        } else if(icc >=0.86){
                            txtDiagnostico.append("- INDICE DE CINTRUA CADERA: OBESIDAD ABDOMIO VISCERAL." + '\n');
                        }
                    }
                }
                oConn.sqlStmt.close();
            } catch (SQLException ex) {
                oFunc.SubSistemaMensajeError("No existe registros del cliente");
            }
        }
        */
        txtFcardiacaTriaje.requestFocus();
    }//GEN-LAST:event_txtTemperaturaTriajeActionPerformed

    private void txtCaderaTriajeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCaderaTriajeFocusLost
        if (txtCinturaTriaje.getText().length() > 1  ){
            if(txtCaderaTriaje.getText().length() > 1){
                //oFunc.SubSistemaMensajeError("carga");
                DecimalFormatSymbols simbolos = new DecimalFormatSymbols();
                simbolos.setDecimalSeparator('.');
                DecimalFormat formateador = new DecimalFormat("##.##",simbolos);

                Double ci;
                Double ca;
                ci = Double.valueOf(txtCinturaTriaje.getText().toString());
                ca = Double.valueOf(txtCaderaTriaje.getText().toString());
                double icc= ci / ca ;
                txtIccTriaje.setText(formateador.format(icc));
            }
        }
    }//GEN-LAST:event_txtCaderaTriajeFocusLost

    private void txtCaderaTriajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCaderaTriajeActionPerformed
        txtTemperaturaTriaje.requestFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_txtCaderaTriajeActionPerformed

    private void txtCinturaTriajeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCinturaTriajeKeyTyped
        oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtCinturaTriajeKeyTyped

    private void txtCinturaTriajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCinturaTriajeActionPerformed
        float imc = Float.parseFloat(txtImcTriaje.getText().toString());
        if (imc < 18.5) {
            txtDiagnostico.append("- INDICE DE MASA CORPORAL: BAJO DE PESO." + '\n');
        } else if (imc >= 18.5 && imc < 25) {
            txtDiagnostico.append("- INDICE DE MASA CORPORAL: NORMAL." + '\n');
        } else if (imc >= 25 && imc < 30) {
            txtDiagnostico.append("- INDICE DE MASA CORPORAL: SOBREPESO." + '\n');
        } else if (imc >= 30 && imc < 35) {
            txtDiagnostico.append("- INDICE DE MASA CORPORAL: OBESIDAD I." + '\n');
        } else if (imc >= 35 && imc < 40) {
            txtDiagnostico.append("- INDICE DE MASA CORPORAL: OBESIDAD II." + '\n');
        } else {
            txtDiagnostico.append("- INDICE DE MASA CORPORAL: OBESIDAD III." + '\n');
        }
        txtCaderaTriaje.requestFocus();
    }//GEN-LAST:event_txtCinturaTriajeActionPerformed

    private void txtImcTriajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImcTriajeActionPerformed
        txtCinturaTriaje.requestFocus();
    }//GEN-LAST:event_txtImcTriajeActionPerformed

    private void txtPesoTriajeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesoTriajeKeyTyped
        oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtPesoTriajeKeyTyped

    private void txtPesoTriajeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPesoTriajeFocusLost
        if (txtTalla.getText().length() > 1  ){
            if(txtPesoTriaje.getText().length() > 1){
                //oFunc.SubSistemaMensajeError("carga");
                DecimalFormatSymbols simbolos = new DecimalFormatSymbols();
                simbolos.setDecimalSeparator('.');
                DecimalFormat formateador = new DecimalFormat("##.##",simbolos);

                Double t;
                Double p;
                t = Double.valueOf(txtTalla.getText().toString());
                p = Double.valueOf(txtPesoTriaje.getText().toString());
                double imc= p/(t * t) ;
                txtImcTriaje.setText(formateador.format(imc));
            }
        }
    }//GEN-LAST:event_txtPesoTriajeFocusLost

    private void txtPesoTriajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoTriajeActionPerformed
        txtCinturaTriaje.requestFocus();
    }//GEN-LAST:event_txtPesoTriajeActionPerformed

    private void txtEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditarActionPerformed
        habilitaTriaje(true);
        
    }//GEN-LAST:event_txtEditarActionPerformed

    private void tbTriajeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTriajeMousePressed
        if (evt.getClickCount() == 1) 
        {  
            txtNumero.setEnabled(false);
            habilitaTriaje(false);
            Integer cod  = Integer.valueOf( tbTriaje.getValueAt(tbTriaje.getSelectedRow(),0).toString());
            String Sql = "select dp.nombres,dp.apellidos,dp.fecha_nacimiento,n.ruc_empresa,n.ruc_contrata,\n" +
                "	t.edad, t.fecha_triaje, t.talla, t.peso, \n" +
                "       t.imc, t.cintura, t.icc, t.cadera, t.temperatura, t.f_cardiaca, t.sat_02, t.perimetro_cuello, \n" +
                "       t.sistolica, t.diastolica, t.f_respiratoria, t.conclusion FROM desktop_datos_pacientes as dp\n" +
                "       INNER JOIN desktop_datos_historia_clinica as n ON (dp.dni = n.dni_paciente) \n" +
                "       INNER JOIN desktop_triaje as t ON (t.n_orden = n.n_orden) \n" +
                "       WHERE n.n_orden= " + cod+"";
            System.out.println(Sql);
            oConn.FnBoolQueryExecute(Sql);
            try {
                if (oConn.setResult.next()) {
                    txtNumero.setText(String.valueOf(cod));
                    txtNombre.setText(oConn.setResult.getString("nombres"));
                    FechaNacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento"));
                    cboEmpresa.setSelectedItem(oConn.setResult.getString("ruc_empresa"));
                    cboContratas.setSelectedItem(oConn.setResult.getString("ruc_contrata"));
                    txtEdad.setText(oConn.setResult.getString("edad"));
                    FechaTriaje.setDate(oConn.setResult.getDate("fecha_triaje"));
                    txtTalla.setText(oConn.setResult.getString("talla"));
                    txtPesoTriaje.setText(oConn.setResult.getString("peso"));
                    txtImcTriaje.setText(oConn.setResult.getString("imc"));
                    txtCinturaTriaje.setText(oConn.setResult.getString("cintura"));
                    txtIccTriaje.setText(oConn.setResult.getString("icc"));
                    txtCaderaTriaje.setText(oConn.setResult.getString("cadera"));
                    txtTemperaturaTriaje.setText(oConn.setResult.getString("temperatura"));
                    txtFcardiacaTriaje.setText(oConn.setResult.getString("f_cardiaca"));
                    txtSatTriaje.setText(oConn.setResult.getString("sat_02"));
                    txtPerimetroCuelloTriaje.setText(oConn.setResult.getString("perimetro_cuello"));
                    txtSistolicaTriaje.setText(oConn.setResult.getString("sistolica"));
                    txtDiastolicaTriaje.setText(oConn.setResult.getString("diastolica"));
                    txtFRespiratoriaTriaje.setText(oConn.setResult.getString("f_respiratoria"));
                    txtDiagnostico.setText(oConn.setResult.getString("conclusion"));
                    
                }
                oConn.sqlStmt.close();
            } catch (Exception e) {
            }
            
        }
    }//GEN-LAST:event_tbTriajeMousePressed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        cerrarVentana();        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosing

    private void cboEspecialidadPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cboEspecialidadPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_cboEspecialidadPopupMenuWillBecomeInvisible

    private void cboEspecialidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboEspecialidadMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cboEspecialidadMouseClicked

    private void cboEspecialidadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboEspecialidadMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cboEspecialidadMouseEntered

    private void cboEspecialidadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboEspecialidadMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboEspecialidadMousePressed

    private void cboEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEspecialidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboEspecialidadActionPerformed

    private void cboEspecialidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboEspecialidadKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboEspecialidadKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(!cboEspecialidad.getSelectedItem().toString().trim().contains("N/A"))
        {
        if(!existenciaEspecialidades()){
        registrarTicketEspecialiad();
                cargarTicketEspecialidadPorNOrden(jTextFieldNro.getText().toString().trim());

        }
        else
                 oFunc.SubSistemaMensajeError("ERROR: Historia clinica por especialidad debe de ser unica");
        }
        else
                         oFunc.SubSistemaMensajeError("SELECCIONE UN ELEMENTO");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        cargarTicketEspecialidadPorNOrden(jTextFieldNro.getText().toString().trim());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextFieldNroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNroActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FechaNacimiento;
    private com.toedter.calendar.JDateChooser FechaTriaje;
    private javax.swing.JScrollPane atxtObservacionesAltura;
    private javax.swing.ButtonGroup bgTriaje;
    private javax.swing.ButtonGroup btBuscar;
    private javax.swing.JButton btnDiagnostico;
    private javax.swing.JButton btnLimpiarCancelarTriaje;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox cboContratas;
    private javax.swing.JComboBox cboEmpresa;
    private javax.swing.JComboBox cboEspecialidad;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableEspecialidad;
    private javax.swing.JTextField jTextFieldNro;
    private javax.swing.JTabbedPane jtTriaje;
    private javax.swing.JLabel lblBuscarID1;
    private javax.swing.JRadioButton rbOrden;
    private javax.swing.JRadioButton rbRecibo;
    private javax.swing.JTable tbTriaje;
    private javax.swing.ButtonGroup tipoPaciente;
    private javax.swing.JTextField txtCaderaTriaje;
    private javax.swing.JTextField txtCinturaTriaje;
    private javax.swing.JTextArea txtConclusionTriaje;
    private javax.swing.JTextArea txtDiagnostico;
    private javax.swing.JTextField txtDiastolicaTriaje;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JButton txtEditar;
    private javax.swing.JTextField txtFRespiratoriaTriaje;
    private javax.swing.JTextField txtFcardiacaTriaje;
    private javax.swing.JTextField txtFefTriaje;
    private javax.swing.JTextField txtFevFvcTriaje;
    private javax.swing.JTextField txtFevTriaje;
    private javax.swing.JTextField txtFvcTriaje;
    private javax.swing.JTextField txtHistorial;
    private javax.swing.JTextField txtIccTriaje;
    private javax.swing.JTextField txtImcTriaje;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPerimetroCuelloTriaje;
    private javax.swing.JTextField txtPesoTriaje;
    private javax.swing.JTextField txtSatTriaje;
    private javax.swing.JTextField txtSistolicaTriaje;
    private javax.swing.JTextField txtTalla;
    private javax.swing.JTextField txtTemperaturaTriaje;
    // End of variables declaration//GEN-END:variables
       public boolean OrdenExiste()
    {
        // Para devolver el resultado
        boolean bResultado=false;
        
        // Para el Query
        String sQuery="";
        
        // Prepara el Query
        sQuery  = "Select * from desktop_triaje Where n_orden="+txtNumero.getText().toString();
        
   
        //Ejecuta el Query
        oConn.FnBoolQueryExecute(sQuery);
        
        // Capturo el Error
        try {
            
            // Verifico que haya habido resultados
            if (oConn.setResult.next())
            {
                // Resultado
                bResultado = true;
//             oFunc.SubSistemaMensajeError("Número de Orden Utilizado");
//             txtNumero.setText(null);
//             txtNumero.requestFocus();
            }
            
            // Cierro los Resultados
            oConn.sqlStmt.close();
            
        } catch (SQLException ex) {
         
        }
        
        
        
        // Retorna el Resultado
        return bResultado;
        
    }
       
       private void Actualizar(){
           String sCodigo=txtNumero.getText();
        String strSqlStmt;
        
//      sCodigo = tbOcupacional.getValueAt(tbOcupacional.getSelectedRow(), 0).toString();
        strSqlStmt="UPDATE desktop_triaje\n" +
                "   SET edad='" + txtEdad.getText().toString() + "', fecha_triaje='" + FechaTriaje.getDate().toString() + "', \n" +
                "       talla='" + txtTalla.getText().toString() + "', peso='" + txtPesoTriaje.getText().toString() + "', "+
                "       imc='" + txtImcTriaje.getText().toString() + "', cintura='" + txtCinturaTriaje.getText().toString() + "', "+ 
                "       icc='" + txtIccTriaje.getText().toString() + "', cadera='" + txtCaderaTriaje.getText().toString() + "', " +
                "       temperatura='" + txtTemperaturaTriaje.getText().toString() + "',f_cardiaca='" + txtFcardiacaTriaje.getText().toString() + "', "+ 
                "sat_02='" + txtSatTriaje.getText().toString() + "', perimetro_cuello='" + txtPerimetroCuelloTriaje.getText().toString() + "', " +
                "sistolica='" + txtSistolicaTriaje.getText().toString() + "', diastolica='" + txtDiastolicaTriaje.getText().toString() + "', \n" +
                "f_respiratoria='" + txtFRespiratoriaTriaje.getText().toString() + "', conclusion='" + txtDiagnostico.getText().toString() + "'\n" +
                " WHERE n_orden='" + sCodigo + "'";
            LimpiarFichaTriaje();
             txtNumero.setEnabled(true);
             txtNumero.requestFocus();
             sbCargarDatosOcupacional("");
        //oFunc.SubSistemaMensajeInformacion(strSqlStmt);
        if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)) {
            oFunc.SubSistemaMensajeInformacion("Se ha actualizado la Entrada con Éxito");
               try {
                   oConn.sqlStmt.close();
               } catch (SQLException ex) {
                   Logger.getLogger(FichaTriaje.class.getName()).log(Level.SEVERE, null, ex);
               }
        } else {
            oFunc.SubSistemaMensajeError("No se pudo Agregar La Entrada");
        }
     try {
         oConn.sqlStmt.close();
     } catch (SQLException ex) {
         Logger.getLogger(FichaTriaje.class.getName()).log(Level.SEVERE, null, ex);
     }
        sbCargarDatosOcupacional("");
       }
   private void LimpiarFichaTriaje(){
   txtNumero.setText(null);
   cboContratas.setSelectedIndex(-1);
   cboEmpresa.setSelectedIndex(-1);
   txtHistorial.setText(null);
   txtNombre.setText(null);
   FechaNacimiento.setDate(null);
   txtEdad.setText(null);
   FechaTriaje.setDate(null);
   txtTalla.setText(null);
   txtPesoTriaje.setText(null);
   txtImcTriaje.setText(null);
   txtCinturaTriaje.setText(null);
   txtIccTriaje.setText(null);
   txtCaderaTriaje.setText(null);
   txtTemperaturaTriaje.setText(null);
   txtFcardiacaTriaje.setText(null);
   txtSatTriaje.setText(null);
   txtPerimetroCuelloTriaje.setText(null);
   txtSistolicaTriaje.setText(null);
   txtDiastolicaTriaje.setText(null);
   txtFRespiratoriaTriaje.setText(null);
   txtDiagnostico.setText(null);
   txtNumero.requestFocus();
           
   
   }
   private void HabilitaReOr(){
   cboEmpresa.setEnabled(false);
   cboContratas.setEnabled(false);
   txtHistorial.setEditable(false);
   txtNombre.setEditable(false);
   FechaNacimiento.setEnabled(false);
   txtEdad.setEditable(false);
   txtTalla.setEnabled(false);
   //if(bHabilita){}
   txtPesoTriaje.setEditable(false);
   txtCinturaTriaje.setEditable(false);
   txtCaderaTriaje.setEditable(false);
   txtPerimetroCuelloTriaje.setEnabled(false);
   txtTemperaturaTriaje.setEditable(false);
   txtSatTriaje.setEnabled(false);
   txtFRespiratoriaTriaje.setEnabled(false);
   txtFcardiacaTriaje.setEditable(false);
   txtSistolicaTriaje.setEditable(false);
   txtDiastolicaTriaje.setEnabled(false);
   
   txtFcardiacaTriaje.requestFocus();
  
   }
    /*private void abrirDialoj(){
       FichaTriajeModalCod FrmModalCod = new FichaTriajeModalCod(null,true);
        FrmModalCod.setLocationRelativeTo(null);
        FrmModalCod.setVisible(true);
    
    }*/
    private void diagnostico(){
        String sql="SELECT dp.sexo FROM dektop_datos_pacientes as dp " 
                +"inner join desktop_datos_historia_clinica AS n ON(dp.dni = n.dni_paciente) "
                + "where n.n_orden='"+txtNumero.getText().toString()+"'";
        oConn.FnBoolQueryExecute(sql);
        
        try {
            if (oConn.setResult.next())
            {
               String sexo=oConn.setResult.getString("sexo");
                float imc = Float.parseFloat(txtImcTriaje.getText().toString());
                float sistolica = Float.parseFloat(txtSistolicaTriaje.getText().toString());
                float diastolica = Float.parseFloat(txtDiastolicaTriaje.getText().toString());
                float frecuencia = Float.parseFloat(txtFcardiacaTriaje.getText().toString());
                float icc = Float.parseFloat(txtIccTriaje.getText().toString());
                float cuello = Float.parseFloat(txtPerimetroCuelloTriaje.getText().toString());
               
               if(frecuencia>100){
                   txtDiagnostico.append("- FRECUENCIA CARDIACA: TAQUICARDIA."+'\n');
               }else if(frecuencia<60){
                   txtDiagnostico.append("- FRECUENCIA CARDIACA: BRAQUICARDIA."+'\n');
               }else{txtDiagnostico.append("- FRECUENCIA CARDIACA: NORMAL."+'\n');}
               if(imc<18.5){
                   txtDiagnostico.append("- INDICE DE MASA CORPORAL: BAJO DE PESO."+'\n');
               }else if(imc>=18.5 && imc<25){
                   txtDiagnostico.append("- INDICE DE MASA CORPORAL: NORMAL."+'\n');
               }else if(imc>=25 && imc<30){
                   txtDiagnostico.append("- INDICE DE MASA CORPORAL: SOBREPESO."+'\n');
               }else if(imc>=30 && imc<35){
                   txtDiagnostico.append("- INDICE DE MASA CORPORAL: OBESIDAD I."+'\n');
               }else if(imc>=35 && imc<40){
                   txtDiagnostico.append("- INDICE DE MASA CORPORAL: OBESIDAD II."+'\n');
               }else{ txtDiagnostico.append("- INDICE DE MASA CORPORAL: OBESIDAD III."+'\n');}
               if(sistolica<120 && diastolica<80){
                   txtDiagnostico.append("- PRESION ARTERIAL: NORMAL."+'\n');
               }else if((sistolica>=120 && sistolica<140)&& (diastolica>=80 && diastolica<90)){
                   txtDiagnostico.append("- PRESION ARTERIAL: PREHIPERTENSION."+'\n');
               }else if((sistolica>=140 && sistolica<160)&& (diastolica>=90 && diastolica<100)){
                   txtDiagnostico.append("- PRESION ARTERIAL: HTA-1."+'\n');
               }else if((sistolica>=160)&& (diastolica>=100)){
                txtDiagnostico.append("- PRESION ARTERIAL: HTA-2."+'\n');}
               if ("M".equals(sexo)) {
                    if (icc >= 0.78 && icc < 0.95) {
                        txtDiagnostico.append("- Indice de Cintura Cadera: NORMAL." + '\n');
                    } else if(icc >= 0.95 ){
                        txtDiagnostico.append("- Indice de Cintura Cadera: OBESIDAD ABDOMIO VISCERAL." + '\n');
                    }
               }
               if ("F".equals(sexo)) {
                    if (icc >= 0.71 && icc < 0.86) {
                        txtDiagnostico.append("- INDICE DE CINTRUA CADERA: NORMAL." + '\n');
                    } else if(icc >=0.86){
                        txtDiagnostico.append("- INDICE DE CINTRUA CADERA: OBESIDAD ABDOMIO VISCERAL." + '\n');
                    }
               }
               if ("M".equals(sexo)) {
                    if (cuello <43.2) {
                        txtDiagnostico.append("- CIRCUNFERENCIA DE CUELLO: NORMAL." + '\n');
                    } else {
                        txtDiagnostico.append("- CIRCUNFERENCIA DE CUELLO: ANORMAL." + '\n');
                    }
               }
               if ("F".equals(sexo)) {
                    if (cuello < 40.6) {
                        txtDiagnostico.append("- CIRCUNFERENCIA DE CUELLO: NORMAL." + '\n');
                    } else {
                        txtDiagnostico.append("- CIRCUNFERENCIA DE CUELLO: ANORMAL." + '\n');
                    }
               }
            }
            oConn.sqlStmt.close();
        } catch (SQLException ex) {
            oFunc.SubSistemaMensajeError("No existe registros del cliente");
       }
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  /* 
    
private void CargarEmpresas(){
      String sQuery;        
        sQuery ="SELECT razon_social FROM desktop_empresa_contrata";
         if (oConn.FnBoolQueryExecute(sQuery))
        {
            try 
            {
              while (oConn.setResult.next())
                 {                    
                     cboEmpresa.addItem(oConn.setResult.getString ("razon_social"));   
                 }
              oConn.setResult.close();
            } 
            catch (SQLException ex) 
            {
                oFunc.SubSistemaMensajeInformacion(ex.toString());
                Logger.getLogger(Ingreso.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        cboEmpresa.setSelectedIndex(-1);
        cboEmpresa.setBackground(Color.LIGHT_GRAY);
        AutoCompleteDecorator.decorate(this.cboEmpresa);
        try {
            oConn.sqlStmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(FichaTriaje.class.getName()).log(Level.SEVERE, null, ex);
        }
}

//FichaTriaje
private void CargarContratas(){
      String sQuery;        
        sQuery ="SELECT razon_social FROM desktop_empresa_contrata";
         if (oConn.FnBoolQueryExecute(sQuery))
        {
            try {
              while (oConn.setResult.next())
                 {             
                     cboContratas.addItem(oConn.setResult.getString ("razon_social"));   
                 }
              oConn.setResult.close();
            } 
            catch (SQLException ex){
                oFunc.SubSistemaMensajeInformacion(ex.toString());
                Logger.getLogger(Ingreso.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        cboContratas.setSelectedIndex(-1);
        cboContratas.setBackground(Color.lightGray);
        AutoCompleteDecorator.decorate(this.cboContratas);
        try {
            oConn.sqlStmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(FichaTriaje.class.getName()).log(Level.SEVERE, null, ex);
        }
}

*/
void sbCargarDatosOcupacional(String valor){
    String [] titulos={"N°Orden","Fecha Nacimiento","Edad","dni_paciente","Nombres"};
    String [] registros = new String[11];
    String sql="select triaje.n_orden ,fecha_nacimiento, EXTRACT(YEAR FROM age(current_date,dat_pa.fecha_nacimiento)) AS  edad, dni_paciente,dat_pa.nombres ||' '|| dat_pa.apellidos as nombres from desktop_datos_historia_clinica as hist_clini \n" +
"inner join desktop_datos_pacientes as dat_pa on hist_clini.dni_paciente=dat_pa.dni inner join desktop_triaje as triaje  on hist_clini.n_orden=triaje.n_orden order by triaje.n_orden desc ";
    
      model = new DefaultTableModel(null,titulos){        
              @Override
          public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }};
       SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    if (oConn.FnBoolQueryExecute(sql))
        {
             try  {
                
                while (oConn.setResult.next())
                {        
                    registros[0]= oConn.setResult.getString("n_orden");
                    registros[1]= oConn.setResult.getDate("fecha_nacimiento").toString();
                    registros[2]= oConn.setResult.getString("edad");
                    registros[3]= oConn.setResult.getString("dni_paciente");
                    registros[4]= oConn.setResult.getString("nombres");
                  
                   /* if(s != null ){
                        registros[7]="COMPLETO";
                        registros[8]= oConn.setResult.getString("estado");
                    }else if( a != null && "ANEXO-7D".equals(exa)){
                            registros[7]="COMPLETO";
                            registros[8]= oConn.setResult.getString("estadoad");
                    }else if( o!= null){
                            registros[7]="OBSERVADO";
                            registros[8]= oConn.setResult.getString("examenes");
                    }else if( ac!= null && "ANEXO-C".equals(exa)){
                            registros[7]="COMPLETO";
                            registros[8]= oConn.setResult.getString("estadoac");
                    }else  if( bc!= null && "PSICOSENSOMETRIA".equals(exa)){
                            registros[7]="COMPLETO";
                            registros[8]= oConn.setResult.getString("estadobc");
                    }else if( ba!= null && "TEST-ALTURA".equals(exa)){
                            registros[7]="COMPLETO";
                            registros[8]= oConn.setResult.getString("estadoba");
                    }else{ 
                        registros[7]="FALTA";
                        registros[8]= " ";
                    }*/
                    
                    //registros[3]=oConn.setResult.getString("anexo7c");
                   // tbTriaje.setDefaultRenderer(Object.class, new MyCellRenderer());
                     model.addRow(registros);
                }
                  // Coloca el Modelo de Nueva Cuenta
                  tbTriaje.setModel(model);
                 // sbTablaTriaje();
                 // Cierra Resultados
                 oConn.setResult.close();
            } 
            catch (SQLException ex) 
            {
                //JOptionPane.showMessageDialorootPane,ex);
                oFunc.SubSistemaMensajeError(ex.toString());
                Logger.getLogger(FichaTriaje.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
     try {
         oConn.sqlStmt.close();
     } catch (SQLException ex) {
         Logger.getLogger(FichaTriaje.class.getName()).log(Level.SEVERE, null, ex);
     }
}
/*
public class MyCellRenderer extends DefaultTableCellRenderer {
   @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        boolean valid = String.valueOf(table.getValueAt(row, 7)).equals("COMPLETO");
        boolean valid1= String.valueOf(table.getValueAt(row, 7)).equals("OBSERVADO");
        component.setBackground(valid ? Color.green :valid1? Color.ORANGE:Color.RED);
        
//        component.setForeground(valid ? Color.black : Color.white);
        return component;
    }
}

    private void sbTablaTriaje() {
        tbTriaje.getColumnModel().getColumn(0).setMinWidth(50);
        tbTriaje.getColumnModel().getColumn(0).setMaxWidth(50);
//tbTriaje.getColumnModel().getColumn(1).setMinWidth(130);//260
//tbTriaje.getColumnModel().getColumn(1).setMaxWidth(130);
        tbTriaje.getColumnModel().getColumn(2).setMinWidth(80);//130
        tbTriaje.getColumnModel().getColumn(2).setMaxWidth(80);
//tbTriaje.getColumnModel().getColumn(3).setMinWidth(100);//260
//tbTriaje.getColumnModel().getColumn(3).setMaxWidth(100); 
//tbTriaje.getColumnModel().getColumn(4).setMinWidth(100);//260
//tbTriaje.getColumnModel().getColumn(4).setMaxWidth(100); 
//tbTriaje.getColumnModel().getColumn(5).setMinWidth(100);//260
//tbTriaje.getColumnModel().getColumn(5).setMaxWidth(100); 
//tbTriaje.getColumnModel().getColumn(6).setMinWidth(90);//260
//tbTriaje.getColumnModel().getColumn(6).setMaxWidth(90); 
        tbTriaje.setFont(new java.awt.Font("Tahoma", 0, 11));
        // Alinear a la derecha las cantidades y precios
        DefaultTableCellRenderer cellAlinear = new DefaultTableCellRenderer();

        // Asignamos el Alineamiento Horizontal a la derecha
        cellAlinear.setHorizontalAlignment(SwingConstants.LEFT);
        tbTriaje.setSelectionForeground(Color.BLUE);
        tbTriaje.setGridColor(Color.blue);
        // Asignamos la Variable de celda de alineamiento a cada una de las columnas a alinear
//        tbTriaje.getColumnModel().getColumn(0).setCellRenderer(cellAlinear);
//        tbTriaje.getColumnModel().getColumn(1).setCellRenderer(cellAlinear);
//        tbTriaje.getColumnModel().getColumn(2).setCellRenderer(cellAlinear);
//        tbTriaje.getColumnModel().getColumn(3).setCellRenderer(cellAlinear);
//        tbTriaje.getColumnModel().getColumn(4).setCellRenderer(cellAlinear);
//        tbTriaje.getColumnModel().getColumn(5).setCellRenderer(cellAlinear);
        // Color de los Encabezados
        //jtTicket.getTableHeader().setBackground(Color.lightGray);
        //jtTicket.getTableHeader().setForeground(Color.blue);
        tbTriaje.getTableHeader().setFont(new java.awt.Font("Tahoma", 0, 11));
        // Remueve la Columna de la Vista
        //jtTicket.removeColumn(jtTicket.getColumnModel().getColumn(4));

    }
    */
    public void cerrarVentana(){
        // JOptionPane.showMessageDialog(null, "probando para cerrar el stament");
        System.out.println("cerro esta ventana");
        try {
            oConn.sqlStmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(FichaTriaje.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    this.dispose();
      //  System.exit(0);

    }
      
      public void calcularDniUser()
    {
        // Para devolver el resultado
        
        // Para el Query
        String sQuery="";
        
        // Prepara el Query
        sQuery  = "select dni from desktop_empleado where name_user='"+clsGlobales.sUser+"'";
        
   
        //Ejecuta el Query
        oConn.FnBoolQueryExecute(sQuery);
        
        // Capturo el Error
        try {
            
            // Verifico que haya habido resultados
            if (oConn.setResult.next())
            {
                
               dni= oConn.setResult.getInt("dni");
                // Resultado
//             oFunc.SubSistemaMensajeError("Número de Orden Utilizado");
//             txtNumero.setText(null);
//             txtNumero.requestFocus();
            }
            
            // Cierro los Resultados
            oConn.sqlStmt.close();
            
        } catch (SQLException ex) {
         
        }
        
        
        
        // Retorna el Resultado
        
    }
       
    
    
      public void consumirApiSello() throws Exception {
      SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
         try {
            DisableSSLVerification.disableSSL();  
            URL url = new URL("https://hmintegracion.azurewebsites.net/api/v01/st/registros/detalleArchivoEmpleado/"+dni+"/FIRMA");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Content-Type", "application/json; utf-8");
            con.setRequestProperty("Accept", "application/json");
            con.setDoOutput(true);


            int code = con.getResponseCode();
            System.out.println("Response Code: " + code);

            if(code!=500){
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
                  System.out.println("Response: " + objectJson);
                  System.out.println("Response: " + objectJson.getString("base64"));
                     
         
                     base64String=(objectJson.getString("base64"));
                 


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
            
            
            }
            else
                        base64String="OTROJASPER";
             

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
         
         
    }
   
       private void cargarEspecialidades(){
      String sQuery;        
        // Prepara el Query
        sQuery ="select nombre_especialidad from desktop_especialidades WHERE estado=true;";
        if (oConn.FnBoolQueryExecute(sQuery)){
            try{
                // Verifica resultados
                while (oConn.setResult.next()){                     
                     // Obtiene los datos de la Consulta
                     cboEspecialidad.addItem(oConn.setResult.getString ("nombre_especialidad").toUpperCase());
                }
            } 
            catch (SQLException ex){
                //JOptionPane.showMessageDialorootPane,ex);
                oFunc.SubSistemaMensajeInformacion(ex.toString());
                Logger.getLogger(FichaTriaje.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            oConn.setResult.close();
            oConn.sqlStmt.close(); 
        } 
        catch (SQLException ex) {
            Logger.getLogger(FichaTriaje.class.getName()).log(Level.SEVERE, null, ex);
        }
        cboEspecialidad.setSelectedIndex(0);
        }
       
              private boolean existenciaEspecialidades(){
      String sQuery;     
      boolean valor=false; 
        // Prepara el Query
        sQuery ="select nombre_especialidad  from desktop_ticket_espcialidad where n_orden="+jTextFieldNro.getText().toString().trim()
                +" and nombre_especialidad='"+cboEspecialidad.getSelectedItem().toString().trim()+"'";
        if (oConn.FnBoolQueryExecute(sQuery)){
            try{
                // Verifica resultados
                while (oConn.setResult.next()){                     
                     // Obtiene los datos de la Consulta
                     valor=true; 
                }
            } 
            catch (SQLException ex){
                //JOptionPane.showMessageDialorootPane,ex);
                oFunc.SubSistemaMensajeInformacion(ex.toString());
                Logger.getLogger(FichaTriaje.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            oConn.setResult.close();
            oConn.sqlStmt.close(); 
        } 
        catch (SQLException ex) {
            Logger.getLogger(FichaTriaje.class.getName()).log(Level.SEVERE, null, ex);
        }
      //  cboEspecialidad.setSelectedIndex(0);
        return valor;
        }
       
                 private void registrarTicketEspecialiad(){
            String strSqlStmt;
             String Query ;
            strSqlStmt="INSERT INTO desktop_ticket_espcialidad(";
            Query="Values('";
            strSqlStmt += "nombre_especialidad";Query += cboEspecialidad.getSelectedItem().toString().trim()+ "'";
            strSqlStmt += ",n_orden";Query += ","+jTextFieldNro.getText().toString().trim();
            if(jRadioButton1.isSelected()){
            strSqlStmt += ",estado";Query += ",true ";}
            else
            {
                           strSqlStmt += ",estado";Query += ",false "; 
            }
            strSqlStmt += ",user_registro";Query += ",'"+clsGlobales.sUser+ "'";
            strSqlStmt += ",fecha_registro";Query += ",'"+formato.format(dateHoy)+ "'";  
               
               if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt.concat(") ") + Query.concat(")"))){
             oFunc.SubSistemaMensajeInformacion("Se ha registrado la Entrada con Éxito");
                try {
                    oConn.sqlStmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(FichaTriaje.class.getName()).log(Level.SEVERE, null, ex);
                }
        }else{
             oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");
               }
                         try {
                             oConn.sqlStmt.close();
                         } catch (SQLException ex) {
                             Logger.getLogger(FichaTriaje.class.getName()).log(Level.SEVERE, null, ex);
                         }
        
       
   } 
                 
                                     private void eliminarTicketTriaje(String nameEspecialidad, int nOrden) {
        String strSqlStmt;
        strSqlStmt = "delete from desktop_ticket_espcialidad where nombre_especialidad='"+nameEspecialidad+"' \n" +
"	and n_orden="+nOrden +"  and estado_registro=false;";
       
        if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)) {
            oFunc.SubSistemaMensajeInformacion("Se elimino con Éxito");
            cargarTicketEspecialidadPorNOrden(jTextFieldNro.getText().toString().trim());
        } else {
            oFunc.SubSistemaMensajeError("Error en registro");
        }            
}
                                     
                                     
                                     void cargarTicketEspecialidadPorNOrden(String nOrden){
    String [] titulos={"H.C","Especialidad"};
    String [] registros = new String[2];
    String sql="select n_orden, nombre_especialidad " +
"	from desktop_ticket_espcialidad where n_orden="+nOrden;
    
      model = new DefaultTableModel(null,titulos){        
              @Override
          public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }};
       SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    if (oConn.FnBoolQueryExecute(sql))
        {
             try  {
                
                while (oConn.setResult.next())
                {        
                    registros[0]= oConn.setResult.getString("n_orden");
                    registros[1]= oConn.setResult.getString("nombre_especialidad").toString();
                  
                   /* if(s != null ){
                        registros[7]="COMPLETO";
                        registros[8]= oConn.setResult.getString("estado");
                    }else if( a != null && "ANEXO-7D".equals(exa)){
                            registros[7]="COMPLETO";
                            registros[8]= oConn.setResult.getString("estadoad");
                    }else if( o!= null){
                            registros[7]="OBSERVADO";
                            registros[8]= oConn.setResult.getString("examenes");
                    }else if( ac!= null && "ANEXO-C".equals(exa)){
                            registros[7]="COMPLETO";
                            registros[8]= oConn.setResult.getString("estadoac");
                    }else  if( bc!= null && "PSICOSENSOMETRIA".equals(exa)){
                            registros[7]="COMPLETO";
                            registros[8]= oConn.setResult.getString("estadobc");
                    }else if( ba!= null && "TEST-ALTURA".equals(exa)){
                            registros[7]="COMPLETO";
                            registros[8]= oConn.setResult.getString("estadoba");
                    }else{ 
                        registros[7]="FALTA";
                        registros[8]= " ";
                    }*/
                    
                    //registros[3]=oConn.setResult.getString("anexo7c");
                   // tbTriaje.setDefaultRenderer(Object.class, new MyCellRenderer());
                     model.addRow(registros);
                }
                  // Coloca el Modelo de Nueva Cuenta
                  jTableEspecialidad.setModel(model);
                 // sbTablaTriaje();
                 // Cierra Resultados
                 oConn.setResult.close();
            } 
            catch (SQLException ex) 
            {
                //JOptionPane.showMessageDialorootPane,ex);
                oFunc.SubSistemaMensajeError(ex.toString());
                Logger.getLogger(FichaTriaje.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
     try {
         oConn.sqlStmt.close();
     } catch (SQLException ex) {
         Logger.getLogger(FichaTriaje.class.getName()).log(Level.SEVERE, null, ex);
     }
}

                                     
public int calcularEdad(Calendar fechaNac){
    Calendar today = Calendar.getInstance();
    int diay = today.get(Calendar.YEAR);
    int fechay = fechaNac.get(Calendar.YEAR);
    int diff_year = diay - fechay;
    int diam = today.get(Calendar.MONTH);
    int fecham = fechaNac.get(Calendar.MONTH);
    int diff_month = diam - fecham;
    int dia = today.get(Calendar.DAY_OF_MONTH);
    int fecha = fechaNac.get(Calendar.DAY_OF_MONTH);
    int diff_day = dia - fecha;
    //Si está en ese año pero todavía no los ha cumplido
    if(diff_month<0 || (diff_month==0 && diff_day<0)){
        int factor=1;
        diff_year = diff_year - factor;
    }
    return diff_year;
}

}
