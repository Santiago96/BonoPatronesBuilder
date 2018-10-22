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
    
    private JButton btnEditar,btnGuardar,btnRegresar,btnSalir;
    
    private Order order;

    public QueryViewBuilder(MainView view,Order order) {
        this.view = view;
        initializeGeneralForm();
        initializePersonalizeForm();
        addComponents();
        componentsPosition();
        addEvents();
        this.order = order;
    }

    @Override
    public void initializeGeneralForm() {
        
        super.setTitle("Query View");
        super.setSize(450, 450);
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
            
            super.getTxtOrderId().setText(String.valueOf(((FerrariOrder)order).getOrderId()));

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
            
            super.getTxtOrderId().setText(String.valueOf(((BMWOrder)order).getOrderId()));
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
            
            super.getTxtOrderId().setText(String.valueOf(((LamborghiniOrder)order).getOrderId()));
        }
        
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
    
    private void hideButtons(){
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

}

class ButtonHandlerQ implements ActionListener {

    QueryViewBuilder objFerrariView;

    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals(EXIT)) {
            System.exit(1);
        }
        if (e.getActionCommand().equals(EDIT)) {
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
            objFerrariView.setVisible(false);
            //objFerrariView.objOrderManager.setVisible(true);
        }

        if (e.getActionCommand().equals(REGRESAR)) {
            objFerrariView.setVisible(false);
            //objFerrariView.objOrderManager.setVisible(true);
        }
    }

    public ButtonHandlerQ() {
    }

    public ButtonHandlerQ(QueryViewBuilder inObjQueryView) {
        objFerrariView = inObjQueryView;
    }

} // End of class ButtonHandler

