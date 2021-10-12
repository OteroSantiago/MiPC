/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceep.test;

import com.ceep.domain.*;

/**
 *
 * @author imac
 */
public class TestMiPC {
    
    public static void main(String[] args) {
        
        Pedido pedido1 = new Pedido();
        // Al tener una relación de agregación podremos tener objetos 
        // de monitor, raton y teclado independientemente de tener Computadores.
        Monitor monitor1 = new Monitor("Dell",21.0);
        Raton raton1 = new Raton("USB", "Logitech");
        Teclado teclado1 = new Teclado("Micro-USB", "Apple");
                        
        Computador computador1 = new Computador("Híbrido", monitor1, teclado1, raton1);
        pedido1.agregarComputador(computador1);
        pedido1.mostrarOrden();
        
        
    }
    
}
