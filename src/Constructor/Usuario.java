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
public class Usuario { //Clase usada para guardar los usuarios en las listas.
    
    String nombre, contraseña;
    int tipo;
    
    public Usuario(String nom, String contra, int clase){
        
        nombre = nom;
        contraseña = contra;
        tipo = clase;
        
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

   
    
    
    
}
