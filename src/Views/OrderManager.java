package Views;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.sun.java.swing.plaf.windows.*;

public class OrderManager extends JFrame {
    
  public static final String CREATE_ORDER = "Create Order";
  public static final String CONSULT_ORDER = "Consult Order";
  public static final String GET_TOTAL = "Get Total";
  public static final String EXIT = "Exit";
  
  public static final String FE_ORDER = "Ferrari Order";
  public static final String BMW_ORDER = "BMW Order";
  public static final String LAM_ORDER = "Lamborghini Order";


  private JComboBox cmbOrderType;
  
  private JTextField txtOrderId;
  private JLabel lblOrderType, lblOrderId;
  
  private JLabel lblTotal, lblTotalValue;

  

  public OrderManager() {
    super("Cars Orders");

    //Create the visitor instance
//    objVisitor = new OrderVisitor();

    cmbOrderType = new JComboBox();
    cmbOrderType.addItem(OrderManager.FE_ORDER);
    cmbOrderType.addItem(OrderManager.BMW_ORDER);
    cmbOrderType.addItem(OrderManager.LAM_ORDER);

    txtOrderId= new JTextField(10);

    lblOrderType = new JLabel("Order Type:");
    lblOrderId = new JLabel("Order ID:");
   
    lblTotal = new JLabel("Result");
    lblTotalValue =
      new JLabel("Click GetTotal Button");

    //Create the open button
    JButton getTotalButton =
      new JButton(OrderManager.GET_TOTAL);
    getTotalButton.setMnemonic(KeyEvent.VK_G);
    JButton createOrderButton =
      new JButton(OrderManager.CREATE_ORDER);
    getTotalButton.setMnemonic(KeyEvent.VK_C);
    JButton consultOrderButton =
      new JButton(OrderManager.CONSULT_ORDER);
    getTotalButton.setMnemonic(KeyEvent.VK_B);
    JButton exitButton = new JButton(OrderManager.EXIT);
    exitButton.setMnemonic(KeyEvent.VK_X);
    
    ButtonHandler objButtonHandler = new ButtonHandler(this);


    getTotalButton.addActionListener(objButtonHandler);
    createOrderButton.addActionListener(objButtonHandler);
    consultOrderButton.addActionListener(objButtonHandler);
    exitButton.addActionListener(new ButtonHandler());

    //For layout purposes, put the buttons in a separate panel
    JPanel buttonPanel = new JPanel();

    JPanel panel = new JPanel();
    
    GridBagLayout gridbag2 = new GridBagLayout();
    panel.setLayout(gridbag2);
    GridBagConstraints gbc2 = new GridBagConstraints();
    panel.add(getTotalButton);
    panel.add(createOrderButton);
    panel.add(consultOrderButton);
    panel.add(exitButton);
    gbc2.anchor = GridBagConstraints.EAST;
    gbc2.gridx = 0;
    gbc2.gridy = 0;
    gridbag2.setConstraints(createOrderButton, gbc2);
    gbc2.gridx = 1;
    gbc2.gridy = 0;
    gridbag2.setConstraints(consultOrderButton, gbc2);
    gbc2.gridx = 2;
    gbc2.gridy = 0;
    gridbag2.setConstraints(getTotalButton, gbc2);
    
    gbc2.gridx = 3;
    gbc2.gridy = 0;
    gridbag2.setConstraints(exitButton, gbc2);

    //****************************************************
    GridBagLayout gridbag = new GridBagLayout();
    buttonPanel.setLayout(gridbag);
    GridBagConstraints gbc = new GridBagConstraints();

    buttonPanel.add(lblOrderType);
    buttonPanel.add(cmbOrderType);
    buttonPanel.add(lblOrderId);
    buttonPanel.add(txtOrderId);

    buttonPanel.add(lblTotal);
    buttonPanel.add(lblTotalValue);

    gbc.insets.top = 5;
    gbc.insets.bottom = 5;
    gbc.insets.left = 5;
    gbc.insets.right = 5;

    gbc.anchor = GridBagConstraints.EAST;
    gbc.gridx = 1;
    gbc.gridy = 0;
    gridbag.setConstraints(lblOrderType, gbc);
    gbc.anchor = GridBagConstraints.WEST;
    gbc.gridx = 2;
    gbc.gridy = 0;
    gridbag.setConstraints(cmbOrderType, gbc);

    gbc.anchor = GridBagConstraints.EAST;
    gbc.gridx = 1;
    gbc.gridy = 1;
    gridbag.setConstraints(lblOrderId, gbc);
    gbc.anchor = GridBagConstraints.WEST;
    gbc.gridx = 2;
    gbc.gridy = 1;
    gridbag.setConstraints(txtOrderId, gbc);

    gbc.anchor = GridBagConstraints.EAST;
    gbc.gridx = 1;
    gbc.gridy = 4;
    gridbag.setConstraints(lblTotal, gbc);
    gbc.anchor = GridBagConstraints.WEST;
    gbc.gridx = 2;
    gbc.gridy = 4;
    gridbag.setConstraints(lblTotalValue, gbc);

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
        OrderManager.this);
    } catch (Exception ex) {
      System.out.println(ex);
    }

  }

  public static void main(String[] args) {
    JFrame frame = new OrderManager();

    frame.addWindowListener(new WindowAdapter() {
          public void windowClosing(WindowEvent e) {
            System.exit(0);
          }
        }
                           );

    //frame.pack();
    frame.setSize(400, 300);
    frame.setVisible(true);
  }

  public void setTotalValue(String msg) {
    lblTotalValue.setText(msg);
  }

  public String getOrderType() {
    return (String) cmbOrderType.getSelectedItem();
  }
  public String getOrderAmount() {
    return txtOrderId.getText();
  }


} // End of class OrderManager

class ButtonHandler implements ActionListener {
  OrderManager objOrderManager;
  
  
  public void actionPerformed(ActionEvent e) {
    String totalResult = null;

    if (e.getActionCommand().equals(OrderManager.EXIT)) {
      System.exit(1);
    }
    if (e.getActionCommand().equals(OrderManager.CREATE_ORDER)) {
        
        String orderType = objOrderManager.getOrderType();
        
        if (orderType.equalsIgnoreCase(OrderManager.FE_ORDER)) {
            
            
            
            
        }
        if (orderType.equalsIgnoreCase(OrderManager.BMW_ORDER)) {
            IViewBuilder builder = new BMWViewBuilder();
            ViewDirector viewDirector = new  ViewDirector(builder);            
            viewDirector.launchView();
            
            
        }
        if (orderType.equalsIgnoreCase(OrderManager.LAM_ORDER)) {

            
        }  
    }
    
    if (e.getActionCommand().equals(OrderManager.CONSULT_ORDER)) {
        
    }

    if (e.getActionCommand().equals(OrderManager.GET_TOTAL)) {
        
    }
  }



  public ButtonHandler() {
  }
  public ButtonHandler(OrderManager inObjOrderManager) {
    objOrderManager = inObjOrderManager;
  }

} // End of class ButtonHandler

