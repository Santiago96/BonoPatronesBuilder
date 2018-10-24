/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.HashMap;

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
    private double suspensionMR;
    private double sEDeportivo;
    private double telemetriaL;

    private HashMap<String, Object> datos;



    public LamborghiniOrder(int orderId, double vConvertible, double vReceptorDAB, double vFaros, double vColor, double vRines, double vModelo, double suspensionMR, double sEDeportivo, double telemetriaL,HashMap<String,Object> datos) {
        this.orderId = orderId;
        this.vConvertible = vConvertible;
        this.vReceptorDAB = vReceptorDAB;
        this.vFaros = vFaros;
        this.vColor = vColor;
        this.vRines = vRines;
        this.vModelo = vModelo;
        this.suspensionMR = suspensionMR;
        this.sEDeportivo = sEDeportivo;
        this.telemetriaL = telemetriaL;
        this.datos = datos;
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

    public double isSuspensionMR() {
        return suspensionMR;
    }

    public void setSuspensionMR(double suspensionMR) {
        this.suspensionMR = suspensionMR;
    }

    public double issEDeportivo() {
        return sEDeportivo;
    }

    public void setsEDeportivo(double sEDeportivo) {
        this.sEDeportivo = sEDeportivo;
    }

    public double isTelemetriaL() {
        return telemetriaL;
    }

    public void setTelemetriaL(double telemetriaL) {
        this.telemetriaL = telemetriaL;
    }

    public HashMap<String, Object> getDatos() {
        return datos;
    }

    public int getOrderId() {
        return orderId;
    }

    public double getSuspensionMR() {
        return suspensionMR;
    }

    public double getsEDeportivo() {
        return sEDeportivo;
    }

    public double getTelemetriaL() {
        return telemetriaL;
    }

    public void setDatos(HashMap<String, Object> datos) {
        this.datos = datos;
    }
    
    
    
    

}
