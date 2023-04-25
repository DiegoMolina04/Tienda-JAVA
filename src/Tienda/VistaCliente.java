/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tienda;

//import static Tienda.VistaPropietario.producto;

//import static Tienda.VistaPropietario.producto;
import Constructor.Producto;
import Constructor.ordenarMenor; //Se importan los constructores que organizaran los precios.
import Constructor.ordenarMayor; //
import com.placeholder.PlaceHolder;
import java.util.Collections; //Se importan las colecciones, estas se encargan de organizar la lista.
import java.util.LinkedList; //Se importa el util de las listas.
import java.util.Queue; //Se importa el util de las colas.
import javax.swing.JOptionPane;


/**
 *
 * @author pc
 */
public class VistaCliente extends javax.swing.JFrame { //Clase que muestra la vista cliente además de hacer sus respectivas funciones.

    /**
     * Creates new form VistaCliente
     */
    
    static Queue<Producto>cola=new LinkedList<Producto>(); //Se declara la cola.
    PlaceHolder holder;
    
    public VistaCliente() {
        initComponents();
        setTitle("SuperTienda");
        setLocationRelativeTo(null);
        producto.requestFocus();
        producto.requestFocus();
        holder = new PlaceHolder(txt_nombreComprar, "Ingrese el nombre del producto");
        holder = new PlaceHolder(txt_precioComprar, "Ingrese el valor del producto");
    }
    
    
    public void imprimirLista(int seleccion){ //Funcion que imprime la lista por categoria en caso que la selección sea Todo.
        
        StringBuilder strBuilder = new StringBuilder(); //StringBuilder creado para poder almacenar todos los resultados y colocarlos en el textArea.
        
        for (int i = 0; i < VistaPropietario.producto.size(); i++) {
             
            if(VistaPropietario.producto.size()==0){ //Verifica si la lista esta vacia.
                
                txtArea_mostrarTodo.setText("No hay productos ingresados");
                
            }else{
                
                String nombre = VistaPropietario.producto.get(i).getProducto(); //
                int precio = VistaPropietario.producto.get(i).getPrecio(); //       Toma los datos ingresados
                int categoria = VistaPropietario.producto.get(i).getCategoria(); //

                switch(categoria){ //Se compara la categoria para saber que mensaje imprimir

                    case 1:
                        strBuilder.append("Nombre: "+nombre+" Precio: $"+precio+" Categoria: Camisa"+"\n");
                    break;

                    case 2:
                        strBuilder.append("Nombre: "+nombre+" Precio: $"+precio+" Categoria: Camiseta"+"\n");
                    break;

                    case 3:
                        strBuilder.append("Nombre: "+nombre+" Precio: $"+precio+" Categoria: Pantalón"+"\n");
                    break;

                    case 4:
                        strBuilder.append("Nombre: "+nombre+" Precio: $"+precio+" Categoria: Vestido"+"\n");
                    break;

                    case 5:
                        strBuilder.append("Nombre: "+nombre+" Precio: $"+precio+" Categoria: Zapatos"+"\n");
                    break;

                    case 6:
                        strBuilder.append("Nombre: "+nombre+" Precio: $"+precio+" Categoria: Chaqueta"+"\n");
                    break;

                    case 7:
                        strBuilder.append("Nombre: "+nombre+" Precio: $"+precio+" Categoria: Medias"+"\n");
                    break;
            }
            }
        }
        
        //Variable selección usada para saber en que textArea insertar el StringBuilder.
        if(seleccion == 1){
            
            txtArea_mostrarTodo.setText(strBuilder.toString());
            
        }else if(seleccion == 2){
            
            txtArea_filtrar.setText(strBuilder.toString());
            
        }
 
    }
    
    public void imprimirListaCategoria(int categoria){ //Imprime la lista en el caso que se quiera filtrar.
        
        StringBuilder strBuilder = new StringBuilder();
        int aux = categoria;
        int flag = 0; //Variable usada para identificar si existe un producto o no.
        for (int i = 0; i < VistaPropietario.producto.size(); i++) {
             
            if(VistaPropietario.producto.size()==0){ //Verifica su esta vacia la lista.
                
                txtArea_mostrarTodo.setText("No hay productos ingresados");
                
            }else{
                
                String nombre = VistaPropietario.producto.get(i).getProducto();//
                int precio = VistaPropietario.producto.get(i).getPrecio();//        Toma los datos ingresados en los textfield
                int categ = VistaPropietario.producto.get(i).getCategoria();//
                
                switch(categoria){ //Compara por categoria para imprimir el mensaje correcto.
                    case 1:
                    if(categoria==categ){ //Compara si la categoria es igual al valor enviado como parametro.
                            strBuilder.append("Nombre: "+nombre+" Precio: $"+precio+" Categoria: Camisa"+"\n");
                            flag = 1; //Variable que identifica que si hayo un producto.
                        }
                    break;
                    case 2:
                        if(categoria==categ){
                            strBuilder.append("Nombre: "+nombre+" Precio: $"+precio+" Categoria: Camiseta"+"\n");
                            flag = 1;
                        }
                    break;

                    case 3:
                        if(categoria==categ){
                            strBuilder.append("Nombre: "+nombre+" Precio: $"+precio+" Categoria: Pantalón"+"\n");
                            flag = 1;
                        }
                    break;
                    
                    case 4:
                        if(categoria==categ){
                            strBuilder.append("Nombre: "+nombre+" Precio: $"+precio+" Categoria: Vestido"+"\n");
                            flag = 1;
                        }
                    break;

                    case 5:
                        if(categoria==categ){
                            strBuilder.append("Nombre: "+nombre+" Precio: $"+precio+" Categoria: Zapatos"+"\n");
                            flag = 1;
                        }
                    break;

                    case 6:
                        if(categoria==categ){
                            strBuilder.append("Nombre: "+nombre+" Precio: $"+precio+" Categoria: Chaqueta"+"\n");
                            flag = 1;
                        }
                    break;

                    case 7:
                        if(categoria==categ){
                            strBuilder.append("Nombre: "+nombre+" Precio: $"+precio+" Categoria: Medias"+"\n");
                            flag = 1;
                        }
                    break;

                   
            }
            }
        }
        
        //Si no se encuentra el producto, se imprime el respectivo mensaje.
        if(categoria==1&&flag==0){
            strBuilder.append("No hay camisas disponibles"+"\n");
        }else if(categoria==2&&flag==0){
            strBuilder.append("No hay camisetas disponibles"+"\n");
        }else if (categoria==3&&flag==0){
            strBuilder.append("No hay pantalones disponibles"+"\n");
        }else if (categoria==4&&flag==0){
            strBuilder.append("No hay vestidos disponibles"+"\n");
        }else if (categoria==5&&flag==0){
            strBuilder.append("No hay zapatos disponibles"+"\n");
        }else if (categoria==6&&flag==0){
             strBuilder.append("No hay chaquetas disponibles"+"\n");
        }else if (categoria==7&&flag==0){
             strBuilder.append("No hay medias disponibles"+"\n");
        }
        
        txtArea_filtrar.setText(strBuilder.toString()); //Se coloca en el txtArea
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        sesionProducto = new javax.swing.JLabel();
        usuarioProducto = new javax.swing.JLabel();
        producto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea_mostrarTodo = new javax.swing.JTextArea();
        btn_actualizarProducto = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        sesionFiltrar = new javax.swing.JLabel();
        filtrar = new javax.swing.JLabel();
        cmb_forma = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtArea_filtrar = new javax.swing.JTextArea();
        btn_actualizarFiltrar = new javax.swing.JButton();
        cmb_categoria = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usuarioFiltrar = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        sesionComprar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usuarioComprar = new javax.swing.JLabel();
        txt_nombreComprar = new javax.swing.JTextField();
        txt_precioComprar = new javax.swing.JTextField();
        cmb_comprar = new javax.swing.JComboBox<>();
        btn_aceptarComprar = new javax.swing.JButton();
        btn_limpiarComprar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        cerrarSesion = new javax.swing.JLabel();
        btn_salir = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(240, 135, 113));

        sesionProducto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sesionProducto.setText("Sesión Iniciada :");

        usuarioProducto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        producto.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        producto.setText("Productos");

        txtArea_mostrarTodo.setEditable(false);
        txtArea_mostrarTodo.setBackground(new java.awt.Color(240, 135, 113));
        txtArea_mostrarTodo.setColumns(20);
        txtArea_mostrarTodo.setRows(5);
        jScrollPane1.setViewportView(txtArea_mostrarTodo);

        btn_actualizarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono/upd_norm.png"))); // NOI18N
        btn_actualizarProducto.setBorder(null);
        btn_actualizarProducto.setBorderPainted(false);
        btn_actualizarProducto.setContentAreaFilled(false);
        btn_actualizarProducto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono/upd_press.png"))); // NOI18N
        btn_actualizarProducto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono/upd_roll.png"))); // NOI18N
        btn_actualizarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarProductoActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Zapato.JPG"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Vestido.JPG"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Camisa.JPG"))); // NOI18N

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Camisa2.JPG"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(460, Short.MAX_VALUE)
                        .addComponent(sesionProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usuarioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel14)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel4)
                                .addGap(45, 45, 45)
                                .addComponent(btn_actualizarProducto)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel11)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel6)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(274, 274, 274)
                .addComponent(producto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sesionProducto)
                            .addComponent(usuarioProducto))
                        .addGap(21, 21, 21)
                        .addComponent(producto)
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn_actualizarProducto)
                                        .addGap(28, 28, 28))
                                    .addComponent(jLabel14)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Todos los productos", jPanel1);

        jPanel2.setBackground(new java.awt.Color(240, 135, 113));

        sesionFiltrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sesionFiltrar.setText("Sesión Iniciada :");

        filtrar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        filtrar.setText("Filtrar");

        cmb_forma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todo", "Menor a mayor precio", "Mayor a menor precio" }));
        cmb_forma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_formaActionPerformed(evt);
            }
        });

        txtArea_filtrar.setEditable(false);
        txtArea_filtrar.setBackground(new java.awt.Color(240, 135, 113));
        txtArea_filtrar.setColumns(20);
        txtArea_filtrar.setRows(5);
        jScrollPane2.setViewportView(txtArea_filtrar);

        btn_actualizarFiltrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono/upd_norm.png"))); // NOI18N
        btn_actualizarFiltrar.setBorder(null);
        btn_actualizarFiltrar.setBorderPainted(false);
        btn_actualizarFiltrar.setContentAreaFilled(false);
        btn_actualizarFiltrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono/upd_press.png"))); // NOI18N
        btn_actualizarFiltrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono/upd_roll.png"))); // NOI18N
        btn_actualizarFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarFiltrarActionPerformed(evt);
            }
        });

        cmb_categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todo", "Camisa", "Camiseta", "Pantalón", "Vestido", "Zapatos", "Chaqueta", "Medias" }));
        cmb_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_categoriaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Elegir Filtrado...");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Elegir Categoria");

        usuarioFiltrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Zapato2.JPG"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Pantalon.JPG"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Chaqueta2.JPG"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Media.JPG"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(466, Short.MAX_VALUE)
                .addComponent(sesionFiltrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(usuarioFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 46, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmb_forma, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(cmb_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(45, 45, 45))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel7)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel8)
                        .addGap(31, 31, 31)
                        .addComponent(btn_actualizarFiltrar)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel9)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(filtrar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sesionFiltrar)
                    .addComponent(usuarioFiltrar))
                .addGap(19, 19, 19)
                .addComponent(filtrar)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmb_forma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_actualizarFiltrar)
                        .addGap(68, 68, 68))))
        );

        jTabbedPane1.addTab("Filtrar", jPanel2);

        jPanel3.setBackground(new java.awt.Color(240, 135, 113));

        sesionComprar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sesionComprar.setText("Sesión Iniciada :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Comprar Producto");

        usuarioComprar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        cmb_comprar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir categoria...", "Camisa", "Camiseta", "Pantalón", "Vestido", "Zapatos", "Chaqueta", "Medias" }));

        btn_aceptarComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono/acep_norm.png"))); // NOI18N
        btn_aceptarComprar.setBorder(null);
        btn_aceptarComprar.setBorderPainted(false);
        btn_aceptarComprar.setContentAreaFilled(false);
        btn_aceptarComprar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono/acep_press.png"))); // NOI18N
        btn_aceptarComprar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono/acep_roll.png"))); // NOI18N
        btn_aceptarComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarComprarActionPerformed(evt);
            }
        });

        btn_limpiarComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono/limpiar_norm.png"))); // NOI18N
        btn_limpiarComprar.setBorder(null);
        btn_limpiarComprar.setBorderPainted(false);
        btn_limpiarComprar.setContentAreaFilled(false);
        btn_limpiarComprar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono/limpiar_press.png"))); // NOI18N
        btn_limpiarComprar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono/limpiar_roll.png"))); // NOI18N
        btn_limpiarComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarComprarActionPerformed(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Carrito.JPG"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sesionComprar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usuarioComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(232, 232, 232)
                                .addComponent(jLabel3))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(216, 216, 216)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_precioComprar)
                                    .addComponent(txt_nombreComprar, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                    .addComponent(cmb_comprar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(btn_aceptarComprar)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(btn_limpiarComprar)))
                        .addGap(0, 165, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sesionComprar)
                    .addComponent(usuarioComprar))
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addGap(25, 25, 25)
                .addComponent(txt_nombreComprar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_precioComprar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmb_comprar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(76, 76, 76)
                            .addComponent(btn_aceptarComprar))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_limpiarComprar)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel12)))
                .addGap(133, 133, 133))
        );

        jTabbedPane1.addTab("Comprar producto", jPanel3);

        jPanel4.setBackground(new java.awt.Color(240, 135, 113));

        cerrarSesion.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        cerrarSesion.setText("Cerrar Sesión");

        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono/salir_norm.png"))); // NOI18N
        btn_salir.setBorder(null);
        btn_salir.setBorderPainted(false);
        btn_salir.setContentAreaFilled(false);
        btn_salir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono/salir_press.png"))); // NOI18N
        btn_salir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono/salir_roll.png"))); // NOI18N
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Cerrar_Sesion.JPG"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cerrarSesion)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_salir)))
                .addContainerGap(277, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(cerrarSesion)
                .addGap(47, 47, 47)
                .addComponent(jLabel13)
                .addGap(33, 33, 33)
                .addComponent(btn_salir)
                .addContainerGap(191, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Salir", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_actualizarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarProductoActionPerformed
        
        imprimirLista(1); //Imprime toda la lista sin filtros.
        
    }//GEN-LAST:event_btn_actualizarProductoActionPerformed

    private void cmb_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_categoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_categoriaActionPerformed

    private void cmb_formaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_formaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_formaActionPerformed

    private void btn_actualizarFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarFiltrarActionPerformed

        int forma = cmb_forma.getSelectedIndex(); //Selecciona filtro.
        int categoria = cmb_categoria.getSelectedIndex(); //Selecciona filtro por tipo de categoria.
        
        switch(forma){
            
            case 0:
                if(forma==categoria){
                    imprimirLista(2); //Imprime toda la lista sin filtros.
                }else{

                    imprimirListaCategoria(categoria); //Imprime la lista con filtro.
                }
            break;
            
            case 1:
                Collections.sort(VistaPropietario.producto, new ordenarMenor()); //Se organiza la lista por precio de menor a mayor.
                if(forma==1&&categoria==0){
                    imprimirLista(2);
                }else{
                    imprimirListaCategoria(categoria);
                }
            break;
            
            case 2:
                Collections.sort(VistaPropietario.producto, new ordenarMayor()); //Se organiza la lista por precio de mayor a menor.
                if(forma==2&&categoria==0){
                    imprimirLista(2);
                }else{
                    imprimirListaCategoria(categoria);
                }
            break;
            
        }
        
    }//GEN-LAST:event_btn_actualizarFiltrarActionPerformed

    private void btn_aceptarComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarComprarActionPerformed
        
        VistaPropietario objPropietario = new VistaPropietario();
        String producto = txt_nombreComprar.getText();
        String precio2 = txt_precioComprar.getText();
        int tipo2 = cmb_comprar.getSelectedIndex();
        
        if(producto.equals("Ingrese el nombre del producto")||precio2.equals("Ingrese el valor del producto")||tipo2==0){
            
            JOptionPane.showMessageDialog(null, "Error ! Verifique datos ingresados","SuperTienda",  JOptionPane.ERROR_MESSAGE);
            
        }else{
            
            int flag = 0;
            for (int i = 0; i < objPropietario.producto.size(); i++) {
            
                String nombreComprobar = objPropietario.producto.get(i).getProducto();//
                int precioComprobar = objPropietario.producto.get(i).getPrecio();//
                String auxPrecio = String.valueOf(precioComprobar);//                   Se identifica si hay un producto guardado respecto a la información guardada.
                int claseComprobar = objPropietario.producto.get(i).getCategoria();//

                if (nombreComprobar.equals(producto)&&auxPrecio.equals(precio2)&&tipo2==claseComprobar){ //Si existe el producto

                    String decision = JOptionPane.showInputDialog("¿Seguro desea comprar el producto? Si/No");
                    
                    if(decision.toLowerCase().equals("si")){
            
                        objPropietario.producto.remove(i); //Se borra el producto de la lista.
                        JOptionPane.showMessageDialog(null, "Producto puesto en cola","SuperTienda",  JOptionPane.INFORMATION_MESSAGE);
                        Producto productoComprado = new Producto(nombreComprobar, claseComprobar, precioComprobar);
                        cola.offer(productoComprado); //Se guarda el producto en la lista para mostrar en Solicitudes en la vista del propietario.
                        //Se colocan los valores por default
                        txt_nombreComprar.setText("");
                        txt_precioComprar.setText("");
                        cmb_comprar.setSelectedIndex(0);
                        holder = new PlaceHolder(txt_nombreComprar, "Ingrese el nombre del producto");
                        holder = new PlaceHolder(txt_precioComprar, "Ingrese el valor del producto");
                        flag = 1; //Variable que identifica que existe el producto
                        
                    }else if(decision.toLowerCase().equals("no")){

                    }else{

                        JOptionPane.showMessageDialog(null, "Error ! Respuesta no valida","SuperTienda",  JOptionPane.ERROR_MESSAGE);

                    }

                }
            
            }
            
            if(flag==0){ //Si no existe el producto
                JOptionPane.showMessageDialog(null, "Error ! El producto no se a encontrado","SuperTienda",  JOptionPane.ERROR_MESSAGE);
            }
           
        }
        
    }//GEN-LAST:event_btn_aceptarComprarActionPerformed

    private void btn_limpiarComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarComprarActionPerformed
        
        //Coloca los valores por default.
        txt_nombreComprar.setText("");
        txt_precioComprar.setText("");
        cmb_comprar.setSelectedIndex(0);
        holder = new PlaceHolder(txt_nombreComprar, "Ingrese el nombre del producto");
        holder = new PlaceHolder(txt_precioComprar, "Ingrese el valor del producto");
        
    }//GEN-LAST:event_btn_limpiarComprarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        
        String decision = JOptionPane.showInputDialog("¿Seguro desea cerrar la sesión? Si/No");
        
        if(decision.toLowerCase().equals("si")){ //Decide si cerrar la sesión o no
            
            Login objLogin = new Login();
            objLogin.setVisible(true); //Se abre la ventana Login.
            dispose(); //Se cierra la ventana cliente.
            
        }else if(decision.toLowerCase().equals("no")){ 
            
        }
        
    }//GEN-LAST:event_btn_salirActionPerformed

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
            java.util.logging.Logger.getLogger(VistaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        VistaPropietario objPropietario = new VistaPropietario();
        objPropietario.cargarProducto();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_aceptarComprar;
    public javax.swing.JButton btn_actualizarFiltrar;
    public javax.swing.JButton btn_actualizarProducto;
    public javax.swing.JButton btn_limpiarComprar;
    public javax.swing.JButton btn_salir;
    public javax.swing.JLabel cerrarSesion;
    public javax.swing.JComboBox<String> cmb_categoria;
    public javax.swing.JComboBox<String> cmb_comprar;
    public javax.swing.JComboBox<String> cmb_forma;
    public javax.swing.JLabel filtrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JLabel producto;
    public javax.swing.JLabel sesionComprar;
    public javax.swing.JLabel sesionFiltrar;
    public javax.swing.JLabel sesionProducto;
    public javax.swing.JTextArea txtArea_filtrar;
    public javax.swing.JTextArea txtArea_mostrarTodo;
    public javax.swing.JTextField txt_nombreComprar;
    public javax.swing.JTextField txt_precioComprar;
    public javax.swing.JLabel usuarioComprar;
    public javax.swing.JLabel usuarioFiltrar;
    public javax.swing.JLabel usuarioProducto;
    // End of variables declaration//GEN-END:variables
}
