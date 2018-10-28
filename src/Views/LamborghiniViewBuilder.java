/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Model.AllLamborghiniOrders;
import Model.LamborghiniOrder;
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
public final class LamborghiniViewBuilder extends MainView implements IViewBuilder {

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
        super();
        initializeGeneralForm();
        initializePersonalizeForm();
        addEvents();
        addComponents();
        componentsPosition();
        
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

        super.getTxtOrderId().setText(String.valueOf(AllLamborghiniOrders.getAllLamborghiniOrders().getData().size() + 1));

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

    public String getCmbModeloValue() {
        return (String) cmbModelo.getSelectedItem();
    }

    public String getCmbSuspensionMRValue() {
        return (String) cmbSuspensionMR.getSelectedItem();
    }

    public String getCmbSEDeportivoValue() {
        return (String) cmbSEDeportivo.getSelectedItem();
    }

    public String getCmbTelemetriaLValue() {
        return (String) cmbTelemetriaL.getSelectedItem();
    }

    public JComboBox getCmbModelo() {
        return cmbModelo;
    }

    public JComboBox getCmbSuspensionMR() {
        return cmbSuspensionMR;
    }

    public JComboBox getCmbSEDeportivo() {
        return cmbSEDeportivo;
    }

    public JComboBox getCmbTelemetriaL() {
        return cmbTelemetriaL;
    }

    public JLabel getLblModelo() {
        return lblModelo;
    }

    public JLabel getLblSuspensionMR() {
        return lblSuspensionMR;
    }

    public JLabel getLblSEDeportivo() {
        return lblSEDeportivo;
    }

    public JLabel getLblTelemetriaL() {
        return lblTelemetriaL;
    }

}

class ButtonHandlerL implements ActionListener {

    LamborghiniViewBuilder objLamborghiniView;
    int orderID = 1;

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals(EXIT)) {
            System.exit(1);
        }
        if (e.getActionCommand().equals(CREATE_ORDER)) {

            //Crear objeto de tipo Lambo pasando por parametro los datos
            LamborghiniOrder lambo = capturarAtributos(objLamborghiniView);
            AllLamborghiniOrders allLamborghini = AllLamborghiniOrders.getAllLamborghiniOrders();
            allLamborghini.agregarAuto(lambo);
            System.out.println("\nOrden " + ((MainView) objLamborghiniView).getTxtOrderId().getText() + " Lamborghini");
            System.out.println("Tamaño Coleccion Lambo: " + allLamborghini.getData().size());
            orderID = allLamborghini.getData().size() + 1;
            ((MainView) objLamborghiniView).getTxtOrderId().setText(String.valueOf(orderID));

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

    private LamborghiniOrder capturarAtributos(LamborghiniViewBuilder objLamborghiniView) {
        String suspensionMR = (String) objLamborghiniView.getCmbSuspensionMR().getSelectedItem();
        String sEDeportivo = (String) objLamborghiniView.getCmbSEDeportivo().getSelectedItem();
        String telemetriaL = (String) objLamborghiniView.getCmbTelemetriaL().getSelectedItem();
        int orderId = Integer.parseInt(objLamborghiniView.getTxtOrderId().getText());
        String convertible = objLamborghiniView.getCmbConvertibleValue();
        String receptorDAB = objLamborghiniView.getCmbReceptorDABValue();
        String faros = objLamborghiniView.getCmbFarosValue();
        String color = objLamborghiniView.getCmbColorValue();
        String rines = objLamborghiniView.getCmbRinesValue();
        String modelo = objLamborghiniView.getCmbModeloValue();

        HashMap<String, Object> data = generarData(suspensionMR, sEDeportivo, telemetriaL, orderId, convertible, receptorDAB, faros, color, rines, modelo);
        Vector valores = obtenerValores(suspensionMR, sEDeportivo, telemetriaL, orderId, convertible, receptorDAB, faros, color, rines, modelo);
        return new LamborghiniOrder(orderID, (double) valores.get(0), (double) valores.get(1), (double) valores.get(2), (double) valores.get(3), (double) valores.get(4), (double) valores.get(5), (double) valores.get(6), (double) valores.get(7), (double) valores.get(8), data);

    }

    public static HashMap<String, Object> generarData(String suspensionMR, String sEDeportivo, String telemetriaL, int orderId, String convertible, String receptorDAB, String faros, String color, String rines, String modelo) {
        HashMap<String, Object> data = new HashMap();
        data.put("Suspension", suspensionMR);
        data.put("Deportivo", sEDeportivo);
        data.put("Telemetria", telemetriaL);
        data.put("Order", orderId);
        data.put("Convertible", convertible);
        data.put("Receptor", receptorDAB);
        data.put("Faros", faros);
        data.put("Color", color);
        data.put("Rines", rines);
        data.put("Modelo", modelo);
        return data;
    }

    public static Vector obtenerValores(String suspensionMR, String sEDeportivo, String telemetriaL, int orderId, String convertible, String receptorDAB, String faros, String color, String rines, String modelo) {
        Vector valores = new Vector();        
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
        if (suspensionMR.equals(SI)) {
            valores.add(100.0);
        } else {
            valores.add(0.0);
        }
        if (sEDeportivo.equals(SI)) {
            valores.add(500.0);
        } else {
            valores.add(0.0);
        }
        if (telemetriaL.equals(SI)) {
            valores.add(120.0);
        } else {
            valores.add(0.0);
        }
        return valores;
    }

}
