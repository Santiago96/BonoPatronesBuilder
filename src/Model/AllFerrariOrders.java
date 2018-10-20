/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.*;

/**
 *
 * @author olixe
 */
public class AllFerrariOrders implements Iterator {

    private static AllFerrariOrders allFerrariOrder;
    private Vector data;
    private OrderVisitor objVisitor;
    private Enumeration ec;
    private FerrariOrder nextFerrariOrder;

    private AllFerrariOrders() {
        objVisitor = new OrderVisitor(); //Ejemplificar en ButtonHandler
        data = new Vector();

    }

    public static AllFerrariOrders getAllFerrariOrders() {
        if (allFerrariOrder == null) {
            allFerrariOrder = new AllFerrariOrders();
        }
        return allFerrariOrder;
    }

    public void agregarAuto(Order v ) {
        // Se ejemplifica en ButtonHandler
        data.add(v);
    }
    
    //Método que se puede desarrollar en ButtonHandler
    public void liquidarColeccion() {
        ec = data.elements();

        while (hasNext()) {
            Order f = (FerrariOrder) next();
            f.accept(objVisitor);
        }
    }
    
    @Override
    public boolean hasNext() {

        boolean matchFound = false;
        nextFerrariOrder = null;

        while (ec.hasMoreElements()) {
            nextFerrariOrder = (FerrariOrder) ec.nextElement();
            break;
        }
        return (nextFerrariOrder != null);
    }

    @Override
    public Object next() {

        if (nextFerrariOrder == null) {
            throw new NoSuchElementException();
        } else {
            return nextFerrariOrder;
        }

    }

    @Override
    public void remove() {

    }

}
