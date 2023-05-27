package views;

import java.awt.event.ActionListener;

public class MainFrame extends javax.swing.JFrame {
    public MainFrame(ActionListener presenterListener) {
        initComponents(presenterListener);
        setVisible(true);
    }

    public void login(){
        PanelLoginAndMainMenu.removeAll();
        PanelLoginAndMainMenu.add(MainMenu);
        PanelLoginAndMainMenu.repaint();
        PanelLoginAndMainMenu.revalidate();
        }

    private void initComponents(ActionListener presenterListener) {
        PanelLoginAndMainMenu = new javax.swing.JPanel();
        Loggin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        exitButtonLongin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        userTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        paswordPaswordField = new javax.swing.JPasswordField();
        MainMenu = new javax.swing.JPanel();
        HeaderLabel = new javax.swing.JLabel();
        Base = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        AddProductButton = new javax.swing.JButton();
        addIngridients = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        Parent = new javax.swing.JPanel();
        administrateProducts = new javax.swing.JPanel();
        searchProductLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        codigoProductoLabel = new javax.swing.JLabel();
        productoNameTextField = new javax.swing.JTextField();
        productIDTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultTable = new javax.swing.JTable();
        editProduct = new javax.swing.JButton();
        deleteProduct = new javax.swing.JButton();
        addProductos = new javax.swing.JPanel();
        AddProductLabel = new javax.swing.JLabel();
        productNameLabel = new javax.swing.JLabel();
        productName = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        PriceTextField = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        addIngriedientoTheTheDB = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        addedIngridientsTextField = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        ingridientList = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        ingridientQuantity = new javax.swing.JSpinner();
        addIngridientPanel = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jSpinner2 = new javax.swing.JSpinner();

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
        loginButton.addActionListener(presenterListener);
        loginButton.setActionCommand("LOGIN");

        exitButtonLongin.setBackground(new java.awt.Color(255, 209, 102));
        exitButtonLongin.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        exitButtonLongin.setText("SALIR");
        exitButtonLongin.setActionCommand("EXIT");
        exitButtonLongin.addActionListener(presenterListener);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("USUARIO:");

        userTextField.setBackground(new java.awt.Color(236, 228, 183));
        userTextField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        userTextField.setText("USUARIO");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("CONTRASEÑA:");

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\carli\\OneDrive\\Escritorio\\SOFTWARE I\\SOFWARE-I-FINANCES-AND-INVENTORY\\resources\\hamburger_logo.png")); // NOI18N

        jLabel2.setBackground(new java.awt.Color(148, 104, 70));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Restaurante Guaranii Sistema de Informacion");
        jLabel2.setOpaque(true);

        paswordPaswordField.setBackground(new java.awt.Color(236, 228, 183));
        paswordPaswordField.setText("jPasswordField1");

        javax.swing.GroupLayout LogginLayout = new javax.swing.GroupLayout(Loggin);
        Loggin.setLayout(LogginLayout);
        LogginLayout.setHorizontalGroup(
                LogginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(LogginLayout.createSequentialGroup()
                                .addGroup(LogginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(LogginLayout.createSequentialGroup()
                                                .addGap(171, 171, 171)
                                                .addGroup(LogginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel3)
                                                        .addComponent(exitButtonLongin, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(69, 69, 69)
                                                .addGroup(LogginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(loginButton)
                                                        .addComponent(userTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(LogginLayout.createSequentialGroup()
                                                .addGap(311, 311, 311)
                                                .addComponent(jLabel5))
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(LogginLayout.createSequentialGroup()
                                .addGap(214, 214, 214)
                                .addGroup(LogginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(paswordPaswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LogginLayout.setVerticalGroup(
                LogginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(LogginLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(LogginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(userTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(LogginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(paswordPaswordField))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                                .addGroup(LogginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(loginButton)
                                        .addComponent(exitButtonLongin))
                                .addGap(47, 47, 47))
        );

        PanelLoginAndMainMenu.add(Loggin, "card2");

        MainMenu.setLayout(null);

        HeaderLabel.setBackground(new java.awt.Color(148, 104, 70));
        HeaderLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        HeaderLabel.setForeground(new java.awt.Color(255, 255, 255));
        HeaderLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HeaderLabel.setText("Menu Principal");
        HeaderLabel.setOpaque(true);
        MainMenu.add(HeaderLabel);
        HeaderLabel.setBounds(0, -4, 700, 40);

        Base.setBackground(new java.awt.Color(185, 184, 153));

        jButton1.setBackground(new java.awt.Color(255, 209, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("<html>BUSCAR<br>PRODUCTOS<html>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
        exitButton.addActionListener(presenterListener);
        exitButton.setActionCommand("EXIT");

        javax.swing.GroupLayout BaseLayout = new javax.swing.GroupLayout(Base);
        Base.setLayout(BaseLayout);
        BaseLayout.setHorizontalGroup(
                BaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BaseLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(BaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(addIngridients, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addGroup(BaseLayout.createSequentialGroup()
                                                .addGroup(BaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(AddProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 3, Short.MAX_VALUE))
                                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addContainerGap())
        );
        BaseLayout.setVerticalGroup(
                BaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BaseLayout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AddProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addIngridients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                                .addComponent(exitButton)
                                .addGap(99, 99, 99))
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

        codigoProductoLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        codigoProductoLabel.setText("CODIGO PRODUCTO:");

        productoNameTextField.setBackground(new java.awt.Color(236, 228, 183));
        productoNameTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        productoNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productoNameTextFieldActionPerformed(evt);
            }
        });

        productIDTextField.setBackground(new java.awt.Color(236, 228, 183));
        productIDTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        productIDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productIDTextFieldActionPerformed(evt);
            }
        });

        resultTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(resultTable);

        editProduct.setBackground(new java.awt.Color(148, 104, 70));
        editProduct.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        editProduct.setText("MODIFICAR PRODUCTO");
        editProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editProductActionPerformed(evt);
            }
        });

        deleteProduct.setBackground(new java.awt.Color(148, 104, 70));
        deleteProduct.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        deleteProduct.setText("ELIMINAR PRODUCTO");

        javax.swing.GroupLayout administrateProductsLayout = new javax.swing.GroupLayout(administrateProducts);
        administrateProducts.setLayout(administrateProductsLayout);
        administrateProductsLayout.setHorizontalGroup(
                administrateProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(administrateProductsLayout.createSequentialGroup()
                                .addGroup(administrateProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(administrateProductsLayout.createSequentialGroup()
                                                .addGap(72, 72, 72)
                                                .addGroup(administrateProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(administrateProductsLayout.createSequentialGroup()
                                                                .addGroup(administrateProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(codigoProductoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel8))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(administrateProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(productoNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                                                                        .addComponent(productIDTextField)))
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(administrateProductsLayout.createSequentialGroup()
                                                                .addComponent(editProduct)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(deleteProduct))))
                                        .addGroup(administrateProductsLayout.createSequentialGroup()
                                                .addGap(170, 170, 170)
                                                .addComponent(searchProductLabel)))
                                .addContainerGap(56, Short.MAX_VALUE))
        );
        administrateProductsLayout.setVerticalGroup(
                administrateProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(administrateProductsLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(searchProductLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addGroup(administrateProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(codigoProductoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(productIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(administrateProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(productoNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addGroup(administrateProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(editProduct)
                                        .addComponent(deleteProduct))
                                .addGap(101, 101, 101))
        );

        Parent.add(administrateProducts, "card2");

        addProductos.setBackground(new java.awt.Color(204, 204, 204));

        AddProductLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        AddProductLabel.setText("AGREGAR PRODUCTO:");

        productNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        productNameLabel.setText("NOMBRE:");

        productName.setBackground(new java.awt.Color(236, 228, 183));
        productName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        productName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productNameActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("CANTIDAD:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("PRECIO:");

        PriceTextField.setBackground(new java.awt.Color(236, 228, 183));
        PriceTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceTextFieldActionPerformed(evt);
            }
        });

        jCheckBox1.setText("¿Producto Cocinado?");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        addIngriedientoTheTheDB.setBackground(new java.awt.Color(148, 104, 70));
        addIngriedientoTheTheDB.setText("<html>AGREGAR<br>INGREDIENTE<html>");
        addIngriedientoTheTheDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addIngriedientoTheTheDBActionPerformed(evt);
            }
        });

        addedIngridientsTextField.setColumns(20);
        addedIngridientsTextField.setRows(5);
        jScrollPane2.setViewportView(addedIngridientsTextField);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText("INGREDIENTE:");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText("CANTIDAD:");

        ingridientList.setBackground(new java.awt.Color(236, 228, 183));
        ingridientList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel17.setText("ingredientes agregados:");

        javax.swing.GroupLayout addProductosLayout = new javax.swing.GroupLayout(addProductos);
        addProductos.setLayout(addProductosLayout);
        addProductosLayout.setHorizontalGroup(
                addProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(addProductosLayout.createSequentialGroup()
                                .addGroup(addProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(addProductosLayout.createSequentialGroup()
                                                .addGap(167, 167, 167)
                                                .addComponent(AddProductLabel))
                                        .addGroup(addProductosLayout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addGroup(addProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(addProductosLayout.createSequentialGroup()
                                                .addGap(132, 132, 132)
                                                .addGroup(addProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel13)
                                                        .addComponent(productNameLabel)
                                                        .addComponent(jLabel12)
                                                        .addComponent(jLabel15)
                                                        .addComponent(jLabel16))
                                                .addGap(18, 18, 18)
                                                .addGroup(addProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(addIngriedientoTheTheDB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(addProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(productName)
                                                                .addComponent(PriceTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                                                .addComponent(jCheckBox1)
                                                                .addComponent(ingridientList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jSpinner1)
                                                                .addComponent(ingridientQuantity, javax.swing.GroupLayout.Alignment.TRAILING)))))
                                .addContainerGap(24, Short.MAX_VALUE))
        );
        addProductosLayout.setVerticalGroup(
                addProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(addProductosLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(AddProductLabel)
                                .addGap(18, 18, 18)
                                .addGroup(addProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(productNameLabel)
                                        .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(addProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel13)
                                        .addComponent(PriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(addProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel12)
                                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox1)
                                .addGap(30, 30, 30)
                                .addGroup(addProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel15)
                                        .addComponent(ingridientList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(addProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel16)
                                        .addComponent(ingridientQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addIngriedientoTheTheDB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(32, Short.MAX_VALUE))
        );

        Parent.add(addProductos, "card3");

        addIngridientPanel.setBackground(new java.awt.Color(204, 204, 204));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel18.setText("AGREGAR INGREDIENTE:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("CANTIDAD:");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setText("NOMBRE INGREDIENTE:");

        jTextField9.setBackground(new java.awt.Color(236, 228, 183));
        jTextField9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jButton10.setBackground(new java.awt.Color(148, 104, 70));
        jButton10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton10.setText("AGREGAR INGREDIENTE");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jSpinner2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

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
                                        .addComponent(jTextField9, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                        .addComponent(jSpinner2))
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addIngridientPanelLayout.createSequentialGroup()
                                .addContainerGap(164, Short.MAX_VALUE)
                                .addComponent(jLabel18)
                                .addGap(154, 154, 154))
                        .addGroup(addIngridientPanelLayout.createSequentialGroup()
                                .addGap(176, 176, 176)
                                .addComponent(jButton10)
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
                                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(addIngridientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel14))
                                .addGap(34, 34, 34)
                                .addComponent(jButton10)
                                .addContainerGap(226, Short.MAX_VALUE))
        );

        Parent.add(addIngridientPanel, "card4");

        MainMenu.add(Parent);
        Parent.setBounds(120, 30, 580, 450);

        PanelLoginAndMainMenu.add(MainMenu, "card3");

        getContentPane().add(PanelLoginAndMainMenu);
        PanelLoginAndMainMenu.setBounds(0, 0, 700, 450);

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        Parent.removeAll();
        Parent.add(administrateProducts);
        Parent.repaint();
        Parent.revalidate();

    }

    private void productoNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void productIDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void editProductActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void productNameActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void PriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void addIngriedientoTheTheDBActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {
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
    // Variables declaration - do not modify
    private javax.swing.JButton AddProductButton;
    private javax.swing.JLabel AddProductLabel;
    private javax.swing.JPanel Base;
    private javax.swing.JLabel HeaderLabel;
    private javax.swing.JPanel Loggin;
    private javax.swing.JPanel MainMenu;
    private javax.swing.JPanel PanelLoginAndMainMenu;
    private javax.swing.JPanel Parent;
    private javax.swing.JTextField PriceTextField;
    private javax.swing.JPanel addIngridientPanel;
    private javax.swing.JButton addIngridients;
    private javax.swing.JButton addIngriedientoTheTheDB;
    private javax.swing.JPanel addProductos;
    private javax.swing.JTextArea addedIngridientsTextField;
    private javax.swing.JPanel administrateProducts;
    private javax.swing.JLabel codigoProductoLabel;
    private javax.swing.JButton deleteProduct;
    private javax.swing.JButton editProduct;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton exitButtonLongin;
    private javax.swing.JComboBox<String> ingridientList;
    private javax.swing.JSpinner ingridientQuantity;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField paswordPaswordField;
    private javax.swing.JTextField productIDTextField;
    private javax.swing.JTextField productName;
    private javax.swing.JLabel productNameLabel;
    private javax.swing.JTextField productoNameTextField;
    private javax.swing.JTable resultTable;
    private javax.swing.JLabel searchProductLabel;
    private javax.swing.JTextField userTextField;
    // End of variables declaration
}