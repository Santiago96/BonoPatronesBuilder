/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.KeyEvent;
import javax.swing.*;

/**
 *
 * @author Santiago
 */
public abstract class MainView extends JFrame {

    public static final String CREATE_ORDER = "Create Order";
    public static final String REGRESAR = "Regresar";
    public static final String EXIT = "Exit";

    public static final String SI = "Si";
    public static final String NO = "No";

    public static final String LED = "LED";
    public static final String LASER = "Láser";

    public static final String METALICO = "Metálico";
    public static final String NOMETALICO = "No Metálico";
    public static final String HISTORICO = "Histórico";
    public static final String ESPECIAL = "Especial";

    public static final String R20 = "20\"";
    public static final String R21 = "21\"";
    public static final String R22 = "22\"";

    //Generales
    private JComboBox cmbConvertible;
    private JComboBox cmbReceptorDAB;
    private JComboBox cmbFaros;
    private JComboBox cmbColor;
    private JComboBox cmbRines;

    private JTextField txtOrderId;
    private JLabel lblOrderId;

    private JLabel lblConvertible, lblReceptorDAB, lblFaros, lblColor, lblRines;

    private JButton createOrderButton, regresarButton, exitButton;

    private GridBagConstraints gbc, gbc2;
    private GridBagLayout gridbag, gridbag2;

    private JPanel panel, buttonPanel;

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

        cmbColor = new JComboBox();
        cmbColor.addItem(MainView.METALICO);
        cmbColor.addItem(MainView.NOMETALICO);
        cmbColor.addItem(MainView.ESPECIAL);
        cmbColor.addItem(MainView.HISTORICO);

        cmbRines = new JComboBox();
        cmbRines.addItem(MainView.R20);
        cmbRines.addItem(MainView.R21);
        cmbRines.addItem(MainView.R22);

        txtOrderId = new JTextField(10);
        txtOrderId.setEditable(false);
        boolean primera = true;
        /*if (primera) {
            txtOrderId.setText("1");
            primera = false;
        }*/

        lblOrderId = new JLabel("Order ID:");

        lblConvertible = new JLabel("Convertible:");
        lblReceptorDAB = new JLabel("Receptor DAB:");
        lblFaros = new JLabel("Faros:");
        lblColor = new JLabel("Color:");
        lblRines = new JLabel("Rines:");

        createOrderButton = new JButton(MainView.CREATE_ORDER);
        createOrderButton.setMnemonic(KeyEvent.VK_C);

        regresarButton = new JButton(MainView.REGRESAR);
        regresarButton.setMnemonic(KeyEvent.VK_R);

        exitButton = new JButton(MainView.EXIT);
        exitButton.setMnemonic(KeyEvent.VK_X);
        //ButtonHandlerB objButtonHandler = new ButtonHandlerB(this);
        //For layout purposes, put the buttons in a separate panel        
        buttonPanel = new JPanel();
        panel = new JPanel();

        gridbag2 = new GridBagLayout();
        panel.setLayout(gridbag2);
        gbc2 = new GridBagConstraints();

        panel.add(createOrderButton);
        panel.add(regresarButton);
        panel.add(exitButton);
        gbc2.anchor = GridBagConstraints.EAST;
        gbc2.gridx = 0;
        gbc2.gridy = 0;
        gridbag2.setConstraints(regresarButton, gbc2);
        gbc2.gridx = 1;
        gbc2.gridy = 0;
        gridbag2.setConstraints(createOrderButton, gbc2);
        gbc2.gridx = 2;
        gbc2.gridy = 0;
        gridbag2.setConstraints(exitButton, gbc2);

        //****************************************************
        gridbag = new GridBagLayout();
        buttonPanel.setLayout(gridbag);
        gbc = new GridBagConstraints();

        buttonPanel.add(lblOrderId);
        buttonPanel.add(txtOrderId);

        buttonPanel.add(lblConvertible);
        buttonPanel.add(lblReceptorDAB);
        buttonPanel.add(lblFaros);
        buttonPanel.add(lblColor);
        buttonPanel.add(lblRines);

        buttonPanel.add(lblOrderId);
        buttonPanel.add(txtOrderId);

        buttonPanel.add(cmbConvertible);
        buttonPanel.add(cmbReceptorDAB);
        buttonPanel.add(cmbFaros);
        buttonPanel.add(cmbColor);
        buttonPanel.add(cmbRines);

        //****************************************************
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
        gridbag.setConstraints(cmbColor, gbc);

        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 0;
        gbc.gridy = 5;
        gridbag.setConstraints(lblRines, gbc);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 1;
        gbc.gridy = 5;
        gridbag.setConstraints(cmbRines, gbc);

        gbc.insets.left = 2;
        gbc.insets.right = 2;
        gbc.insets.top = 40;

        //****************************************************
        //Add the buttons and the log to the frame
        Container contentPane = getContentPane();

        contentPane.add(buttonPanel, BorderLayout.NORTH);
        contentPane.add(panel, BorderLayout.CENTER);
        try {
            UIManager.setLookAndFeel(new WindowsLookAndFeel());
            SwingUtilities.updateComponentTreeUI(
                    MainView.this);
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    public String getCmbConvertibleValue() {
        return (String) cmbConvertible.getSelectedItem();
    }

    public String getCmbReceptorDABValue() {
        return (String) cmbReceptorDAB.getSelectedItem();
    }

    public String getCmbFarosValue() {
        return (String) cmbFaros.getSelectedItem();
    }

    public String getCmbColorValue() {
        return (String) cmbColor.getSelectedItem();
    }

    public String getCmbRinesValue() {
        return (String) cmbRines.getSelectedItem();
    }

    public JTextField getTxtOrderId() {
        return txtOrderId;
    }

    public void setTxtOrderId(JTextField txtOrderId) {
        this.txtOrderId = txtOrderId;
    }

    public JButton getCreateOrderButton() {
        return createOrderButton;
    }

    public JButton getRegresarButton() {
        return regresarButton;
    }

    public JButton getExitButton() {
        return exitButton;
    }

    public GridBagConstraints getGbc() {
        return gbc;
    }

    public GridBagLayout getGridbag() {
        return gridbag;
    }

    public GridBagConstraints getGbc2() {
        return gbc2;
    }

    public GridBagLayout getGridbag2() {
        return gridbag2;
    }

    public JPanel getPanel() {
        return panel;
    }

    public JPanel getButtonPanel() {
        return buttonPanel;
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

    public JComboBox getCmbRines() {
        return cmbRines;
    }

    public JComboBox getCmbColor() {
        return cmbColor;
    }

}
