/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Model.AllBMWOrders;
import Model.BMWOrder;
import static Views.MainView.CREATE_ORDER;
import static Views.MainView.EXIT;
import static Views.MainView.REGRESAR;
import static Views.MainView.SI;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Santiago
 */
public class BMWViewBuilder extends MainView implements IViewBuilder {

    public static final String I8R = "i8Roadster";
    public static final String M240I = "M240i";
    public static final String X3 = "X3";
    public static final String M40I = "M40i";
    public static final String M2C = "M2 Competition";

    public static final String DEFAULT = "Default";
    public static final String HALO = "i Halo";
    public static final String ACCARO = "i Accaro";

    private JComboBox cmbModelo;
    private JComboBox cmbDiseñoInt;
    private JComboBox cmbNavegacionIS;
    private JComboBox cmbSElevacion;

    private JLabel lblModelo, lblDiseñoInt, lblNavegacionIS, lblSElevacion;

    BMWViewBuilder() {
        initializeGeneralForm();
        initializePersonalizeForm();
        addComponents();
        componentsPosition();
        addEvents();
    }

    @Override
    public void initializeGeneralForm() {
        //Inicializar todos los componentes generales
        super.setTitle("BMW Order");
        super.setSize(400, 400);

    }

    @Override
    public void launchView() {
        //Llamado
        //objOrderManager.setVisible(false);
        this.setVisible(true);
    }

    @Override
    public void initializePersonalizeForm() {
        cmbModelo = new JComboBox();
        cmbModelo.addItem(I8R);
        cmbModelo.addItem(M240I);
        cmbModelo.addItem(X3);
        cmbModelo.addItem(M40I);
        cmbModelo.addItem(M2C);

        cmbDiseñoInt = new JComboBox();
        cmbDiseñoInt.addItem(DEFAULT);
        cmbDiseñoInt.addItem(HALO);
        cmbDiseñoInt.addItem(ACCARO);

        cmbNavegacionIS = new JComboBox();
        cmbNavegacionIS.addItem(SI);
        cmbNavegacionIS.addItem(NO);

        cmbSElevacion = new JComboBox();
        cmbSElevacion.addItem(SI);
        cmbSElevacion.addItem(NO);

        lblModelo = new JLabel("Modelo:");
        lblDiseñoInt = new JLabel("Diseño Interior:");
        lblNavegacionIS = new JLabel("Navegación e Interfaz Smartphone");
        lblSElevacion = new JLabel("Sistema de elevación:");

    }

    @Override
    public void addComponents() {
        super.getButtonPanel().add(cmbModelo);
        super.getButtonPanel().add(cmbDiseñoInt);
        super.getButtonPanel().add(cmbNavegacionIS);
        super.getButtonPanel().add(cmbSElevacion);

        super.getButtonPanel().add(lblModelo);
        super.getButtonPanel().add(lblDiseñoInt);
        super.getButtonPanel().add(lblNavegacionIS);
        super.getButtonPanel().add(lblSElevacion);

        super.getPanel().add(super.getRegresarButton());
        super.getPanel().add(super.getCreateOrderButton());
        super.getPanel().add(super.getExitButton());
    }

    @Override
    public void componentsPosition() {
        super.getGbc().insets.top = 5;
        super.getGbc().insets.bottom = 5;
        super.getGbc().insets.left = 5;
        super.getGbc().insets.right = 5;

        super.getGbc().anchor = GridBagConstraints.EAST;
        super.getGbc().gridx = 0;
        super.getGbc().gridy = 6;
        super.getGridbag().setConstraints(lblModelo, super.getGbc());
        super.getGbc().anchor = GridBagConstraints.WEST;
        super.getGbc().gridx = 1;
        super.getGbc().gridy = 6;
        super.getGridbag().setConstraints(cmbModelo, super.getGbc());

        super.getGbc().anchor = GridBagConstraints.EAST;
        super.getGbc().gridx = 0;
        super.getGbc().gridy = 7;
        super.getGridbag().setConstraints(lblDiseñoInt, super.getGbc());
        super.getGbc().anchor = GridBagConstraints.WEST;
        super.getGbc().gridx = 1;
        super.getGbc().gridy = 7;
        super.getGridbag().setConstraints(cmbDiseñoInt, super.getGbc());

        super.getGbc().anchor = GridBagConstraints.EAST;
        super.getGbc().gridx = 0;
        super.getGbc().gridy = 8;
        super.getGridbag().setConstraints(lblNavegacionIS, super.getGbc());
        super.getGbc().anchor = GridBagConstraints.WEST;
        super.getGbc().gridx = 1;
        super.getGbc().gridy = 8;
        super.getGridbag().setConstraints(cmbNavegacionIS, super.getGbc());

        super.getGbc().anchor = GridBagConstraints.EAST;
        super.getGbc().gridx = 0;
        super.getGbc().gridy = 9;
        super.getGridbag().setConstraints(lblSElevacion, super.getGbc());
        super.getGbc().anchor = GridBagConstraints.WEST;
        super.getGbc().gridx = 1;
        super.getGbc().gridy = 9;
        super.getGridbag().setConstraints(cmbSElevacion, super.getGbc());
    }

    @Override
    public void addEvents() {
        ButtonHandlerB objButtonHandler = new ButtonHandlerB(this);

        super.getRegresarButton().addActionListener(objButtonHandler);
        super.getCreateOrderButton().addActionListener(objButtonHandler);
        super.getExitButton().addActionListener(new ButtonHandler());
    }

    public JComboBox getCmbModelo() {
        return cmbModelo;
    }
    
    public String getCmbModeloValue(){
        return (String)cmbModelo.getSelectedItem();
    }

    public JComboBox getCmbDiseñoInt() {
        return cmbDiseñoInt;
    }
    
    public String getCmbDiseñoIntValue() {
        return (String)cmbDiseñoInt.getSelectedItem();
    }

    public JComboBox getCmbNavegacionIS() {
        return cmbNavegacionIS;
    }

    public JComboBox getCmbSElevacion() {
        return cmbSElevacion;
    }

    public JLabel getLblModelo() {
        return lblModelo;
    }

    public JLabel getLblDiseñoInt() {
        return lblDiseñoInt;
    }

    public JLabel getLblNavegacionIS() {
        return lblNavegacionIS;
    }

    public JLabel getLblSElevacion() {
        return lblSElevacion;
    }

}

class ButtonHandlerB implements ActionListener {

    BMWViewBuilder objBMWView;

    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals(EXIT)) {
            System.exit(1);
        }
        if (e.getActionCommand().equals(CREATE_ORDER)) {
            System.out.println("Crear Orden");
            BMWOrder bmw = capturarAtributos(objBMWView);
            AllBMWOrders allBMW = AllBMWOrders.getAllBMWOrders();
            allBMW.agregarAuto(bmw);
        }

        if (e.getActionCommand().equals(REGRESAR)) {

            objBMWView.setVisible(false);
            //objBMWView.objOrderManager.setVisible(true);
        }
    }

    public ButtonHandlerB() {
    }

    public ButtonHandlerB(BMWViewBuilder inObjBMWView) {
        objBMWView = inObjBMWView;
    }

    private BMWOrder capturarAtributos(BMWViewBuilder objBMWView) {
        boolean sistemaE = objBMWView.getCmbSElevacion().equals(SI);
        boolean navegacion = objBMWView.getCmbNavegacionIS().equals(SI);
        String diseñoInt = objBMWView.getCmbDiseñoIntValue();
        int orderId = Integer.parseInt(objBMWView.getTxtOrderId().getText());
        boolean convertible = objBMWView.getCmbConvertible().equals(SI);
        boolean receptorDAB = objBMWView.getCmbReceptorDAB().equals(SI);
        String faros = objBMWView.getCmbFaros();
        //String color = objLamborghiniView.
        String rines = objBMWView.getCmbRines();
        String modelo = objBMWView.getCmbModeloValue();
        
        HashMap<String, Object> data = generarData(sistemaE,navegacion,diseñoInt,orderId,convertible,receptorDAB,faros,rines,modelo);
        Vector valores = obtenerValores(sistemaE,navegacion,diseñoInt,orderId,convertible,receptorDAB,faros,rines,modelo);
        
        return new BMWOrder();
    }

    private HashMap<String, Object> generarData(boolean sistemaE, boolean navegacion, String diseñoInt, int orderId, boolean convertible, boolean receptorDAB, String faros, String rines, String modelo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Vector obtenerValores(boolean sistemaE, boolean navegacion, String diseñoInt, int orderId, boolean convertible, boolean receptorDAB, String faros, String rines, String modelo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


} // End of class ButtonHandler
