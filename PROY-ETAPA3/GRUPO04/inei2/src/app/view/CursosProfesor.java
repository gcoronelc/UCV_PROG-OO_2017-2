/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.view;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import app.service.ProgCursosService;
import javax.swing.table.DefaultTableModel;
import app.controller.ProgCursoController;

/**
 *
 * @author CBrayan
 */
public class CursosProfesor extends javax.swing.JPanel {

    /**
     * Creates new form CursosR
     */
    public CursosProfesor() {
        initComponents();
        ciclo();
    }
    public void ciclo(){
        ProgCursoController controller = new ProgCursoController();
        cboNombreCurso.removeAllItems();
        List<String> codigos = controller.leerCurso();
        for(String s : codigos)
        cboNombreCurso.addItem(s);
       
    }
    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblRepo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        cboNombreCurso = new javax.swing.JComboBox<>();

        tblRepo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CÓDIGO", "CURSO", "CICLO", "CÓDIGO PROFESOR", "PROFESOR", "VACANTES", "MATRICULADOS", "HORARIO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRepo);

        jLabel1.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        jLabel1.setText("NOMBRE CURSO:");

        btnBuscar.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 982, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cboNombreCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnBuscar)
                    .addComponent(cboNombreCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        String nombreCurso = cboNombreCurso.getSelectedItem().toString();
        ProgCursoController controller = new ProgCursoController();
        List<Map<String, Object>> list;
        list = controller.cursosProgramados(nombreCurso);
        DefaultTableModel tabla;
        tabla = (DefaultTableModel) tblRepo.getModel();
        tabla.setRowCount(0);
         for (Map<String, Object> r : list) {
            Object[] rowData = {
                r.get("codigo"),
                r.get("curso"),
                r.get("ciclo"),
                r.get("codigopro"),
                r.get("profesor"),
                r.get("vacantes"),
                r.get("matriculados"),
                r.get("horario"),
               
            };
            tabla.addRow(rowData);
        }
        
 
        
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<String> cboNombreCurso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRepo;
    // End of variables declaration//GEN-END:variables
}
