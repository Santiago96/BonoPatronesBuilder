/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author olixe
 */
public class OrderVisitor implements VisitorInterface {

    private double orderTotal;
    private double impuesto = 0.19;

    public OrderVisitor() {
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    @Override
    public void visit(BMWOrder bmwo) {
        double cifraG = bmwo.getvConvertible() + bmwo.getvReceptorDAB() + bmwo.getvFaros() + bmwo.getvColor() + bmwo.getvRines() + bmwo.getvModelo();
        double cifraImpuesto = (bmwo.getvDiseñoInt() + bmwo.getvNavegacionIS() + bmwo.getvElevacion()) * impuesto;
        double cifraE = bmwo.getvDiseñoInt() + bmwo.getvNavegacionIS() + bmwo.getvElevacion() + cifraImpuesto;
        orderTotal = orderTotal + cifraG + cifraE;

    }

    @Override
    public void visit(FerrariOrder fo) {
        double cifraG = fo.getvConvertible() + fo.getvReceptorDAB() + fo.getvFaros() + fo.getvColor() + fo.getvRines() + fo.getvModelo();
        double cifraImpuesto = (fo.getvTapacubos() + fo.getvElevadorSus() + fo.getvCamaraFrontal()) * impuesto;
        double cifraE = fo.getvTapacubos() + fo.getvElevadorSus() + fo.getvCamaraFrontal() + cifraImpuesto;
        orderTotal = orderTotal + cifraG + cifraE;
    }

    @Override
    public void visit(LamborghiniOrder lo) {
        double cifraG = lo.getvConvertible() + lo.getvReceptorDAB() + lo.getvFaros() + lo.getvColor() + lo.getvRines() + lo.getvModelo();
        double cifraImpuesto = (lo.getSuspensionMR() + lo.getsEDeportivo() + lo.getTelemetriaL()) * impuesto;
        double cifraE = lo.getSuspensionMR() + lo.getsEDeportivo() + lo.getTelemetriaL() + cifraImpuesto;
        orderTotal = orderTotal + cifraG + cifraE;
    }

    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }

}
