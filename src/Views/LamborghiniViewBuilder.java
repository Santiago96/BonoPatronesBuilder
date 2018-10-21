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
public class LamborghiniViewBuilder extends MainView implements IViewBuilder {

    public static final String URUS = "Urus";
    public static final String HURACAN = "Huracán";
    public static final String AVENTADOR = "Aventador";
    public static final String FEW = "Few Off";
    public static final String CONCEPT = "Concept";
    public static final String AD = "Ad";
    public static final String PERSONAM = "Personam";

    private JComboBox cmbModelo;
    private JComboBox cmbSuspensionMR;
    private JComboBox cmbSEDeportivo;
    private JComboBox cmbTelemetriaL;

    private JLabel lblModelo, lblSuspensionMR, lblSEDeportivo, lblTelemetriaL;

    public LamborghiniViewBuilder() {
        initializeGeneralForm();
        initializePersonalizeForm();
        addComponents();
        componentsPosition();
        addEvents();
    }

    @Override
    public void initializeGeneralForm() {
        super.setTitle("Lamborghini Order");
        super.setSize(400, 400);
    }

    @Override
    public void initializePersonalizeForm() {
        cmbModelo = new JComboBox();
        cmbModelo.addItem(URUS);
        cmbModelo.addItem(HURACAN);
        cmbModelo.addItem(AVENTADOR);
        cmbModelo.addItem(FEW);
        cmbModelo.addItem(CONCEPT);
        cmbModelo.addItem(AD);
        cmbModelo.addItem(PERSONAM);

        cmbSuspensionMR = new JComboBox();
        cmbSuspensionMR.addItem(SI);
        cmbSuspensionMR.addItem(NO);

        cmbSEDeportivo = new JComboBox();
        cmbSEDeportivo.addItem(SI);
        cmbSEDeportivo.addItem(NO);

        cmbTelemetriaL = new JComboBox();
        cmbTelemetriaL.addItem(SI);
        cmbTelemetriaL.addItem(NO);

        lblModelo = new JLabel("Modelo:");
        lblSuspensionMR = new JLabel("Suspensión Magnética Reológica:");
        lblSEDeportivo = new JLabel("Sistema de escape deportivo");
        lblTelemetriaL = new JLabel("Telemetria Lamborghini:");

    }

    @Override
    public void addComponents() {
        super.getButtonPanel().add(cmbModelo);
        super.getButtonPanel().add(cmbSuspensionMR);
        super.getButtonPanel().add(cmbSEDeportivo);
        super.getButtonPanel().add(cmbTelemetriaL);

        super.getButtonPanel().add(lblModelo);
        super.getButtonPanel().add(lblSuspensionMR);
        super.getButtonPanel().add(lblSEDeportivo);
        super.getButtonPanel().add(lblTelemetriaL);
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
        super.getGridbag().setConstraints(lblSuspensionMR, super.getGbc());
        super.getGbc().anchor = GridBagConstraints.WEST;
        super.getGbc().gridx = 1;
        super.getGbc().gridy = 7;
        super.getGridbag().setConstraints(cmbSuspensionMR, super.getGbc());

        super.getGbc().anchor = GridBagConstraints.EAST;
        super.getGbc().gridx = 0;
        super.getGbc().gridy = 8;
        super.getGridbag().setConstraints(lblSEDeportivo, super.getGbc());
        super.getGbc().anchor = GridBagConstraints.WEST;
        super.getGbc().gridx = 1;
        super.getGbc().gridy = 8;
        super.getGridbag().setConstraints(cmbSEDeportivo, super.getGbc());

        super.getGbc().anchor = GridBagConstraints.EAST;
        super.getGbc().gridx = 0;
        super.getGbc().gridy = 9;
        super.getGridbag().setConstraints(lblTelemetriaL, super.getGbc());
        super.getGbc().anchor = GridBagConstraints.WEST;
        super.getGbc().gridx = 1;
        super.getGbc().gridy = 9;
        super.getGridbag().setConstraints(cmbTelemetriaL, super.getGbc());

        super.getGbc().insets.left = 2;
        super.getGbc().insets.right = 2;
        super.getGbc().insets.top = 40;
    }

    @Override
    public void addEvents() {
        ButtonHandlerL objButtonHandler = new ButtonHandlerL(this);

        super.getRegresarButton().addActionListener(objButtonHandler);
        super.getCreateOrderButton().addActionListener(objButtonHandler);
        super.getExitButton().addActionListener(new ButtonHandler());
    }

    @Override
    public void launchView() {
        this.setVisible(true);
    }

}

class ButtonHandlerL implements ActionListener {

    LamborghiniViewBuilder objLamborghiniView;

    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals(EXIT)) {
            System.exit(1);
        }
        if (e.getActionCommand().equals(CREATE_ORDER)) {
            /*
            //Capturar Atributos
            boolean suspensionMR = objLamborghiniView.getCmbSuspensionMR().equals("Si");
            boolean sEDeportivo = objLamborghiniView.getCmbSEDeportivo().equals("Si");
            boolean telemetriaL = objLamborghiniView.getCmbTelemetriaL().equals("Si");
            int orderId = Integer.parseInt(objLamborghiniView.getOrderID());
            boolean convertible = objLamborghiniView.getCmbConvertible().equals("Si");
            boolean receptorDAB = objLamborghiniView.getCmbReceptorDAB().equals("Si");
            String faros = objLamborghiniView.getCmbFaros();
            //String color = objLamborghiniView.
            String rines = objLamborghiniView.getCmbRines();
            String modelo = objLamborghiniView.getCmbModelo();

            //Crear objeto de tipo Lambo pasando por parametro los datos
            Lamborghini lambo = new Lamborghini(suspensionMR, sEDeportivo, telemetriaL, orderId, convertible, receptorDAB, faros, modelo, rines, modelo);

            //Enviar al Builder
            LamborghiniOrderBuilder l = LamborghiniOrderBuilder.getLamborghiniOrderBuilder();
            l.agregarVehiculo(lambo);*/

        }

        if (e.getActionCommand().equals(REGRESAR)) {
            objLamborghiniView.setVisible(false);
            //objLamborghiniView.objOrderManager.setVisible(true);
        }
    }

    public ButtonHandlerL() {
    }

    public ButtonHandlerL(LamborghiniViewBuilder inObjLamborghiniView) {
        objLamborghiniView = inObjLamborghiniView;
    }

}
