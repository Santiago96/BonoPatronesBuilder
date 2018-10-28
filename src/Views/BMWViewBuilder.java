/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Model.AllBMWOrders;
import Model.BMWOrder;
import static Views.MainView.*;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JLabel;

/**
 *
 * @author Santiago
 */
public final class BMWViewBuilder extends MainView implements IViewBuilder {

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

    public BMWViewBuilder() {
        super();
        initializeGeneralForm();
        initializePersonalizeForm();
        addEvents();
        addComponents();
        componentsPosition();
        
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

        super.getTxtOrderId().setText(String.valueOf(AllBMWOrders.getAllBMWOrders().getData().size() + 1));

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

    public String getCmbModeloValue() {
        return (String) cmbModelo.getSelectedItem();
    }

    public String getCmbDiseñoIntValue() {
        return (String) cmbDiseñoInt.getSelectedItem();
    }

    public String getCmbNavegacionISValue() {
        return (String) cmbNavegacionIS.getSelectedItem();
    }

    public String getCmbSElevacionValue() {
        return (String) cmbSElevacion.getSelectedItem();
    }

    public JComboBox getCmbModelo() {
        return cmbModelo;
    }

    public JComboBox getCmbDiseñoInt() {
        return cmbDiseñoInt;
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

    int orderID = 1;

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals(EXIT)) {
            System.exit(1);
        }
        if (e.getActionCommand().equals(CREATE_ORDER)) {           
            BMWOrder bmw = capturarAtributos(objBMWView);
            AllBMWOrders allBMW = AllBMWOrders.getAllBMWOrders();
            allBMW.agregarAuto(bmw);
            //System.out.println("\nOrden " + ((MainView) objBMWView).getTxtOrderId().getText() + " Creada - BMW");
            //System.out.println("Tamaño Coleccion BMW: " + allBMW.getData().size());
            orderID = allBMW.getData().size() + 1;
            ((MainView) objBMWView).getTxtOrderId().setText(String.valueOf(orderID));

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
        
        String sistemaE = objBMWView.getCmbSElevacionValue();
        String navegacion = objBMWView.getCmbNavegacionISValue();
        String diseñoInt = objBMWView.getCmbDiseñoIntValue();
        int orderId = Integer.parseInt(objBMWView.getTxtOrderId().getText());
        String convertible = objBMWView.getCmbConvertibleValue();
        String receptorDAB = objBMWView.getCmbReceptorDABValue();
        String faros = objBMWView.getCmbFarosValue();
        String color = objBMWView.getCmbColorValue();
        String rines = objBMWView.getCmbRinesValue();
        String modelo = objBMWView.getCmbModeloValue();
        
        HashMap<String, Object> data = generarData(sistemaE, navegacion, diseñoInt, orderId, convertible, receptorDAB, faros, color, rines, modelo);
        Vector valores = obtenerValores(sistemaE, navegacion, diseñoInt, orderId, convertible, receptorDAB, faros, color, rines, modelo);

        return new BMWOrder(orderID, (double) valores.get(0), (double) valores.get(1), (double) valores.get(2), (double) valores.get(3), (double) valores.get(4), (double) valores.get(5), (double) valores.get(6), (double) valores.get(7), (double) valores.get(8), data);
    }

    public static HashMap<String, Object> generarData(String sistemaE, String navegacion, String diseñoInt, int orderId, String convertible, String receptorDAB, String faros, String color, String rines, String modelo) {
        HashMap<String, Object> data = new HashMap();
        data.put("SistemaElevacion", sistemaE);
        data.put("Navegacion", navegacion);
        data.put("DiseñoInterior", diseñoInt);
        data.put("Order", orderId);
        data.put("Convertible", convertible);
        data.put("Receptor", receptorDAB);
        data.put("Faros", faros);
        data.put("Color", color);
        data.put("Rines", rines);
        data.put("Modelo", modelo);
        return data;
    }

    public static Vector obtenerValores(String sistemaE, String navegacion, String diseñoInt, int orderId, String convertible, String receptorDAB, String faros, String color, String rines, String modelo) {
        Vector valores = new Vector();
        //boolean receptorDAB, String faros, String rines, String modelo 
        if (convertible.equals(SI)) {
            valores.add(320.0);
        } else {
            valores.add(0.0);
        }
        if (receptorDAB.equals(SI)) {
            valores.add(80.0);
        } else {
            valores.add(0.0);
        }
        if (faros.equals(LED)) {
            valores.add(30.0);
        } else if (faros.equals(LASER)) {
            valores.add(50.0);
        } else {
            valores.add(0.0);
        }

        if (color.equals(METALICO)) {
            valores.add(60.0);
        } else if (color.equals(NOMETALICO)) {
            valores.add(50.0);
        } else if (color.equals(HISTORICO) || color.equals(ESPECIAL)) {
            valores.add(70.0);
        } else {
            valores.add(0.0);
        }

        if (rines.equals(R20)) {
            valores.add(65.0);
        } else if (rines.equals(R21)) {
            valores.add(70.0);
        } else {
            valores.add(0.0);
        }
        valores.add(350.0);
        if (sistemaE.equals(SI)) {
            valores.add(100.0);
        } else {
            valores.add(0.0);
        }
        if (navegacion.equals(SI)) {
            valores.add(500.0);
        } else {
            valores.add(0.0);
        }

        valores.add(120.0);

        return valores;
    }

} // End of class ButtonHandler
