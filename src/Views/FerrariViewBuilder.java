/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Model.AllFerrariOrders;
import Model.FerrariOrder;
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
public final class FerrariViewBuilder extends MainView implements IViewBuilder {

    public static final String SUPER = "812 SuperFast";
    public static final String SPIDER = "488 Spider";
    public static final String GTC = "GTC4Lusso T";
    public static final String PORTOFINO = "Portofino";

    private JComboBox cmbModelo;
    private JComboBox cmbTapacubos;
    private JComboBox cmbElevadorSus;
    private JComboBox cmbCamaraFrontal;

    private JLabel lblModelo, lblTapacubos, lblElevadorSus, lblCamaraFrontal;

    public FerrariViewBuilder() {
        super();
        initializeGeneralForm();
        initializePersonalizeForm();
        addEvents();
        addComponents();
        componentsPosition();
        

    }

    @Override
    public void initializeGeneralForm() {
        setTitle("Ferrari Order");
        setSize(400, 400);
    }

    @Override
    public void initializePersonalizeForm() {
        cmbModelo = new JComboBox();
        cmbModelo.addItem(SUPER);
        cmbModelo.addItem(SPIDER);
        cmbModelo.addItem(GTC);
        cmbModelo.addItem(PORTOFINO);

        cmbTapacubos = new JComboBox();
        cmbTapacubos.addItem(SI);
        cmbTapacubos.addItem(NO);

        cmbElevadorSus = new JComboBox();
        cmbElevadorSus.addItem(SI);
        cmbElevadorSus.addItem(NO);

        cmbCamaraFrontal = new JComboBox();
        cmbCamaraFrontal.addItem(SI);
        cmbCamaraFrontal.addItem(NO);

        lblModelo = new JLabel("Modelo:");
        lblTapacubos = new JLabel("Tapacubos fibra Carbono:");
        lblElevadorSus = new JLabel("Elevador de Suspensión");
        lblCamaraFrontal = new JLabel("Cámara frontal (Dos vistas):");

        super.getTxtOrderId().setText(String.valueOf(AllFerrariOrders.getAllFerrariOrders().getData().size() + 1));
    }

    @Override
    public void addComponents() {

        super.getButtonPanel().add(cmbModelo);
        super.getButtonPanel().add(cmbTapacubos);
        super.getButtonPanel().add(cmbElevadorSus);
        super.getButtonPanel().add(cmbCamaraFrontal);

        super.getButtonPanel().add(lblModelo);
        super.getButtonPanel().add(lblTapacubos);
        super.getButtonPanel().add(lblElevadorSus);
        super.getButtonPanel().add(lblCamaraFrontal);

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
        super.getGridbag().setConstraints(lblTapacubos, super.getGbc());
        super.getGbc().anchor = GridBagConstraints.WEST;
        super.getGbc().gridx = 1;
        super.getGbc().gridy = 7;
        super.getGridbag().setConstraints(cmbTapacubos, super.getGbc());

        super.getGbc().anchor = GridBagConstraints.EAST;
        super.getGbc().gridx = 0;
        super.getGbc().gridy = 8;
        super.getGridbag().setConstraints(lblElevadorSus, super.getGbc());
        super.getGbc().anchor = GridBagConstraints.WEST;
        super.getGbc().gridx = 1;
        super.getGbc().gridy = 8;
        super.getGridbag().setConstraints(cmbElevadorSus, super.getGbc());

        super.getGbc().anchor = GridBagConstraints.EAST;
        super.getGbc().gridx = 0;
        super.getGbc().gridy = 9;
        super.getGridbag().setConstraints(lblCamaraFrontal, super.getGbc());
        super.getGbc().anchor = GridBagConstraints.WEST;
        super.getGbc().gridx = 1;
        super.getGbc().gridy = 9;
        super.getGridbag().setConstraints(cmbCamaraFrontal, super.getGbc());

        super.getGbc().insets.left = 2;
        super.getGbc().insets.right = 2;
        super.getGbc().insets.top = 40;

    }

    @Override
    public void addEvents() {
        ButtonHandlerF objButtonHandler = new ButtonHandlerF(this);

        super.getRegresarButton().addActionListener(objButtonHandler);
        super.getCreateOrderButton().addActionListener(objButtonHandler);
        super.getExitButton().addActionListener(new ButtonHandler());

    }

    @Override
    public void launchView() {
        this.setVisible(true);
    }

    public String getCmbModeloValue() {
        return (String) cmbModelo.getSelectedItem();
    }

    public String getCmbTapacubosValue() {
        return (String) cmbTapacubos.getSelectedItem();
    }

    public String getCmbElevadorSusValue() {
        return (String) cmbElevadorSus.getSelectedItem();
    }

    public String getCmbCamaraFrontalValue() {
        return (String) cmbCamaraFrontal.getSelectedItem();
    }

    public JComboBox getCmbModelo() {
        return cmbModelo;
    }

    public JComboBox getCmbTapacubos() {
        return cmbTapacubos;
    }

    public JComboBox getCmbElevadorSus() {
        return cmbElevadorSus;
    }

    public JComboBox getCmbCamaraFrontal() {
        return cmbCamaraFrontal;
    }

    public JLabel getLblModelo() {
        return lblModelo;
    }

    public JLabel getLblTapacubos() {
        return lblTapacubos;
    }

    public JLabel getLblElevadorSus() {
        return lblElevadorSus;
    }

    public JLabel getLblCamaraFrontal() {
        return lblCamaraFrontal;
    }

}

class ButtonHandlerF implements ActionListener {

    FerrariViewBuilder objFerrariView;
    int orderID = 1;

    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals(EXIT)) {
            System.exit(1);
        }
        if (e.getActionCommand().equals(CREATE_ORDER)) {

            FerrariOrder ferrari = capturarAtributos(objFerrariView);
            AllFerrariOrders allFerrari = AllFerrariOrders.getAllFerrariOrders();
            allFerrari.agregarAuto(ferrari);
            System.out.println("\nOrden " + ((MainView) objFerrariView).getTxtOrderId().getText() + " Creada - Ferrari");
            System.out.println("Tamaño Coleccion Ferrari: " + allFerrari.getData().size());
            orderID = allFerrari.getData().size() + 1;
            ((MainView) objFerrariView).getTxtOrderId().setText(String.valueOf(orderID));
        }

        if (e.getActionCommand().equals(REGRESAR)) {
            objFerrariView.setVisible(false);
            //objFerrariView.objOrderManager.setVisible(true);
        }
    }

    public ButtonHandlerF() {
    }

    public ButtonHandlerF(FerrariViewBuilder inObjFerrariView) {
        objFerrariView = inObjFerrariView;
    }

    private FerrariOrder capturarAtributos(FerrariViewBuilder objFerrariView) {
        
        String tapacubos = objFerrariView.getCmbTapacubosValue();
        String elevadorSus = objFerrariView.getCmbElevadorSusValue();
        String camaraFrontal = objFerrariView.getCmbCamaraFrontalValue();
        int orderId = Integer.parseInt(objFerrariView.getTxtOrderId().getText());
        String convertible = objFerrariView.getCmbConvertibleValue();
        String receptorDAB = objFerrariView.getCmbReceptorDABValue();
        String faros = objFerrariView.getCmbFarosValue();
        String color = objFerrariView.getCmbColorValue();
        String rines = objFerrariView.getCmbRinesValue();
        String modelo = objFerrariView.getCmbModeloValue();

        HashMap<String, Object> data = generarData(tapacubos, elevadorSus, camaraFrontal, orderId, convertible, receptorDAB, faros, color, rines, modelo);
        Vector valores = obtenerValores(tapacubos, elevadorSus, camaraFrontal, orderId, convertible, receptorDAB, faros, color, rines, modelo);

        return new FerrariOrder(orderID, (double) valores.get(0), (double) valores.get(1), (double) valores.get(2), (double) valores.get(3), (double) valores.get(4), (double) valores.get(5), (double) valores.get(6), (double) valores.get(7), (double) valores.get(8), data);
    }

    public static HashMap<String, Object> generarData(String tapacubos, String elevadorSus, String camaraFrontal, int orderId, String convertible, String receptorDAB, String faros, String color, String rines, String modelo) {
        HashMap<String, Object> data = new HashMap();
        data.put("TapaCubos", tapacubos);
        data.put("ElevadorSuspension", elevadorSus);
        data.put("CamaraFrontal", camaraFrontal);
        data.put("Order", orderId);
        data.put("Convertible", convertible);
        data.put("Receptor", receptorDAB);
        data.put("Faros", faros);
        data.put("Color", color);
        data.put("Rines", rines);
        data.put("Modelo", modelo);
        return data;
    }

    public static Vector obtenerValores(String tapacubos, String elevadorSus, String camaraFrontal, int orderId, String convertible, String receptorDAB, String faros, String color, String rines, String modelo) {
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
        if (tapacubos.equals(SI)) {
            valores.add(100.0);
        } else {
            valores.add(0.0);
        }
        if (elevadorSus.equals(SI)) {
            valores.add(500.0);
        } else {
            valores.add(0.0);
        }
        if (camaraFrontal.equals(SI)) {
            valores.add(120.0);
        } else {
            valores.add(0.0);
        }
        return valores;
    }

} // End of class ButtonHandler
