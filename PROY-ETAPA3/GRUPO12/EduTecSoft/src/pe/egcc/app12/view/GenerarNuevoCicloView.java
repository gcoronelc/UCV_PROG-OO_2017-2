package pe.egcc.app12.view;

import pe.egcc.app12.controller.AppController;
import pe.egcc.app12.service.AppService;


public class GenerarNuevoCicloView extends javax.swing.JInternalFrame {

    public GenerarNuevoCicloView() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblUltimoCiclo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblNuevoCiclo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnLeerUltimoCiclo = new javax.swing.JButton();
        btnGenerarNuevoCiclo = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("GENERAR NUEVO CICLO");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ULTIMO CICLO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(0, 0, 255))); // NOI18N

        lblUltimoCiclo.setBackground(new java.awt.Color(51, 153, 255));
        lblUltimoCiclo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblUltimoCiclo.setForeground(new java.awt.Color(255, 255, 255));
        lblUltimoCiclo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUltimoCiclo.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblUltimoCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUltimoCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NUEVO CICLO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(0, 0, 255))); // NOI18N

        lblNuevoCiclo.setBackground(new java.awt.Color(51, 153, 255));
        lblNuevoCiclo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblNuevoCiclo.setForeground(new java.awt.Color(255, 255, 255));
        lblNuevoCiclo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNuevoCiclo.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblNuevoCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNuevoCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ACCIONES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(0, 0, 255))); // NOI18N

        btnLeerUltimoCiclo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnLeerUltimoCiclo.setText("Leer Ultimo Ciclo");
        btnLeerUltimoCiclo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeerUltimoCicloActionPerformed(evt);
            }
        });

        btnGenerarNuevoCiclo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnGenerarNuevoCiclo.setText("Generar Nuevo Ciclo");
        btnGenerarNuevoCiclo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarNuevoCicloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLeerUltimoCiclo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGenerarNuevoCiclo, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLeerUltimoCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGenerarNuevoCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  private void btnLeerUltimoCicloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeerUltimoCicloActionPerformed
    AppController appController = new AppController();
    String ultimoCiclo = appController.leerUltimoCiclo();
    lblUltimoCiclo.setText(ultimoCiclo);
  }//GEN-LAST:event_btnLeerUltimoCicloActionPerformed

    private void btnGenerarNuevoCicloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarNuevoCicloActionPerformed
        AppService appService = new AppService();
        String ultimoCiclo = appService.leerUltimoCiclo();
        String nuevoCiclo = appService.generarCiclo(ultimoCiclo);
        lblNuevoCiclo.setText(nuevoCiclo);
        
        
    }//GEN-LAST:event_btnGenerarNuevoCicloActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerarNuevoCiclo;
    private javax.swing.JButton btnLeerUltimoCiclo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblNuevoCiclo;
    private javax.swing.JLabel lblUltimoCiclo;
    // End of variables declaration//GEN-END:variables
}
