package views;

import javax.swing.*;
import java.awt.event.ActionListener;

public class LoginMenu {

    private JTextField passwordField;
    private JTextField userField;
    private JButton AYUDAButton;
    private JButton loginButton;
    private JPanel loginMenu;
    private JLabel image;

    public JPanel getLoginMenu() {
        return loginMenu;
    }

    public String getUser() {
        return userField.getText();
    }

    public String getPassword() {
        return passwordField.getText();
    }

    public LoginMenu(ActionListener presenterListener) {
        ImageIcon imageIcon = new ImageIcon("resources/hamburger_logo.png"); // Load the image
        image.setIcon(imageIcon); // Set the icon for the label
        loginButton.addActionListener(presenterListener);
        loginButton.setActionCommand("INGRESAR");
    }
}


