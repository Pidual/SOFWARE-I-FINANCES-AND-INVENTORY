package views;

import models.Ingredient;

import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.event.*;
import java.text.NumberFormat;
import java.util.ArrayList;

public class MainFrame extends javax.swing.JFrame {
    public MainFrame(ActionListener presenterListener) {
        initComponents(presenterListener);
        setLocationRelativeTo(null);
        this.setSize(700,500);
        this.setVisible(true);

    }

    private void initComponents(ActionListener presenterListener) {

        jScrollPane5 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        PanelLoginAndMainMenu = new javax.swing.JPanel();
        Loggin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        exitButtonLongin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        logginUsernameTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        logginPaswordTextField = new javax.swing.JPasswordField();
        showPasswordCheckBox = new javax.swing.JCheckBox();
        MainMenu = new javax.swing.JPanel();
        headerLabel = new javax.swing.JLabel();
        Base = new javax.swing.JPanel();
        showAdministrateProductsButton = new javax.swing.JButton();
        AddProductButton = new javax.swing.JButton();
        addIngridients = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        administrateIngridientsButton = new javax.swing.JButton();
        seeInventoryButton = new javax.swing.JButton();
        Parent = new javax.swing.JPanel();
        administrateProducts = new javax.swing.JPanel();
        searchProductLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        searchProductTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        searchProductTable = new javax.swing.JTable();
        searchProductModifyProductButton = new javax.swing.JButton();
        searchProductDeleteProductButton = new javax.swing.JButton();
        searchProductButton = new javax.swing.JButton();
        addProductos = new javax.swing.JPanel();
        AddProductLabel = new javax.swing.JLabel();
        productNameLabel = new javax.swing.JLabel();
        addProductNameTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        NumberFormatter formatter = new NumberFormatter(numberFormat);
        formatter.setValueClass(Float.class);
        formatter.setAllowsInvalid(false);
        formatter.setCommitsOnValidEdit(true);
        addProductPriceFormatedTextField = new javax.swing.JFormattedTextField(formatter);
        addProductIsCookedCheckBox = new javax.swing.JCheckBox();
        addProductAddIngridientButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        addIngridientsAddedIngridientsTextField = new javax.swing.JTextArea();
        addProductAddProductButton = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        addProductIngridientList = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        addProductQuantitySpinner = new javax.swing.JSpinner();
        addProductIngridientQuantity = new javax.swing.JSpinner();
        addIngridientPanel = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        addIngridientIngridientNameTextField = new javax.swing.JTextField();
        addIngridientAddIngridientButton = new javax.swing.JButton();
        addIngridientIngridientQuianity = new javax.swing.JSpinner();
        administrateIngridientsPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        administrateIngridientsIngridientNameTextField = new javax.swing.JTextField();
        searchIngridientDeleteIngridient = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        ingridientSearchJTable = new javax.swing.JTable();
        searchIngridientButton = new javax.swing.JButton();
        searchIngridientModifyIngridientButton = new javax.swing.JButton();
        seeInventory = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        seeInventoryPanelProductTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        seeIventoryPanelIngridientTable = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        jScrollPane5.setViewportView(jTable3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        PanelLoginAndMainMenu.setLayout(new java.awt.CardLayout());

        Loggin.setBackground(new java.awt.Color(217, 217, 217));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INICIO DE SESION");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        loginButton.setBackground(new java.awt.Color(255, 209, 102));
        loginButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        loginButton.setText("INGRESAR");
        loginButton.setActionCommand("LOGIN");
        loginButton.addActionListener(presenterListener);

        exitButtonLongin.setBackground(new java.awt.Color(255, 209, 102));
        exitButtonLongin.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        exitButtonLongin.setText("SALIR");
        exitButtonLongin.addActionListener(presenterListener);
        exitButtonLongin.setActionCommand("EXIT");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("USUARIO:");

        logginUsernameTextField.setBackground(new java.awt.Color(236, 228, 183));
        logginUsernameTextField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        logginUsernameTextField.setText("USUARIO");
        logginUsernameTextField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                logginUsernameTextField.setText(""); // Clear the text field
            }

            @Override
            public void focusLost(FocusEvent e) {
                // Do nothing when focus is lost
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("CONTRASEÑA:");

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\carli\\OneDrive\\Escritorio\\SOFTWARE I\\SOFWARE-I-FINANCES-AND-INVENTORY\\resources\\hamburger_logo.png")); // NOI18N

        jLabel2.setBackground(new java.awt.Color(148, 104, 70));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Restaurante Guaranii Sistema de Informacion");
        jLabel2.setOpaque(true);

        logginPaswordTextField.setBackground(new java.awt.Color(236, 228, 183));
        logginPaswordTextField.setFont(new java.awt.Font("Segoe UI", 0, 18));
        logginPaswordTextField.setText("contraseña");
        logginPaswordTextField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                logginPaswordTextField.setText(""); // Clear the password field
            }
        });

        showPasswordCheckBox.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        showPasswordCheckBox.setText("mostrar contraseña");
        showPasswordCheckBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    logginPaswordTextField.setEchoChar((char) 0);
                } else {
                    logginPaswordTextField.setEchoChar('\u2022'); // Bullet character
                }
            }
        });

        javax.swing.GroupLayout LogginLayout = new javax.swing.GroupLayout(Loggin);
        Loggin.setLayout(LogginLayout);
        LogginLayout.setHorizontalGroup(
                LogginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(LogginLayout.createSequentialGroup()
                                .addGroup(LogginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(LogginLayout.createSequentialGroup()
                                                .addGap(171, 171, 171)
                                                .addGroup(LogginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(LogginLayout.createSequentialGroup()
                                                                .addGroup(LogginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel4)
                                                                        .addComponent(jLabel3)
                                                                        .addComponent(exitButtonLongin, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(53, 53, 53)
                                                                .addComponent(loginButton))
                                                        .addGroup(LogginLayout.createSequentialGroup()
                                                                .addGap(51, 51, 51)
                                                                .addComponent(jLabel1))))
                                        .addGroup(LogginLayout.createSequentialGroup()
                                                .addGap(311, 311, 311)
                                                .addComponent(jLabel5))
                                        .addGroup(LogginLayout.createSequentialGroup()
                                                .addGap(368, 368, 368)
                                                .addGroup(LogginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(showPasswordCheckBox)
                                                        .addGroup(LogginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(logginUsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(logginPaswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LogginLayout.setVerticalGroup(
                LogginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(LogginLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)
                                .addGap(20, 20, 20)
                                .addGroup(LogginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(logginUsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(LogginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(logginPaswordTextField))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(showPasswordCheckBox)
                                .addGap(37, 37, 37)
                                .addGroup(LogginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(loginButton)
                                        .addComponent(exitButtonLongin))
                                .addContainerGap(60, Short.MAX_VALUE))
        );

        PanelLoginAndMainMenu.add(Loggin, "card2");

        MainMenu.setLayout(null);

        headerLabel.setBackground(new java.awt.Color(148, 104, 70));
        headerLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        headerLabel.setForeground(new java.awt.Color(255, 255, 255));
        headerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLabel.setText("Menu Principal");
        headerLabel.setOpaque(true);
        MainMenu.add(headerLabel);
        headerLabel.setBounds(0, -4, 700, 40);

        Base.setBackground(new java.awt.Color(185, 184, 153));

        showAdministrateProductsButton.setBackground(new java.awt.Color(255, 209, 102));
        showAdministrateProductsButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        showAdministrateProductsButton.setText("<html>GESTIONAR<br>PRODUCTOS<html>");
        showAdministrateProductsButton.addActionListener(this::showAdministrateProductsButtonActionPerformed);

        AddProductButton.setBackground(new java.awt.Color(255, 209, 102));
        AddProductButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AddProductButton.setText("<html>AGREGAR<br>PRODUCTO<html>");
        AddProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddProductButtonActionPerformed(evt);
            }
        });

        addIngridients.setBackground(new java.awt.Color(255, 209, 102));
        addIngridients.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addIngridients.setText("<html>AGREGAR<br>INGREDIENTE<html>");
        addIngridients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addIngridientsActionPerformed(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(255, 209, 102));
        exitButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        exitButton.setText("SALIR");
        exitButton.addActionListener(presenterListener);
        exitButton.setActionCommand("EXIT");

        administrateIngridientsButton.setBackground(new java.awt.Color(255, 209, 102));
        administrateIngridientsButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        administrateIngridientsButton.setText("<html>GESTIONAR<br>INGREDIENTES<html>");
        administrateIngridientsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                administrateIngridientsButtonActionPerformed(evt);
            }
        });

        seeInventoryButton.setBackground(new java.awt.Color(255, 209, 102));
        seeInventoryButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        seeInventoryButton.setText("<html>VER<br>INVENTARIO<html>");
        seeInventoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeInventoryButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BaseLayout = new javax.swing.GroupLayout(Base);
        Base.setLayout(BaseLayout);
        BaseLayout.setHorizontalGroup(
                BaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BaseLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(BaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(AddProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(addIngridients, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(showAdministrateProductsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(BaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(administrateIngridientsButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                .addComponent(seeInventoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(9, Short.MAX_VALUE))
        );
        BaseLayout.setVerticalGroup(
                BaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BaseLayout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(showAdministrateProductsButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AddProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addIngridients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(administrateIngridientsButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(seeInventoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                .addComponent(exitButton)
                                .addGap(60, 60, 60))
        );

        MainMenu.add(Base);
        Base.setBounds(0, 20, 120, 460);

        Parent.setBackground(new java.awt.Color(217, 217, 217));
        Parent.setLayout(new java.awt.CardLayout());

        administrateProducts.setBackground(new java.awt.Color(204, 204, 204));

        searchProductLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        searchProductLabel.setText("BUSCAR PRODUCTO:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("NOMBRE PRODUCTO:");

        searchProductTextField.setBackground(new java.awt.Color(236, 228, 183));
        searchProductTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        searchProductTextField.addActionListener(presenterListener);
        searchProductTextField.setActionCommand("BUSCAR_PRODUCTO");

        searchProductTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null}},
                new String [] {
                        "ID", "NOMBRE", "PRECIO", "CANTIDAD"
                }
        ));
        jScrollPane1.setViewportView(searchProductTable);

        searchProductModifyProductButton.setBackground(new java.awt.Color(148, 104, 70));
        searchProductModifyProductButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        searchProductModifyProductButton.setText("MODIFICAR PRODUCTO");
        searchProductModifyProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchProductModifyProductButtonActionPerformed(evt);
            }
        });

        searchProductDeleteProductButton.setBackground(new java.awt.Color(148, 104, 70));
        searchProductDeleteProductButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        searchProductDeleteProductButton.setText("ELIMINAR PRODUCTO");

        searchProductButton.setBackground(new java.awt.Color(148, 104, 70));
        searchProductButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        searchProductButton.setText("BUSCAR PRODUCTO");
        searchProductButton.setActionCommand("BUSCAR_PRODUCTO");
        searchProductButton.addActionListener(presenterListener);

        javax.swing.GroupLayout administrateProductsLayout = new javax.swing.GroupLayout(administrateProducts);
        administrateProducts.setLayout(administrateProductsLayout);
        administrateProductsLayout.setHorizontalGroup(
                administrateProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(administrateProductsLayout.createSequentialGroup()
                                .addGroup(administrateProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(administrateProductsLayout.createSequentialGroup()
                                                .addGap(170, 170, 170)
                                                .addComponent(searchProductLabel))
                                        .addGroup(administrateProductsLayout.createSequentialGroup()
                                                .addGap(60, 60, 60)
                                                .addGroup(administrateProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(administrateProductsLayout.createSequentialGroup()
                                                                .addComponent(searchProductModifyProductButton)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(searchProductDeleteProductButton))
                                                        .addGroup(administrateProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addGroup(administrateProductsLayout.createSequentialGroup()
                                                                        .addComponent(jLabel8)
                                                                        .addGap(26, 26, 26)
                                                                        .addComponent(searchProductTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(46, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, administrateProductsLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(searchProductButton)
                                .addGap(193, 193, 193))
        );
        administrateProductsLayout.setVerticalGroup(
                administrateProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(administrateProductsLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(searchProductLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addGroup(administrateProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(searchProductTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(searchProductButton)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addGroup(administrateProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(searchProductDeleteProductButton)
                                        .addComponent(searchProductModifyProductButton))
                                .addContainerGap(136, Short.MAX_VALUE))
        );

        Parent.add(administrateProducts, "card2");

        addProductos.setBackground(new java.awt.Color(204, 204, 204));

        AddProductLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        AddProductLabel.setText("AGREGAR PRODUCTO:");

        productNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        productNameLabel.setText("NOMBRE:");

        addProductNameTextField.setBackground(new java.awt.Color(236, 228, 183));
        addProductNameTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addProductNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductNameTextFieldActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("CANTIDAD:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("PRECIO:");

        addProductPriceFormatedTextField.setBackground(new java.awt.Color(236, 228, 183));
        addProductPriceFormatedTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        addProductIngridientQuantity.setEnabled(false);

        addProductIsCookedCheckBox.setText("¿Producto Cocinado?");
        addProductIsCookedCheckBox.addItemListener(e -> {      // Activa los demas componentes si le da que es cocinado
            boolean enabled = e.getStateChange() == ItemEvent.SELECTED;
            addProductIngridientList.setEnabled(enabled);
            addProductIngridientQuantity.setEnabled(enabled);
            addProductAddIngridientButton.setEnabled(enabled);
            jLabel15.setEnabled(enabled);
            jLabel16.setEnabled(enabled);
            jLabel17.setEnabled(enabled);
            addIngridientsAddedIngridientsTextField.setEnabled(enabled);
        });

        addProductAddIngridientButton.setBackground(new java.awt.Color(148, 104, 70));
        addProductAddIngridientButton.setText("<html>AGREGAR<br>INGREDIENTE<html>");
        addProductAddIngridientButton.addActionListener(presenterListener);
        addProductAddIngridientButton.setActionCommand("AGREGAR_INGREDIENTE_A_PRODUCTO_EN_CREACION");
        addProductAddIngridientButton.setEnabled(false);

        addIngridientsAddedIngridientsTextField.setColumns(20);
        addIngridientsAddedIngridientsTextField.setRows(3);
        addIngridientsAddedIngridientsTextField.setEditable(false);
        jScrollPane2.setViewportView(addIngridientsAddedIngridientsTextField);
        addIngridientsAddedIngridientsTextField.setEnabled(false);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText("INGREDIENTE:");
        jLabel15.setEnabled(false);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText("CANTIDAD:");
        jLabel16.setEnabled(false);

        addProductIngridientList.setBackground(new java.awt.Color(236, 228, 183));
        addProductIngridientList.setEnabled(false);


        jLabel17.setPreferredSize(getPreferredSize());
        jLabel17.setText("ingredientes del producto:");
        jLabel17.setEnabled(false);

        addProductAddProductButton.setBackground(new java.awt.Color(148, 104, 70));
        addProductAddProductButton.setText("<html>AGREGAR<br>PRODUCTO<html>");
        addProductAddProductButton.addActionListener(presenterListener);
        addProductAddProductButton.setActionCommand("AGREGAR_PRODUCTOS");

        javax.swing.GroupLayout addProductosLayout = new javax.swing.GroupLayout(addProductos);
        addProductos.setLayout(addProductosLayout);
        addProductosLayout.setHorizontalGroup(
                addProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(addProductosLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(addProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel15)
                                        .addComponent(productNameLabel))
                                .addGap(18, 18, 18)
                                .addGroup(addProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(addProductosLayout.createSequentialGroup()
                                                .addComponent(addProductNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(addProductosLayout.createSequentialGroup()
                                                .addGroup(addProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(addProductPriceFormatedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(addProductIsCookedCheckBox)
                                                        .addGroup(addProductosLayout.createSequentialGroup()
                                                                .addComponent(addProductIngridientList, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(26, 26, 26)
                                                                .addComponent(addProductAddIngridientButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(addProductosLayout.createSequentialGroup()
                                .addGroup(addProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(addProductosLayout.createSequentialGroup()
                                                .addGap(35, 35, 35)
                                                .addComponent(jLabel17))
                                        .addGroup(addProductosLayout.createSequentialGroup()
                                                .addGap(17, 17, 17)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 29, Short.MAX_VALUE))
                        .addGroup(addProductosLayout.createSequentialGroup()
                                .addGroup(addProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(addProductosLayout.createSequentialGroup()
                                                .addGap(167, 167, 167)
                                                .addComponent(AddProductLabel))
                                        .addGroup(addProductosLayout.createSequentialGroup()
                                                .addGap(180, 180, 180)
                                                .addComponent(addProductAddProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addProductosLayout.setVerticalGroup(
                addProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(addProductosLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(AddProductLabel)
                                .addGap(9, 9, 9)
                                .addGroup(addProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(productNameLabel)
                                        .addComponent(addProductNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(addProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(addProductPriceFormatedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addProductIsCookedCheckBox)
                                .addGroup(addProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(addProductosLayout.createSequentialGroup()
                                                .addGap(9, 9, 9)
                                                .addGroup(addProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel15)
                                                        .addComponent(addProductIngridientList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                                        .addGroup(addProductosLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(addProductAddIngridientButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(addProductAddProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97))
        );

        Parent.add(addProductos, "card3");

        addIngridientPanel.setBackground(new java.awt.Color(204, 204, 204));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel18.setText("AGREGAR INGREDIENTE:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("CANTIDAD:");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setText("NOMBRE INGREDIENTE:");

        addIngridientIngridientNameTextField.setBackground(new java.awt.Color(236, 228, 183));
        addIngridientIngridientNameTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        addIngridientAddIngridientButton.setBackground(new java.awt.Color(148, 104, 70));
        addIngridientAddIngridientButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addIngridientAddIngridientButton.setText("AGREGAR INGREDIENTE");
        addIngridientAddIngridientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addIngridientAddIngridientButtonActionPerformed(evt);
            }
        });

        addIngridientIngridientQuianity.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout addIngridientPanelLayout = new javax.swing.GroupLayout(addIngridientPanel);
        addIngridientPanel.setLayout(addIngridientPanelLayout);
        addIngridientPanelLayout.setHorizontalGroup(
                addIngridientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(addIngridientPanelLayout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addGroup(addIngridientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel19)
                                        .addComponent(jLabel14))
                                .addGap(22, 22, 22)
                                .addGroup(addIngridientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(addIngridientIngridientNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                        .addComponent(addIngridientIngridientQuianity))
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addIngridientPanelLayout.createSequentialGroup()
                                .addContainerGap(164, Short.MAX_VALUE)
                                .addComponent(jLabel18)
                                .addGap(154, 154, 154))
                        .addGroup(addIngridientPanelLayout.createSequentialGroup()
                                .addGap(176, 176, 176)
                                .addComponent(addIngridientAddIngridientButton)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addIngridientPanelLayout.setVerticalGroup(
                addIngridientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(addIngridientPanelLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18)
                                .addGroup(addIngridientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel19)
                                        .addComponent(addIngridientIngridientNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(addIngridientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(addIngridientIngridientQuianity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel14))
                                .addGap(34, 34, 34)
                                .addComponent(addIngridientAddIngridientButton)
                                .addContainerGap(226, Short.MAX_VALUE))
        );

        Parent.add(addIngridientPanel, "card4");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("BUSCAR INGREDIENTE:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("NOMBRE INGREDIENTE:");

        administrateIngridientsIngridientNameTextField.setBackground(new java.awt.Color(236, 228, 183));
        administrateIngridientsIngridientNameTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        searchIngridientDeleteIngridient.setBackground(new java.awt.Color(148, 104, 70));
        searchIngridientDeleteIngridient.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        searchIngridientDeleteIngridient.setText("ELIMINAR INGREDIENTE");
        searchIngridientDeleteIngridient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchIngridientDeleteIngridientActionPerformed(evt);
            }
        });

        ingridientSearchJTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        jScrollPane3.setViewportView(ingridientSearchJTable);

        searchIngridientButton.setBackground(new java.awt.Color(148, 104, 70));
        searchIngridientButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        searchIngridientButton.setText("BUSCAR INGREDIENTE");
        searchIngridientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchIngridientButtonActionPerformed(evt);
            }
        });

        searchIngridientModifyIngridientButton.setBackground(new java.awt.Color(148, 104, 70));
        searchIngridientModifyIngridientButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        searchIngridientModifyIngridientButton.setText("MODIFICAR INGREDIENTE");
        searchIngridientModifyIngridientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchIngridientModifyIngridientButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout administrateIngridientsPanelLayout = new javax.swing.GroupLayout(administrateIngridientsPanel);
        administrateIngridientsPanel.setLayout(administrateIngridientsPanelLayout);
        administrateIngridientsPanelLayout.setHorizontalGroup(
                administrateIngridientsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, administrateIngridientsPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(187, 187, 187))
                        .addGroup(administrateIngridientsPanelLayout.createSequentialGroup()
                                .addGroup(administrateIngridientsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(administrateIngridientsPanelLayout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addGroup(administrateIngridientsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, administrateIngridientsPanelLayout.createSequentialGroup()
                                                                .addGap(26, 26, 26)
                                                                .addComponent(jLabel7)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(administrateIngridientsIngridientNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, administrateIngridientsPanelLayout.createSequentialGroup()
                                                                .addComponent(searchIngridientModifyIngridientButton)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(searchIngridientDeleteIngridient))
                                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)))
                                        .addGroup(administrateIngridientsPanelLayout.createSequentialGroup()
                                                .addGap(167, 167, 167)
                                                .addComponent(searchIngridientButton)))
                                .addContainerGap(59, Short.MAX_VALUE))
        );
        administrateIngridientsPanelLayout.setVerticalGroup(
                administrateIngridientsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(administrateIngridientsPanelLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel6)
                                .addGap(29, 29, 29)
                                .addGroup(administrateIngridientsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(administrateIngridientsIngridientNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(searchIngridientButton)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addGroup(administrateIngridientsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(searchIngridientDeleteIngridient)
                                        .addComponent(searchIngridientModifyIngridientButton))
                                .addContainerGap(140, Short.MAX_VALUE))
        );

        Parent.add(administrateIngridientsPanel, "card5");

        seeInventoryPanelProductTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        jScrollPane4.setViewportView(seeInventoryPanelProductTable);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("PRODUCTOS:");

        seeIventoryPanelIngridientTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        jScrollPane6.setViewportView(seeIventoryPanelIngridientTable);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("INGREDIENTES:");

        javax.swing.GroupLayout seeInventoryLayout = new javax.swing.GroupLayout(seeInventory);
        seeInventory.setLayout(seeInventoryLayout);
        seeInventoryLayout.setHorizontalGroup(
                seeInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, seeInventoryLayout.createSequentialGroup()
                                .addContainerGap(54, Short.MAX_VALUE)
                                .addGroup(seeInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(seeInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34))
        );
        seeInventoryLayout.setVerticalGroup(
                seeInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(seeInventoryLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addGap(8, 8, 8)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(27, Short.MAX_VALUE))
        );

        Parent.add(seeInventory, "card6");

        MainMenu.add(Parent);
        Parent.setBounds(120, 30, 580, 450);

        PanelLoginAndMainMenu.add(MainMenu, "card3");

        getContentPane().add(PanelLoginAndMainMenu);
        PanelLoginAndMainMenu.setBounds(0, 0, 700, 480);

        pack();
    }// </editor-fold>

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO JOPTION PANE JAJAJAJJA
    }

    private void showAdministrateProductsButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Parent.removeAll();
        Parent.add(administrateProducts);
        Parent.repaint();
        Parent.revalidate();

    }

    private void searchProductTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void searchProductModifyProductButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void addProductNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void addProductPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void addProductIsCookedCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void addProductAddIngridientButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void addIngridientAddIngridientButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void AddProductButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Parent.removeAll();
        Parent.add(addProductos); //Monda wave
        Parent.repaint();
        Parent.revalidate();
    }

    private void addIngridientsActionPerformed(java.awt.event.ActionEvent evt) {
        Parent.removeAll();
        Parent.add(addIngridientPanel); //Monda wave
        Parent.repaint();
        Parent.revalidate();
    }

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void administrateIngridientsButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Parent.removeAll();
        Parent.add(administrateIngridientsPanel); //Monda wave
        Parent.repaint();
        Parent.revalidate();
    }

    private void seeInventoryButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Parent.removeAll();
        Parent.add(seeInventory); //Monda wave
        Parent.repaint();
        Parent.revalidate();
    }

    private void searchIngridientDeleteIngridientActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void searchIngridientButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void searchIngridientModifyIngridientButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }


    public void login(){
        PanelLoginAndMainMenu.removeAll();
        PanelLoginAndMainMenu.add(MainMenu); //Monda wave
        PanelLoginAndMainMenu.repaint();
        PanelLoginAndMainMenu.revalidate();
    }

    public String getUsername(){
        return logginUsernameTextField.getText();
    }

    public String getPassword(){
        return new String( logginPaswordTextField.getPassword());
    }

    public void changeHeader(String text){
        headerLabel.setText(text);
        headerLabel.repaint();
    }

    public String getSearchedProduct(){
        return searchProductTextField.getText();
    }

    public void setAddProductIngredientListModel(ArrayList<Ingredient> ingredients) {
        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
        for (Ingredient ingredient : ingredients) {
            comboBoxModel.addElement(ingredient.toString());
        }
        addProductIngridientList.setModel(comboBoxModel);
    }

    public void setSearchProductTable(){
        searchProductTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null}},
                new String [] {
                        "ID", "NOMBRE", "PRECIO", "CANTIDAD"
                }
        ));
    }

    public int getTypeProduct(){
        if(addProductIsCookedCheckBox.isSelected()){
            return 1;
        }else{
            return 2;
        }
    }

    public String getAddProductName(){
        return addProductNameTextField.getText();
    }

    public float getPriceForAddingProduct(){
        if(addProductPriceFormatedTextField.getValue() == null){
            return 0;
        }
        return (float) addProductPriceFormatedTextField.getValue();
    }

    public int getIndexFromIngridientList() { //TODO esto podria ser una oportunidad para usar la clase Ingridient
        return addProductIngridientList.getSelectedIndex();
    }

    // Variables declaration - do not modify
    private javax.swing.JButton AddProductButton;
    private javax.swing.JLabel AddProductLabel;
    private javax.swing.JPanel Base;
    private javax.swing.JPanel Loggin;
    private javax.swing.JPanel MainMenu;
    private javax.swing.JPanel PanelLoginAndMainMenu;
    private javax.swing.JPanel Parent;
    private javax.swing.JButton addIngridientAddIngridientButton;
    private javax.swing.JTextField addIngridientIngridientNameTextField;
    private javax.swing.JSpinner addIngridientIngridientQuianity;
    private javax.swing.JPanel addIngridientPanel;
    private javax.swing.JButton addIngridients;
    private javax.swing.JTextArea addIngridientsAddedIngridientsTextField;
    private javax.swing.JButton addProductAddIngridientButton;
    private javax.swing.JComboBox<String> addProductIngridientList;
    private javax.swing.JSpinner addProductIngridientQuantity;
    private javax.swing.JCheckBox addProductIsCookedCheckBox;
    private javax.swing.JTextField addProductNameTextField;
    private javax.swing.JFormattedTextField addProductPriceFormatedTextField;
    private javax.swing.JSpinner addProductQuantitySpinner;
    private javax.swing.JPanel addProductos;
    private javax.swing.JButton administrateIngridientsButton;
    private javax.swing.JTextField administrateIngridientsIngridientNameTextField;
    private javax.swing.JPanel administrateIngridientsPanel;
    private javax.swing.JPanel administrateProducts;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton exitButtonLongin;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JTable ingridientSearchJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable3;
    private javax.swing.JPasswordField logginPaswordTextField;
    private javax.swing.JTextField logginUsernameTextField;

    private javax.swing.JButton addProductAddProductButton;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel productNameLabel;
    private javax.swing.JButton searchIngridientButton;
    private javax.swing.JButton searchIngridientDeleteIngridient;
    private javax.swing.JButton searchIngridientModifyIngridientButton;

    private javax.swing.JButton searchProductButton;
    private javax.swing.JButton searchProductDeleteProductButton;
    private javax.swing.JLabel searchProductLabel;
    private javax.swing.JButton searchProductModifyProductButton;
    private javax.swing.JTable searchProductTable;
    private javax.swing.JTextField searchProductTextField;
    private javax.swing.JPanel seeInventory;
    private javax.swing.JButton seeInventoryButton;
    private javax.swing.JTable seeInventoryPanelProductTable;
    private javax.swing.JTable seeIventoryPanelIngridientTable;
    private javax.swing.JButton showAdministrateProductsButton;
    private javax.swing.JCheckBox showPasswordCheckBox;

    public void addItemToTextFieldInAddProduct(String ingridient) {
        addIngridientsAddedIngridientsTextField.setText(addIngridientsAddedIngridientsTextField.getText()+ingridient+",");
    }

    public void showJOptionPaneError(String s) {
        JOptionPane.showMessageDialog(null, s, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public void showJOptionPaneSuccess(String s) {
        JOptionPane.showMessageDialog(null, s, "Error", JOptionPane.INFORMATION_MESSAGE);
    }


    // End of variables declaration
}
