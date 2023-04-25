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
public class ordenarMayor implements Comparator<Producto>{ /**Clase usada para organizar los precios de los productos 
                                                              de mayor a menor**/

    @Override
    public int compare(Producto o1, Producto o2) {
        
        int r;
        r = o2.getPrecio().compareTo(o1.getPrecio());
        
        return r;
        
    }
    
}
