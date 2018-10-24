/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Model.BMWOrder;
import Model.FerrariOrder;
import Model.LamborghiniOrder;
import Model.Order;
import static Views.MainView.EXIT;
import static Views.MainView.REGRESAR;
import static Views.QueryViewBuilder.EDIT;
import static Views.QueryViewBuilder.SAVE;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;

/**
 *
 * @author Santiago
 */
public class QueryViewBuilder extends MainView implements IViewBuilder {

    public static final String EDIT = "Edit";
    public static final String SAVE = "Save";

    MainView view;

    private JComboBox cmb1;
    private JComboBox cmb2;
    private JComboBox cmb3;
    private JComboBox cmb4;

    private JLabel lbl1;
    private JLabel lbl2;
    private JLabel lbl3;
    private JLabel lbl4;

    private JButton btnEditar, btnGuardar, btnRegresar, btnSalir;

    private Order order;

    public QueryViewBuilder(MainView view, Order order) {
        this.view = view;
        this.order = order;
        initializeGeneralForm();
        initializePersonalizeForm();
        addComponents();
        componentsPosition();
        addEvents();

    }

    @Override
    public void initializeGeneralForm() {

        super.setTitle("Query View");
        super.setSize(450, 450);
    }

    private void setValuesFerrariOrder(FerrariOrder fOrder) {
        cmb1.setSelectedItem(fOrder.getDatos().get("Modelo"));
        cmb2.setSelectedItem(fOrder.getDatos().get("TapaCubos"));
        cmb3.setSelectedItem(fOrder.getDatos().get("ElevadorSuspension"));
        cmb4.setSelectedItem(fOrder.getDatos().get("CamaraFrontal"));

        super.getCmbConvertible().setSelectedItem(fOrder.getDatos().get("Convertible"));
        super.getCmbFaros().setSelectedItem(fOrder.getDatos().get("Faros"));
        super.getCmbReceptorDAB().setSelectedItem(fOrder.getDatos().get("Receptor"));
        super.getCmbRines().setSelectedItem(fOrder.getDatos().get("Rines"));

    }

    private void setValuesBMWOrder(BMWOrder bmwOrder) {
        cmb1.setSelectedItem(bmwOrder.getDatos().get("Modelo"));
        cmb2.setSelectedItem(bmwOrder.getDatos().get("DiseñoInterior"));
        cmb3.setSelectedItem(bmwOrder.getDatos().get("Navegacion"));
        cmb4.setSelectedItem(bmwOrder.getDatos().get("SistemaElevacion"));

        super.getCmbConvertible().setSelectedItem(bmwOrder.getDatos().get("Convertible"));
        super.getCmbFaros().setSelectedItem(bmwOrder.getDatos().get("Faros"));
        super.getCmbReceptorDAB().setSelectedItem(bmwOrder.getDatos().get("Receptor"));
        super.getCmbRines().setSelectedItem(bmwOrder.getDatos().get("Rines"));

    }

    private void setValuesLamborghini(LamborghiniOrder lamborghiniOrder) {
        cmb1.setSelectedItem(lamborghiniOrder.getDatos().get("Modelo"));
        cmb2.setSelectedItem(lamborghiniOrder.getDatos().get("Suspension"));
        cmb3.setSelectedItem(lamborghiniOrder.getDatos().get("Deportivo"));
        cmb4.setSelectedItem(lamborghiniOrder.getDatos().get("Telemetria"));

        super.getCmbConvertible().setSelectedItem(lamborghiniOrder.getDatos().get("Convertible"));
        super.getCmbFaros().setSelectedItem(lamborghiniOrder.getDatos().get("Faros"));
        super.getCmbReceptorDAB().setSelectedItem(lamborghiniOrder.getDatos().get("Receptor"));
        super.getCmbRines().setSelectedItem(lamborghiniOrder.getDatos().get("Rines"));

    }

    @Override
    public void initializePersonalizeForm() {
        if (view instanceof FerrariViewBuilder) {
            //Inicializar 
            cmb1 = ((FerrariViewBuilder) view).getCmbModelo();
            cmb2 = ((FerrariViewBuilder) view).getCmbTapacubos();
            cmb3 = ((FerrariViewBuilder) view).getCmbElevadorSus();
            cmb4 = ((FerrariViewBuilder) view).getCmbCamaraFrontal();

            lbl1 = ((FerrariViewBuilder) view).getLblModelo();
            lbl2 = ((FerrariViewBuilder) view).getLblTapacubos();
            lbl3 = ((FerrariViewBuilder) view).getLblElevadorSus();
            lbl4 = ((FerrariViewBuilder) view).getLblCamaraFrontal();

            super.getTxtOrderId().setText(String.valueOf(((FerrariOrder) order).getOrderId()));

            setValuesFerrariOrder((FerrariOrder) order);

        }
        if (view instanceof BMWViewBuilder) {
            cmb1 = ((BMWViewBuilder) view).getCmbModelo();
            cmb2 = ((BMWViewBuilder) view).getCmbDiseñoInt();
            cmb3 = ((BMWViewBuilder) view).getCmbNavegacionIS();
            cmb4 = ((BMWViewBuilder) view).getCmbSElevacion();

            lbl1 = ((BMWViewBuilder) view).getLblModelo();
            lbl2 = ((BMWViewBuilder) view).getLblDiseñoInt();
            lbl3 = ((BMWViewBuilder) view).getLblNavegacionIS();
            lbl4 = ((BMWViewBuilder) view).getLblSElevacion();

            super.getTxtOrderId().setText(String.valueOf(((BMWOrder) order).getOrderId()));
            setValuesBMWOrder((BMWOrder) order);
        }
        if (view instanceof LamborghiniViewBuilder) {
            cmb1 = ((LamborghiniViewBuilder) view).getCmbModelo();
            cmb2 = ((LamborghiniViewBuilder) view).getCmbSuspensionMR();
            cmb3 = ((LamborghiniViewBuilder) view).getCmbSEDeportivo();
            cmb4 = ((LamborghiniViewBuilder) view).getCmbTelemetriaL();

            lbl1 = ((LamborghiniViewBuilder) view).getLblModelo();
            lbl2 = ((LamborghiniViewBuilder) view).getLblSuspensionMR();
            lbl3 = ((LamborghiniViewBuilder) view).getLblSEDeportivo();
            lbl4 = ((LamborghiniViewBuilder) view).getLblTelemetriaL();

            super.getTxtOrderId().setText(String.valueOf(((LamborghiniOrder) order).getOrderId()));

            setValuesLamborghini((LamborghiniOrder) order);
        }

        atributos(false);

        btnEditar = new JButton(EDIT);
        btnGuardar = new JButton(SAVE);
        btnRegresar = new JButton(REGRESAR);
        btnSalir = new JButton(EXIT);
    }

    @Override
    public void addComponents() {
        super.getButtonPanel().add(cmb1);
        super.getButtonPanel().add(cmb2);
        super.getButtonPanel().add(cmb3);
        super.getButtonPanel().add(cmb4);

        super.getButtonPanel().add(lbl1);
        super.getButtonPanel().add(lbl2);
        super.getButtonPanel().add(lbl3);
        super.getButtonPanel().add(lbl4);

        super.getPanel().add(btnGuardar);
        super.getPanel().add(btnEditar);
        super.getPanel().add(btnRegresar);
        super.getPanel().add(btnSalir);

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
        super.getGridbag().setConstraints(lbl1, super.getGbc());
        super.getGbc().anchor = GridBagConstraints.WEST;
        super.getGbc().gridx = 1;
        super.getGbc().gridy = 6;
        super.getGridbag().setConstraints(cmb1, super.getGbc());

        super.getGbc().anchor = GridBagConstraints.EAST;
        super.getGbc().gridx = 0;
        super.getGbc().gridy = 7;
        super.getGridbag().setConstraints(lbl2, super.getGbc());
        super.getGbc().anchor = GridBagConstraints.WEST;
        super.getGbc().gridx = 1;
        super.getGbc().gridy = 7;
        super.getGridbag().setConstraints(cmb2, super.getGbc());

        super.getGbc().anchor = GridBagConstraints.EAST;
        super.getGbc().gridx = 0;
        super.getGbc().gridy = 8;
        super.getGridbag().setConstraints(lbl3, super.getGbc());
        super.getGbc().anchor = GridBagConstraints.WEST;
        super.getGbc().gridx = 1;
        super.getGbc().gridy = 8;
        super.getGridbag().setConstraints(cmb3, super.getGbc());

        super.getGbc().anchor = GridBagConstraints.EAST;
        super.getGbc().gridx = 0;
        super.getGbc().gridy = 9;
        super.getGridbag().setConstraints(lbl4, super.getGbc());
        super.getGbc().anchor = GridBagConstraints.WEST;
        super.getGbc().gridx = 1;
        super.getGbc().gridy = 9;
        super.getGridbag().setConstraints(cmb4, super.getGbc());

        super.getGbc().insets.left = 2;
        super.getGbc().insets.right = 2;
        super.getGbc().insets.top = 40;

        super.getGbc2().anchor = GridBagConstraints.EAST;
        super.getGbc2().gridx = 0;
        super.getGbc2().gridy = 0;
        super.getGridbag2().setConstraints(btnGuardar, super.getGbc2());
        super.getGbc2().gridx = 1;
        super.getGbc2().gridy = 0;
        super.getGridbag2().setConstraints(btnEditar, super.getGbc2());
        super.getGbc2().gridx = 2;
        super.getGbc2().gridy = 0;
        super.getGridbag2().setConstraints(btnRegresar, super.getGbc2());

        hideButtons();
    }

    private void hideButtons() {
        super.getRegresarButton().setVisible(false);
        super.getCreateOrderButton().setVisible(false);
        super.getExitButton().setVisible(false);
    }

    @Override
    public void addEvents() {
        ButtonHandlerQ objButtonHandler = new ButtonHandlerQ(this);

        btnGuardar.addActionListener(objButtonHandler);
        btnEditar.addActionListener(objButtonHandler);
        btnRegresar.addActionListener(objButtonHandler);
        btnSalir.addActionListener(new ButtonHandlerQ());
    }

    @Override
    public void launchView() {
        this.setVisible(true);
    }

    public void atributos(boolean b) {
        cmb1.setEnabled(b);
        cmb2.setEnabled(b);
        cmb3.setEnabled(b);
        cmb4.setEnabled(b);
        super.getCmbConvertible().setEnabled(b);
        super.getCmbFaros().setEnabled(b);
        super.getCmbReceptorDAB().setEnabled(b);
        super.getCmbRines().setEnabled(b);

    }

    public JComboBox getCmb1() {
        return cmb1;
    }

    public JComboBox getCmb2() {
        return cmb2;
    }

    public JComboBox getCmb3() {
        return cmb3;
    }

    public JComboBox getCmb4() {
        return cmb4;
    }

    public Order getOrder() {
        return order;
    }

}

class ButtonHandlerQ implements ActionListener {

    QueryViewBuilder objQueryView;
    Order order;

    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals(EXIT)) {
            System.exit(1);
        }
        if (e.getActionCommand().equals(EDIT)) {
            objQueryView.atributos(true);
            order = objQueryView.getOrder();

            String convertible = (String) objQueryView.getCmbConvertible().getSelectedItem();
            String faros = (String) objQueryView.getCmbFaros().getSelectedItem();
            String receptorDAB = (String) objQueryView.getCmbReceptorDAB().getSelectedItem();
            String rines = (String) objQueryView.getCmbRines().getSelectedItem();

            if (order instanceof FerrariOrder) {
                String modelo = (String) objQueryView.getCmb1().getSelectedItem();
                String tapaCubos = (String) objQueryView.getCmb2().getSelectedItem();
                String elevadorSus = (String) objQueryView.getCmb3().getSelectedItem();
                String camaraFrontal = (String) objQueryView.getCmb4().getSelectedItem();
                
                ((FerrariOrder)order).setDatos(ButtonHandlerF.generarData(tapaCubos, elevadorSus, camaraFrontal, ((FerrariOrder)order).getOrderId(), convertible, receptorDAB, faros, rines, modelo));

            }
            if (order instanceof BMWOrder) {
                String modelo = (String) objQueryView.getCmb1().getSelectedItem();
                String diseñoInt = (String) objQueryView.getCmb2().getSelectedItem();
                String navegacion = (String) objQueryView.getCmb3().getSelectedItem();
                String sistemaE = (String) objQueryView.getCmb4().getSelectedItem();
                
                ((BMWOrder)order).setDatos(ButtonHandlerB.generarData(sistemaE, navegacion, diseñoInt, ((BMWOrder)order).getOrderId(), convertible, receptorDAB, faros, rines, modelo));
            }
            if (order instanceof LamborghiniOrder) {                        
                String modelo = (String) objQueryView.getCmb1().getSelectedItem();
                String suspension = (String) objQueryView.getCmb2().getSelectedItem();
                String deportivo = (String) objQueryView.getCmb3().getSelectedItem();
                String telemetria = (String) objQueryView.getCmb4().getSelectedItem();
                
                ((LamborghiniOrder)order).setDatos(ButtonHandlerL.generarData(suspension, deportivo, telemetria, ((LamborghiniOrder)order).getOrderId(), convertible, receptorDAB, faros, rines, modelo));
            }
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

        if (e.getActionCommand().equals(SAVE)) {
            objQueryView.setVisible(false);
            //objFerrariView.objOrderManager.setVisible(true);
        }

        if (e.getActionCommand().equals(REGRESAR)) {
            objQueryView.setVisible(false);
            //objQueryView.objOrderManager.setVisible(true);
        }
    }

    public ButtonHandlerQ() {
    }

    public ButtonHandlerQ(QueryViewBuilder inObjQueryView) {
        objQueryView = inObjQueryView;
    }

} // End of class ButtonHandler

