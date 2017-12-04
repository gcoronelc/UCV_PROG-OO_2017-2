package app.view;

import app.controller.AlumnosController;
import java.awt.Component;
import java.util.List;
import java.util.Map;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author CBrayan
 */
public class ListaAlumno extends javax.swing.JPanel {

    /**
     * Creates new form ListaA
     */
    public ListaAlumno() {
        initComponents();
        alumnos();
    }

    public void alumnos() {
        AlumnosController service = new AlumnosController();
        List<Map<String, Object>> cursos = service.Alumnos();
        DefaultTableModel tabla;
        tabla = (DefaultTableModel) tblAlumnos.getModel();
        tabla.setRowCount(0);
        for (Map<String, Object> r : cursos) {
            Object[] rowData = {
                r.get("codigo"),
                r.get("alumno"),
                r.get("direccion"),
                r.get("telefono"),
                r.get("email"),};
            tabla.addRow(rowData);
        }

    }

    private void limpiar() {
        for (Component c : this.getComponents()) {
            if (c instanceof JTextField) {
                JTextField t = (JTextField) c;
                t.setText("");
            }
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlumnos = new javax.swing.JTable();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jLabel1.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        jLabel1.setText("CÓDIGO ALUMNO:");

        txtCodigo.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N

        btnBuscar.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tblAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CÓDIGO", "ALUMNO", "DIRECCIÓN", "TELEFONO", "EMAIL"
            }
        ));
        jScrollPane1.setViewportView(tblAlumnos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 982, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String codigo = txtCodigo.getText();
        AlumnosController service = new AlumnosController();
        List<Map<String, Object>> cursos = service.Alumnos(codigo);
        DefaultTableModel tabla;
        tabla = (DefaultTableModel) tblAlumnos.getModel();
        tabla.setRowCount(0);
        for (Map<String, Object> r : cursos) {
            Object[] rowData = {
                r.get("codigo"),
                r.get("alumno"),
                r.get("direccion"),
                r.get("telefono"),
                r.get("email"),};
            tabla.addRow(rowData);
        }
                limpiar();
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAlumnos;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables
}
