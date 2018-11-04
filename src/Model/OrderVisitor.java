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
    
    private double vConvertible;
    private double vReceptorDAB;
    private double vFaros;
    private double vColor;
    private double vRines;
    private double vModelo;
    
    private final double impuesto = 0.19; 

    public OrderVisitor() {
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    @Override
    public void visit(BMWOrder bmwo) {
        
        vConvertible = bmwo.getvConvertible();
        vReceptorDAB = bmwo.getvReceptorDAB();
        vFaros = bmwo.getvFaros();
        vColor = bmwo.getvColor();
        vRines = bmwo.getvRines();
        vModelo = bmwo.getvModelo();
        
        double vDiseñoInt = bmwo.getvDiseñoInt();
        double vNavegacionIS = bmwo.getvNavegacionIS();
        double vElevacion = bmwo.getvElevacion();
        
        double cifraG = vConvertible + vReceptorDAB + vFaros + vColor + vRines + vModelo;
        double cifraImpuesto = (vRines + vDiseñoInt + vNavegacionIS + vElevacion) * impuesto;
        double cifraE = vDiseñoInt + vNavegacionIS + vElevacion;
        orderTotal = orderTotal + cifraG + cifraE + cifraImpuesto;

    }

    @Override
    public void visit(FerrariOrder fo) {

        vConvertible = fo.getvConvertible();
        vReceptorDAB = fo.getvReceptorDAB();
        vFaros = fo.getvFaros();
        vColor = fo.getvColor();
        vRines = fo.getvRines();
        vModelo = fo.getvModelo();
        
        double vTapacubos = fo.getvTapacubos();
        double vElevadorSus = fo.getvElevadorSus();
        double vCamaraFrontal = fo.getvCamaraFrontal();
    
        double cifraG = vConvertible + vReceptorDAB + vFaros + vColor + vRines + vModelo;
        double cifraImpuesto = (vFaros + vTapacubos + vElevadorSus + vCamaraFrontal) * impuesto;
        double cifraE = vTapacubos + vElevadorSus + vCamaraFrontal;
        orderTotal = orderTotal + cifraG + cifraE + cifraImpuesto;
    }

    @Override
    public void visit(LamborghiniOrder lo) {
        
        vConvertible = lo.getvConvertible();
        vReceptorDAB = lo.getvReceptorDAB();
        vFaros = lo.getvFaros();
        vColor = lo.getvColor();
        vRines = lo.getvRines();
        vModelo = lo.getvModelo();
        
        double vSuspensionMR = lo.getSuspensionMR();
        double vsEDeportivo = lo.getsEDeportivo();
        double vTelemetriaL = lo.getTelemetriaL();
        
        double cifraG = vConvertible + vReceptorDAB + vFaros + vColor + vRines + vModelo;
        double cifraImpuesto = (vSuspensionMR + vsEDeportivo + vTelemetriaL) * impuesto;
        double cifraE = vSuspensionMR + vsEDeportivo + vTelemetriaL;
        orderTotal = orderTotal + cifraG + cifraE + cifraImpuesto;
    }

    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }

}
