/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Santiago
 */
public class MainView extends JFrame {

    public static final String CREATE_ORDER = "Create Order";
    public static final String REGRESAR = "Regresar";
    public static final String EXIT = "Exit";

    public static final String SI = "Si";
    public static final String NO = "No";

    public static final String LED = "LED";
    public static final String LASER = "Láser";

    public static final String R20 = "20\"";
    public static final String R21 = "21\"";
    public static final String R22 = "22\"";

    //Generales
    private JComboBox cmbConvertible;
    private JComboBox cmbReceptorDAB;
    private JComboBox cmbFaros;
    private JColorChooser clcColor;
    private JComboBox cmbRines;

    private JTextField txtOrderId;
    private JLabel lblOrderId;

    private JLabel lblConvertible, lblReceptorDAB, lblFaros, lblColor, lblRines;

    public MainView() {

        cmbConvertible = new JComboBox();
        cmbConvertible.addItem(MainView.SI);
        cmbConvertible.addItem(MainView.NO);

        cmbReceptorDAB = new JComboBox();
        cmbReceptorDAB.addItem(MainView.SI);
        cmbReceptorDAB.addItem(MainView.NO);

        cmbFaros = new JComboBox();
        cmbFaros.addItem(MainView.LED);
        cmbFaros.addItem(MainView.LASER);

        clcColor = new JColorChooser();

        cmbRines = new JComboBox();
        cmbRines.addItem(MainView.R20);
        cmbRines.addItem(MainView.R21);
        cmbRines.addItem(MainView.R22);

        txtOrderId = new JTextField(10);

        lblOrderId = new JLabel("Order ID:");

        lblConvertible = new JLabel("Convertible:");
        lblReceptorDAB = new JLabel("Receptor DAB:");
        lblFaros = new JLabel("Faros:");
        lblColor = new JLabel("Color:");
        lblRines = new JLabel("Rines:");

        JPanel buttonPanel = new JPanel();

        buttonPanel.add(lblOrderId);
        buttonPanel.add(txtOrderId);

        buttonPanel.add(lblConvertible);
        buttonPanel.add(lblReceptorDAB);
        buttonPanel.add(lblFaros);
        buttonPanel.add(lblColor);
        buttonPanel.add(lblRines);

        //****************************************************
        GridBagLayout gridbag = new GridBagLayout();
        buttonPanel.setLayout(gridbag);
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.insets.top = 5;
        gbc.insets.bottom = 5;
        gbc.insets.left = 5;
        gbc.insets.right = 5;

        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gridbag.setConstraints(lblOrderId, gbc);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 1;
        gbc.gridy = 0;
        gridbag.setConstraints(txtOrderId, gbc);

        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 0;
        gbc.gridy = 1;
        gridbag.setConstraints(lblConvertible, gbc);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 1;
        gbc.gridy = 1;
        gridbag.setConstraints(cmbConvertible, gbc);

        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 0;
        gbc.gridy = 2;
        gridbag.setConstraints(lblReceptorDAB, gbc);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 1;
        gbc.gridy = 2;
        gridbag.setConstraints(cmbReceptorDAB, gbc);

        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 0;
        gbc.gridy = 3;
        gridbag.setConstraints(lblFaros, gbc);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 1;
        gbc.gridy = 3;
        gridbag.setConstraints(cmbFaros, gbc);

        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 0;
        gbc.gridy = 4;
        gridbag.setConstraints(lblColor, gbc);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 1;
        gbc.gridy = 4;
        gridbag.setConstraints(clcColor, gbc);

        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 0;
        gbc.gridy = 5;
        gridbag.setConstraints(lblRines, gbc);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 1;
        gbc.gridy = 5;
        gridbag.setConstraints(cmbRines, gbc);

    }

    public JComboBox getCmbConvertible() {
        return cmbConvertible;
    }

    public JComboBox getCmbReceptorDAB() {
        return cmbReceptorDAB;
    }

    public JComboBox getCmbFaros() {
        return cmbFaros;
    }

    public JColorChooser getClcColor() {
        return clcColor;
    }

    public JComboBox getCmbRines() {
        return cmbRines;
    }

    public JTextField getTxtOrderId() {
        return txtOrderId;
    }
    
    

}
