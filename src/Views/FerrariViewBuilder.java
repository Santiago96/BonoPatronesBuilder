/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import static Views.MainView.CREATE_ORDER;
import static Views.MainView.EXIT;
import static Views.MainView.REGRESAR;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JLabel;

/**
 *
 * @author Santiago
 */
public class FerrariViewBuilder extends MainView implements IViewBuilder {

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
        initializeGeneralForm();
        initializePersonalizeForm();
        addComponents();
        componentsPosition();
        addEvents();

    }

    @Override
    public void initializeGeneralForm() {
        super.setTitle("Ferrari Order");
        super.setSize(400, 400);
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

}

class ButtonHandlerF implements ActionListener {

    FerrariViewBuilder objFerrariView;

    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals(EXIT)) {
            System.exit(1);
        }
        if (e.getActionCommand().equals(CREATE_ORDER)) {
            //Capturar Atributos
            /*int orderId = Integer.parseInt(objFerrariView.getOrderID());
            boolean convertible = objFerrariView.getCmbConvertible().equals(FerrariView.SI);
            boolean receptorDAB = objFerrariView.getCmbReceptorDAB().equals(FerrariView.SI);
            String faros = objFerrariView.getCmbFaros();
            //String color = objLamborghiniView.
            String rines = objFerrariView.getCmbRines();
            String modelo = objFerrariView.getCmbModelo();
            boolean tapacubos = objFerrariView.getCmbTapacubos().equals(FerrariView.SI);
            boolean elevadorSus = objFerrariView.getCmbElevadorSus().equals(FerrariView.SI);
            boolean camaraFrontal = objFerrariView.getCmbCamaraFrontal().equals(FerrariView.SI);

            System.out.println(orderId + "\n" + convertible + "\n"
                    + receptorDAB + "\n" + faros + "\n" + rines + "\n" + modelo
                    + "\n" + tapacubos + "\n" + elevadorSus + "\n" + camaraFrontal);
            
            FerrariOrderBuilder builderFerrari = FerrariOrderBuilder.getFerrariOrderBuilder();
            OrderDirector orderDirector = new OrderDirector(builderFerrari);
            orderDirector.agregarVehiculo(orderId,convertible,receptorDAB,faros,rines,modelo,tapacubos,elevadorSus,camaraFrontal);

             */

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

} // End of class ButtonHandler
