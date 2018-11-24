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
import java.util.Vector;
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

        getCmbConvertible().setSelectedItem(fOrder.getDatos().get("Convertible"));
        getCmbFaros().setSelectedItem(fOrder.getDatos().get("Faros"));
        getCmbColor().setSelectedItem(fOrder.getDatos().get("Color"));
        getCmbReceptorDAB().setSelectedItem(fOrder.getDatos().get("Receptor"));
        getCmbRines().setSelectedItem(fOrder.getDatos().get("Rines"));

    }

    private void setValuesBMWOrder(BMWOrder bmwOrder) {
        cmb1.setSelectedItem(bmwOrder.getDatos().get("Modelo"));
        cmb2.setSelectedItem(bmwOrder.getDatos().get("DiseñoInterior"));
        cmb3.setSelectedItem(bmwOrder.getDatos().get("Navegacion"));
        cmb4.setSelectedItem(bmwOrder.getDatos().get("SistemaElevacion"));

        getCmbConvertible().setSelectedItem(bmwOrder.getDatos().get("Convertible"));
        getCmbFaros().setSelectedItem(bmwOrder.getDatos().get("Faros"));
        getCmbColor().setSelectedItem(bmwOrder.getDatos().get("Color"));
        getCmbReceptorDAB().setSelectedItem(bmwOrder.getDatos().get("Receptor"));
        getCmbRines().setSelectedItem(bmwOrder.getDatos().get("Rines"));

    }

    private void setValuesLamborghini(LamborghiniOrder lamborghiniOrder) {
        cmb1.setSelectedItem(lamborghiniOrder.getDatos().get("Modelo"));
        cmb2.setSelectedItem(lamborghiniOrder.getDatos().get("Suspension"));
        cmb3.setSelectedItem(lamborghiniOrder.getDatos().get("Deportivo"));
        cmb4.setSelectedItem(lamborghiniOrder.getDatos().get("Telemetria"));

        getCmbConvertible().setSelectedItem(lamborghiniOrder.getDatos().get("Convertible"));
        getCmbFaros().setSelectedItem(lamborghiniOrder.getDatos().get("Faros"));
        getCmbColor().setSelectedItem(lamborghiniOrder.getDatos().get("Color"));
        getCmbReceptorDAB().setSelectedItem(lamborghiniOrder.getDatos().get("Receptor"));
        getCmbRines().setSelectedItem(lamborghiniOrder.getDatos().get("Rines"));

    }

    @Override
    public void initializePersonalizeForm() {
        if (view instanceof FerrariViewBuilder) {
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

        crearBotones();

    }

    private void crearBotones() {
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
        super.getCmbColor().setEnabled(b);
        super.getCmbReceptorDAB().setEnabled(b);
        super.getCmbRines().setEnabled(b);

    }

    public JComboBox getCmb1() {
        return cmb1;
    }

    public String getCmb1Value() {
        return (String) cmb1.getSelectedItem();
    }
    public JComboBox getCmb2() {
        return cmb2;
    }
    public String getCmb2Value() {
        return (String) cmb2.getSelectedItem();
    }

    public JComboBox getCmb3() {
        return cmb3;
    }
    public String getCmb3Value() {
        return (String) cmb3.getSelectedItem();
    }

    public JComboBox getCmb4() {
        return cmb4;
    }
    public String getCmb4Value() {
        return (String) cmb4.getSelectedItem();
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

        }

        if (e.getActionCommand().equals(SAVE)) {
            Vector vector = null;
            objQueryView.atributos(false);
            order = objQueryView.getOrder();

            String convertible = objQueryView.getCmbConvertibleValue();
            String faros = objQueryView.getCmbFarosValue();
            String color = objQueryView.getCmbColorValue();
            String receptorDAB = objQueryView.getCmbReceptorDABValue();
            String rines = objQueryView.getCmbRinesValue();

            if (order instanceof FerrariOrder) {
                int orderID = ((FerrariOrder) order).getOrderId();
                String modelo = objQueryView.getCmb1Value();
                String tapaCubos =  objQueryView.getCmb2Value();
                String elevadorSus = objQueryView.getCmb3Value();
                String camaraFrontal = objQueryView.getCmb4Value();

                ((FerrariOrder) order).setDatos(ButtonHandlerF.generarData(tapaCubos, elevadorSus, camaraFrontal, orderID, convertible, receptorDAB, faros, color, rines, modelo));
                vector = ButtonHandlerF.obtenerValores(tapaCubos, elevadorSus, camaraFrontal, orderID, convertible, receptorDAB, faros, color, rines, modelo);

            }
            if (order instanceof BMWOrder) {
                int orderID = ((BMWOrder) order).getOrderId();
                String modelo = objQueryView.getCmb1Value();
                String diseñoInt = objQueryView.getCmb2Value();
                String navegacion = objQueryView.getCmb3Value();
                String sistemaE = objQueryView.getCmb4Value();

                ((BMWOrder) order).setDatos(ButtonHandlerB.generarData(sistemaE, navegacion, diseñoInt, orderID, convertible, receptorDAB, faros, color, rines, modelo));
                vector = ButtonHandlerB.obtenerValores(sistemaE, navegacion, diseñoInt, orderID, convertible, receptorDAB, faros, color, rines, modelo);
            }
            if (order instanceof LamborghiniOrder) {
                int orderID = ((LamborghiniOrder) order).getOrderId();
                String modelo = (String) objQueryView.getCmb1Value();
                String suspension = (String) objQueryView.getCmb2Value();
                String deportivo = (String) objQueryView.getCmb3Value();
                String telemetria = (String) objQueryView.getCmb4Value();

                ((LamborghiniOrder) order).setDatos(ButtonHandlerL.generarData(suspension, deportivo, telemetria, orderID, convertible, receptorDAB, faros, color, rines, modelo));
                vector = ButtonHandlerL.obtenerValores(suspension, deportivo, telemetria, orderID, convertible, receptorDAB, faros, color, rines, modelo);
            }

            setPrecios(vector, order);

            objQueryView.setVisible(false);

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

    private void setPrecios(Vector vector, Order order) {

        if (order instanceof FerrariOrder) {
            ((FerrariOrder) order).setvConvertible((double) vector.get(0));
            ((FerrariOrder) order).setvReceptorDAB((double) vector.get(1));
            ((FerrariOrder) order).setvFaros((double) vector.get(2));
            ((FerrariOrder) order).setvColor((double) vector.get(3));
            ((FerrariOrder) order).setvRines((double) vector.get(4));
            ((FerrariOrder) order).setvModelo((double) vector.get(5));
            ((FerrariOrder) order).setvTapacubos((double) vector.get(6));
            ((FerrariOrder) order).setvElevadorSus((double) vector.get(7));
            ((FerrariOrder) order).setvCamaraFrontal((double) vector.get(8));
        }

        if (order instanceof BMWOrder) {
            ((BMWOrder) order).setvConvertible((double) vector.get(0));
            ((BMWOrder) order).setvReceptorDAB((double) vector.get(1));
            ((BMWOrder) order).setvFaros((double) vector.get(2));
            ((BMWOrder) order).setvColor((double) vector.get(3));
            ((BMWOrder) order).setvRines((double) vector.get(4));
            ((BMWOrder) order).setvModelo((double) vector.get(5));
            ((BMWOrder) order).setvDiseñoInt((double) vector.get(6));
            ((BMWOrder) order).setvNavegacionIS((double) vector.get(7));
            ((BMWOrder) order).setvElevacion((double) vector.get(8));

        }

        if (order instanceof LamborghiniOrder) {
            ((LamborghiniOrder) order).setvConvertible((double) vector.get(0));
            ((LamborghiniOrder) order).setvReceptorDAB((double) vector.get(1));
            ((LamborghiniOrder) order).setvFaros((double) vector.get(2));
            ((LamborghiniOrder) order).setvColor((double) vector.get(3));
            ((LamborghiniOrder) order).setvRines((double) vector.get(4));
            ((LamborghiniOrder) order).setvModelo((double) vector.get(5));
            ((LamborghiniOrder) order).setSuspensionMR((double) vector.get(6));
            ((LamborghiniOrder) order).setsEDeportivo((double) vector.get(7));
            ((LamborghiniOrder) order).setTelemetriaL((double) vector.get(8));

        }
    }

} // End of class ButtonHandler

