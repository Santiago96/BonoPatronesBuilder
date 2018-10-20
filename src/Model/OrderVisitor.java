/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Vector;

/**
 *
 * @author olixe
 */
public class OrderVisitor implements VisitorInterface {

    private double orderTotal;

    public OrderVisitor() {
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    @Override
    public void visit(BMWOrder bmwo) {
        //Formula
    }

    @Override
    public void visit(FerrariOrder fo) {
        //Formula
    }

    @Override
    public void visit(LamborghiniOrder lo) {
        //Formula
    }
}
