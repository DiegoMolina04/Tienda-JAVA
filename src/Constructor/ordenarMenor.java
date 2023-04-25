/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor;

import java.util.Comparator;

/**
 *
 * @author pc
 */
public class ordenarMenor implements Comparator<Producto>{/*Clase usada para ordenar los precios de los productos
                                                            de menor a mayor*/

    @Override
    public int compare(Producto o1, Producto o2) {
        
        int r;
        r = o1.getPrecio().compareTo(o2.getPrecio());
        
        return r;
    }
    
}
