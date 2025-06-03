package org.cenidet;

import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Main extends JFrame {

    List<String> nombresMicroservicios = new ArrayList<>();
    List<Double> granularidades = new ArrayList<>();
    List<Double> cohesiones = new ArrayList<>();
    List<Double> complejidades = new ArrayList<>();
    List<Double> lcoms = new ArrayList<>();
    List<Integer> noos = new ArrayList<>();
    List<Double> sgms = new ArrayList<>();

    Procesos procesos = new Procesos();
    UIDimension uiDimension = new UIDimension();
    private static String reposName = "";
    private static final List<String[]> filePathsList = new ArrayList<>();
    private static final List<String> filteredFilePath = new ArrayList<>();
    private static final List<String> filteredFilePath2 = new ArrayList<>();
    private static final List<String[]> cadenasCSV = new ArrayList<>();

    public Main() {
        initComponents();
        this.setTitle("MSA");
        this.areavista.setEditable(false);
        this.areaanalisis.setEditable(false);
        this.treepanel.setVisible(false);
        this.panelacciones.setVisible(false);
        this.panelcalculos.setVisible(false);
        this.panelanalisis.setVisible(false);
        this.panelaccanalisis.setVisible(false);
        this.panelerrores.setVisible(false);

        uiDimension.setWindowWidth(this.getWidth());
        uiDimension.setWindowHeight(this.getHeight());
        uiDimension.setPanelPathWidth(this.panelruta.getWidth());
        uiDimension.setPanelPathHeight(this.panelruta.getHeight());
        uiDimension.setPanelViewWidth(this.panelvista.getWidth());
        uiDimension.setPanelViewHeight(this.panelvista.getHeight());
        uiDimension.setAreaViewWidth(this.areavista.getWidth());
        uiDimension.setAreaViewHeight(this.areavista.getHeight());

        pack();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    private void initComponents() {

        maindesktop = new JDesktopPane();
        jPanel1 = new JPanel();
        panelanalisis = new JPanel();
        jScrollPane3 = new JScrollPane();
        areaanalisis = new JTextArea();
        jPanel2 = new JPanel();
        treepanel = new JPanel();
        jScrollPane2 = new JScrollPane();
        arboldir = new JTree();
        panelruta = new JPanel();
        rutalabel = new JLabel();
        panelvista = new JPanel();
        jScrollPane1 = new JScrollPane();
        areavista = new JTextArea();
        jPanel3 = new JPanel();
        panelacciones = new JPanel();
        btnanalizar = new JButton();
        btnlimpiar = new JButton();
        panelaccanalisis = new JPanel();
        btnguardarexcel = new JButton();
        panelcalculos = new JPanel();
        btncalcular = new JButton();
        jLabel1 = new JLabel();
        btnguardartxt = new JButton();
        panelerrores = new JPanel();
        btnerrores = new JButton();
        jMenuBar1 = new JMenuBar();
        menuarchivo = new JMenu();
        abrirarchivo = new JMenuItem();
        abrircarpeta = new JMenuItem();
        menuacercade = new JMenu();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //maindesktop.setBackground(new java.awt.Color(0, 102, 51));

        panelanalisis.setBorder(BorderFactory.createTitledBorder("Resultado de análisis"));

        areaanalisis.setColumns(20);
        areaanalisis.setRows(5);
        jScrollPane3.setViewportView(areaanalisis);

        GroupLayout panelanalisisLayout = new GroupLayout(panelanalisis);
        panelanalisis.setLayout(panelanalisisLayout);
        panelanalisisLayout.setHorizontalGroup(
                panelanalisisLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelanalisisLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane3)
                                .addContainerGap())
        );
        panelanalisisLayout.setVerticalGroup(
                panelanalisisLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelanalisisLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane3, GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                .addContainerGap())
        );

        treepanel.setBorder(BorderFactory.createTitledBorder("Estructura de directorio"));

        arboldir.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                arboldirValueChanged();
            }
        });
        jScrollPane2.setViewportView(arboldir);

        GroupLayout treepanelLayout = new GroupLayout(treepanel);
        treepanel.setLayout(treepanelLayout);
        treepanelLayout.setHorizontalGroup(
                treepanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
        );
        treepanelLayout.setVerticalGroup(
                treepanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
        );

        panelruta.setBorder(BorderFactory.createTitledBorder("Archivo o carpeta seleccionada"));

        rutalabel.setText("Ningún archivo seleccionado");

        GroupLayout panelrutaLayout = new GroupLayout(panelruta);
        panelruta.setLayout(panelrutaLayout);
        panelrutaLayout.setHorizontalGroup(
                panelrutaLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelrutaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(rutalabel, GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                                .addContainerGap())
        );
        panelrutaLayout.setVerticalGroup(
                panelrutaLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelrutaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(rutalabel)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelvista.setBorder(BorderFactory.createTitledBorder("Vista previa de archivos"));

        areavista.setColumns(20);
        areavista.setRows(5);
        jScrollPane1.setViewportView(areavista);

        GroupLayout panelvistaLayout = new GroupLayout(panelvista);
        panelvista.setLayout(panelvistaLayout);
        panelvistaLayout.setHorizontalGroup(
                panelvistaLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelvistaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                                .addContainerGap())
        );
        panelvistaLayout.setVerticalGroup(
                panelvistaLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelvistaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                                .addContainerGap())
        );

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(treepanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(panelruta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(panelvista, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(treepanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(panelruta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(panelvista, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelacciones.setBorder(BorderFactory.createTitledBorder("Acciones"));

        btnanalizar.setText("Analizar seleccionado");
        btnanalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnanalizarActionPerformed();
            }
        });

        btnlimpiar.setText("Limpiar todo");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed();
            }
        });

        GroupLayout panelaccionesLayout = new GroupLayout(panelacciones);
        panelacciones.setLayout(panelaccionesLayout);
        panelaccionesLayout.setHorizontalGroup(
                panelaccionesLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelaccionesLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelaccionesLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(btnanalizar, GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                        .addComponent(btnlimpiar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        panelaccionesLayout.setVerticalGroup(
                panelaccionesLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelaccionesLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnanalizar)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnlimpiar)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelaccanalisis.setBorder(BorderFactory.createTitledBorder("Acciones de análisis"));

        btnguardarexcel.setText("Archivo .csv");
        btnguardarexcel.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnguardarexcelActionPerformed();
            }
        });

        jLabel1.setText("Guardar análisis como...");

        btnguardartxt.setText("Archivo .txt");

        btnguardartxt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnguardartxtActionPerformed();
            }
        });


        GroupLayout panelaccanalisisLayout = new GroupLayout(panelaccanalisis);
        panelaccanalisis.setLayout(panelaccanalisisLayout);
        panelaccanalisisLayout.setHorizontalGroup(
                panelaccanalisisLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelaccanalisisLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelaccanalisisLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(btnguardarexcel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnguardartxt, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(panelaccanalisisLayout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        panelaccanalisisLayout.setVerticalGroup(
                panelaccanalisisLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, panelaccanalisisLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnguardarexcel)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnguardartxt)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelcalculos.setBorder(BorderFactory.createTitledBorder("Cálculos"));

        btncalcular.setText("Calcular métricas");
        btncalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalcularActionPerformed();
            }
        });

        GroupLayout panelcalculosLayout = new GroupLayout(panelcalculos);
        panelcalculos.setLayout(panelcalculosLayout);

        panelcalculosLayout.setHorizontalGroup(
                panelcalculosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelcalculosLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelcalculosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(btncalcular, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        panelcalculosLayout.setVerticalGroup(
                panelcalculosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelcalculosLayout.createSequentialGroup()
                                .addContainerGap()
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btncalcular)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelerrores.setBorder(BorderFactory.createTitledBorder("Errores"));

        btnerrores.setText("Ver archivos con errores");
        btnerrores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnerroresActionPerformed();
            }
        });

        GroupLayout panelerroresLayout = new GroupLayout(panelerrores);
        panelerrores.setLayout(panelerroresLayout);
        panelerroresLayout.setHorizontalGroup(
                panelerroresLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelerroresLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnerrores)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelerroresLayout.setVerticalGroup(
                panelerroresLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelerroresLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnerrores)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(panelaccanalisis, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(panelacciones, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(panelcalculos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(panelerrores, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(panelacciones, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelaccanalisis, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panelcalculos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panelerrores, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(panelanalisis, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addContainerGap())
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(panelanalisis, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        maindesktop.setLayer(jPanel1, JLayeredPane.DEFAULT_LAYER);

        GroupLayout maindesktopLayout = new GroupLayout(maindesktop);
        maindesktop.setLayout(maindesktopLayout);
        maindesktopLayout.setHorizontalGroup(
                maindesktopLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(maindesktopLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        maindesktopLayout.setVerticalGroup(
                maindesktopLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(maindesktopLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        menuarchivo.setText("Archivo");

        abrirarchivo.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        abrirarchivo.setText("Abrir archivo");
        abrirarchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirarchivoActionPerformed();
            }
        });
        menuarchivo.add(abrirarchivo);

        abrircarpeta.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        abrircarpeta.setText("Abrir carpeta");
        abrircarpeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrircarpetaActionPerformed();
            }
        });
        menuarchivo.add(abrircarpeta);

        jMenuBar1.add(menuarchivo);

        menuacercade.setText("Acerca de");
        jMenuBar1.add(menuacercade);

        setJMenuBar(jMenuBar1);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(maindesktop, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(maindesktop, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }

    private void abrirarchivoActionPerformed(){
        JFileChooser fileChooser = new JFileChooser(".");
        FileFilter filtro = new FileNameExtensionFilter("Archivos java (.java)", "java");
        fileChooser.setFileFilter(filtro);

        int val = fileChooser.showOpenDialog(fileChooser);
        if(val == JFileChooser.APPROVE_OPTION) {
            String ruta = fileChooser.getSelectedFile().getAbsolutePath();
            String nombre = fileChooser.getSelectedFile().getName();
            String[] partes;
            filteredFilePath.clear();

            if(nombre.endsWith(".java")) {
                String content = procesos.fileContent(ruta);
                partes = procesos.divideText(ruta, (int) ruta.length() / 2);

                if(partes.length > 1)
                    this.rutalabel.setText("<html>" + partes[0] + "<br>" + partes[1] + "</html>");
                else
                    this.rutalabel.setText(ruta);
                this.rutalabel.setPreferredSize(null);
                this.rutalabel.revalidate();
                this.rutalabel.setForeground(new Color(5, 69, 38));
                this.areavista.setText(content);
                filteredFilePath.add(ruta);
                this.panelacciones.setVisible(true);
            } else {
                this.rutalabel.setText("El archivo seleccionado no es un archivo .java");
                this.rutalabel.setForeground(new Color(92, 14, 8));
                this.areavista.setText("");
            }
        }
        pack();
        this.panelvista.setSize(new Dimension(this.panelruta.getWidth(), uiDimension.getPanelViewHeight()));
        this.areavista.setSize(new Dimension(this.panelruta.getWidth(), uiDimension.getAreaViewHeight()));
        panelvista.revalidate();
        areavista.revalidate();
        pack();
        this.setLocationRelativeTo(null);
    }

    private void abrircarpetaActionPerformed() {
        JFileChooser folderChooser = new JFileChooser();
        folderChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        folderChooser.setDialogTitle("Seleccionar repositorio");
        String[] partes;

        int returnValue = folderChooser.showOpenDialog(this);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFolder = folderChooser.getSelectedFile();
            reposName = selectedFolder.getName();
            DefaultMutableTreeNode root = new DefaultMutableTreeNode(selectedFolder.getName());
            DefaultTreeModel treeModel = new DefaultTreeModel(root);

            filePathsList.clear();
            filteredFilePath.clear();
            buildTree(selectedFolder, root);

            for(String[] filePath : filePathsList) {
                for(String path : filePath) {
                    if(path.endsWith("Impl.java") && path.contains("Impl.java")) {
                        filteredFilePath.add(path);
                    } else if(path.endsWith("Service.java")) {
                        filteredFilePath2.add(path);
                    }
                }
            }

            if(filteredFilePath.isEmpty() && filteredFilePath2.isEmpty()) {
                rutalabel.setText("La carpeta seleccionada no contiene archivos de microservicios");
            } else {
                String ruta = selectedFolder.getPath();
                partes = procesos.divideText(ruta, (int) ruta.length() / 2);

                if(partes.length > 1)
                    this.rutalabel.setText("<html>" + partes[0] + "<br>" + partes[1] + "</html>");
                else
                    this.rutalabel.setText(ruta);
                this.treepanel.setVisible(true);
                this.rutalabel.setForeground(new Color(5, 69, 38));
                this.areavista.setText("");

                this.arboldir.setModel(treeModel);
                int c = 1;
                System.out.println("fp1");
                for (String filePath : filteredFilePath) {
                    System.out.println(c + " - " + filePath);
                    c++;
                }
                System.out.println("fp2");
                c = 1;
                for (String filePath2 : filteredFilePath2) {
                    System.out.println(c + " - " + filePath2);
                    c++;
                }
                this.panelacciones.setVisible(true);
                this.panelanalisis.setVisible(false);
                this.panelaccanalisis.setVisible(false);
                this.panelcalculos.setVisible(false);
                this.panelerrores.setVisible(false);
            }
        } else {
            this.rutalabel.setText("No se seleccionó ninguna carpeta.");
            this.rutalabel.setForeground(new Color(92, 14, 8));
            this.areavista.setText("");
        }
        pack();
        this.panelvista.setSize(new Dimension(this.panelruta.getWidth(), uiDimension.getPanelViewHeight()));
        this.areavista.setSize(new Dimension(this.panelruta.getWidth(), uiDimension.getAreaViewHeight()));
        panelvista.revalidate();
        areavista.revalidate();
        pack();
        this.setLocationRelativeTo(null);
    }

    private void arboldirValueChanged() {
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) arboldir.getLastSelectedPathComponent();
        if (selectedNode != null) {
            Object userObject = selectedNode.getUserObject();
            if (userObject instanceof String nodeText) {
                for (String filePath : filteredFilePath) {
                    if(filePath.endsWith(nodeText)) {
                        String content = procesos.fileContent(filePath);
                        this.areavista.setText(content);
                        this.areavista.setCaretPosition(this.areavista.getDocument().getLength());
                        System.out.println(content);
                    }
                }
                System.out.println("Texto del nodo seleccionado: " + nodeText);
            }
        }
    }

    private String printTree(DefaultMutableTreeNode node, String prefix, boolean isTail) {
        StringBuilder sb = new StringBuilder();
        sb.append(prefix).append(isTail ? "└── " : "├── ").append(node.getUserObject().toString()).append("\n");
        for (int i = 0; i < node.getChildCount() - 1; i++) {
            DefaultMutableTreeNode child = (DefaultMutableTreeNode) node.getChildAt(i);
            sb.append(printTree(child, prefix + (isTail ? "    " : "│   "), false));
        }
        if (node.getChildCount() > 0) {
            DefaultMutableTreeNode child = (DefaultMutableTreeNode) node.getChildAt(node.getChildCount() - 1);
            sb.append(printTree(child, prefix + (isTail ?"    " : "│   "), true));
        }
        return sb.toString();
    }

    private void btnlimpiarActionPerformed() {
        this.arboldir.setModel(null);
        this.treepanel.setVisible(false);
        this.areavista.setText("");
        this.areaanalisis.setText("");
        this.rutalabel.setText("Ningún archivo seleccionado");
        this.rutalabel.setForeground(Color.BLACK);
        this.panelacciones.setVisible(false);
        this.panelanalisis.setVisible(false);
        this.panelaccanalisis.setVisible(false);
        this.panelcalculos.setVisible(false);
        this.panelerrores.setVisible(false);
        filePathsList.clear();
        filteredFilePath.clear();

        pack();
        this.panelvista.setPreferredSize(new Dimension(this.panelruta.getWidth(),
                this.panelvista.getHeight() - 300));
        this.areavista.setPreferredSize(new Dimension(this.panelruta.getWidth(),
                this.areavista.getHeight() - 300));
        this.panelvista.revalidate();
        this.areavista.revalidate();
        pack();
        this.setLocationRelativeTo(null);
    }

    private void buildTree(File folder, DefaultMutableTreeNode parentNode) {
        File[] files = folder.listFiles();
        if (files != null) {
            List<String> filePaths = new ArrayList<>();
            for (File file : files) {
                DefaultMutableTreeNode node = new DefaultMutableTreeNode(file.getName());
                parentNode.add(node);
                filePaths.add(file.getAbsolutePath());
                if (file.isDirectory()) {
                    buildTree(file, node);
                }
            }
            filePathsList.add(filePaths.toArray(new String[0]));
        }
    }


    private void abrirVentanaConTabla(
            List<String> nombresMicroservicios,
            List<Double> granularidad,
            List<Double> cohesion,
            List<Double> complejidad,
            List<Double> lcom,
            List<Integer> noo,
            List<Double> sgm) {

        JFrame ventanaTabla = new JFrame("Cálculo de Métricas");
        ventanaTabla.setSize(800, 400); // Ajustar el tamaño para columnas adicionales
        ventanaTabla.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ventanaTabla.setLocationRelativeTo(null);
        ventanaTabla.setLayout(new BorderLayout());

        // Crear las columnas para la tabla
        String[] columnas = {"Microservicio", "Granularidad", "Cohesión", "Complejidad", "LCOM", "NOO", "SGM"};

        // Crear los datos de la tabla
        Object[][] datos = new Object[nombresMicroservicios.size()][7];
        for (int i = 0; i < nombresMicroservicios.size(); i++) {
            double nuevoDato = procesos.getNuevoDato(); // Obtener el nuevo dato
            granularidad.add(nuevoDato);
            sgm.add(nuevoDato);

            datos[i][0] = nombresMicroservicios.get(i); // Nombre del microservicio
            datos[i][1] = granularidad.get(i+1);         // Granularidad
            datos[i][2] = cohesion.get(i);                    // Nuevo Dato
            datos[i][3] = complejidad.get(i);            // Cohesión
            datos[i][4] = lcom.get(i);          // Complejidad
            datos[i][5] = noo.get(i);                 // LCOM
            datos[i][6] = sgm.get(i+1);                  // NOO// SGM
        }

        // Crear la tabla con los datos
        JTable tabla = new JTable(datos, columnas);
        JScrollPane scrollPane = new JScrollPane(tabla);

        // Título de la ventana
        JLabel titulo = new JLabel("Resultados del Cálculo de Métricas", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 16));

        // Botón para exportar a Excel
        JButton btnExportar = new JButton("Exportar a Excel");
        btnExportar.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Guardar como...");
            fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Archivos CSV", "csv"));

            int userSelection = fileChooser.showSaveDialog(ventanaTabla);
            if (userSelection == JFileChooser.APPROVE_OPTION) {
                File fileToSave = fileChooser.getSelectedFile();
                String filePath = fileToSave.getAbsolutePath();
                if (!filePath.endsWith(".csv")) {
                    filePath += ".csv";
                }

                try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
                    // Escribir encabezados
                    writer.write(String.join(",", columnas));
                    writer.newLine();

                    // Escribir datos
                    for (Object[] row : datos) {
                        String[] rowData = new String[row.length];
                        for (int i = 0; i < row.length; i++) {
                            rowData[i] = row[i].toString();
                        }
                        writer.write(String.join(",", rowData));
                        writer.newLine();
                    }

                    JOptionPane.showMessageDialog(ventanaTabla, "Archivo exportado exitosamente a: " + filePath);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(ventanaTabla, "Error al guardar el archivo: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Panel inferior con el botón de exportar
        JPanel panelInferior = new JPanel();
        panelInferior.add(btnExportar);

        // Agregar componentes a la ventana
        ventanaTabla.add(titulo, BorderLayout.NORTH); // Título en la parte superior
        ventanaTabla.add(scrollPane, BorderLayout.CENTER); // Tabla en el centro
        ventanaTabla.add(panelInferior, BorderLayout.SOUTH); // Botón en la parte inferior

        ventanaTabla.setVisible(true); // Hacer visible la ventana
    }

    private void btnanalizarActionPerformed() {
        if(filteredFilePath.isEmpty())
            HacerAnalisis(filteredFilePath2);
        else
            HacerAnalisis(filteredFilePath);
    }

    private void HacerAnalisis(@NotNull List<String> lista) {
        this.areaanalisis.setText("");
        this.areaanalisis.append("Datos del repositorio \"" + reposName + "\"\n");
        this.areaanalisis.append("Número de MS encontrados en este repositorio (NS): " + lista.size() + "\n\n");

        cadenasCSV.add(new String[]{"Datos del repositorio " + reposName, "", "", "", "", "", ""});
        cadenasCSV.add(new String[]{"(NS) Cantidad de MS encontrados en este repositorio:",
                String.valueOf(lista.size()), "", "", "", "", ""});
        cadenasCSV.add(new String[]{"", "", "", "", "", "", ""});
        cadenasCSV.add(new String[]{"Nota", "Las comas fueron reemplazadas por comillas simples " +
                "debido a que podrían ocasionar desfasamiento de celdas", "", "", "", "", ""});
        cadenasCSV.add(new String[]{"", "", "", "", "", "", ""});

        for (String filePath : lista) {
            FileData fileData = procesos.extractFileInfo(filePath);
            ApiAndMethodsInfo info = procesos.extractInfoFromFile(fileData.getFilePath());

            this.areaanalisis.append(procesos.buildStringWithInfo(info, fileData.getFileName(), fileData.getFilePath()));

            this.panelanalisis.setVisible(true);
            this.panelaccanalisis.setVisible(true);
            this.panelcalculos.setVisible(true);
            this.panelerrores.setVisible(true);
            llenarLineasCSV();

            if (info != null) {
                nombresMicroservicios.add(info.getClassName());    // Nombre del microservicio
                granularidades.add(info.getGranularity());         // Obtener Granularidad
                cohesiones.add(info.getCohesion());               // Obtener Cohesión
                complejidades.add(info.getComplexity());           // Obtener Complejidad
                lcoms.add(info.getLcom());                        // Obtener LCOM
                noos.add(info.getNoo());                          // Obtener NOO
                sgms.add(info.getSgm());                          // Obtener SGM
            }
        }

        pack();
        this.setLocationRelativeTo(null);
    }

    private void llenarLineasCSV() {
        List<String[]> csvLines = procesos.getLineasCSV();

        if(csvLines.isEmpty()) {
            System.out.println("Lista de cadenas vacía");
        } else {
            cadenasCSV.addAll(csvLines);
        }
    }

    private void btncalcularActionPerformed() {
        abrirVentanaConTabla(nombresMicroservicios,
                granularidades,
                cohesiones,
                complejidades,
                lcoms,
                noos,
                sgms);
    }

    private void btnerroresActionPerformed() {
        FilesWErrors filesWErrors = new FilesWErrors(procesos.getFilesWErrors());
        maindesktop.add(filesWErrors);
        filesWErrors.setVisible(true);
    }

    private void btnguardarexcelActionPerformed() {
        if(cadenasCSV.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "El archivo csv no puede estar vacío",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Guardar archivo como...");
            fileChooser.setFileFilter(new FileNameExtensionFilter(
                    "Archivo de valores separados por comas (.csv)", ".csv"));

            while (true) {
                int opc = fileChooser.showSaveDialog(null);

                if(opc == JFileChooser.APPROVE_OPTION) {
                    File archivo = fileChooser.getSelectedFile();
                    String path = archivo.getAbsolutePath();
                    if(!path.endsWith(".csv")) {
                        path += ".csv";
                    }

                    File file = new File(path);
                    if (file.exists()) {
                        int response = JOptionPane.showConfirmDialog(this,
                                "El archivo ya existe. ¿Deseas reemplazarlo?",
                                "Confirmar reemplazo",
                                JOptionPane.YES_NO_OPTION,
                                JOptionPane.WARNING_MESSAGE);
                        if (response == JOptionPane.NO_OPTION) {
                            continue;
                        }
                    }

                    try(OutputStreamWriter osw = new OutputStreamWriter(
                            new FileOutputStream(path), StandardCharsets.UTF_8
                    ); BufferedWriter writer = new BufferedWriter(osw)) {

                        writer.write("\uFEFF");

                        for(String[] linea : cadenasCSV) {
                            writer.write(String.join(",", linea));
                            writer.newLine();
                        }
                        JOptionPane.showMessageDialog(
                                this,
                                "Archivo " + path + " guardado", "Hecho",
                                JOptionPane.INFORMATION_MESSAGE
                        );
                    }catch (IOException e) {
                        JOptionPane.showMessageDialog(
                                this,
                                "No se pudo crear el archivo " + path,
                                "Error", JOptionPane.ERROR_MESSAGE
                        );
                        System.out.println(e.getMessage());
                    }
                    break;
                } else {
                    break;
                }
            }
        }
    }

    private void btnguardartxtActionPerformed() {}

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    private JMenuItem abrirarchivo;
    private JMenuItem abrircarpeta;
    private JTree arboldir;
    private JTextArea areaanalisis;
    private JTextArea areavista;
    private JButton btnanalizar;
    private JButton btnerrores;
    private JButton btnguardarexcel;
    private JButton btnguardartxt;
    private JButton btnlimpiar;
    private JButton btncalcular;
    private JLabel jLabel1;
    private JMenuBar jMenuBar1;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JScrollPane jScrollPane3;
    private JDesktopPane maindesktop;
    private JMenu menuacercade;
    private JMenu menuarchivo;
    private JPanel panelaccanalisis;
    private JPanel panelcalculos;
    private JPanel panelacciones;
    private JPanel panelanalisis;
    private JPanel panelerrores;
    private JPanel panelruta;
    private JPanel panelvista;
    private JLabel rutalabel;
    private JPanel treepanel;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
}