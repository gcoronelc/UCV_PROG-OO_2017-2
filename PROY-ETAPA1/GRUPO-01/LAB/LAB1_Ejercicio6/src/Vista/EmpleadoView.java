
package Vista;

import Modelo.EmpleadoModelo;
import javax.swing.table.DefaultTableModel;

public class EmpleadoView extends javax.swing.JFrame {
    EmpleadoModelo objModelo;
    public EmpleadoView() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTiempoServ = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApePaterno = new javax.swing.JTextField();
        cbxArea = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtNumerHijos = new javax.swing.JTextField();
        cbxCondicion = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtApeMaterno = new javax.swing.JTextField();
        txtSueldoBase = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        btnOpc1 = new javax.swing.JButton();
        btnOpc5 = new javax.swing.JButton();
        btnOpc2 = new javax.swing.JButton();
        btnOpc3 = new javax.swing.JButton();
        btnOpc4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaRes = new javax.swing.JTextArea();
        btnRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel2.setText("Apellido Paterno:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 51, -1, -1));

        jLabel3.setText("Apellido Materno:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 83, -1, -1));

        jLabel4.setText("Area:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 115, -1, -1));

        jLabel5.setText("Sueldo Base:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, -1, -1));

        jLabel6.setText("Tiempo de Servicio: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        jLabel7.setText("Condición:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, -1));

        txtTiempoServ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTiempoServActionPerformed(evt);
            }
        });
        getContentPane().add(txtTiempoServ, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 40, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 90, -1));

        txtApePaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApePaternoActionPerformed(evt);
            }
        });
        getContentPane().add(txtApePaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 90, -1));

        cbxArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Planificación", "Ventas ", "Marketing" }));
        cbxArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxAreaActionPerformed(evt);
            }
        });
        getContentPane().add(cbxArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        jLabel8.setText("Años");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

        txtNumerHijos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumerHijosActionPerformed(evt);
            }
        });
        getContentPane().add(txtNumerHijos, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 90, -1));

        cbxCondicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Contratado", "Estable" }));
        getContentPane().add(cbxCondicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, -1, -1));

        jLabel9.setText("N# de Hijos:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, -1, -1));

        txtApeMaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApeMaternoActionPerformed(evt);
            }
        });
        getContentPane().add(txtApeMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 90, -1));

        txtSueldoBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSueldoBaseActionPerformed(evt);
            }
        });
        getContentPane().add(txtSueldoBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 90, -1));

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "ApellidoPaterno", "ApellidoMaterno", "Area", "Tiempo de Servicio", "Condición", "Sueldo Base", "Asignacion de Movilidad", "N# de hijos", "desc. de AFP", "sueldo Final"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDatos);
        if (tblDatos.getColumnModel().getColumnCount() > 0) {
            tblDatos.getColumnModel().getColumn(0).setResizable(false);
            tblDatos.getColumnModel().getColumn(1).setResizable(false);
            tblDatos.getColumnModel().getColumn(2).setResizable(false);
            tblDatos.getColumnModel().getColumn(3).setResizable(false);
            tblDatos.getColumnModel().getColumn(4).setResizable(false);
            tblDatos.getColumnModel().getColumn(5).setResizable(false);
            tblDatos.getColumnModel().getColumn(6).setResizable(false);
            tblDatos.getColumnModel().getColumn(7).setResizable(false);
            tblDatos.getColumnModel().getColumn(8).setResizable(false);
            tblDatos.getColumnModel().getColumn(9).setResizable(false);
            tblDatos.getColumnModel().getColumn(10).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 460, 140));

        btnOpc1.setText("Opcion 1");
        btnOpc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpc1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnOpc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        btnOpc5.setText("Opcion 5");
        btnOpc5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpc5ActionPerformed(evt);
            }
        });
        getContentPane().add(btnOpc5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        btnOpc2.setText("Opcion 2");
        btnOpc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpc2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnOpc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        btnOpc3.setText("Opcion 3");
        btnOpc3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpc3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnOpc3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        btnOpc4.setText("Opcion 4");
        btnOpc4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpc4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnOpc4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        txaRes.setColumns(20);
        txaRes.setRows(5);
        jScrollPane2.setViewportView(txaRes);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 330, 130));

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTiempoServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTiempoServActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTiempoServActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApePaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApePaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApePaternoActionPerformed

    private void txtNumerHijosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumerHijosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumerHijosActionPerformed

    private void txtApeMaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApeMaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApeMaternoActionPerformed

    private void txtSueldoBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSueldoBaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSueldoBaseActionPerformed

    private void btnOpc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpc2ActionPerformed
        // Promedio de Salarios de los empleados contratados del área de Marketing.
    }//GEN-LAST:event_btnOpc2ActionPerformed

    private void btnOpc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpc1ActionPerformed
        // Nombre del empleado que tenga el menor sueldo final que sea del área de Ventas que
        //tengan entre 2 y 10 años de Servicio.
//         String nombre=txtNombre.getText().toUpperCase();
//         String area = cbxArea.getSelectedItem().toString();
//         int tiempoServi=Integer.parseInt(txtTiempoServ.getText());
//         
//         int total=0;
//       int totalMin[];
//        totalMin=new int[0];
            if (objModelo.getSueldoFinal()<198)
             if (objModelo.getArea().equals("Ventas"))
                 if(objModelo.getTiempoServicio()>=2 && objModelo.getTiempoServicio()>=10)
        
         txaRes.append("\nNombre ->  " + objModelo.getNombre());
    }//GEN-LAST:event_btnOpc1ActionPerformed

    private void btnOpc3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpc3ActionPerformed
        // Número de empleados estables que ganan más de S/.2500 y menos de S/ 3500 con más
        //de 5 años de servicio y con más de 3 hijos.
    }//GEN-LAST:event_btnOpc3ActionPerformed

    private void btnOpc4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpc4ActionPerformed
        //Porcentaje de empleados estables del área de Marketing con sueldo menores a S/. 1200
        // y asignación de movilidad superior a 60 soles
    }//GEN-LAST:event_btnOpc4ActionPerformed

    private void btnOpc5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpc5ActionPerformed
        // Área que tiene el empleado estable con el mayor tiempo de servicio sin hijos.
    }//GEN-LAST:event_btnOpc5ActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
       String nombre=txtNombre.getText().toUpperCase();
       String apeMaterno=txtApeMaterno.getText().toUpperCase();
       String apePaterno=txtApePaterno.getText().toUpperCase();
       String area = cbxArea.getSelectedItem().toString();
       int tiempoServi=Integer.parseInt(txtTiempoServ.getText());
       String condicion = cbxCondicion.getSelectedItem().toString();
       double sueldobase = Double.parseDouble(txtSueldoBase.getText());
       int numHijos=Integer.parseInt(txtNumerHijos.getText());
    
    // Proceso
//    VentaController control;
//    control = new VentaController();
//    Item[] repo = control.procesar(tipo, total);
    
    // Reporte
    // Mostrar el reporte en la tabla
    DefaultTableModel tabla;
    tabla = (DefaultTableModel) tblDatos.getModel();
    tabla.setRowCount(0);
//    for (Item item : repo) {
      Object[] rowData = {nombre,apePaterno,apeMaterno,area,tiempoServi,condicion,sueldobase,numHijos};
      tabla.addRow(rowData);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void cbxAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxAreaActionPerformed

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
            java.util.logging.Logger.getLogger(EmpleadoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmpleadoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmpleadoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmpleadoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmpleadoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOpc1;
    private javax.swing.JButton btnOpc2;
    private javax.swing.JButton btnOpc3;
    private javax.swing.JButton btnOpc4;
    private javax.swing.JButton btnOpc5;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbxArea;
    private javax.swing.JComboBox<String> cbxCondicion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextArea txaRes;
    private javax.swing.JTextField txtApeMaterno;
    private javax.swing.JTextField txtApePaterno;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumerHijos;
    private javax.swing.JTextField txtSueldoBase;
    private javax.swing.JTextField txtTiempoServ;
    // End of variables declaration//GEN-END:variables
}
