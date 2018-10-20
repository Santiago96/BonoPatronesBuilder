/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Santiago
 */
public class BMWViewBuilder extends MainView implements IViewBuilder {

    public static final String LED = "LED";
    public static final String LASER = "Láser";

    public static final String R20 = "20''";
    public static final String R21 = "21''";
    public static final String R22 = "22''";

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

    private JTextField txtOrderId;
    private JLabel lblOrderId;

    private JLabel lblConvertible, lblReceptorDAB, lblFaros, lblColor, lblRines;
    private JLabel lblModelo, lblDiseñoInt, lblNavegacionIS, lblSElevacion;

    BMWViewBuilder() {        
        initialize();
    }

    @Override
    public void initialize() {
        //Inicializar todos los componentes de esta vista
        super.setTitle("BMW Order");        
        super.setSize(600, 200);

    }

    @Override
    public void launchView() {
        //Llamado
        //objOrderManager.setVisible(false);
        this.setVisible(true);
    }

}
