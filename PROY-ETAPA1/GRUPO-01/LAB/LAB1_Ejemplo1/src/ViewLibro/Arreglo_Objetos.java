
package ViewLibro;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.*;
import javax.swing.Icon;
import java.text.DecimalFormat;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import modelo.Libro;
import controlador.ArregloLibros;


public class Arreglo_Objetos extends javax.swing.JFrame{
    Libro objLibro;
    ArregloLibros objArreglo;
    DefaultTableModel miModelo;
    String[] cabecera={"N°","Codigo","Nombre de Libro","Tipo","Clase","Año","Num Pág","Costo"};
    String[][] data={};
    int nwn=0;

   
    public Arreglo_Objetos() {
        initComponents();
        miModelo=new DefaultTableModel(data,cabecera);
        tblRegistros.setModel(miModelo);
        objArreglo=new ArregloLibros();
        cargaData();
        actualizar_tabla();
        resumen();
        jtxtCodigo.requestFocus();
        
    }
    
    public void cargaData(){
        try{
                FileInputStream fis=new FileInputStream("Libro.bin");
                ObjectInputStream in=new ObjectInputStream(fis);
                        if(in!=null){
                            objArreglo=(ArregloLibros)in.readObject();
                            in.close();
                        }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Tenemos un error al cargar el archivo binario"+ex);
            }
        
    }
    
    
    public void vaciar_tabla(){
        int filas=tblRegistros.getRowCount();
        for(int i=0;i<filas;i++)
            miModelo.removeRow(0);
    }
    
    public void mensaje(String texto){
        JOptionPane.showMessageDialog(this,texto);
    }
    
    
    public void resumen(){
        String sA="",sB="",sD1="",sD2="";
        int mayor=-99,menor=999999,sC=0;
        double maycos=-99;
        int n=objArreglo.numeroLibros();
        for(int i=0;i<n;i++)
        {
            String cod=objArreglo.getLibro(i).getCodigo();
            String nombre=objArreglo.getLibro(i).getNombre();
            String tipo=objArreglo.getLibro(i).getTipo();
            String clase=objArreglo.getLibro(i).getClases();
            int anio=objArreglo.getLibro(i).getAnio();
            int num_pag=objArreglo.getLibro(i).getNum_pag();
            double costo=objArreglo.getLibro(i).getCosto();
            
            if(anio>mayor)
            {
                mayor=anio;
                sA=nombre;
            }
            if(num_pag<menor)
            {
                menor=num_pag;
                sB=tipo;
            }
            if(costo>maycos)
            {
                maycos=costo;
                sD1=nombre;
                sD2=tipo;
            }
        }
        jtxtsA.setText(sA);
        jtxtsB.setText(sB);
        jtxtsC.setText(String.valueOf(sC));
        jtxtsD1.setText(sD1);
        jtxtsD2.setText(sD2);
        
    }
    
    public void actualizar_tabla(){
        vaciar_tabla();
        int n=objArreglo.numeroLibros();
        for(int i=0;i<n;i++)
        {
            String cod=objArreglo.getLibro(i).getCodigo();
            String nom=objArreglo.getLibro(i).getNombre();
            String ti=objArreglo.getLibro(i).getTipo();
            String cla=objArreglo.getLibro(i).getClases();
            int an=objArreglo.getLibro(i).getAnio();
            int np=objArreglo.getLibro(i).getNum_pag();
            double c=objArreglo.getLibro(i).getCosto();
            insertar(i+1,cod,nom,ti,cla,an,np,c);
        }
    }
    
    
    public void modifica(){
        String cod=jtxtCodigo.getText().toUpperCase();
        int p=objArreglo.busca(cod);
        String nom=jtxtNombre.getText().toUpperCase();
        String ti=jCbxTipo.getSelectedItem().toString();
        String cla=jCbxClase.getSelectedItem().toString();
        int an=Integer.parseInt(jtxtAnio.getText());
        int np=Integer.parseInt(jtxtNroPag.getText());
        double c=Double.parseDouble(jtxtCosto.getText());
        
        objLibro = new Libro(cod, nom, ti, cla, np,c,an);
        
        if(p==-1)
        
            objArreglo.agregar(objLibro);
        else
            objArreglo.reemplaza(p, objLibro);
        limpiar_entradas();
        grabar();
        actualizar_tabla();
        resumen();
        jtxtCodigo.requestFocus();
    }
    
    public void eliminar(){
        consulta();
        int p =objArreglo.busca(jtxtCodigo.getText().toUpperCase());
        if(p!=-1)
             p=JOptionPane.showConfirmDialog(this, "Esta usted seguro en eliminar este registro? Responda:");
        if(p==0)
            objArreglo.elimina(p);
        limpiar_entradas();
        grabar();
        actualizar_tabla();
        resumen();
        jtxtCodigo.requestFocus();
    }
    
    public void consulta(){
        String cod=jtxtCodigo.getText().toUpperCase();
        int p=objArreglo.busca(cod);
        if(p==-1){
        mensaje("El código no existe");
        limpiar_entradas();
        }else{
        objLibro=objArreglo.getLibro(p);
        String nombre=objLibro.getNombre();
        String tipo=objLibro.getTipo();
        String clase=objLibro.getClases();
        int anio=objLibro.getAnio();
        int num_pag=objLibro.getNum_pag();
        double costo=objLibro.getCosto();
        jtxtNombre.setText(nombre);
        if(tipo.equalsIgnoreCase("PSICOLOGIA"))
            jCbxTipo.setSelectedIndex(1);
        else if(tipo.equalsIgnoreCase("DERECHO"))
            jCbxTipo.setSelectedIndex(2);
        else if(tipo.equalsIgnoreCase("SISTEMICA"))
            jCbxTipo.setSelectedIndex(3);
        if(clase.equalsIgnoreCase("A"))
            jCbxClase.setSelectedIndex(1);
        else if(clase.equalsIgnoreCase("B"))
            jCbxClase.setSelectedIndex(2);
        else if(clase.equalsIgnoreCase("C"))
            jCbxClase.setSelectedIndex(3);
        jtxtNombre.setText(nombre);
        jtxtAnio.setText(String.valueOf(anio));
        jtxtNroPag.setText(String.valueOf(num_pag));
        jtxtCosto.setText(String.valueOf(costo));
    }
    
}    
    
    public void limpiar_entradas(){
        jtxtCodigo.setText("");
        jtxtNombre.setText("");
        jtxtAnio.setText("");
        jtxtNroPag.setText("");
        jtxtCosto.setText("");
        jCbxTipo.setSelectedIndex(0);
        jCbxClase.setSelectedIndex(0);
        jtxtCodigo.requestFocus(true);
        
    }
    
    public void insertar(int num, String codigo, String nombre, String tipo, String clase,int anio, int num_pag, double costo){
        String co;
        DecimalFormat df2 = new DecimalFormat("####.00");
        co=df2.format(costo);
        Object[]fila={num,codigo,nombre,tipo,clase,String.valueOf(anio),String.valueOf(num_pag),co};
        miModelo.addRow(fila);
        
    }
    
    public void ord_PorCodigo(){
        int n=objArreglo.numeroLibros();
        int menor;
        Libro aux;
        for(int p=0;p<n-1;p++)
        {
            menor=p;
        for(int q=(n+1);q<n;q++)
        {
            String codActual=objArreglo.getLibro(q).getCodigo();
            String codMenor=objArreglo.getLibro(menor).getCodigo();
            if(codActual.compareToIgnoreCase(codMenor)<0)
            
                menor=q;
            
        aux=objArreglo.getLibro(p);
        objArreglo.reemplaza(p,objArreglo.getLibro(menor));
        objArreglo.reemplaza(menor,aux);
            
        actualizar_tabla();
        }
    }
    }
    public void ord_PorNombre(){
        int n=objArreglo.numeroLibros();
        Libro aux;
        for(int q=0;q<(n-1);q++)
        {
            for(int p=0;p<(n-1)-q;p++)
            {
                String nomAnt=objArreglo.getLibro(p).getNombre();
                String nomSig=objArreglo.getLibro(p+1).getNombre();
                if(nomAnt.compareToIgnoreCase(nomSig)>0)
                {
                    aux=objArreglo.getLibro(p);
                objArreglo.reemplaza(p, objArreglo.getLibro(p+1));
                objArreglo.reemplaza(p+1,aux);
                }
            }
        }
        actualizar_tabla();
    }
    
    public void ord_PorTipo(){
        int n=objArreglo.numeroLibros();
        int j;
        Libro aux;
        for(int i=0;i<n-1;i++)
        {
            j=i;
            while(j!=0)
            {
                String tipoActual=objArreglo.getLibro(j).getTipo();
                String tipoAnt=objArreglo.getLibro(j-1).getTipo();
                if(tipoActual.compareToIgnoreCase(tipoAnt)<0)
                {
                    aux=objArreglo.getLibro(j);
                    objArreglo.reemplaza(j,objArreglo.getLibro(j-1));
                    objArreglo.reemplaza(j-1, aux);
                }else
                {
                    j=1;
                    j=j-1;
                }
            }
        }
        actualizar_tabla();
    }
    
    public void ord_PorClase(){
        int n=objArreglo.numeroLibros();
        Libro aux;
        for(int q=0;q<(n-1);q++){
            for(int p=0;p<(n-1)-q;p++){
                String claseAnt=objArreglo.getLibro(p).getClases();
                String claseSig=objArreglo.getLibro(p+1).getClases();
                if(claseAnt.compareToIgnoreCase(claseSig)>0){
                  
                
                    aux=objArreglo.getLibro(p);
                    objArreglo.reemplaza(p, objArreglo.getLibro(p+1));
                    objArreglo.reemplaza(p+1,aux);
                }
            }
        }    
        actualizar_tabla();
    }
    
    public void ord_PorAnio(){
        int n=objArreglo.numeroLibros();
        int j;
        Libro aux;
        for(int i=1;i<n;i++){
            j=1;
            while(j!=0)
            {
                int anioActual=objArreglo.getLibro(j).getAnio();
                int anioAnt=objArreglo.getLibro(j-1).getAnio();
            
                if(anioActual<anioAnt)
                    
                {
                    aux=objArreglo.getLibro(j);
                    objArreglo.reemplaza(j, objArreglo.getLibro(j-1));
                    objArreglo.reemplaza(j-1, aux);
        
                }else
                {
                  j=1;
                  j=j-1;
                }
                  
    }
   actualizar_tabla();
 }   
    }
    public void ord_PorNumPag()
    {
        int n=objArreglo.numeroLibros();
        int menor;
        Libro aux;
        for(int p=0;p<n-1;p++)
        {
            menor=p;
           for(int q=(p+1);q<n;q++)
           {
            int npActual=objArreglo.getLibro(q).getNum_pag();
            int npMenor=objArreglo.getLibro(menor).getNum_pag();
            if(npActual<npMenor)
            {
                menor=q;
            }
            aux=objArreglo.getLibro(p);
            objArreglo.reemplaza(n, objArreglo.getLibro(menor));
            objArreglo.reemplaza(menor, aux);
           }
        }
        actualizar_tabla();
        
    }

    
    public void ord_PorCosto(){
        int n=objArreglo.numeroLibros();
        int menor;
        Libro aux;
        for(int p=0;p<n-1;p++){
            menor=p;
            
        for(int q=p+1;q<n;q++)
        {
            double cActual=objArreglo.getLibro(q).getCosto();
            double cMenor=objArreglo.getLibro(menor).getCosto();
            if(cActual<cMenor)
            {
                menor=q;
            }
            aux=objArreglo.getLibro(q);
            objArreglo.reemplaza(p, objArreglo.getLibro(menor));
            objArreglo.reemplaza(menor, aux);
        }
        }
        actualizar_tabla();
    }   
    
        public void grabar(){
            try{
                FileOutputStream fos=new FileOutputStream("Libebro.bin");
                ObjectOutputStream out=new ObjectOutputStream(fos);
                        if(out!=null){
                            out.writeObject(objArreglo);
                            out.close();
                        }
            }catch(IOException ex){
                JOptionPane.showMessageDialog(null,"Error en la grabacion del archivo serializado.."+ex);
            }
        }
    
  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtxtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jCbxTipo = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jtxtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxtAnio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtxtCosto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtxtNroPag = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jCbxClase = new javax.swing.JComboBox();
        jBtnGrabar = new javax.swing.JButton();
        BUSCAR = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jbtnConsultar = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jcbxOrdenar = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRegistros = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jtxtsA = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jtxtsB = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jtxtsC = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jtxtsD1 = new javax.swing.JTextField();
        jtxtsD2 = new javax.swing.JTextField();
        btnsalir = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 153, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("REGISTRO DE INFORMACIÓN DE LIBROS");

        jPanel1.setBackground(new java.awt.Color(255, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Código:");

        jtxtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCodigoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Tipo Editorial");

        jCbxTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PSICOLOGÍA", "DERECHO", "SISTEMICA" }));
        jCbxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbxTipoActionPerformed(evt);
            }
        });

        jLabel4.setText("Nombre:");

        jtxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNombreActionPerformed(evt);
            }
        });

        jLabel5.setText("Año de Edad:");

        jtxtAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtAnioActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Costo");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Nro.Pág");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Clase");

        jCbxClase.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", " " }));
        jCbxClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbxClaseActionPerformed(evt);
            }
        });

        jBtnGrabar.setText("GRABAR");
        jBtnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGrabarActionPerformed(evt);
            }
        });

        BUSCAR.setBackground(new java.awt.Color(204, 204, 204));
        BUSCAR.setText("PORTADA");
        BUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUSCARActionPerformed(evt);
            }
        });

        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jbtnConsultar.setText("CONSULTAR");
        jbtnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnConsultarActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("Librería");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBtnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(95, 95, 95)
                                        .addComponent(jbtnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCbxClase, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtxtNroPag, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtxtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtxtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jtxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(259, 259, 259)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(139, 139, 139)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jtxtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jtxtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCbxClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtNroPag, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(BUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnGrabar)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("RELACIÓN DE LIBROS");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel10.setText("ORDENAR POR");

        jcbxOrdenar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ord_PorCodigo", "ord_PorNombre", "ord_PorTipo", "ord_PorClase", "ord_PorAnio", "ord_PorNumPag", "ord_PorCosto" }));
        jcbxOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbxOrdenarActionPerformed(evt);
            }
        });

        tblRegistros.setBackground(new java.awt.Color(204, 255, 204));
        tblRegistros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblRegistros.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(tblRegistros);

        jPanel3.setBackground(new java.awt.Color(102, 255, 153));

        jLabel11.setText("Nombre del libro con su año de edición");

        jtxtsA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtsAActionPerformed(evt);
            }
        });

        jLabel12.setText("mas reciente.");

        jLabel13.setText("Nombre de la Editorial que tiene el libro");

        jLabel14.setText("con el Menor número de paginas.");

        jtxtsB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtsBActionPerformed(evt);
            }
        });

        jLabel15.setText("Número de libros que supera el Costo de $100");

        jLabel16.setText("que sean de la Editorial A y de Gestión");

        jLabel17.setText("Nombre del libro que tenga el mayor costo");

        jLabel18.setText("y aque editorial pertenece.");

        jtxtsD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtsD1ActionPerformed(evt);
            }
        });

        btnsalir.setText("SALIR");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtsD2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtsD1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jtxtsA, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel14)
                                    .addComponent(jtxtsB, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13)))
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jtxtsC, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxtsA, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtxtsB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxtsC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtxtsD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtxtsD2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jcbxOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbxOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtsAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtsAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtsAActionPerformed

    private void jcbxOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbxOrdenarActionPerformed
        // TODO add your handling code here:
        switch(jcbxOrdenar.getSelectedIndex()){
            case 0:cargaData();
            actualizar_tabla();
            break;
            case 1:ord_PorCodigo();break;
            case 2:ord_PorNombre();break;
            case 3:ord_PorTipo();break;
            case 4:ord_PorClase();break;
            case 5:ord_PorAnio();break;
            case 6:ord_PorNumPag();break;
            case 7:ord_PorCosto();break;
        }
        
        
    }//GEN-LAST:event_jcbxOrdenarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnsalirActionPerformed

    private void jbtnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnConsultarActionPerformed
        // TODO add your handling code here:
        consulta();
    }//GEN-LAST:event_jbtnConsultarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        modifica();

    }//GEN-LAST:event_btnModificarActionPerformed

    private void BUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUSCARActionPerformed
        // TODO add your handling code here:
        JFileChooser dlg=new JFileChooser();
        int option=dlg.showOpenDialog(this);
        if(option==JFileChooser.APPROVE_OPTION){
            String file=dlg.getSelectedFile().getPath();

        }
    }//GEN-LAST:event_BUSCARActionPerformed

    private void jBtnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGrabarActionPerformed

        String cod=jtxtCodigo.getText().toUpperCase();
        String nom=jtxtNombre.getText().toUpperCase();
        String ti=jCbxTipo.getSelectedItem().toString();
        String cla=jCbxClase.getSelectedItem().toString();
        int an=Integer.parseInt(jtxtAnio.getText());
        int np=Integer.parseInt(jtxtNroPag.getText());
        double c=Double.parseDouble(jtxtCosto.getText());
        objLibro=new Libro(cod,nom,ti,cla,np,c,an);
        if(objArreglo.busca(objLibro.getCodigo())!=-1)
        mensaje("Usted esta escribiendo el mismo código");
        else
        objArreglo.agregar(objLibro);
        insertar(0,cod,nom,ti,cla,an,np,c);
        limpiar_entradas();
        grabar();
        actualizar_tabla();
        resumen();
    }//GEN-LAST:event_jBtnGrabarActionPerformed

    private void jtxtAnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtAnioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtAnioActionPerformed

    private void jCbxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbxTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCbxTipoActionPerformed

    private void jCbxClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbxClaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCbxClaseActionPerformed

    private void jtxtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCodigoActionPerformed

    private void jtxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNombreActionPerformed

    private void jtxtsD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtsD1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtsD1ActionPerformed

    private void jtxtsBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtsBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtsBActionPerformed

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
            java.util.logging.Logger.getLogger(Arreglo_Objetos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Arreglo_Objetos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Arreglo_Objetos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Arreglo_Objetos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Arreglo_Objetos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BUSCAR;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JButton jBtnGrabar;
    private javax.swing.JComboBox jCbxClase;
    private javax.swing.JComboBox jCbxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtnConsultar;
    private javax.swing.JComboBox jcbxOrdenar;
    private javax.swing.JTextField jtxtAnio;
    private javax.swing.JTextField jtxtCodigo;
    private javax.swing.JTextField jtxtCosto;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtNroPag;
    private javax.swing.JTextField jtxtsA;
    private javax.swing.JTextField jtxtsB;
    private javax.swing.JTextField jtxtsC;
    private javax.swing.JTextField jtxtsD1;
    private javax.swing.JTextField jtxtsD2;
    private javax.swing.JTable tblRegistros;
    // End of variables declaration//GEN-END:variables

}