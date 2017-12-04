package pe.egcc.app12.view;

import javax.swing.JInternalFrame;
import pe.egcc.app12.model.Empleado;
import pe.egcc.app12.util.Session;

public class MainView extends javax.swing.JFrame {

  public MainView() {
    initComponents();
    establecerTitulo();
  }
  
  private void establecerTitulo(){
    Empleado bean = (Empleado) Session.get("usuario");
    String titulo =  "EDUTEC APP [Usuario: ";
    titulo += bean.getApellido() + ", ";
    titulo += bean.getNombre() + "]";
    this.setTitle(titulo);
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        menuArchivoSalir = new javax.swing.JMenuItem();
        menuProcesos = new javax.swing.JMenu();
        menuProcesosGenerarCiclo = new javax.swing.JMenuItem();
        menuAlumno = new javax.swing.JMenu();
        menuAlumnoConsultar = new javax.swing.JMenuItem();
        menuAlumnoCrear = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuArchivo.setText("Archivo");

        menuArchivoSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        menuArchivoSalir.setText("Salir");
        menuArchivoSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuArchivoSalirActionPerformed(evt);
            }
        });
        menuArchivo.add(menuArchivoSalir);

        menuBar.add(menuArchivo);

        menuProcesos.setText("Procesos");

        menuProcesosGenerarCiclo.setText("Generar Ciclo");
        menuProcesosGenerarCiclo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProcesosGenerarCicloActionPerformed(evt);
            }
        });
        menuProcesos.add(menuProcesosGenerarCiclo);

        menuBar.add(menuProcesos);

        menuAlumno.setText("Alumno");

        menuAlumnoConsultar.setText("Consultar");
        menuAlumnoConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAlumnoConsultarActionPerformed(evt);
            }
        });
        menuAlumno.add(menuAlumnoConsultar);

        menuAlumnoCrear.setText("Crear");
        menuAlumnoCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAlumnoCrearActionPerformed(evt);
            }
        });
        menuAlumno.add(menuAlumnoCrear);

        menuBar.add(menuAlumno);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  private void menuArchivoSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArchivoSalirActionPerformed
    System.exit(0);
  }//GEN-LAST:event_menuArchivoSalirActionPerformed

  private void menuAlumnoConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAlumnoConsultarActionPerformed
    JInternalFrame view = new AlumnoConsultarView();
    desktopPane.add(view);
    view.setVisible(true);
  }//GEN-LAST:event_menuAlumnoConsultarActionPerformed

  private void menuAlumnoCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAlumnoCrearActionPerformed
    JInternalFrame view = new AlumnoCrearView();
    desktopPane.add(view);
    view.setVisible(true);
  }//GEN-LAST:event_menuAlumnoCrearActionPerformed

    private void menuProcesosGenerarCicloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProcesosGenerarCicloActionPerformed
        JInternalFrame view = new GenerarNuevoCicloView();
    desktopPane.add(view);
    view.setVisible(true);
    }//GEN-LAST:event_menuProcesosGenerarCicloActionPerformed

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
    private javax.swing.JMenu menuAlumno;
    private javax.swing.JMenuItem menuAlumnoConsultar;
    private javax.swing.JMenuItem menuAlumnoCrear;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenuItem menuArchivoSalir;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuProcesos;
    private javax.swing.JMenuItem menuProcesosGenerarCiclo;
    // End of variables declaration//GEN-END:variables

}
