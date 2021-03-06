
package view;

import java.util.List;
import java.util.Map;
import javax.swing.table.DefaultTableModel;
import service.CursoService;

public class ConsultarCicloView extends javax.swing.JInternalFrame {

    public ConsultarCicloView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCiclo = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRepo = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consultar Ciclo");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Ciclo:");

        txtCiclo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        btnConsultar.setBackground(new java.awt.Color(255, 153, 255));
        btnConsultar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnConsultar.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultar.setText("Consultar");
        btnConsultar.setOpaque(false);
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        tblRepo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "periodo", "ciclo", "cursoprog", "curso", "nomcurso", "horario", "tarifa", "nomtarifa", "precio", "pagohora", "horas", "vacantes", "matriculados", "ingresos", "pagoprofesor", "profesor", "nomprofesor", "activo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRepo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(txtCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(277, 277, 277))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 974, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed

        // Dato
        String ciclo = txtCiclo.getText();

        // Proceso
        CursoService service = new CursoService();
        List<Map<String, Object>> lista;
        lista = service.conCursosProfesor(ciclo);

        // Cargar datos en la tabla
        DefaultTableModel tabla;
        tabla = (DefaultTableModel) tblRepo.getModel();
        tabla.setRowCount(0);
        for (Map<String, Object> r : lista) {
            Object[] rowData = {
                r.get("periodo"),
                r.get("ciclo"),
                r.get("cursoprog"),
                r.get("curso"),
                r.get("nomcurso"),
                r.get("horario"),
                r.get("tarifa"),
                r.get("nomtarifa"),
                r.get("precio"),
                r.get("pagohora"),
                r.get("horas"),
                r.get("vacantes"),
                r.get("matriculados"),
                r.get("ingresos"),
                r.get("pagoprofesor"),
                r.get("profesor"),
                r.get("nomprofesor"),
                r.get("activo"),
            };
            tabla.addRow(rowData);
        }
    }//GEN-LAST:event_btnConsultarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRepo;
    private javax.swing.JTextField txtCiclo;
    // End of variables declaration//GEN-END:variables
}
