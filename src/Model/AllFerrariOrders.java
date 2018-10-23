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
public class AllFerrariOrders implements Iterator {

    private static AllFerrariOrders allFerrariOrder;
    private Vector data;
    private Enumeration ec;
    private FerrariOrder nextFerrariOrder;

    private AllFerrariOrders() {
        data = new Vector();

    }

    public synchronized static AllFerrariOrders getAllFerrariOrders() {
        if (allFerrariOrder == null) {
            allFerrariOrder = new AllFerrariOrders();
        }
        return allFerrariOrder;
    }

    public void agregarAuto(Order v) {
        data.add(v);
    }

    public void a() {
        ec = data.elements();
    }

    @Override
    public boolean hasNext() {

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
            System.out.println("hola");
            throw new NoSuchElementException();
        } else {
            return nextFerrariOrder;
        }

    }

    @Override
    public void remove() {

    }

    public Vector getData() {
        return data;
    }

}
