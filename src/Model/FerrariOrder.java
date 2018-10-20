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
public class FerrariOrder implements Order {

    private int orderId;
    private double vConvertible;
    private double vReceptorDAB;
    private double vFaros;
    private double vColor;
    private double vRines;
    private double vModelo;
    private double vTapacubos;
    private double vElevadorSus;
    private double vCamaraFrontal;

    public FerrariOrder(int orderId, double vConvertible, double vReceptorDAB, double vFaros, double vColor, double vRines, double vModelo, double vTapacubos, double vElevadorSus, double vCamaraFrontal) {
        this.orderId = orderId;
        this.vConvertible = vConvertible;
        this.vReceptorDAB = vReceptorDAB;
        this.vFaros = vFaros;
        this.vColor = vColor;
        this.vRines = vRines;
        this.vModelo = vModelo;
        this.vTapacubos = vTapacubos;
        this.vElevadorSus = vElevadorSus;
        this.vCamaraFrontal = vCamaraFrontal;
    }

    @Override
    public void accept(OrderVisitor v) {
        v.visit(this);
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
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

    public double getvTapacubos() {
        return vTapacubos;
    }

    public void setvTapacubos(double vTapacubos) {
        this.vTapacubos = vTapacubos;
    }

    public double getvElevadorSus() {
        return vElevadorSus;
    }

    public void setvElevadorSus(double vElevadorSus) {
        this.vElevadorSus = vElevadorSus;
    }

    public double getvCamaraFrontal() {
        return vCamaraFrontal;
    }

    public void setvCamaraFrontal(double vCamaraFrontal) {
        this.vCamaraFrontal = vCamaraFrontal;
    }
    
    
    



}
