
package Vista;
import LLamadaApp.LLamadaApp;
import javax.swing.table.DefaultTableModel;
import Modelo.LLamadaModelo;
import Controlador.ArregloLLamada;
import Servicio.LLamadaServicio;

public class LLamadaView extends javax.swing.JFrame {
    LLamadaApp objLLamada;
     ArregloLLamada objArreglo;
    DefaultTableModel miModelo;
    LLamadaModelo objModelo;
    
    public LLamadaView() {
        initComponents();
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMinXLLamada = new javax.swing.JTextField();
        cbxTipoPlan = new javax.swing.JComboBox<>();
        cbxTipoLLamada = new javax.swing.JComboBox<>();
        cbxHorarioLLamada = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        btnMostrar = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaRes = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LLamadaApp");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Tipo de LLamada: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel2.setText("Tipo de Plan:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, -1, -1));

        txtMinXLLamada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMinXLLamadaActionPerformed(evt);
            }
        });
        getContentPane().add(txtMinXLLamada, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 92, 81, -1));

        cbxTipoPlan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B" }));
        getContentPane().add(cbxTipoPlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 11, -1, -1));

        cbxTipoLLamada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "local ", "celular A", "celular B ", "celular C" }));
        getContentPane().add(cbxTipoLLamada, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 37, -1, -1));

        cbxHorarioLLamada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "mañana-tarde ", "noche", "madrugada" }));
        cbxHorarioLLamada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxHorarioLLamadaActionPerformed(evt);
            }
        });
        getContentPane().add(cbxHorarioLLamada, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 66, -1, -1));

        jLabel3.setText("Horario de LLamada:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 69, -1, -1));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 92, -1, -1));

        jLabel5.setText("Minutos por LLamada:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Tipo de Plan", "Tipo de LLmada", "Horario de LLamada", "Min x LLamada", "Costo x Min", "Costo x LLamada"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 149, 390, 159));

        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 115, -1, -1));

        btn4.setText("Problema4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, -1, -1));

        btn2.setText("Problema2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 19, -1, -1));

        btn3.setText("Problema3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(567, 19, -1, -1));

        btn1.setText("Problema1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        btn5.setText("Problema5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, -1, -1));

        txaRes.setColumns(20);
        txaRes.setRows(5);
        jScrollPane2.setViewportView(txaRes);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 230, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void txtMinXLLamadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMinXLLamadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMinXLLamadaActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        //datos
        String tipoPlan =cbxTipoPlan.getSelectedItem().toString();
        String tipoLLamada =cbxTipoLLamada.getSelectedItem().toString();
        String Horario =cbxHorarioLLamada.getSelectedItem().toString();
        int minXllamada=Integer.parseInt(txtMinXLLamada.getText());
        double costoXMin;
        double costoXLLama;
        LLamadaServicio Tipo;
        Tipo = new LLamadaServicio();
        LLamadaModelo[] repo= Tipo.procesarTipo(tipoPlan);
        DefaultTableModel tabla;
        tabla=(DefaultTableModel)tblDatos.getModel();
        tabla.setRowCount(0);
           for(LLamadaModelo item:repo){
            Object[] rowData={tipoPlan,tipoLLamada,Horario,minXllamada}; //item.getCostoXMin(),item.getCostoXLLama()
            tabla.addRow(rowData);}
        limpiar();
        actualizarTabla();
           
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // Número de llamadas con más de 5 minutos y menos de 20 en horario de la noche.
        int minXllamada=Integer.parseInt(txtMinXLLamada.getText());
        String Horario =cbxHorarioLLamada.getSelectedItem().toString();
        int NumeroLLamadas[];
        NumeroLLamadas=new int[0];
        int suma=0;
        if(Horario.equals("noche")){}
        else if (minXllamada >= 5 && minXllamada < 20){
            for(int i=0; i<NumeroLLamadas.length; i++)
            suma+=NumeroLLamadas[i]; }
            //return datos;
            
         txaRes.append("Número de llamadas con más de"  );   
         txaRes.append("\n5 minutos y menos de 20 en");
         txaRes.append("\nhorario de la noche:  "+ suma);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        //Costos totales de llamada según Tipo de Plan.
        String tipoPlan =cbxTipoPlan.getSelectedItem().toString();
        int planAA[];
        planAA=new int[0];
        int planBB[];
        planBB=new int[0];
        double planA=0;
        double planB=0; 
       
            if(tipoPlan.equals("A")){
                for(int i=0; i<planAA.length; i++){
                    planA= objModelo.getCostoXLLama();
                    planA+= planAA[i];}
            }else if (tipoPlan.equals("B")){
                for(int j=0; j<planBB.length; j++){
                    planB= objModelo.getCostoXLLama();
                    planB+= planBB[j];}
            }
        
         txaRes.append("Costos totales de llamada según Tipo de Plan"  );   
         txaRes.append("\nPlan A -> "+ planA );
         txaRes.append("\nPlan B -> "+ planB );
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
       //Total de minutos realizados en el turno de la noche y madrugada a 
       //teléfonos locales con costo de llamada superiores a 10 soles.
       String tipoLLamada =cbxTipoLLamada.getSelectedItem().toString();
       String Horario =cbxHorarioLLamada.getSelectedItem().toString();
       int total=0;
       int totalMin[];
        totalMin=new int[0];
             if (Horario.equals("noche") && Horario.equals("madrugada"))
                 if (tipoLLamada.equals("local"))
                     if(objModelo.getCostoXLLama()>=10)
                         for(int i=0; i<totalMin.length; i++){
                         total+= totalMin[i];}
             
       
         txaRes.append("Total de minutos realizados en el"  );
         txaRes.append("\nturno de la noche y madrugada a");
         txaRes.append("\nteléfonos locales con costo de llamada"  );
         txaRes.append("\nsuperiores llamada superiores a 10 soles");
         txaRes.append("\nTotal ->  " + total);
         
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // En que horario y tipo de Plan se realizo la llamada con mayor costo de llamada
         
        
                if(objModelo.getCostoXLLama()>=100)
             
             
         txaRes.append("En que horario y tipo de Plan se realizo"  );
         txaRes.append("\nla llamada con mayor costo de llamada");
         txaRes.append("\nHorario ->  ");
         txaRes.append("\nTipo de Plan ->  ");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // Total de llamadas en minutos realizadas al celular C en horario de mañana-tarde.
        int totalLLama=0;
         txaRes.append("Total de llamadas en minutos realizadas al"  );
         txaRes.append("\ncelular C en horario de mañana-tarde");
         txaRes.append("\nTotal ->  ");
    }//GEN-LAST:event_btn5ActionPerformed

    private void cbxHorarioLLamadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxHorarioLLamadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxHorarioLLamadaActionPerformed
     public void limpiar(){
        txtMinXLLamada.setText("");
        cbxTipoPlan.setSelectedIndex(0);
        cbxTipoLLamada.setSelectedIndex(0);
        cbxHorarioLLamada.setSelectedIndex(0);
    }
     public void vaciar_tabla(){
        int filas=tblDatos.getRowCount();
        for(int i=0;i<filas;i++)
            miModelo.removeRow(0);
    }
     

     public void actualizarTabla(){
        vaciar_tabla();
        int n=objArreglo.numeroLLamada();
        for(int i=0;i<n;i++)
        {
            String plan=objArreglo.getLLamada(i).getTipoPlan();
            String llamada=objArreglo.getLLamada(i).getTipoLLamada();
            String hora=objArreglo.getLLamada(i).getHorarioLLamada();
            int min= (int) objArreglo.getLLamada(i).getMinXLLamada();
            insertar(i+1, plan, llamada, hora, min);
        }
    }
    public void insertar(int par, String plan, String llamada, String hora, int min){
        Object[]fila={plan, llamada, hora, min};
        miModelo.addRow(fila);
        
    }
    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LLamadaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JComboBox<String> cbxHorarioLLamada;
    private javax.swing.JComboBox<String> cbxTipoLLamada;
    private javax.swing.JComboBox<String> cbxTipoPlan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextArea txaRes;
    private javax.swing.JTextField txtMinXLLamada;
    // End of variables declaration//GEN-END:variables
}
