/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Tienda.Login;
import Tienda.VistaPropietario;

/**
 *
 * @author pc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { /*Clase utilizada para ejecutar el proyecto y cargar datos de prueba 
                                               para usuarios y productos*/
        
        VistaPropietario objPropietario = new VistaPropietario();
        Login objLogin = new Login();
        objLogin.cargarUsuarios(); //Carga usuarios de prubea
        objPropietario.cargarProducto(); //Carga productos de prueba
        objLogin.setVisible(true);
        
    }
    
}
