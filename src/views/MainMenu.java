package views;

import javax.swing.*;
import java.awt.event.ActionListener;

public class MainMenu {
    private JButton gestionarProductosButton;
    private JButton agregarProductosButton;
    private JPanel mainMenu;
    private JPanel dummyPanel;
    private JButton exitButton;


    public MainMenu(ActionListener presenterListener) {
            gestionarProductosButton.addActionListener(presenterListener);
            gestionarProductosButton.setActionCommand("BUSCAR_PRODUCTO");
            agregarProductosButton.addActionListener(presenterListener);
            agregarProductosButton.setActionCommand("AGREGAR_PRODUCTOS");
            exitButton.addActionListener(presenterListener);
            exitButton.setActionCommand("EXIT");
    }



    public JPanel getMainMenu() {
        return mainMenu;
    }
}
