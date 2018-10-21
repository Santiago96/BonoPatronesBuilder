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
public class BMWOrder implements Order {

    private int orderId;
    private double vConvertible;
    private double vReceptorDAB;
    private double vFaros;
    private double vColor;
    private double vRines;
    private double vModelo;
    private double vDiseñoInt;
    private double vNavegacionIS;
    private double vElevacion;

    public BMWOrder(int orderId, double vConvertible, double vReceptorDAB, double vFaros, double vColor, double vRines, double vModelo, double vDiseñoInt, double vNavegacionIS, double vElevacion) {
        this.orderId = orderId;
        this.vConvertible = vConvertible;
        this.vReceptorDAB = vReceptorDAB;
        this.vFaros = vFaros;
        this.vColor = vColor;
        this.vRines = vRines;
        this.vModelo = vModelo;
        this.vDiseñoInt = vDiseñoInt;
        this.vNavegacionIS = vNavegacionIS;
        this.vElevacion = vElevacion;
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

    public double getvDiseñoInt() {
        return vDiseñoInt;
    }

    public void setvDiseñoInt(double vDiseñoInt) {
        this.vDiseñoInt = vDiseñoInt;
    }

    public double getvNavegacionIS() {
        return vNavegacionIS;
    }

    public void setvNavegacionIS(double vNavegacionIS) {
        this.vNavegacionIS = vNavegacionIS;
    }

    public double getvElevacion() {
        return vElevacion;
    }

    public void setvElevacion(double vElevacion) {
        this.vElevacion = vElevacion;
    }

}
