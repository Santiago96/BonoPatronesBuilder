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
public class LamborghiniOrder implements Order {

    private int orderId;
    private double vConvertible;
    private double vReceptorDAB;
    private double vFaros;
    private double vColor;
    private double vRines;
    private double vModelo;
    private boolean suspensionMR;
    private boolean sEDeportivo;
    private boolean telemetriaL;

    public LamborghiniOrder(int orderId, double vConvertible, double vReceptorDAB, double vFaros, double vColor, double vRines, double vModelo, boolean suspensionMR) {
        this.orderId = orderId;
        this.vConvertible = vConvertible;
        this.vReceptorDAB = vReceptorDAB;
        this.vFaros = vFaros;
        this.vColor = vColor;
        this.vRines = vRines;
        this.vModelo = vModelo;
        this.suspensionMR = suspensionMR;
    }

    @Override
    public void accept(OrderVisitor v) {
        v.visit(this);
    }

    public double getvConvertible() {
        return vConvertible;
    }

    public void setvConvertible(double vConvertible) {
        this.vConvertible = vConvertible;
    }

    public double getvReceptorDAB() {
        return vReceptorDAB;
    }

    public void setvReceptorDAB(double vReceptorDAB) {
        this.vReceptorDAB = vReceptorDAB;
    }

    public double getvFaros() {
        return vFaros;
    }

    public void setvFaros(double vFaros) {
        this.vFaros = vFaros;
    }

    public double getvColor() {
        return vColor;
    }

    public void setvColor(double vColor) {
        this.vColor = vColor;
    }

    public double getvRines() {
        return vRines;
    }

    public void setvRines(double vRines) {
        this.vRines = vRines;
    }

    public double getvModelo() {
        return vModelo;
    }

    public void setvModelo(double vModelo) {
        this.vModelo = vModelo;
    }

    public boolean isSuspensionMR() {
        return suspensionMR;
    }

    public void setSuspensionMR(boolean suspensionMR) {
        this.suspensionMR = suspensionMR;
    }

    public boolean issEDeportivo() {
        return sEDeportivo;
    }

    public void setsEDeportivo(boolean sEDeportivo) {
        this.sEDeportivo = sEDeportivo;
    }

    public boolean isTelemetriaL() {
        return telemetriaL;
    }

    public void setTelemetriaL(boolean telemetriaL) {
        this.telemetriaL = telemetriaL;
    }
    
    

}
