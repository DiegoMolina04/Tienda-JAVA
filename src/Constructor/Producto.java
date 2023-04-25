/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor;

/**
 *
 * @author pc
 */
public class Producto implements Comparable<Producto>{ //Clase utilizada guardar los productos en las listas.
    
    String producto;
    Integer categoria, precio;
    
    public Producto(String produc, int categ, int prec){
        
        producto = produc;
        categoria = categ;
        precio = prec;
        
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    
    @Override
    public int compareTo(Producto o) {
        return categoria.compareTo(o.getCategoria());
    }
   
}
