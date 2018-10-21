/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Vector;

/**
 *
 * @author olixe
 */
public class AllBMWOrders implements IAllAutos,Iterator {

    private static AllBMWOrders allBMWOrder;
    private Vector data;
    private Enumeration ec;
    private BMWOrder nextBMWOrder;
    private OrderVisitor objVisitor;

    private AllBMWOrders() {
        data = new Vector();
        objVisitor = new OrderVisitor();
    }

    public static AllBMWOrders getAllBMWOrders() {
        if (allBMWOrder == null) {
            allBMWOrder = new AllBMWOrders();
        }
        return allBMWOrder;
    }

    public void agregarAuto(Order v) {
        // Se ejemplifica en ButtonHandler
        data.add(v);
    }

    //Método que se puede desarrollar en ButtonHandler
    public void liquidarColeccion() {
        ec = data.elements();

        while (hasNext()) {
            Order f = (BMWOrder) next();
            f.accept(objVisitor);
        }
    }

    @Override
    public boolean hasNext() {

        boolean matchFound = false;
        nextBMWOrder = null;

        while (ec.hasMoreElements()) {
            nextBMWOrder = (BMWOrder) ec.nextElement();
            break;
        }
        return (nextBMWOrder != null);
    }

    @Override
    public Object next() {

        if (nextBMWOrder == null) {
            throw new NoSuchElementException();
        } else {
            return nextBMWOrder;
        }

    }

    @Override
    public void remove() {

    }

}
