package view;

import icon.ImagenFondo;
import java.awt.Dimension;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import model.Empleado;
import util.Session;

public class MainView extends javax.swing.JFrame {

    public MainView() {
        initComponents();
        establecerTitulo();
        desktopPane.setBorder(new ImagenFondo());
        this.setExtendedState(MainView.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        menuArchivoSalir = new javax.swing.JMenuItem();
        menuConsultar = new javax.swing.JMenu();
        menuConsultarCiclo = new javax.swing.JMenuItem();
        menuConsultarProfesor = new javax.swing.JMenuItem();
        menuConsultarAlumno = new javax.swing.JMenuItem();
        menuConsultarTarifa = new javax.swing.JMenuItem();
        menuTransferencia = new javax.swing.JMenu();
        menuRegistrarAlumno = new javax.swing.JMenuItem();
        menuRegistrarCiclo = new javax.swing.JMenuItem();
        menuRegistrarProfesor = new javax.swing.JMenuItem();
        menuRegistrarEmpleado = new javax.swing.JMenuItem();
        menuRegistrarTarifa = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setBackground(new java.awt.Color(51, 51, 51));
        desktopPane.setForeground(new java.awt.Color(51, 51, 51));
        desktopPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        menuBar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        menuArchivo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        menuArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/archivo.png"))); // NOI18N
        menuArchivo.setText("Archivo");

        menuArchivoSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        menuArchivoSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/salida.png"))); // NOI18N
        menuArchivoSalir.setText("Salir");
        menuArchivoSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuArchivoSalirActionPerformed(evt);
            }
        });
        menuArchivo.add(menuArchivoSalir);

        menuBar.add(menuArchivo);

        menuConsultar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        menuConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/consultaII.png"))); // NOI18N
        menuConsultar.setText("Consultas");

        menuConsultarCiclo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/consulta.png"))); // NOI18N
        menuConsultarCiclo.setText("Consultar Ciclo");
        menuConsultarCiclo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultarCicloActionPerformed(evt);
            }
        });
        menuConsultar.add(menuConsultarCiclo);

        menuConsultarProfesor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/consulta.png"))); // NOI18N
        menuConsultarProfesor.setText("Consultar Profesor");
        menuConsultarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultarProfesorActionPerformed(evt);
            }
        });
        menuConsultar.add(menuConsultarProfesor);

        menuConsultarAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/consulta.png"))); // NOI18N
        menuConsultarAlumno.setText("Consultar Alumno");
        menuConsultarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultarAlumnoActionPerformed(evt);
            }
        });
        menuConsultar.add(menuConsultarAlumno);

        menuConsultarTarifa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/consulta.png"))); // NOI18N
        menuConsultarTarifa.setText("Consultar Tarifa");
        menuConsultarTarifa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultarTarifaActionPerformed(evt);
            }
        });
        menuConsultar.add(menuConsultarTarifa);

        menuBar.add(menuConsultar);

        menuTransferencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        menuTransferencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/transferencia.png"))); // NOI18N
        menuTransferencia.setText("Transferencia");

        menuRegistrarAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/registrar.png"))); // NOI18N
        menuRegistrarAlumno.setText("Registrar Alumno");
        menuRegistrarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegistrarAlumnoActionPerformed(evt);
            }
        });
        menuTransferencia.add(menuRegistrarAlumno);

        menuRegistrarCiclo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/registrar.png"))); // NOI18N
        menuRegistrarCiclo.setText("Registrar Ciclo");
        menuRegistrarCiclo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegistrarCicloActionPerformed(evt);
            }
        });
        menuTransferencia.add(menuRegistrarCiclo);

        menuRegistrarProfesor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/registrar.png"))); // NOI18N
        menuRegistrarProfesor.setText("Registrar Profesor");
        menuRegistrarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegistrarProfesorActionPerformed(evt);
            }
        });
        menuTransferencia.add(menuRegistrarProfesor);

        menuRegistrarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/registrar.png"))); // NOI18N
        menuRegistrarEmpleado.setText("Registrar Empleado");
        menuRegistrarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegistrarEmpleadoActionPerformed(evt);
            }
        });
        menuTransferencia.add(menuRegistrarEmpleado);

        menuRegistrarTarifa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/registrar.png"))); // NOI18N
        menuRegistrarTarifa.setText("Registrar Tarifa");
        menuRegistrarTarifa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegistrarTarifaActionPerformed(evt);
            }
        });
        menuTransferencia.add(menuRegistrarTarifa);

        menuBar.add(menuTransferencia);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 878, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
      private void establecerTitulo() {
        Empleado bean = (Empleado) Session.get("usuario");
        String titulo = "EDUTEC APP [Usuario: ";
        titulo += bean.getApellido() + ", ";
        titulo += bean.getNombre() + "]";
        this.setTitle(titulo);
    }

  private void menuArchivoSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArchivoSalirActionPerformed
      String mensaje = "Izabo Rosario, Alvares H. \nYassel Aracely, Huaman F.";
      JOptionPane.showMessageDialog(this, mensaje,
              "AUTORES: ", JOptionPane.INFORMATION_MESSAGE);
      System.exit(0);
  }//GEN-LAST:event_menuArchivoSalirActionPerformed

  private void menuRegistrarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegistrarAlumnoActionPerformed
      JInternalFrame view = new RegistrarAlumnoView();
      desktopPane.add(view);
      view.setVisible(true);
      Dimension desktopSize = desktopPane.getSize();
      Dimension FrameSize = view.getSize();
      view.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
      view.show();

  }//GEN-LAST:event_menuRegistrarAlumnoActionPerformed

  private void menuRegistrarCicloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegistrarCicloActionPerformed
      JInternalFrame view = new RegistrarCicloView();
      desktopPane.add(view);
      view.setVisible(true);
      Dimension desktopSize = desktopPane.getSize();
      Dimension FrameSize = view.getSize();
      view.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
      view.show();
  }//GEN-LAST:event_menuRegistrarCicloActionPerformed

    private void menuConsultarCicloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultarCicloActionPerformed
        JInternalFrame view = new ConsultarCicloView();
        desktopPane.add(view);
        view.setVisible(true);
        Dimension desktopSize = desktopPane.getSize();
        Dimension FrameSize = view.getSize();
        view.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        view.show();
    }//GEN-LAST:event_menuConsultarCicloActionPerformed

    private void menuConsultarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultarProfesorActionPerformed
        JInternalFrame view = new ConsultarProfesor();
        desktopPane.add(view);
        view.setVisible(true);
        Dimension desktopSize = desktopPane.getSize();
        Dimension FrameSize = view.getSize();
        view.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        view.show();
    }//GEN-LAST:event_menuConsultarProfesorActionPerformed

    private void menuConsultarTarifaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultarTarifaActionPerformed
        JInternalFrame view = new ConsultarTarifa();
        desktopPane.add(view);
        view.setVisible(true);
        Dimension desktopSize = desktopPane.getSize();
        Dimension FrameSize = view.getSize();
        view.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        view.show();
    }//GEN-LAST:event_menuConsultarTarifaActionPerformed

    private void menuConsultarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultarAlumnoActionPerformed
        JInternalFrame view = new ConsultarAlumno();
        desktopPane.add(view);
        view.setVisible(true);
        Dimension desktopSize = desktopPane.getSize();
        Dimension FrameSize = view.getSize();
        view.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        view.show();
    }//GEN-LAST:event_menuConsultarAlumnoActionPerformed

    private void menuRegistrarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegistrarProfesorActionPerformed
        JInternalFrame view = new RegistrarProfesor();
        desktopPane.add(view);
        view.setVisible(true);
        Dimension desktopSize = desktopPane.getSize();
        Dimension FrameSize = view.getSize();
        view.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        view.show();
    }//GEN-LAST:event_menuRegistrarProfesorActionPerformed

    private void menuRegistrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegistrarEmpleadoActionPerformed
        JInternalFrame view = new RegistrarEmpleado();
        desktopPane.add(view);
        view.setVisible(true);
        Dimension desktopSize = desktopPane.getSize();
        Dimension FrameSize = view.getSize();
        view.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        view.show();
    }//GEN-LAST:event_menuRegistrarEmpleadoActionPerformed

    private void menuRegistrarTarifaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegistrarTarifaActionPerformed
        JInternalFrame view = new RegistrarTarifa();
        desktopPane.add(view);
        view.setVisible(true);
        Dimension desktopSize = desktopPane.getSize();
        Dimension FrameSize = view.getSize();
        view.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        view.show();
    }//GEN-LAST:event_menuRegistrarTarifaActionPerformed

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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenuItem menuArchivoSalir;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuConsultar;
    private javax.swing.JMenuItem menuConsultarAlumno;
    private javax.swing.JMenuItem menuConsultarCiclo;
    private javax.swing.JMenuItem menuConsultarProfesor;
    private javax.swing.JMenuItem menuConsultarTarifa;
    private javax.swing.JMenuItem menuRegistrarAlumno;
    private javax.swing.JMenuItem menuRegistrarCiclo;
    private javax.swing.JMenuItem menuRegistrarEmpleado;
    private javax.swing.JMenuItem menuRegistrarProfesor;
    private javax.swing.JMenuItem menuRegistrarTarifa;
    private javax.swing.JMenu menuTransferencia;
    // End of variables declaration//GEN-END:variables

}
