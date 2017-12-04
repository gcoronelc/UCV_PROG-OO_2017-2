package view;

import java.util.List;
import java.util.Map;
import service.ProfesorService;

public class ConsultarProfesor extends javax.swing.JInternalFrame {

    public ConsultarProfesor() {
        initComponents();
    }

    private void llenarCodProfe() {

        // Obtener periodos
        ProfesorService service = new ProfesorService();
        java.util.List<String> codProfesor = service.leerCodigoProfesor();

        // llenar el combo
        cboCodProfesor.removeAllItems();
        for (String s : codProfesor) {
            cboCodProfesor.addItem(s);
        }
        cboCodProfesor.setSelectedIndex(-1);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cboCodProfesor = new javax.swing.JComboBox<>();
        btnConsultar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaRes = new javax.swing.JTextArea();
        btnLlenar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consulta de Profesores");

        cboCodProfesor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cboCodProfesor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboCodProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCodProfesorActionPerformed(evt);
            }
        });

        btnConsultar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Codigo del Profesor:");

        txaRes.setColumns(20);
        txaRes.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        txaRes.setRows(5);
        jScrollPane1.setViewportView(txaRes);

        btnLlenar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLlenar.setText("LLenar ");
        btnLlenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLlenarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(cboCodProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addComponent(btnLlenar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLlenar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cboCodProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboCodProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCodProfesorActionPerformed
        // Verificar periodo seleccionado
        int index = cboCodProfesor.getSelectedIndex();
        if (index == -1) {
            return;
        }
        // Obtener periodo seleccionado
        String codigo = cboCodProfesor.getSelectedItem().toString();

    }//GEN-LAST:event_cboCodProfesorActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // Dato
        String codigo = cboCodProfesor.getSelectedItem().toString();
        
        ProfesorService service = new ProfesorService();
        List<Map<String, Object>> lista = service.mostrarDatosProfesor(codigo);
        // Reporte
        for (Map<String, Object> r : lista) {
            String fila = "";
            fila += r.get("idprofesor") + "\t";
            fila += r.get("apeprofesor") + "\t";
            fila += r.get("nomprofesor") + "\t";
            fila += r.get("dirprofesor") + "\t";
            fila += r.get("telprofesor") + "\t";
            fila += r.get("emailprofesor");
            
            String mensaje = "ID \t APELLIDO \t NOMBRE \t DIRECCIÓN \t TELEFONO \t EMAIL \n";
            txaRes.setText(mensaje + fila);
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnLlenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLlenarActionPerformed
        llenarCodProfe();
    }//GEN-LAST:event_btnLlenarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnLlenar;
    private javax.swing.JComboBox<String> cboCodProfesor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txaRes;
    // End of variables declaration//GEN-END:variables
}
