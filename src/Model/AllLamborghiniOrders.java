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
    private OrderVisitor objVisitor;
    private Enumeration ec;
    private LamborghiniOrder nextLamborghiniOrder;

    private AllLamborghiniOrders() {
        objVisitor = new OrderVisitor(); //Ejemplificar en ButtonHandler
        data = new Vector();

    }

    public static AllLamborghiniOrders getAllLamborghiniOrders() {
        if (allLamborghiniOrder == null) {
            allLamborghiniOrder = new AllLamborghiniOrders();
        }
        return allLamborghiniOrder;
    }

    public void agregarAuto(Order v) {
        // Se ejemplifica en ButtonHandler
        data.add(v);
    }

    //Método que se puede desarrollar en ButtonHandler
    public void liquidarColeccion() {
        ec = data.elements();

        while (hasNext()) {
            Order f = (LamborghiniOrder) next();
            f.accept(objVisitor);
        }
    }

    @Override
    public boolean hasNext() {

        boolean matchFound = false;
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
