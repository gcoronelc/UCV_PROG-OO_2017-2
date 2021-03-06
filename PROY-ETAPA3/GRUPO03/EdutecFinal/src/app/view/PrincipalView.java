
package app.view;

import app.model.Empleado;
import app.util.Session;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.PopupMenu;

/**
 *
 * @author Chino
 */
public class PrincipalView extends javax.swing.JFrame {

    private String[] args;

    /**
     * Creates new form PRUEBA
     */
    public PrincipalView() {
        initComponents();
        this.setTitle("PRINCIPAL");
        this.setLocationRelativeTo(null);
    
        establecerTitulo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileCUsuario = new javax.swing.JMenu();
        fileCambiarUsuario = new javax.swing.JMenuItem();
        fileSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        fileMAlumnos = new javax.swing.JMenuItem();
        fileMProfesores = new javax.swing.JMenuItem();
        Nuevo = new javax.swing.JMenu();
        fileNuevoC = new javax.swing.JMenuItem();
        fileNCursoN = new javax.swing.JMenu();
        NuevoC = new javax.swing.JMenuItem();
        fileProgramados = new javax.swing.JMenuItem();
        fileRAlumnos = new javax.swing.JMenu();
        fileAlumno = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlMenu.setBackground(new java.awt.Color(153, 217, 236));
        pnlMenu.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bienvenidos-2.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Principal2.jpg"))); // NOI18N

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 122, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(20, 20, 20))
        );

        fileCUsuario.setText("Elección");

        fileCambiarUsuario.setText("Cambiar de Usuario");
        fileCambiarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileCambiarUsuarioActionPerformed(evt);
            }
        });
        fileCUsuario.add(fileCambiarUsuario);

        fileSalir.setText("Salir");
        fileSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileSalirActionPerformed(evt);
            }
        });
        fileCUsuario.add(fileSalir);

        jMenuBar1.add(fileCUsuario);

        jMenu2.setText("Ver");

        fileMAlumnos.setText("Alumnos");
        fileMAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileMAlumnosActionPerformed(evt);
            }
        });
        jMenu2.add(fileMAlumnos);

        fileMProfesores.setText("Profesor");
        fileMProfesores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileMProfesoresActionPerformed(evt);
            }
        });
        jMenu2.add(fileMProfesores);

        jMenuBar1.add(jMenu2);

        Nuevo.setText("Ciclo");

        fileNuevoC.setText("Nuevo Ciclo");
        fileNuevoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileNuevoCActionPerformed(evt);
            }
        });
        Nuevo.add(fileNuevoC);

        jMenuBar1.add(Nuevo);

        fileNCursoN.setText("Curso");

        NuevoC.setText("Nuevo Curso");
        NuevoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoCActionPerformed(evt);
            }
        });
        fileNCursoN.add(NuevoC);

        fileProgramados.setText("Curso Programados");
        fileProgramados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileProgramadosActionPerformed(evt);
            }
        });
        fileNCursoN.add(fileProgramados);

        jMenuBar1.add(fileNCursoN);

        fileRAlumnos.setText("Registrar");

        fileAlumno.setText("Alumno");
        fileAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileAlumnoActionPerformed(evt);
            }
        });
        fileRAlumnos.add(fileAlumno);

        jMenuBar1.add(fileRAlumnos);

        jMenu3.setText("Matricula");

        jMenuItem4.setText("Info");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void establecerTitulo(){
    Empleado bean = (Empleado) Session.get("usuario");
    String titulo =  "SANG  [Usuario: ";
    titulo += bean.getApellido() + ", ";
    titulo += bean.getNombre() + "]";
    this.setTitle(titulo);
  }
  
    private void fileCambiarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileCambiarUsuarioActionPerformed
        this.dispose();
        AccesoSistemaView.main(args);
    }//GEN-LAST:event_fileCambiarUsuarioActionPerformed

    private void fileAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileAlumnoActionPerformed
        RegistroAlumno rga = new RegistroAlumno();
        rga.setSize(pnlMenu.getWidth(),pnlMenu.getHeight());
        rga.setLocation(0, 0);
        pnlMenu.removeAll();
        pnlMenu.add(rga,BorderLayout.CENTER);
        pnlMenu.revalidate();
        pnlMenu.repaint();
        
    }//GEN-LAST:event_fileAlumnoActionPerformed

    private void fileMAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileMAlumnosActionPerformed
        ConsultarAlumno la = new ConsultarAlumno();
        la.setSize(pnlMenu.getWidth(),pnlMenu.getHeight());
        la.setLocation(0, 0);
        pnlMenu.removeAll();
        pnlMenu.add(la,BorderLayout.CENTER);
        pnlMenu.revalidate();
        pnlMenu.repaint();
        
    }//GEN-LAST:event_fileMAlumnosActionPerformed

    private void fileMProfesoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileMProfesoresActionPerformed
        ConsultarProfesor lp = new ConsultarProfesor();
        lp.setSize(pnlMenu.getWidth(),pnlMenu.getHeight());
        lp.setLocation(0, 0);
        pnlMenu.removeAll();
        pnlMenu.add(lp,BorderLayout.CENTER);
        pnlMenu.revalidate();
        pnlMenu.repaint();
    }//GEN-LAST:event_fileMProfesoresActionPerformed

    private void NuevoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoCActionPerformed
        NuevoCurso cn = new NuevoCurso();
        cn.setSize(pnlMenu.getWidth(),pnlMenu.getHeight());
        cn.setLocation(0, 0);
        pnlMenu.removeAll();
        pnlMenu.add(cn,BorderLayout.CENTER);
        pnlMenu.revalidate();
        pnlMenu.repaint();
    }//GEN-LAST:event_NuevoCActionPerformed

    private void fileSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_fileSalirActionPerformed

    private void fileProgramadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileProgramadosActionPerformed
        ConsultarCurso cp = new ConsultarCurso();
        cp.setSize(pnlMenu.getWidth(),pnlMenu.getHeight());
        cp.setLocation(0, 0);
        pnlMenu.removeAll();
        pnlMenu.add(cp,BorderLayout.CENTER);
        pnlMenu.revalidate();
        pnlMenu.repaint();
    }//GEN-LAST:event_fileProgramadosActionPerformed

    private void fileNuevoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileNuevoCActionPerformed
        NuevoCiclo cn = new NuevoCiclo();
        cn.setSize(pnlMenu.getWidth(),pnlMenu.getHeight());
        cn.setLocation(0, 0);
        pnlMenu.removeAll();
        pnlMenu.add(cn,BorderLayout.CENTER);
        pnlMenu.revalidate();
        pnlMenu.repaint();
    }//GEN-LAST:event_fileNuevoCActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        Matricula mt = new Matricula();
        mt.setSize(pnlMenu.getWidth(),pnlMenu.getHeight());
        mt.setLocation(0, 0);
        pnlMenu.removeAll();
        pnlMenu.add(mt,BorderLayout.CENTER);
        pnlMenu.revalidate();
        pnlMenu.repaint();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Nuevo;
    private javax.swing.JMenuItem NuevoC;
    private javax.swing.JMenuItem fileAlumno;
    private javax.swing.JMenu fileCUsuario;
    private javax.swing.JMenuItem fileCambiarUsuario;
    private javax.swing.JMenuItem fileMAlumnos;
    private javax.swing.JMenuItem fileMProfesores;
    private javax.swing.JMenu fileNCursoN;
    private javax.swing.JMenuItem fileNuevoC;
    private javax.swing.JMenuItem fileProgramados;
    private javax.swing.JMenu fileRAlumnos;
    private javax.swing.JMenuItem fileSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    public static javax.swing.JPanel pnlMenu;
    // End of variables declaration//GEN-END:variables
}
