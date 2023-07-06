package mx.tecnm.rioverde.forms;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import mx.tecnm.rioverde.models.Alumno;
import mx.tecnm.rioverde.models.Prorroga;
import mx.tecnm.rioverde.models.Pago;
import mx.tecnm.rioverde.dao.AlumnoDao;
import mx.tecnm.rioverde.dao.AlumnoBusquedaDao;
import mx.tecnm.rioverde.dao.ProrrogaDao;
import mx.tecnm.rioverde.dao.PagoDao;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Gael Perez
 */
public class formulario extends javax.swing.JFrame {

    public formulario() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        // panes
        menuPanel.setVisible(true);
        alumnoPanel.setVisible(false);
        prorrogaPanel.setVisible(false);
        pagoPanel.setVisible(false);
        
        // edit alumnos
        editLabel.setVisible(false);
        deselectBtn.setVisible(false);
    }
    
    private List<Alumno> listaAlumno = new ArrayList<>();
    private List<Alumno> listaAlumnoBusqueda = new ArrayList<>();
    private List<Prorroga> listaProrroga = new ArrayList<>();
    private List<Pago> listaPago = new ArrayList<>();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        menuBtn = new javax.swing.JButton();
        alumnoBtn = new javax.swing.JButton();
        prorrogaBtn = new javax.swing.JButton();
        pagoBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        menuPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        alumnoPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtNoControl = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtApeP = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtApeM = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        alumnoTable = new javax.swing.JTable();
        guardarBtn = new javax.swing.JButton();
        editarBtn = new javax.swing.JButton();
        eliminarBtn = new javax.swing.JButton();
        editLabel = new javax.swing.JLabel();
        deselectBtn = new javax.swing.JButton();
        busquedaCBox = new javax.swing.JComboBox<>();
        txtBusqueda = new javax.swing.JTextField();
        tipoBusquedaCbox = new javax.swing.JComboBox<>();
        selectAllBtn = new javax.swing.JButton();
        FileChooserBtn = new javax.swing.JButton();
        txtImport = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtTable = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        ImportTableBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        prorrogaPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        refreshBtn1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtNoControlProrroga = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        nombreLbl = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        pagoPanel = new javax.swing.JPanel();
        aaa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(35, 36, 61));
        jPanel5.setMinimumSize(new java.awt.Dimension(800, 80));
        jPanel5.setPreferredSize(new java.awt.Dimension(974, 80));

        menuBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\gael_\\OneDrive\\Documentos\\NetBeansProjects\\sistemaCaja\\src\\main\\java\\icons\\house-solid.png")); // NOI18N
        menuBtn.setBorder(null);
        menuBtn.setContentAreaFilled(false);
        menuBtn.setFocusPainted(false);
        menuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBtnActionPerformed(evt);
            }
        });

        alumnoBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\gael_\\OneDrive\\Documentos\\NetBeansProjects\\sistemaCaja\\src\\main\\java\\icons\\user-solid.png")); // NOI18N
        alumnoBtn.setBorder(null);
        alumnoBtn.setContentAreaFilled(false);
        alumnoBtn.setFocusPainted(false);
        alumnoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alumnoBtnActionPerformed(evt);
            }
        });

        prorrogaBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\gael_\\OneDrive\\Documentos\\NetBeansProjects\\sistemaCaja\\src\\main\\java\\icons\\file-invoice-dollar-solid.png")); // NOI18N
        prorrogaBtn.setBorder(null);
        prorrogaBtn.setBorderPainted(false);
        prorrogaBtn.setContentAreaFilled(false);
        prorrogaBtn.setFocusPainted(false);
        prorrogaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prorrogaBtnActionPerformed(evt);
            }
        });

        pagoBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\gael_\\OneDrive\\Documentos\\NetBeansProjects\\sistemaCaja\\src\\main\\java\\icons\\money-bill-solid.png")); // NOI18N
        pagoBtn.setBorder(null);
        pagoBtn.setBorderPainted(false);
        pagoBtn.setContentAreaFilled(false);
        pagoBtn.setFocusPainted(false);
        pagoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagoBtnActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\gael_\\OneDrive\\Documentos\\NetBeansProjects\\sistemaCaja\\src\\main\\java\\icons\\tecnm.png")); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\gael_\\OneDrive\\Documentos\\NetBeansProjects\\sistemaCaja\\src\\main\\java\\icons\\tec.png")); // NOI18N

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ITSRV TECNM");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(menuBtn)
                .addGap(18, 18, 18)
                .addComponent(alumnoBtn)
                .addGap(18, 18, 18)
                .addComponent(prorrogaBtn)
                .addGap(18, 18, 18)
                .addComponent(pagoBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(alumnoBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prorrogaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pagoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, java.awt.BorderLayout.NORTH);

        jPanel4.setBackground(new java.awt.Color(245, 246, 250));
        jPanel4.setMinimumSize(new java.awt.Dimension(800, 400));

        menuPanel.setBackground(new java.awt.Color(236, 236, 236));

        jLabel1.setText("MENU");

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(617, 617, 617)
                .addComponent(jLabel1)
                .addContainerGap(326, Short.MAX_VALUE))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(jLabel1)
                .addContainerGap(358, Short.MAX_VALUE))
        );

        alumnoPanel.setBackground(new java.awt.Color(236, 236, 236));
        alumnoPanel.setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel6.setText("Numero de Control");

        txtNoControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoControlActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre");

        jLabel7.setText("Apellido Paterno");

        jLabel8.setText("Apellido Materno");

        alumnoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Numero de Control", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(alumnoTable);

        guardarBtn.setText("Guardar");
        guardarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBtnActionPerformed(evt);
            }
        });

        editarBtn.setText("Editar");
        editarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarBtnActionPerformed(evt);
            }
        });

        eliminarBtn.setText("Eliminar");
        eliminarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarBtnActionPerformed(evt);
            }
        });

        editLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        editLabel.setText("Editando");

        deselectBtn.setText("Deseleccionar");
        deselectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deselectBtnActionPerformed(evt);
            }
        });

        busquedaCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Numero de Control", "Nombre", "Apellido Paterno", "Apellido Materno" }));

        txtBusqueda.setToolTipText("Busqueda");
        txtBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusquedaActionPerformed(evt);
            }
        });
        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyTyped(evt);
            }
        });

        tipoBusquedaCbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Coincide", "Comienza con", "Termina con", "Incluye" }));

        selectAllBtn.setText("Seleccionar Todo");
        selectAllBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectAllBtnActionPerformed(evt);
            }
        });

        FileChooserBtn.setText("Seleccionar Archivo");
        FileChooserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FileChooserBtnActionPerformed(evt);
            }
        });

        jLabel10.setText("Path");

        jLabel11.setText("Nombre de la Tabla");

        jLabel12.setText("Importar Tabla");

        ImportTableBtn.setText("Confirmar");
        ImportTableBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImportTableBtnActionPerformed(evt);
            }
        });

        refreshBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\gael_\\OneDrive\\Documentos\\NetBeansProjects\\sistemaCaja\\src\\main\\java\\icons\\refresh.png")); // NOI18N
        refreshBtn.setToolTipText("Recargar pagina");
        refreshBtn.setBorder(null);
        refreshBtn.setBorderPainted(false);
        refreshBtn.setContentAreaFilled(false);
        refreshBtn.setFocusPainted(false);
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Agregar Alumnos");

        javax.swing.GroupLayout alumnoPanelLayout = new javax.swing.GroupLayout(alumnoPanel);
        alumnoPanel.setLayout(alumnoPanelLayout);
        alumnoPanelLayout.setHorizontalGroup(
            alumnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alumnoPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(alumnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(alumnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(alumnoPanelLayout.createSequentialGroup()
                            .addComponent(FileChooserBtn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ImportTableBtn))
                        .addGroup(alumnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(alumnoPanelLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(txtImport, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(alumnoPanelLayout.createSequentialGroup()
                                .addGroup(alumnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, alumnoPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, alumnoPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(44, 44, 44)))
                                .addComponent(txtTable, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(alumnoPanelLayout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(alumnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, alumnoPanelLayout.createSequentialGroup()
                            .addGroup(alumnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(alumnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNombre)
                                .addComponent(txtApeP)
                                .addComponent(txtApeM, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(editLabel)
                        .addGroup(alumnoPanelLayout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(18, 18, 18)
                            .addComponent(txtNoControl, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, alumnoPanelLayout.createSequentialGroup()
                            .addComponent(eliminarBtn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editarBtn)
                            .addGap(26, 26, 26)
                            .addComponent(guardarBtn))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, alumnoPanelLayout.createSequentialGroup()
                            .addComponent(selectAllBtn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deselectBtn))))
                .addGap(18, 18, 18)
                .addGroup(alumnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(alumnoPanelLayout.createSequentialGroup()
                        .addComponent(busquedaCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tipoBusquedaCbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBusqueda))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE))
                .addContainerGap())
        );
        alumnoPanelLayout.setVerticalGroup(
            alumnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alumnoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(alumnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(alumnoPanelLayout.createSequentialGroup()
                        .addGroup(alumnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(refreshBtn)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(alumnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNoControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(12, 12, 12)
                        .addGroup(alumnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(alumnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApeP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(alumnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApeM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(alumnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eliminarBtn)
                            .addComponent(editarBtn)
                            .addComponent(guardarBtn))
                        .addGap(18, 18, 18)
                        .addGroup(alumnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deselectBtn)
                            .addComponent(selectAllBtn))
                        .addGap(18, 18, 18)
                        .addComponent(editLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addGroup(alumnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(alumnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtImport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(alumnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FileChooserBtn)
                            .addComponent(ImportTableBtn)))
                    .addGroup(alumnoPanelLayout.createSequentialGroup()
                        .addGroup(alumnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(busquedaCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tipoBusquedaCbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)))
                .addContainerGap())
        );

        prorrogaPanel.setBackground(new java.awt.Color(236, 236, 236));
        prorrogaPanel.setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Crear Prorroga");

        refreshBtn1.setIcon(new javax.swing.ImageIcon("C:\\Users\\gael_\\OneDrive\\Documentos\\NetBeansProjects\\sistemaCaja\\src\\main\\java\\icons\\refresh.png")); // NOI18N
        refreshBtn1.setToolTipText("Recargar pagina");
        refreshBtn1.setBorder(null);
        refreshBtn1.setBorderPainted(false);
        refreshBtn1.setContentAreaFilled(false);
        refreshBtn1.setFocusPainted(false);
        refreshBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtn1ActionPerformed(evt);
            }
        });

        jLabel14.setText("Numero de Control");

        txtNoControlProrroga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoControlProrrogaActionPerformed(evt);
            }
        });
        txtNoControlProrroga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNoControlProrrogaKeyReleased(evt);
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

        jLabel15.setText("Nombre");

        jLabel16.setText("Concepto");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semestre", "Ingles", "Otro" }));

        jTextField1.setEnabled(false);

        jLabel17.setText("Semestre o Nivel");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Primero", "Segundo", "Tercero", "Cuarto", "Quinto", "Sexto", "Septimo", "Octavo", "Noveno", "Decimo" }));

        javax.swing.GroupLayout prorrogaPanelLayout = new javax.swing.GroupLayout(prorrogaPanel);
        prorrogaPanel.setLayout(prorrogaPanelLayout);
        prorrogaPanelLayout.setHorizontalGroup(
            prorrogaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(prorrogaPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(prorrogaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(prorrogaPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refreshBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(prorrogaPanelLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(nombreLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jTextField1)
                    .addGroup(prorrogaPanelLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(prorrogaPanelLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(prorrogaPanelLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(txtNoControlProrroga, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                .addContainerGap())
        );
        prorrogaPanelLayout.setVerticalGroup(
            prorrogaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(prorrogaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(prorrogaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                    .addGroup(prorrogaPanelLayout.createSequentialGroup()
                        .addGroup(prorrogaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(refreshBtn1))
                        .addGap(18, 18, 18)
                        .addGroup(prorrogaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNoControlProrroga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(prorrogaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(nombreLbl))
                        .addGap(18, 18, 18)
                        .addGroup(prorrogaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(prorrogaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pagoPanel.setBackground(new java.awt.Color(236, 236, 236));

        aaa.setBackground(new java.awt.Color(0, 0, 0));
        aaa.setText("pago");

        javax.swing.GroupLayout pagoPanelLayout = new javax.swing.GroupLayout(pagoPanel);
        pagoPanel.setLayout(pagoPanelLayout);
        pagoPanelLayout.setHorizontalGroup(
            pagoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pagoPanelLayout.createSequentialGroup()
                .addGap(468, 468, 468)
                .addComponent(aaa)
                .addContainerGap(479, Short.MAX_VALUE))
        );
        pagoPanelLayout.setVerticalGroup(
            pagoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pagoPanelLayout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(aaa)
                .addContainerGap(192, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayer(menuPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(alumnoPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(prorrogaPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(pagoPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(prorrogaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 977, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(alumnoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 977, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pagoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(prorrogaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(alumnoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pagoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuPanel.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void menuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBtnActionPerformed
        menuPanel.setVisible(true);
        alumnoPanel.setVisible(false);
        prorrogaPanel.setVisible(false);
        pagoPanel.setVisible(false);
    }//GEN-LAST:event_menuBtnActionPerformed

    private void alumnoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alumnoBtnActionPerformed
        alumnoPanel.setVisible(true);
        menuPanel.setVisible(false);
        prorrogaPanel.setVisible(false);
        pagoPanel.setVisible(false);
        actualizarListaBusqueda();
    }//GEN-LAST:event_alumnoBtnActionPerformed

    private void prorrogaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prorrogaBtnActionPerformed
        prorrogaPanel.setVisible(true);
        alumnoPanel.setVisible(false);
        menuPanel.setVisible(false);
        pagoPanel.setVisible(false);
    }//GEN-LAST:event_prorrogaBtnActionPerformed

    private void pagoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagoBtnActionPerformed
        pagoPanel.setVisible(true);
        prorrogaPanel.setVisible(false);
        alumnoPanel.setVisible(false);
        menuPanel.setVisible(false);
    }//GEN-LAST:event_pagoBtnActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        actualizarListaBusqueda();
    }//GEN-LAST:event_formComponentShown

    private void guardarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBtnActionPerformed

        Alumno alumno = new Alumno();
        alumno.setNoControl(Integer.parseInt(this.txtNoControl.getText()));
        alumno.setNombre(this.txtNombre.getText());
        alumno.setApeP(this.txtApeP.getText());
        alumno.setApeM(this.txtApeM.getText());
        
        AlumnoDao dao = new AlumnoDao();
        
        
        
        if (this.editLabel.isVisible()){
            dao.editar(alumno);
            editLabel.setVisible(false);
            deselectBtn.setVisible(false);
        }
        else {
            if (!dao.agregar(alumno)) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "Ocurrió un error al guardar el alumno, por favor verifique que no sea una entrada duplicada en el numero de Control");
            }
        }

        
        actualizarListaBusqueda();
        limpiarCajasDeTexto();
    }//GEN-LAST:event_guardarBtnActionPerformed

    private void txtNoControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoControlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoControlActionPerformed

    private void editarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarBtnActionPerformed
        
        int indice = this.alumnoTable.getSelectedRow();
        
        Alumno alumno = new Alumno();

        if (listaAlumnoBusqueda.isEmpty()){
            alumno = listaAlumno.get(indice);
        }
        else {
            alumno = listaAlumnoBusqueda.get(indice);
        }
        
        this.txtNombre.setText(alumno.getNombre());
        this.txtApeP.setText(alumno.getApeP());
        this.txtApeM.setText(alumno.getApeM());
        this.txtNoControl.setText(String.valueOf(alumno.getNoControl()));
        
        editLabel.setVisible(true);
        deselectBtn.setVisible(true);

    }//GEN-LAST:event_editarBtnActionPerformed

    private void eliminarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarBtnActionPerformed
        
        int[] index = this.alumnoTable.getSelectedRows();
        Alumno alumno = new Alumno();
        AlumnoDao dao = new AlumnoDao();
        
        if (index.length <= 1){
            
            
            if (listaAlumnoBusqueda.isEmpty()){
                alumno = listaAlumno.get(index[0]);
            }
            else {
                alumno = listaAlumnoBusqueda.get(index[0]);
            }
            
            if (!dao.eliminar(alumno)) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "Ocurrió un error al eliminar el alumno, por favor verifique que no tenga conexiones en el apartado de prorrogas");
            }
            
        } else {
            
            int[] array = new int[index.length];
            
            for (int i = 0; i < index.length; i++) {
                if (listaAlumnoBusqueda.isEmpty()){
                    alumno = listaAlumno.get(index[i]);
                }
                else {
                    alumno = listaAlumnoBusqueda.get(index[i]); // error
                }
                array[i] = alumno.getNoControl(); // error todo
            }

            List<Integer> numInProrrogas = dao.eliminar(array);
            
            if (!numInProrrogas.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < numInProrrogas.size(); i++) {
                    sb.append(numInProrrogas.get(i));
                    if (i < numInProrrogas.size() - 1) {
                        sb.append(", ");
                    }
                }
                String cadena = sb.toString();
                
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(rootPane, "Ocurrió un error al intentar eliminar los siguientes alumnos: " + cadena + "\nPor favor verifique que no tenga conexiones en el apartado de prorrogas");
            }
        }
        
        actualizarListaBusqueda();
        deselectAll();
    }//GEN-LAST:event_eliminarBtnActionPerformed

    private void deselectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deselectBtnActionPerformed
        deselectAll();
    }//GEN-LAST:event_deselectBtnActionPerformed

    private void txtBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyTyped
    }//GEN-LAST:event_txtBusquedaKeyTyped

    private void txtBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyReleased
        actualizarListaBusqueda();
    }//GEN-LAST:event_txtBusquedaKeyReleased

    private void selectAllBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectAllBtnActionPerformed
        alumnoTable.selectAll();
    }//GEN-LAST:event_selectAllBtnActionPerformed

    private void FileChooserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FileChooserBtnActionPerformed

        JFileChooser fc = new JFileChooser();

        int selection = fc.showOpenDialog(jPanel4);

        if(selection == JFileChooser.APPROVE_OPTION){

            File fichero = fc.getSelectedFile();

            txtImport.setText(fichero.getAbsolutePath());

        }

    }//GEN-LAST:event_FileChooserBtnActionPerformed

    private void ImportTableBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImportTableBtnActionPerformed
        
        String path = this.txtImport.getText();
        String table = this.txtTable.getText();
        
        AlumnoDao alumnoDao = new AlumnoDao();
        
        if (!alumnoDao.importar(path, table)) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "Ocurrió un error al intentar exportar la base de datos");
        }
        
    }//GEN-LAST:event_ImportTableBtnActionPerformed

    private void txtBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusquedaActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed

        listaAlumnoBusqueda.clear();
        actualizarLista();
        deselectAll();
        this.txtBusqueda.setText("");
        this.txtTable.setText("");
        this.txtImport.setText("");

    }//GEN-LAST:event_refreshBtnActionPerformed

    private void refreshBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtn1ActionPerformed
        
        
        
    }//GEN-LAST:event_refreshBtn1ActionPerformed

    private void txtNoControlProrrogaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoControlProrrogaActionPerformed
    }//GEN-LAST:event_txtNoControlProrrogaActionPerformed

    private void txtNoControlProrrogaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoControlProrrogaKeyReleased
        
        AlumnoDao dao = new AlumnoDao();
        
        String nombre = dao.obtenerNombre(this.txtNoControlProrroga.getText());
        
        this.nombreLbl.setText(nombre);
        
    }//GEN-LAST:event_txtNoControlProrrogaKeyReleased

    private void deselectAll(){
        limpiarCajasDeTexto();
        
        editLabel.setVisible(false);
        deselectBtn.setVisible(false);
    }
    
    private void limpiarCajasDeTexto() {
        this.txtNombre.setText("");
        this.txtApeP.setText("");
        this.txtApeM.setText("");
        this.txtNoControl.setText("");
    }
    
    private void actualizarLista(){
        
        AlumnoDao alumnoDao = new AlumnoDao();
        listaAlumno = alumnoDao.listar();
        
        DefaultTableModel mt = new DefaultTableModel();
        String ids [] = {"Numero de Control", "Nombre Completo"};
        mt.setColumnIdentifiers(ids);
        alumnoTable.setModel(mt);
        
        for(int i = 0; i < listaAlumno.size(); i++) {
            Alumno alumno = listaAlumno.get(i);
            mt.addRow(new Object[]{alumno.getNoControl(), alumno.getNombreCompleto()});
            
        }

    }
    
    private void actualizarListaBusqueda(){
        
        String[] CboxOptions = {"noControl", "nombre", "apeP", "apeM"};
        
        if (this.txtBusqueda.getText().isBlank()) {
            actualizarLista();
        }
        else {
            listaAlumnoBusqueda.clear();
            AlumnoBusquedaDao alumnoDao = new AlumnoBusquedaDao();
            listaAlumnoBusqueda = alumnoDao.listar(CboxOptions[busquedaCBox.getSelectedIndex()], (String) this.txtBusqueda.getText(), tipoBusquedaCbox.getSelectedIndex());

            DefaultTableModel mt = new DefaultTableModel();
            String ids [] = {"Numero de Control", "Nombre Completo"};
            mt.setColumnIdentifiers(ids);
            alumnoTable.setModel(mt);

            for(int i = 0; i < listaAlumnoBusqueda.size(); i++) {
                Alumno alumno = listaAlumnoBusqueda.get(i);
                mt.addRow(new Object[]{alumno.getNoControl(), alumno.getNombreCompleto()});

            }
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
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new formulario().setVisible(true);
 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FileChooserBtn;
    private javax.swing.JButton ImportTableBtn;
    private javax.swing.JLabel aaa;
    private javax.swing.JButton alumnoBtn;
    private javax.swing.JPanel alumnoPanel;
    private javax.swing.JTable alumnoTable;
    private javax.swing.JComboBox<String> busquedaCBox;
    private javax.swing.JButton deselectBtn;
    private javax.swing.JLabel editLabel;
    private javax.swing.JButton editarBtn;
    private javax.swing.JButton eliminarBtn;
    private javax.swing.JButton guardarBtn;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton menuBtn;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JLabel nombreLbl;
    private javax.swing.JButton pagoBtn;
    private javax.swing.JPanel pagoPanel;
    private javax.swing.JButton prorrogaBtn;
    private javax.swing.JPanel prorrogaPanel;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton refreshBtn1;
    private javax.swing.JButton selectAllBtn;
    private javax.swing.JComboBox<String> tipoBusquedaCbox;
    private javax.swing.JTextField txtApeM;
    private javax.swing.JTextField txtApeP;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtImport;
    private javax.swing.JTextField txtNoControl;
    private javax.swing.JTextField txtNoControlProrroga;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTable;
    // End of variables declaration//GEN-END:variables
}
