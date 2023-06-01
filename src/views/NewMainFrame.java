package views;

import javax.swing.*;

public class NewMainFrame extends javax.swing.JFrame {
    public NewMainFrame() {
        this.setUndecorated(true);
        this.setLocationRelativeTo(null);
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jScrollPane5 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
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
        Base = new javax.swing.JPanel();
        showAdministrateProductsButton = new javax.swing.JButton();
        AddProductButton = new javax.swing.JButton();
        addIngridients = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        administrateIngridientsButton = new javax.swing.JButton();
        seeInventoryButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
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
        jLabel13 = new javax.swing.JLabel();
        addProductPriceTextField = new javax.swing.JTextField();
        addProductIsCookedCheckBox = new javax.swing.JCheckBox();
        addProductAddIngridientButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        addIngridientsAddedIngridientsTextField = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        addProductIngridientList = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        addProductAddProductButton = new javax.swing.JButton();
        addIngridientPanel = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        addIngridientIngridientNameTextField = new javax.swing.JTextField();
        addIngridientAddIngridientButton = new javax.swing.JButton();
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
        setMaximizedBounds(getMaximizedBounds());
        setPreferredSize(new java.awt.Dimension(900, 700));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(217, 217, 217));

        PanelLoginAndMainMenu.setLayout(new java.awt.CardLayout());

        Loggin.setBackground(new java.awt.Color(217, 217, 217));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INICIO DE SESION");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        loginButton.setBackground(new java.awt.Color(255, 209, 102));
        loginButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        loginButton.setText("INGRESAR");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        exitButtonLongin.setBackground(new java.awt.Color(255, 209, 102));
        exitButtonLongin.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        exitButtonLongin.setText("SALIR");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("USUARIO:");

        logginUsernameTextField.setBackground(new java.awt.Color(236, 228, 183));
        logginUsernameTextField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        logginUsernameTextField.setText("USUARIO");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("CONTRASEÑA:");

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\carli\\OneDrive\\Escritorio\\SOFTWARE I\\SOFWARE-I-FINANCES-AND-INVENTORY\\resources\\hamburger_logo.png")); // NOI18N

        jLabel2.setBackground(new java.awt.Color(148, 104, 70));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Restaurante Guaranii Sistema de Informacion");
        jLabel2.setOpaque(true);

        logginPaswordTextField.setBackground(new java.awt.Color(236, 228, 183));
        logginPaswordTextField.setText("jPasswordField1");

        showPasswordCheckBox.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        showPasswordCheckBox.setText("mostrar contraseña");

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

        MainMenu.setLayout(new java.awt.BorderLayout());

        Base.setBackground(new java.awt.Color(185, 184, 153));

        showAdministrateProductsButton.setBackground(new java.awt.Color(255, 209, 102));
        showAdministrateProductsButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        showAdministrateProductsButton.setText("<html>GESTIONAR<br>PRODUCTOS<html>");
        showAdministrateProductsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAdministrateProductsButtonActionPerformed(evt);
            }
        });

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
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

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

        MainMenu.add(Base, java.awt.BorderLayout.WEST);

        Parent.setBackground(new java.awt.Color(217, 217, 217));
        Parent.setLayout(new java.awt.CardLayout());

        administrateProducts.setBackground(new java.awt.Color(204, 204, 204));

        searchProductLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        searchProductLabel.setText("BUSCAR PRODUCTO:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("NOMBRE PRODUCTO:");

        searchProductTextField.setBackground(new java.awt.Color(236, 228, 183));
        searchProductTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        searchProductTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchProductTextFieldActionPerformed(evt);
            }
        });

        searchProductTable.setModel(new javax.swing.table.DefaultTableModel(
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
                                                        .addGroup(administrateProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addGroup(administrateProductsLayout.createSequentialGroup()
                                                                        .addComponent(jLabel8)
                                                                        .addGap(26, 26, 26)
                                                                        .addComponent(searchProductTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(administrateProductsLayout.createSequentialGroup()
                                                                .addComponent(searchProductModifyProductButton)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(searchProductDeleteProductButton)))))
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
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(administrateProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(searchProductModifyProductButton)
                                        .addComponent(searchProductDeleteProductButton))
                                .addContainerGap(88, Short.MAX_VALUE))
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

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("PRECIO:");

        addProductPriceTextField.setBackground(new java.awt.Color(236, 228, 183));
        addProductPriceTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addProductPriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductPriceTextFieldActionPerformed(evt);
            }
        });

        addProductIsCookedCheckBox.setText("¿Producto Cocinado?");
        addProductIsCookedCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductIsCookedCheckBoxActionPerformed(evt);
            }
        });

        addProductAddIngridientButton.setBackground(new java.awt.Color(148, 104, 70));
        addProductAddIngridientButton.setText("<html>AGREGAR<br>INGREDIENTE<html>");
        addProductAddIngridientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductAddIngridientButtonActionPerformed(evt);
            }
        });

        addIngridientsAddedIngridientsTextField.setColumns(20);
        addIngridientsAddedIngridientsTextField.setRows(5);
        jScrollPane2.setViewportView(addIngridientsAddedIngridientsTextField);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText("INGREDIENTE:");

        addProductIngridientList.setBackground(new java.awt.Color(236, 228, 183));
        addProductIngridientList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel17.setText("ingredientes del producto:");

        addProductAddProductButton.setBackground(new java.awt.Color(148, 104, 70));
        addProductAddProductButton.setText("<html>AGREGAR<br>PRODUCTO<html>");
        addProductAddProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductAddProductButtonActionPerformed(evt);
            }
        });

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
                                                        .addComponent(addProductPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                        .addComponent(addProductPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE))
                                        .addGroup(addProductosLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(addProductAddIngridientButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

        javax.swing.GroupLayout addIngridientPanelLayout = new javax.swing.GroupLayout(addIngridientPanel);
        addIngridientPanel.setLayout(addIngridientPanelLayout);
        addIngridientPanelLayout.setHorizontalGroup(
                addIngridientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(addIngridientPanelLayout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(jLabel19)
                                .addGap(22, 22, 22)
                                .addComponent(addIngridientIngridientNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addIngridientPanelLayout.createSequentialGroup()
                                .addContainerGap(168, Short.MAX_VALUE)
                                .addComponent(jLabel18)
                                .addGap(154, 154, 154))
                        .addGroup(addIngridientPanelLayout.createSequentialGroup()
                                .addGap(173, 173, 173)
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
                                .addComponent(addIngridientAddIngridientButton)
                                .addContainerGap(291, Short.MAX_VALUE))
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
                                .addContainerGap(69, Short.MAX_VALUE))
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
        jLabel9.setText("PRODUCTOS EN EL INVENTARIO:");

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
        jLabel10.setText("INGREDIENTES EN EL INVENTARIO:");

        javax.swing.GroupLayout seeInventoryLayout = new javax.swing.GroupLayout(seeInventory);
        seeInventory.setLayout(seeInventoryLayout);
        seeInventoryLayout.setHorizontalGroup(
                seeInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, seeInventoryLayout.createSequentialGroup()
                                .addContainerGap(54, Short.MAX_VALUE)
                                .addGroup(seeInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(seeInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel9))
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 580, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(Parent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 450, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(Parent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );

        MainMenu.add(jPanel3, java.awt.BorderLayout.CENTER);

        PanelLoginAndMainMenu.add(MainMenu, "card3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 700, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(PanelLoginAndMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 480, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(PanelLoginAndMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>

    private void searchProductTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void searchProductModifyProductButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void addProductNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
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

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {
        PanelLoginAndMainMenu.removeAll();
        PanelLoginAndMainMenu.add(MainMenu); //Monda wave
        PanelLoginAndMainMenu.repaint();
        PanelLoginAndMainMenu.revalidate();
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

    private void addProductAddProductButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void addProductPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void seeInventoryButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Parent.removeAll();
        Parent.add(seeInventory); //Monda wave
        Parent.repaint();
        Parent.revalidate();
    }

    private void administrateIngridientsButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Parent.removeAll();
        Parent.add(administrateIngridientsPanel); //Monda wave
        Parent.repaint();
        Parent.revalidate();
    }

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO JOPTION PANE JAJAJAJJA
    }

    private void addIngridientsActionPerformed(java.awt.event.ActionEvent evt) {
        Parent.removeAll();
        Parent.add(addIngridientPanel); //Monda wave
        Parent.repaint();
        Parent.revalidate();
    }

    private void AddProductButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Parent.removeAll();
        Parent.add(addProductos); //Monda wave
        Parent.repaint();
        Parent.revalidate();
    }

    private void showAdministrateProductsButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Parent.removeAll();
        Parent.add(administrateProducts);
        Parent.repaint();
        Parent.revalidate();

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
    private javax.swing.JPanel addIngridientPanel;
    private javax.swing.JButton addIngridients;
    private javax.swing.JTextArea addIngridientsAddedIngridientsTextField;
    private javax.swing.JButton addProductAddIngridientButton;
    private javax.swing.JButton addProductAddProductButton;
    private javax.swing.JComboBox<String> addProductIngridientList;
    private javax.swing.JCheckBox addProductIsCookedCheckBox;
    private javax.swing.JTextField addProductNameTextField;
    private javax.swing.JTextField addProductPriceTextField;
    private javax.swing.JPanel addProductos;
    private javax.swing.JButton administrateIngridientsButton;
    private javax.swing.JTextField administrateIngridientsIngridientNameTextField;
    private javax.swing.JPanel administrateIngridientsPanel;
    private javax.swing.JPanel administrateProducts;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton exitButtonLongin;
    private javax.swing.JTable ingridientSearchJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable3;
    private javax.swing.JPasswordField logginPaswordTextField;
    private javax.swing.JTextField logginUsernameTextField;
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
    // End of variables declaration
}
