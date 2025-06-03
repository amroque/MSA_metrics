package org.cenidet;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class FilesWErrors extends javax.swing.JInternalFrame {

    public FilesWErrors(String errors) {
        initComponents();
        this.setTitle("Archivos con errores");
        this.copiado.setVisible(false);
        this.areaerrores.setEditable(false);
        if(errors.isBlank()) {
            this.btncopiar.setEnabled(false);
            this.areaerrores.setText("No hay archivos con errores");
        }
        else
            this.areaerrores.setText(errors);
    }

    private void initComponents() {

        panelerrores = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaerrores = new javax.swing.JTextArea();
        btncopiar = new javax.swing.JButton();
        copiado = new javax.swing.JLabel();

        setClosable(true);

        areaerrores.setColumns(20);
        areaerrores.setRows(5);
        jScrollPane1.setViewportView(areaerrores);

        btncopiar.setText("Copiar al portapapeles");
        btncopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncopiarActionPerformed();
            }
        });

        copiado.setFont(new java.awt.Font("Segoe UI", Font.ITALIC, 12)); // NOI18N
        copiado.setText("Copiado");

        javax.swing.GroupLayout panelerroresLayout = new javax.swing.GroupLayout(panelerrores);
        panelerrores.setLayout(panelerroresLayout);
        panelerroresLayout.setHorizontalGroup(
                panelerroresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelerroresLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelerroresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelerroresLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(copiado)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btncopiar)))
                                .addContainerGap())
        );
        panelerroresLayout.setVerticalGroup(
                panelerroresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelerroresLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelerroresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btncopiar)
                                        .addComponent(copiado))
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(panelerrores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(panelerrores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
    }

    private void btncopiarActionPerformed() {
        String cadena = areaerrores.getText();
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection str = new StringSelection(cadena);

        clip.setContents(str, null);
        this.copiado.setVisible(true);
    }

    private javax.swing.JTextArea areaerrores;
    private javax.swing.JButton btncopiar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelerrores;
    private javax.swing.JLabel copiado;
}
