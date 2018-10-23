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
public class AllLamborghiniOrders implements Iterator {

    private static AllLamborghiniOrders allLamborghiniOrder;
    private Vector data;
    private Enumeration ec;
    private LamborghiniOrder nextLamborghiniOrder;

    private AllLamborghiniOrders() {
        data = new Vector();

    }

    public static AllLamborghiniOrders getAllLamborghiniOrders() {
        if (allLamborghiniOrder == null) {
            allLamborghiniOrder = new AllLamborghiniOrders();
        }
        return allLamborghiniOrder;
    }

    public void agregarAuto(Order v) {
        data.add(v);
    }

    public void a() {
        ec = data.elements();
    }

    @Override
    public boolean hasNext() {
        nextLamborghiniOrder = null;

        while (ec.hasMoreElements()) {
            nextLamborghiniOrder = (LamborghiniOrder) ec.nextElement();
            break;
        }
        return (nextLamborghiniOrder != null);
    }

    @Override
    public Object next() {

        if (nextLamborghiniOrder == null) {
            throw new NoSuchElementException();
        } else {
            return nextLamborghiniOrder;
        }

    }

    @Override
    public void remove() {

    }

    public Vector getData() {
        return data;
    }

}
