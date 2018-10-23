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
public class AllBMWOrders implements IAllAutos, Iterator {

    private static AllBMWOrders allBMWOrder;
    private Vector data;
    private Enumeration ec;
    private BMWOrder nextBMWOrder;

    private AllBMWOrders() {
        data = new Vector();
    }

    public static AllBMWOrders getAllBMWOrders() {
        if (allBMWOrder == null) {
            allBMWOrder = new AllBMWOrders();
        }
        return allBMWOrder;
    }

    @Override
    public void agregarAuto(Order v) {
        data.add(v);
    }

    public void a() {
        ec = data.elements();
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

    public Vector getData() {
        return data;
    }

}
