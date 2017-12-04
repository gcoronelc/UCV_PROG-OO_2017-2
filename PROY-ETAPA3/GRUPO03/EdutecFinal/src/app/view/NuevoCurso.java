/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.view;

import app.controller.CursoNuevoController;
import java.util.List;
import app.model.Curso;
import java.util.Map;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CBrayan
 */
public class NuevoCurso extends javax.swing.JPanel {

    /**
     * Creates new form CursoN
     */
    public NuevoCurso() {
        initComponents();
        tarifas();
        cursos();
    }
    public void cursos(){
        CursoNuevoController service = new CursoNuevoController();
        List<Map<String, Object>> cursos = service.cursos();
        DefaultTableModel tabla;
        tabla = (DefaultTableModel) tblCursos.getModel();
        tabla.setRowCount(0);
        for(Map<String, Object> r : cursos){
            Object[] rowData = {
                r.get("codigo"),
                r.get("tarifa"),
                r.get("nombre"),
            };
              tabla.addRow(rowData);     
        }

    }
    public void tarifas() {
        CursoNuevoController conroller = new CursoNuevoController();
        cboTarifa.removeAllItems();
        List<String> codigos = conroller.tarifa();
        for (String s : codigos) {
            cboTarifa.addItem(s);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCursos = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        txtNombreC = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboTarifa = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(153, 153, 255));

        tblCursos.setBackground(new java.awt.Color(204, 204, 255));
        tblCursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CÓDIGO", "TARIFA", "NOMBRE CURSO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCursos);

        btnBuscar.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        btnBuscar.setText("REGISTRAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtNombreC.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        jLabel1.setText("TARIFA:");

        jLabel2.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        jLabel2.setText("NOMBRE CURSO:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 982, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cboTarifa, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(cboTarifa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    private Curso datoAlumno() {
        String tarifa = cboTarifa.getSelectedItem().toString();
        Curso curso = new Curso("QUE TE IMPORTA", tarifa, txtNombreC.getText());
        return curso;
    }
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            Curso curso = datoAlumno();
            CursoNuevoController controller = new CursoNuevoController();
            controller.reistrarAlumno(curso);
            String reporte = "CÓDIGO: " + curso.getCodigo();
            cursos();
            JOptionPane.showMessageDialog(this, reporte, "ALUMNO REGISTRADO", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "ERROR", JOptionPane.ERROR);
        }
        limpiar();
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<String> cboTarifa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCursos;
    private javax.swing.JTextField txtNombreC;
    // End of variables declaration//GEN-END:variables
}
