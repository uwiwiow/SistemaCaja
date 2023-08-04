package mx.tecnm.rioverde.forms;
import java.awt.Toolkit;
import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import mx.tecnm.rioverde.models.Alumno;
import mx.tecnm.rioverde.models.Prorroga;
import mx.tecnm.rioverde.models.Pago;
import mx.tecnm.rioverde.dao.AlumnoDao;
import mx.tecnm.rioverde.dao.ProrrogaDao;
import mx.tecnm.rioverde.dao.PagoDao;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableCellRenderer;
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
        
        // edit prorrogas
        editProrrogaLbl.setVisible(false);
        deselectProrrogaBtn.setVisible(false);
        
        // edit pagos
        editPagoLbl.setVisible(false);
        deselectPagoBtn.setVisible(false);
    }
    
    private List<Alumno> listaAlumno = new ArrayList<>();
    private List<Alumno> listaAlumnoBusqueda = new ArrayList<>();
    private List<Prorroga> listaProrroga = new ArrayList<>();
    private List<Prorroga> listaProrrogaBusqueda = new ArrayList<>();
    private List<Pago> listaPago = new ArrayList<>();
    private List<Pago> listaPagoBusqueda = new ArrayList<>();

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
        jScrollPane2 = new javax.swing.JScrollPane();
        alumnoTable = new javax.swing.JTable();
        busquedaCBox = new javax.swing.JComboBox<>();
        txtBusqueda = new javax.swing.JTextField();
        tipoBusquedaCbox = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        guardarBtn = new javax.swing.JButton();
        editarBtn = new javax.swing.JButton();
        eliminarBtn = new javax.swing.JButton();
        editLabel = new javax.swing.JLabel();
        deselectBtn = new javax.swing.JButton();
        selectAllBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtNoControl = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        refreshBtn = new javax.swing.JButton();
        txtApeP = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtApeM = new javax.swing.JTextField();
        FileChooserBtn = new javax.swing.JButton();
        txtImport = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtTable = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        ImportTableBtn = new javax.swing.JButton();
        prorrogaPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        conceptoCBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        nombreLbl = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        refreshProrrogaBtn = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtOtroConcepto = new javax.swing.JTextField();
        txtNoControlProrroga = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        semestreCBox = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        pedidoDiaCBox = new javax.swing.JComboBox<>();
        pedidoMesCBox = new javax.swing.JComboBox<>();
        pedidoAnoCBox = new javax.swing.JComboBox<>();
        liquidadoDiaCBox = new javax.swing.JComboBox<>();
        liquidadoMesCBox = new javax.swing.JComboBox<>();
        liquidadoAnoCBox = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        liquidadoCheckBox = new javax.swing.JCheckBox();
        guardarProrrogaBtn = new javax.swing.JButton();
        eliminarProrrogaBtn = new javax.swing.JButton();
        editarProrrogaBtn = new javax.swing.JButton();
        selectAllProrrogaBtn = new javax.swing.JButton();
        deselectProrrogaBtn = new javax.swing.JButton();
        editProrrogaLbl = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        prorrogaTable = new javax.swing.JTable();
        tipoBusquedaProrrogaCbox = new javax.swing.JComboBox<>();
        busquedaProrrogaCBox = new javax.swing.JComboBox<>();
        txtBusquedaProrroga = new javax.swing.JTextField();
        pagoPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        nombrePagoLbl = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        refreshPagoBtn = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        txtNoControlPago = new javax.swing.JTextField();
        txtFolioPago = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        selectProrrogaPagoCBox = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        txtPago = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        pagoDiaCBox = new javax.swing.JComboBox<>();
        pagoMesCBox = new javax.swing.JComboBox<>();
        pagoAnoCBox = new javax.swing.JComboBox<>();
        guardarPagoBtn = new javax.swing.JButton();
        eliminarPagoBtn = new javax.swing.JButton();
        editarPagoBtn = new javax.swing.JButton();
        selectAllPagoBtn = new javax.swing.JButton();
        deselectPagoBtn = new javax.swing.JButton();
        editPagoLbl = new javax.swing.JLabel();
        txtProrrogaNum = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pagoTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(35, 36, 61));
        jPanel5.setMinimumSize(new java.awt.Dimension(800, 80));
        jPanel5.setPreferredSize(new java.awt.Dimension(974, 80));

        menuBtn.setIcon(new javax.swing.ImageIcon("icons\\house-solid.png"));
        menuBtn.setBorder(null);
        menuBtn.setContentAreaFilled(false);
        menuBtn.setFocusPainted(false);
        menuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBtnActionPerformed(evt);
            }
        });

        alumnoBtn.setIcon(new javax.swing.ImageIcon("icons\\user-solid.png"));
        alumnoBtn.setBorder(null);
        alumnoBtn.setContentAreaFilled(false);
        alumnoBtn.setFocusPainted(false);
        alumnoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alumnoBtnActionPerformed(evt);
            }
        });

        prorrogaBtn.setIcon(new javax.swing.ImageIcon("icons\\file-invoice-dollar-solid.png"));
        prorrogaBtn.setBorder(null);
        prorrogaBtn.setBorderPainted(false);
        prorrogaBtn.setContentAreaFilled(false);
        prorrogaBtn.setFocusPainted(false);
        prorrogaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prorrogaBtnActionPerformed(evt);
            }
        });

        pagoBtn.setIcon(new javax.swing.ImageIcon("icons\\money-bill-solid.png"));
        pagoBtn.setBorder(null);
        pagoBtn.setBorderPainted(false);
        pagoBtn.setContentAreaFilled(false);
        pagoBtn.setFocusPainted(false);
        pagoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagoBtnActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon("icons\\tecnm.png"));

        jLabel5.setIcon(new javax.swing.ImageIcon("icons\\tec.png"));

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 349, Short.MAX_VALUE)
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
                .addGap(574, 574, 574)
                .addComponent(jLabel1)
                .addContainerGap(369, Short.MAX_VALUE))
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

        busquedaCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Numero de Control", "Nombre Completo", "Nombre", "Apellido Paterno", "Apellido Materno" }));

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

        jPanel1.setBackground(new java.awt.Color(236, 236, 236));

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

        selectAllBtn.setText("Seleccionar Todo");
        selectAllBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectAllBtnActionPerformed(evt);
            }
        });

        jLabel6.setText("Numero de Control");

        txtNoControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoControlActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre");

        jLabel7.setText("Apellido Paterno");

        refreshBtn.setIcon(new javax.swing.ImageIcon("icons\\refresh.png"));
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

        jLabel8.setText("Apellido Materno");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(editLabel)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(eliminarBtn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                            .addComponent(editarBtn)
                            .addGap(26, 26, 26)
                            .addComponent(guardarBtn))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(selectAllBtn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deselectBtn))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(jLabel6))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNoControl, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(txtNombre)
                                .addComponent(txtApeP)
                                .addComponent(txtApeM))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(FileChooserBtn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ImportTableBtn))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(txtImport, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(44, 44, 44)))
                                .addComponent(txtTable, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(refreshBtn)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNoControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApeP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApeM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eliminarBtn)
                    .addComponent(editarBtn)
                    .addComponent(guardarBtn))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deselectBtn)
                    .addComponent(selectAllBtn))
                .addGap(18, 18, 18)
                .addComponent(editLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtImport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FileChooserBtn)
                    .addComponent(ImportTableBtn))
                .addContainerGap())
        );

        javax.swing.GroupLayout alumnoPanelLayout = new javax.swing.GroupLayout(alumnoPanel);
        alumnoPanel.setLayout(alumnoPanelLayout);
        alumnoPanelLayout.setHorizontalGroup(
            alumnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alumnoPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(alumnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(alumnoPanelLayout.createSequentialGroup()
                        .addComponent(busquedaCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tipoBusquedaCbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBusqueda))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE))
                .addContainerGap())
        );
        alumnoPanelLayout.setVerticalGroup(
            alumnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, alumnoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(alumnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(busquedaCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipoBusquedaCbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        prorrogaPanel.setBackground(new java.awt.Color(236, 236, 236));
        prorrogaPanel.setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel2.setBackground(new java.awt.Color(236, 236, 236));
        jPanel2.setPreferredSize(new java.awt.Dimension(283, 453));

        conceptoCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semestre", "Ingles", "Otro" }));
        conceptoCBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conceptoCBoxActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Crear Prorroga");

        jLabel17.setText("Semestre o Nivel");

        refreshProrrogaBtn.setIcon(new javax.swing.ImageIcon("icons\\refresh.png"));
        refreshProrrogaBtn.setToolTipText("Recargar pagina");
        refreshProrrogaBtn.setBorder(null);
        refreshProrrogaBtn.setBorderPainted(false);
        refreshProrrogaBtn.setContentAreaFilled(false);
        refreshProrrogaBtn.setFocusPainted(false);
        refreshProrrogaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshProrrogaBtnActionPerformed(evt);
            }
        });

        jLabel14.setText("Numero de Control");

        txtOtroConcepto.setEnabled(false);
        txtOtroConcepto.setPreferredSize(new java.awt.Dimension(289, 22));
        txtOtroConcepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOtroConceptoActionPerformed(evt);
            }
        });

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

        jLabel15.setText("Nombre");

        jLabel16.setText("Concepto");

        semestreCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Primero", "Segundo", "Tercero", "Cuarto", "Quinto", "Sexto", "Septimo", "Octavo", "Noveno", "Decimo" }));

        jLabel18.setText("Monto");

        jLabel19.setText("Fecha de Pedido");

        pedidoDiaCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        pedidoMesCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        pedidoAnoCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016" }));

        liquidadoDiaCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        liquidadoDiaCBox.setEnabled(false);

        liquidadoMesCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        liquidadoMesCBox.setEnabled(false);

        liquidadoAnoCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016" }));
        liquidadoAnoCBox.setEnabled(false);

        jLabel20.setText("Fecha de Liquidacion");

        liquidadoCheckBox.setText("Liquidado");
        liquidadoCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                liquidadoCheckBoxActionPerformed(evt);
            }
        });

        guardarProrrogaBtn.setText("Guardar");
        guardarProrrogaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarProrrogaBtnActionPerformed(evt);
            }
        });

        eliminarProrrogaBtn.setText("Eliminar");
        eliminarProrrogaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarProrrogaBtnActionPerformed(evt);
            }
        });

        editarProrrogaBtn.setText("Editar");
        editarProrrogaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarProrrogaBtnActionPerformed(evt);
            }
        });

        selectAllProrrogaBtn.setText("Seleccionar Todo");
        selectAllProrrogaBtn.setToolTipText("");
        selectAllProrrogaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectAllProrrogaBtnActionPerformed(evt);
            }
        });

        deselectProrrogaBtn.setText("Deseleccionar");
        deselectProrrogaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deselectProrrogaBtnActionPerformed(evt);
            }
        });

        editProrrogaLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        editProrrogaLbl.setText("Editando");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(12, 12, 12)
                        .addComponent(nombreLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(refreshProrrogaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(txtNoControlProrroga))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addGap(18, 18, 18)
                                        .addComponent(conceptoCBox, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel17))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtOtroConcepto, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(semestreCBox, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(6, 6, 6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(pedidoDiaCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                .addComponent(pedidoMesCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(pedidoAnoCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addGap(18, 18, 18)
                                        .addComponent(liquidadoCheckBox)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(liquidadoDiaCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(liquidadoMesCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(eliminarProrrogaBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(editarProrrogaBtn)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(liquidadoAnoCBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(guardarProrrogaBtn, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(selectAllProrrogaBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deselectProrrogaBtn)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(editProrrogaLbl)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(refreshProrrogaBtn))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtNoControlProrroga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addComponent(nombreLbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(conceptoCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOtroConcepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(semestreCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pedidoDiaCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pedidoMesCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pedidoAnoCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(liquidadoCheckBox))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(liquidadoDiaCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(liquidadoMesCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(liquidadoAnoCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarProrrogaBtn)
                    .addComponent(eliminarProrrogaBtn)
                    .addComponent(editarProrrogaBtn))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectAllProrrogaBtn)
                    .addComponent(deselectProrrogaBtn))
                .addGap(18, 18, 18)
                .addComponent(editProrrogaLbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        prorrogaTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(prorrogaTable);

        tipoBusquedaProrrogaCbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Coincide", "Comienza con", "Termina con", "Incluye" }));

        busquedaProrrogaCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Numero de Control", "Id", "Concepto", "Nivel o Semestre", "Cantidad", "Pagado", "Resto", "Pedido", "Liquidado" }));

        txtBusquedaProrroga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaProrrogaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout prorrogaPanelLayout = new javax.swing.GroupLayout(prorrogaPanel);
        prorrogaPanel.setLayout(prorrogaPanelLayout);
        prorrogaPanelLayout.setHorizontalGroup(
            prorrogaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, prorrogaPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(prorrogaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                    .addGroup(prorrogaPanelLayout.createSequentialGroup()
                        .addComponent(busquedaProrrogaCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tipoBusquedaProrrogaCbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBusquedaProrroga)))
                .addContainerGap())
        );
        prorrogaPanelLayout.setVerticalGroup(
            prorrogaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, prorrogaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(prorrogaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoBusquedaProrrogaCbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(busquedaProrrogaCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBusquedaProrroga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3)
                .addContainerGap())
        );

        pagoPanel.setBackground(new java.awt.Color(236, 236, 236));

        jPanel3.setBackground(new java.awt.Color(236, 236, 236));
        jPanel3.setPreferredSize(new java.awt.Dimension(283, 453));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setText("Crear Pago");

        jLabel22.setText("Prorroga");

        refreshPagoBtn.setIcon(new javax.swing.ImageIcon("icons\\refresh.png"));
        refreshPagoBtn.setToolTipText("Recargar pagina");
        refreshPagoBtn.setBorder(null);
        refreshPagoBtn.setBorderPainted(false);
        refreshPagoBtn.setContentAreaFilled(false);
        refreshPagoBtn.setFocusPainted(false);
        refreshPagoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshPagoBtnActionPerformed(evt);
            }
        });

        jLabel23.setText("Folio");

        txtNoControlPago.setPreferredSize(new java.awt.Dimension(289, 22));
        txtNoControlPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoControlPagoActionPerformed(evt);
            }
        });
        txtNoControlPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNoControlPagoKeyReleased(evt);
            }
        });

        txtFolioPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFolioPagoActionPerformed(evt);
            }
        });
        txtFolioPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFolioPagoKeyReleased(evt);
            }
        });

        jLabel24.setText("Nombre");

        jLabel25.setText("No. Control");

        jLabel26.setText("Pago");

        jLabel27.setText("Fecha de Pago");
        jLabel27.setToolTipText("");

        pagoDiaCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        pagoMesCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        pagoAnoCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016" }));

        guardarPagoBtn.setText("Guardar");
        guardarPagoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarPagoBtnActionPerformed(evt);
            }
        });

        eliminarPagoBtn.setText("Eliminar");
        eliminarPagoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPagoBtnActionPerformed(evt);
            }
        });

        editarPagoBtn.setText("Editar");
        editarPagoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarPagoBtnActionPerformed(evt);
            }
        });

        selectAllPagoBtn.setText("Seleccionar Todo");
        selectAllPagoBtn.setToolTipText("");
        selectAllPagoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectAllPagoBtnActionPerformed(evt);
            }
        });

        deselectPagoBtn.setText("Deseleccionar");
        deselectPagoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deselectPagoBtnActionPerformed(evt);
            }
        });

        editPagoLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        editPagoLbl.setText("Editando");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(nombrePagoLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel22)
                        .addGap(18, 18, 18)
                        .addComponent(txtProrrogaNum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(selectProrrogaPagoCBox, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(refreshPagoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel25))
                                .addGap(18, 36, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFolioPago, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                    .addComponent(txtNoControlPago, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))))
                        .addGap(6, 6, 6))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPago, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(selectAllPagoBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deselectPagoBtn)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(editPagoLbl)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(pagoDiaCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(pagoMesCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(pagoAnoCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(eliminarPagoBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editarPagoBtn)
                        .addGap(36, 36, 36)
                        .addComponent(guardarPagoBtn)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel24))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(refreshPagoBtn))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtFolioPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtNoControlPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel24)
                    .addComponent(nombrePagoLbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(selectProrrogaPagoCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProrrogaNum))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addComponent(txtPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel27)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pagoDiaCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pagoMesCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pagoAnoCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eliminarPagoBtn)
                    .addComponent(editarPagoBtn)
                    .addComponent(guardarPagoBtn))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectAllPagoBtn)
                    .addComponent(deselectPagoBtn))
                .addGap(18, 18, 18)
                .addComponent(editPagoLbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pagoTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(pagoTable);

        javax.swing.GroupLayout pagoPanelLayout = new javax.swing.GroupLayout(pagoPanel);
        pagoPanel.setLayout(pagoPanelLayout);
        pagoPanelLayout.setHorizontalGroup(
            pagoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pagoPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                .addContainerGap())
        );
        pagoPanelLayout.setVerticalGroup(
            pagoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pagoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pagoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE))
                .addContainerGap())
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
        actualizarListaProrroga();
        
        LocalDate fechaActual = LocalDate.now();
        
        Object [] days = new Object[31];
        
        for (int i = 0; i < days.length; i++) {
            days[i] = i + 1;
        }
        
        pedidoDiaCBox.setModel(new DefaultComboBoxModel(days));
        liquidadoDiaCBox.setModel(new DefaultComboBoxModel(days));
        
        Object months [] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        
        pedidoMesCBox.setModel(new DefaultComboBoxModel(months));
        liquidadoMesCBox.setModel(new DefaultComboBoxModel(months));
        
        Object [] years = new Object[10];
        int j = 0;
        for (int i = fechaActual.getYear(); i >= (fechaActual.getYear() - 9); i--) {
            years[j] = i;
            j++;
        }
        
        pedidoAnoCBox.setModel(new DefaultComboBoxModel(years));
        liquidadoAnoCBox.setModel(new DefaultComboBoxModel(years));
        
        pedidoDiaCBox.setSelectedIndex(fechaActual.getDayOfMonth() - 1);
        pedidoMesCBox.setSelectedIndex(fechaActual.getMonthValue() - 1);
        pedidoAnoCBox.setSelectedIndex(0);
        
    }//GEN-LAST:event_prorrogaBtnActionPerformed

    private void pagoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagoBtnActionPerformed
        pagoPanel.setVisible(true);
        prorrogaPanel.setVisible(false);
        alumnoPanel.setVisible(false);
        menuPanel.setVisible(false);
        actualizarListaPago();
        
        LocalDate fechaActual = LocalDate.now();
        
        Object [] days = new Object[31];
        
        for (int i = 0; i < days.length; i++) {
            days[i] = i + 1;
        }
        
        pagoDiaCBox.setModel(new DefaultComboBoxModel(days));
        
        Object months [] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        
        pagoMesCBox.setModel(new DefaultComboBoxModel(months));
        
        Object [] years = new Object[10];
        int j = 0;
        for (int i = fechaActual.getYear(); i >= (fechaActual.getYear() - 9); i--) {
            years[j] = i;
            j++;
        }
        
        pagoAnoCBox.setModel(new DefaultComboBoxModel(years));
        
        pagoDiaCBox.setSelectedIndex(fechaActual.getDayOfMonth() - 1);
        pagoMesCBox.setSelectedIndex(fechaActual.getMonthValue() - 1);
        pagoAnoCBox.setSelectedIndex(0);
        
    }//GEN-LAST:event_pagoBtnActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        actualizarListaBusqueda();
        actualizarListaProrroga();
        actualizarListaPago();
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
                    alumno = listaAlumnoBusqueda.get(index[i]);
                }
                array[i] = alumno.getNoControl();
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
                JOptionPane.showMessageDialog(rootPane, "Ocurrió un error al intentar eliminar los siguientes alumnos: " + cadena + " \nPor favor verifique que no tenga conexiones en el apartado de prorrogas");
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
            JOptionPane.showMessageDialog(rootPane, "Ocurrió un error al intentar exportar la base de datos.\n"
                    + "Revise que se haya declarado correctamente el nombre de la tabla.\n"
                    + "Tambien que la estructura de la tabla a importar sea la siguiente:\n"
                    + "[noControl] [nombre] [apeP] [apeM]");
        }
        else {
            actualizarLista();
            deselectAll();
            this.txtBusqueda.setText("");
            this.txtTable.setText("");
            this.txtImport.setText("");
        }

    }//GEN-LAST:event_ImportTableBtnActionPerformed

    private void txtBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusquedaActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed

        listaAlumnoBusqueda.clear();
        actualizarListaBusqueda();
        deselectAll();
        this.txtBusqueda.setText("");
        this.txtTable.setText("");
        this.txtImport.setText("");

    }//GEN-LAST:event_refreshBtnActionPerformed

    private void refreshProrrogaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshProrrogaBtnActionPerformed
        
        listaProrrogaBusqueda.clear();
        actualizarListaProrrogaBusqueda();
        deselectAllProrroga();
        
    }//GEN-LAST:event_refreshProrrogaBtnActionPerformed

    private void txtNoControlProrrogaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoControlProrrogaActionPerformed
    }//GEN-LAST:event_txtNoControlProrrogaActionPerformed

    private void txtNoControlProrrogaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoControlProrrogaKeyReleased
        
        AlumnoDao dao = new AlumnoDao();
        
        String nombre = dao.obtenerNombre(this.txtNoControlProrroga.getText());
        
        this.nombreLbl.setText(nombre);
        
    }//GEN-LAST:event_txtNoControlProrrogaKeyReleased

    private void conceptoCBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conceptoCBoxActionPerformed
        if (conceptoCBox.getSelectedIndex() == 2){
            txtOtroConcepto.setEnabled(true);
        }
        else {
            txtOtroConcepto.setEnabled(false);
        }
    }//GEN-LAST:event_conceptoCBoxActionPerformed

    private void txtOtroConceptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOtroConceptoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOtroConceptoActionPerformed

    private void liquidadoCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_liquidadoCheckBoxActionPerformed
        
        if (liquidadoCheckBox.isSelected()) {
            liquidadoDiaCBox.setEnabled(true);
            liquidadoMesCBox.setEnabled(true);
            liquidadoAnoCBox.setEnabled(true);
            
            LocalDate fechaActual = LocalDate.now();

            liquidadoDiaCBox.setSelectedIndex(fechaActual.getDayOfMonth() - 1);
            liquidadoMesCBox.setSelectedIndex(fechaActual.getMonthValue() - 1);
            liquidadoAnoCBox.setSelectedIndex(0);
            
        }
        else {
            liquidadoMesCBox.setEnabled(false);
            liquidadoAnoCBox.setEnabled(false);            
            liquidadoDiaCBox.setEnabled(false);
        }
        
    }//GEN-LAST:event_liquidadoCheckBoxActionPerformed

    private void guardarProrrogaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarProrrogaBtnActionPerformed
        
        Prorroga prorroga = new Prorroga();
        
        prorroga.setNoControl(Integer.parseInt(txtNoControlProrroga.getText()));
        
        if (conceptoCBox.getSelectedIndex() != 2){
            prorroga.setConcepto(String.valueOf(conceptoCBox.getSelectedItem()));
        } else if (conceptoCBox.getSelectedIndex() == 2) {
            prorroga.setConcepto(txtOtroConcepto.getText());
        }
        
        prorroga.setSemestrePorPagar(String.valueOf(semestreCBox.getSelectedItem()));
        
        prorroga.setTotalPorPagar(Integer.parseInt(txtMonto.getText()));
        
        String fechaPedido = pedidoAnoCBox.getSelectedItem() + "-" + monthToInt(pedidoMesCBox.getSelectedItem()) + "-" + pedidoDiaCBox.getSelectedItem();
        prorroga.setFechaPedido(fechaPedido);
        
        
        if (liquidadoCheckBox.isSelected()) {
            String fechaLiquidado = liquidadoAnoCBox.getSelectedItem() + "-" + monthToInt(liquidadoMesCBox.getSelectedItem()) + "-" + liquidadoDiaCBox.getSelectedItem();
            prorroga.setFechaLiq(fechaLiquidado);
        }
        
        ProrrogaDao dao = new ProrrogaDao();
        
        if (this.editProrrogaLbl.isVisible()){
            Prorroga id;
            int indice = this.prorrogaTable.getSelectedRow();
            if (listaProrrogaBusqueda.isEmpty()){id = listaProrroga.get(indice);}
            else {id = listaProrrogaBusqueda.get(indice);}
            
            prorroga.setIdProrroga(id.getIdProrroga());
            
            dao.editar(prorroga);
            editProrrogaLbl.setVisible(false);
            deselectProrrogaBtn.setVisible(false);
        }
        else {
            if (!dao.agregar(prorroga)) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "Ocurrió un error al guardar la prorroga\n Por favor verifique los datos");
            }
        }

        
        actualizarListaProrrogaBusqueda();
        limpiarCajasDeTextoProrroga();
        
    }//GEN-LAST:event_guardarProrrogaBtnActionPerformed

    private void editarProrrogaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarProrrogaBtnActionPerformed
        
        int indice = this.prorrogaTable.getSelectedRow();
        
        Prorroga prorroga = new Prorroga();
        AlumnoDao dao = new AlumnoDao();

        if (listaProrrogaBusqueda.isEmpty()){
            prorroga = listaProrroga.get(indice);
        }
        else {
            prorroga = listaProrrogaBusqueda.get(indice);
        }
        
        txtNoControlProrroga.setText(String.valueOf(prorroga.getNoControl()));
        String nombre = dao.obtenerNombre(this.txtNoControlProrroga.getText());
        this.nombreLbl.setText(nombre);
        
        conceptoCBox.setSelectedItem(prorroga.getConcepto());
        if (conceptoCBox.getSelectedIndex() == 2){
            txtOtroConcepto.setText(prorroga.getConcepto());
            txtOtroConcepto.setEnabled(true);
        } else if (conceptoCBox.getSelectedIndex() != 2) {
            txtOtroConcepto.setText("");
            txtOtroConcepto.setEnabled(false);
        }
        semestreCBox.setSelectedItem(prorroga.getSemestrePorPagar());
        txtMonto.setText(String.valueOf(prorroga.getTotalPorPagar()));
        
        String fechaPedido = prorroga.getFechaPedido();
        LocalDate localDatefechaPedido = LocalDate.parse(fechaPedido);
        int pedidoAno = localDatefechaPedido.getYear();
        int pedidoMes = localDatefechaPedido.getMonthValue();
        int pedidoDia = localDatefechaPedido.getDayOfMonth();
        pedidoAnoCBox.setSelectedItem(pedidoAno);
        pedidoMesCBox.setSelectedItem(pedidoMes);
        pedidoDiaCBox.setSelectedItem(pedidoDia);
        
        if (prorroga.getFechaLiq() != null) {
            
            liquidadoCheckBox.setSelected(true);
            
            liquidadoDiaCBox.setEnabled(true);
            liquidadoMesCBox.setEnabled(true);
            liquidadoAnoCBox.setEnabled(true);
            
            String fechaLiquidado = prorroga.getFechaPedido();
            LocalDate localDatefechaLiquidado = LocalDate.parse(fechaLiquidado);
            int liquidadoAno = localDatefechaLiquidado.getYear();
            int liquidadoMes = localDatefechaLiquidado.getMonthValue();
            int liquidadoDia = localDatefechaLiquidado.getDayOfMonth();
            liquidadoAnoCBox.setSelectedItem(liquidadoAno);
            liquidadoMesCBox.setSelectedItem(liquidadoMes);
            liquidadoDiaCBox.setSelectedItem(liquidadoDia);
        }
        
        
        editProrrogaLbl.setVisible(true);
        deselectProrrogaBtn.setVisible(true);
        
    }//GEN-LAST:event_editarProrrogaBtnActionPerformed

    private void eliminarProrrogaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarProrrogaBtnActionPerformed
        
        int[] index = this.prorrogaTable.getSelectedRows();
        Prorroga prorroga = new Prorroga();
        ProrrogaDao dao = new ProrrogaDao();
        
        if (index.length <= 1){
            
            
            if (listaProrrogaBusqueda.isEmpty()){
                prorroga = listaProrroga.get(index[0]);
            }
            else {
                prorroga = listaProrrogaBusqueda.get(index[0]);
            }
            
            if (!dao.eliminar(prorroga)) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "Ocurrió un error al eliminar la prorroga, por favor verifique que no tenga conexiones en el apartado de pagos");
            }
            
        } else {
            
            int[] array = new int[index.length];
            
            for (int i = 0; i < index.length; i++) {
                if (listaProrrogaBusqueda.isEmpty()){
                    prorroga = listaProrroga.get(index[i]);
                }
                else {
                    prorroga = listaProrrogaBusqueda.get(index[i]);
                }
                array[i] = prorroga.getIdProrroga();
            }

            List<Integer> numInPagos = dao.eliminar(array);
            
            if (!numInPagos.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < numInPagos.size(); i++) {
                    sb.append(numInPagos.get(i));
                    if (i < numInPagos.size() - 1) {
                        sb.append(", ");
                    }
                }
                String cadena = sb.toString();
                
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(rootPane, "Ocurrió un error al intentar eliminar las siguientes prorrogas: " + cadena + " \nPor favor verifique que no tenga conexiones en el apartado de pagos");
            }
        }
        
        actualizarListaProrrogaBusqueda();
        deselectAllProrroga();
    }//GEN-LAST:event_eliminarProrrogaBtnActionPerformed

    private void selectAllProrrogaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectAllProrrogaBtnActionPerformed
        prorrogaTable.selectAll();
    }//GEN-LAST:event_selectAllProrrogaBtnActionPerformed

    private void deselectProrrogaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deselectProrrogaBtnActionPerformed
        deselectAllProrroga();
    }//GEN-LAST:event_deselectProrrogaBtnActionPerformed

    private void txtBusquedaProrrogaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaProrrogaKeyReleased
        
        actualizarListaProrrogaBusqueda();
        
    }//GEN-LAST:event_txtBusquedaProrrogaKeyReleased

    private void refreshPagoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshPagoBtnActionPerformed
        
        listaPagoBusqueda.clear();
        actualizarListaPagoBusqueda();
        deselectAllPago();
        
    }//GEN-LAST:event_refreshPagoBtnActionPerformed

    private void txtNoControlPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoControlPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoControlPagoActionPerformed

    private void txtFolioPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFolioPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFolioPagoActionPerformed

    private void txtFolioPagoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFolioPagoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFolioPagoKeyReleased

    private void guardarPagoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarPagoBtnActionPerformed
        
        Pago pago = new Pago();
        PagoDao dao = new PagoDao();
        
        pago.setIdPago(Integer.parseInt(txtFolioPago.getText()));
        
        pago.setIdProrroga(Integer.parseInt(txtProrrogaNum.getText()));
        
        pago.setAbonoPago(Integer.parseInt(txtPago.getText()));
        
        pago.setNumeroPago(dao.getNextNumPago(pago.getIdProrroga()));
        
        String fechaPago = pagoAnoCBox.getSelectedItem() + "-" + monthToInt(pagoMesCBox.getSelectedItem()) + "-" + pagoDiaCBox.getSelectedItem();
        pago.setFechaPago(fechaPago);


        if (this.editPagoLbl.isVisible()){
            dao.editar(pago);
            editPagoLbl.setVisible(false);
            deselectPagoBtn.setVisible(false);
        }
        else {
            if (!dao.agregar(pago)) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "Ocurrió un error al guardar el pago, por favor verifique que no sea una entrada duplicada en el folio");
            }
        }
        
        int pagado = dao.calculatePagadoRestoProrroga(pago.getIdProrroga());
        
        ProrrogaDao prorrogaDao = new ProrrogaDao();
        
        prorrogaDao.editarPagadoResto(pagado, pago.getIdProrroga());
        
        if (prorrogaDao.obtenerRestoPorPagar(pago.getIdProrroga()) == 0){
            prorrogaDao.setLiquidado(fechaPago, pago.getIdProrroga());
        }
        
        actualizarListaPagoBusqueda();
        limpiarCajasDeTextoPago();
        
    }//GEN-LAST:event_guardarPagoBtnActionPerformed

    private void eliminarPagoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarPagoBtnActionPerformed
        
        int[] index = this.pagoTable.getSelectedRows();
        Pago pago = new Pago();
        PagoDao dao = new PagoDao();
        
        if (index.length <= 1){
            
            
            if (listaPagoBusqueda.isEmpty()){
                pago = listaPago.get(index[0]);
            }
            else {
                pago = listaPagoBusqueda.get(index[0]);
            }
            
            if (!dao.eliminar(pago)) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "Ocurrió un error al eliminar el pago");
            }
            
        } else {
            
            int[] array = new int[index.length];
            
            for (int i = 0; i < index.length; i++) {
                if (listaPagoBusqueda.isEmpty()){
                    pago = listaPago.get(index[i]);
                }
                else {
                    pago = listaPagoBusqueda.get(index[i]);
                }
                array[i] = pago.getIdPago();
            }

            if (!dao.eliminar(array)) {
                
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(rootPane, "Ocurrió un error al intentar eliminar los pagos");
            }
        }
        
        actualizarListaPagoBusqueda();
        deselectAllPago();
        
    }//GEN-LAST:event_eliminarPagoBtnActionPerformed

    private void editarPagoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarPagoBtnActionPerformed
        
        int indice = this.pagoTable.getSelectedRow();
        
        Pago pago = new Pago();

        if (listaPagoBusqueda.isEmpty()){
            pago = listaPago.get(indice);
        }
        else {
            pago = listaPagoBusqueda.get(indice);
        }
        
        this.txtFolioPago.setText(String.valueOf(pago.getIdPago()));
        
        AlumnoDao alumnoDao = new AlumnoDao();
        this.txtNoControlPago.setText(String.valueOf(alumnoDao.obtenerNoControl(pago.getIdProrroga())));
        
        this.nombrePagoLbl.setText(alumnoDao.obtenerNombre(this.txtNoControlPago.getText()));
        
        ProrrogaDao prorrogaDao = new ProrrogaDao();
        List<Prorroga> lista = prorrogaDao.getProrrogasActivas(txtNoControlPago.getText());
        
        Object index [] = new Object[lista.size()];
        
        int indexProrroga = 0;
        
        for (int i = 0; i < lista.size(); i++) {
            Prorroga prorroga = lista.get(i);
            if (pago.getIdProrroga() == prorroga.getIdProrroga()) {
                indexProrroga = i;
            }
            index[i] = "$" + prorroga.getRestoPorPagar() + " de $"+ prorroga.getTotalPorPagar() + " / " + prorroga.getFechaPedido();
        }
        
        selectProrrogaPagoCBox.setModel(new DefaultComboBoxModel(index));
        
        selectProrrogaPagoCBox.setSelectedIndex(indexProrroga);
        
        Prorroga pr = lista.get(selectProrrogaPagoCBox.getSelectedIndex());
        txtProrrogaNum.setText(String.valueOf(pr.getIdProrroga()));
        
        String fechaPago = pago.getFechaPago();
        LocalDate localDatefechaPago = LocalDate.parse(fechaPago);
        int pagoAno = localDatefechaPago.getYear();
        int pagoMes = localDatefechaPago.getMonthValue();
        int pagoDia = localDatefechaPago.getDayOfMonth();
        pagoAnoCBox.setSelectedItem(pagoAno);
        pagoMesCBox.setSelectedItem(pagoMes);
        pagoDiaCBox.setSelectedItem(pagoDia);
        
        editPagoLbl.setVisible(true);
        deselectPagoBtn.setVisible(true);
        
    }//GEN-LAST:event_editarPagoBtnActionPerformed

    private void selectAllPagoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectAllPagoBtnActionPerformed
        
        pagoTable.selectAll();
        
    }//GEN-LAST:event_selectAllPagoBtnActionPerformed

    private void deselectPagoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deselectPagoBtnActionPerformed
        
        deselectAllPago();
        
    }//GEN-LAST:event_deselectPagoBtnActionPerformed

    private void txtNoControlPagoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoControlPagoKeyReleased
        
        AlumnoDao dao = new AlumnoDao();
        
        String nombre = dao.obtenerNombre(txtNoControlPago.getText());
        nombrePagoLbl.setText(nombre);
        
        ProrrogaDao prorrogaDao = new ProrrogaDao();
        
        List<Prorroga> lista = prorrogaDao.getProrrogasActivas(txtNoControlPago.getText());
        
        Object index [] = new Object[lista.size()];
        
        for (int i = 0; i < lista.size(); i++) {
            Prorroga prorroga = lista.get(i);
            index[i] = "$" + prorroga.getRestoPorPagar() + " de $"+ prorroga.getTotalPorPagar() + " / " + prorroga.getFechaPedido();
        }
        
        selectProrrogaPagoCBox.setModel(new DefaultComboBoxModel(index));
        
        Prorroga pr = lista.get(selectProrrogaPagoCBox.getSelectedIndex());
        txtProrrogaNum.setText(String.valueOf(pr.getIdProrroga()));
    }//GEN-LAST:event_txtNoControlPagoKeyReleased

    private int monthToInt(Object mes){
        Object months [] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        
        for (int i = 0; i < months.length; i++) {
            if (mes == months[i]){
                return i + 1;
            }
        }
        return 0;
    }
    
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
    
    private void deselectAllProrroga(){
        limpiarCajasDeTextoProrroga();
        
        editProrrogaLbl.setVisible(false);
        deselectProrrogaBtn.setVisible(false);
    }
    
    private void limpiarCajasDeTextoProrroga() {
        txtNoControlProrroga.setText("");
        conceptoCBox.setSelectedIndex(0);
        txtOtroConcepto.setEnabled(false);
        txtOtroConcepto.setText("");
        semestreCBox.setSelectedIndex(0);
        txtMonto.setText("");
        
        LocalDate fechaActual = LocalDate.now();
        
        pedidoDiaCBox.setSelectedIndex(fechaActual.getDayOfMonth() - 1);
        pedidoMesCBox.setSelectedIndex(fechaActual.getMonthValue() - 1);
        pedidoAnoCBox.setSelectedIndex(0);
        
        liquidadoDiaCBox.setSelectedIndex(fechaActual.getDayOfMonth() - 1);
        liquidadoMesCBox.setSelectedIndex(fechaActual.getMonthValue() - 1);
        liquidadoAnoCBox.setSelectedIndex(0);
        liquidadoCheckBox.setSelected(false);
        liquidadoDiaCBox.setEnabled(false);
        liquidadoMesCBox.setEnabled(false);
        liquidadoAnoCBox.setEnabled(false);            
        
    }
    
    private void deselectAllPago(){
        limpiarCajasDeTextoPago();
        
        editPagoLbl.setVisible(false);
        deselectPagoBtn.setVisible(false);
    }
    
    private void limpiarCajasDeTextoPago() {
        txtFolioPago.setText("");
        txtNoControlPago.setText("");
        nombrePagoLbl.setText("");
        selectProrrogaPagoCBox.setModel(new DefaultComboBoxModel());
        txtPago.setText("");
        
        LocalDate fechaActual = LocalDate.now();
        
        pagoDiaCBox.setSelectedIndex(fechaActual.getDayOfMonth() - 1);
        pagoMesCBox.setSelectedIndex(fechaActual.getMonthValue() - 1);
        pagoAnoCBox.setSelectedIndex(0);   
        
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
        
        String[] CboxOptions = {"noControl", "CONCAT(nombre, ' ', apeP, ' ', apeM)", "nombre", "apeP", "apeM"};
        
        if (this.txtBusqueda.getText().isBlank()) {
            actualizarLista();
        }
        else {
            listaAlumnoBusqueda.clear();
            AlumnoDao alumnoDao = new AlumnoDao();
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
    
    
    private void actualizarListaProrroga(){
        
        ProrrogaDao dao = new ProrrogaDao();
        listaProrroga = dao.listar();
        
        DefaultTableModel mt = new DefaultTableModel();
        String ids [] = {"Id", "Numero de Control", "Concepto", "Nivel o Semestre", "Cantidad", "Pagado", "Resto", "Pedido", "Liquidado"};
        mt.setColumnIdentifiers(ids);
        prorrogaTable.setModel(mt);
        
        int widths [] = {100, 180, 200, 180, 180, 180, 180, 180, 180};
        for (int i = 0; i < widths.length; i++) {
            prorrogaTable.getColumn(ids[i]).setPreferredWidth(widths[i]);
        }
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        
        for (int i = 0; i < ids.length; i++) {
            prorrogaTable.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
        
        for(int i = 0; i < listaProrroga.size(); i++) {
            Prorroga prorroga = listaProrroga.get(i);
            mt.addRow(new Object[]{prorroga.getIdProrroga(), prorroga.getNoControl(), prorroga.getConcepto(), prorroga.getSemestrePorPagar(), prorroga.getTotalPorPagar(), prorroga.getTotalPagado(), prorroga.getRestoPorPagar(), prorroga.getFechaPedido(), prorroga.getFechaLiq()});
        }

    }
    
    private void actualizarListaProrrogaBusqueda(){
        
        String[] CboxOptions = {"noControl", "idProrroga", "concepto", "semestrePorPagar", "totalPorPagar", "totalPagado", "restoPorPagar", "fechaPedido", "fechaLiq"};
        
        if (this.txtBusquedaProrroga.getText().isBlank()) {
            actualizarListaProrroga();
        }
        else {
            listaProrrogaBusqueda.clear();
            ProrrogaDao prorrogaDao = new ProrrogaDao();
            listaProrrogaBusqueda = prorrogaDao.listar(CboxOptions[busquedaProrrogaCBox.getSelectedIndex()], (String) this.txtBusquedaProrroga.getText(), tipoBusquedaProrrogaCbox.getSelectedIndex());

            DefaultTableModel mt = new DefaultTableModel();
            String ids [] = {"Id", "Numero de Control", "Concepto", "Nivel o Semestre", "Cantidad", "Pagado", "Resto", "Pedido", "Liquidado"};
            mt.setColumnIdentifiers(ids);
            prorrogaTable.setModel(mt);

            int widths [] = {100, 180, 200, 180, 180, 180, 180, 180, 180};
            for (int i = 0; i < widths.length; i++) {
                prorrogaTable.getColumn(ids[i]).setPreferredWidth(widths[i]);
            }

            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(JLabel.CENTER);

            for (int i = 0; i < ids.length; i++) {
                prorrogaTable.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
            }

            for(int i = 0; i < listaProrrogaBusqueda.size(); i++) {
                Prorroga prorroga = listaProrrogaBusqueda.get(i);
                mt.addRow(new Object[]{prorroga.getIdProrroga(), prorroga.getNoControl(), prorroga.getConcepto(), prorroga.getSemestrePorPagar(), prorroga.getTotalPorPagar(), prorroga.getTotalPagado(), prorroga.getRestoPorPagar(), prorroga.getFechaPedido(), prorroga.getFechaLiq()});
            }
        }

    }
    
    private void actualizarListaPago(){
        AlumnoDao alumnoDao = new AlumnoDao();
        PagoDao dao = new PagoDao();
        listaPago = dao.listar();
        
        DefaultTableModel mt = new DefaultTableModel();
        String ids [] = {"Folio", "Numero de Control", "Prorroga", "Pago", "Numero de Pago", "Fecha"};
        mt.setColumnIdentifiers(ids);
        pagoTable.setModel(mt);
        
        int widths [] = {260, 260, 260, 260, 260, 260};
        for (int i = 0; i < widths.length; i++) {
            pagoTable.getColumn(ids[i]).setPreferredWidth(widths[i]);
        }
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        
        for (int i = 0; i < ids.length; i++) {
            pagoTable.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
        
        for(int i = 0; i < listaPago.size(); i++) {
            Pago pago = listaPago.get(i);
            mt.addRow(new Object[]{pago.getIdPago(), alumnoDao.obtenerNoControl(pago.getIdProrroga()), pago.getIdProrroga(), pago.getAbonoPago(), pago.getNumeroPago(), pago.getFechaPago()});
        }

    }
    
    private void actualizarListaPagoBusqueda(){
        
        String[] CboxOptions = {"noControl", "idProrroga", "concepto", "semestrePorPagar", "totalPorPagar", "fechaPedido", "fechaLiq"};
        
        if (true) {
            actualizarListaPago();
        }
        else {
            listaProrrogaBusqueda.clear();
            ProrrogaDao prorrogaDao = new ProrrogaDao();
            listaProrrogaBusqueda = prorrogaDao.listar(CboxOptions[busquedaProrrogaCBox.getSelectedIndex()], (String) this.txtBusquedaProrroga.getText(), tipoBusquedaProrrogaCbox.getSelectedIndex());

            DefaultTableModel mt = new DefaultTableModel();
            String ids [] = {"Id", "Numero de Control", "Concepto", "Nivel o Semestre", "Cantidad", "Pedido", "Liquidado"};
            mt.setColumnIdentifiers(ids);
            prorrogaTable.setModel(mt);

            int widths [] = {100, 215, 400, 245, 200, 200, 200};
            for (int i = 0; i < widths.length; i++) {
                prorrogaTable.getColumn(ids[i]).setPreferredWidth(widths[i]);
            }

            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(JLabel.CENTER);

            for (int i = 0; i < ids.length; i++) {
                prorrogaTable.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
            }

            for(int i = 0; i < listaProrrogaBusqueda.size(); i++) {
                Prorroga prorroga = listaProrrogaBusqueda.get(i);
                mt.addRow(new Object[]{prorroga.getIdProrroga(), prorroga.getNoControl(), prorroga.getConcepto(), prorroga.getSemestrePorPagar(), prorroga.getTotalPorPagar(), prorroga.getFechaPedido(), prorroga.getFechaLiq()});
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
    private javax.swing.JButton alumnoBtn;
    private javax.swing.JPanel alumnoPanel;
    private javax.swing.JTable alumnoTable;
    private javax.swing.JComboBox<String> busquedaCBox;
    private javax.swing.JComboBox<String> busquedaProrrogaCBox;
    private javax.swing.JComboBox<String> conceptoCBox;
    private javax.swing.JButton deselectBtn;
    private javax.swing.JButton deselectPagoBtn;
    private javax.swing.JButton deselectProrrogaBtn;
    private javax.swing.JLabel editLabel;
    private javax.swing.JLabel editPagoLbl;
    private javax.swing.JLabel editProrrogaLbl;
    private javax.swing.JButton editarBtn;
    private javax.swing.JButton editarPagoBtn;
    private javax.swing.JButton editarProrrogaBtn;
    private javax.swing.JButton eliminarBtn;
    private javax.swing.JButton eliminarPagoBtn;
    private javax.swing.JButton eliminarProrrogaBtn;
    private javax.swing.JButton guardarBtn;
    private javax.swing.JButton guardarPagoBtn;
    private javax.swing.JButton guardarProrrogaBtn;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> liquidadoAnoCBox;
    private javax.swing.JCheckBox liquidadoCheckBox;
    private javax.swing.JComboBox<String> liquidadoDiaCBox;
    private javax.swing.JComboBox<String> liquidadoMesCBox;
    private javax.swing.JButton menuBtn;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JLabel nombreLbl;
    private javax.swing.JLabel nombrePagoLbl;
    private javax.swing.JComboBox<String> pagoAnoCBox;
    private javax.swing.JButton pagoBtn;
    private javax.swing.JComboBox<String> pagoDiaCBox;
    private javax.swing.JComboBox<String> pagoMesCBox;
    private javax.swing.JPanel pagoPanel;
    private javax.swing.JTable pagoTable;
    private javax.swing.JComboBox<String> pedidoAnoCBox;
    private javax.swing.JComboBox<String> pedidoDiaCBox;
    private javax.swing.JComboBox<String> pedidoMesCBox;
    private javax.swing.JButton prorrogaBtn;
    private javax.swing.JPanel prorrogaPanel;
    private javax.swing.JTable prorrogaTable;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton refreshPagoBtn;
    private javax.swing.JButton refreshProrrogaBtn;
    private javax.swing.JButton selectAllBtn;
    private javax.swing.JButton selectAllPagoBtn;
    private javax.swing.JButton selectAllProrrogaBtn;
    private javax.swing.JComboBox<String> selectProrrogaPagoCBox;
    private javax.swing.JComboBox<String> semestreCBox;
    private javax.swing.JComboBox<String> tipoBusquedaCbox;
    private javax.swing.JComboBox<String> tipoBusquedaProrrogaCbox;
    private javax.swing.JTextField txtApeM;
    private javax.swing.JTextField txtApeP;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtBusquedaProrroga;
    private javax.swing.JTextField txtFolioPago;
    private javax.swing.JTextField txtImport;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtNoControl;
    private javax.swing.JTextField txtNoControlPago;
    private javax.swing.JTextField txtNoControlProrroga;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtOtroConcepto;
    private javax.swing.JTextField txtPago;
    private javax.swing.JLabel txtProrrogaNum;
    private javax.swing.JTextField txtTable;
    // End of variables declaration//GEN-END:variables
}
