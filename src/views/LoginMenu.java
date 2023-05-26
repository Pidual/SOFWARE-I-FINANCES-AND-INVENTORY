package views;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class LoginMenu {

    private JButton loginButton;
    private JPanel loginMenu;

    private JTextField usernameTextField;
    private JLabel image;
    private JButton helpButton;
    private JPasswordField passwordField;
    private JCheckBox passwordShowCheckBox;

    public JPanel getLoginMenu() {
        return loginMenu;
    }

    public String getUser() {
        return usernameTextField.getText();
    }

    public String getPassword() {
        char[] password = passwordField.getPassword();
        return String.valueOf(password);
    }


    public LoginMenu(ActionListener presenterListener) {
        ImageIcon imageIcon = new ImageIcon("resources/hamburger_logo.png"); // Load the image
        //Image imageAux = imageIcon.getImage(); // transform it
        //Image newimg = imageAux.getScaledInstance(120, 90, Image.SCALE_SMOOTH); // scale it the smooth way
        //imageIcon = new ImageIcon(newimg);  // transform it back
        image.setIcon(imageIcon);
        loginButton.addActionListener(presenterListener);
        loginButton.setActionCommand("INGRESAR");

        usernameTextField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                usernameTextField.setText("");
            }
        });
        passwordField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                passwordField.setText("");
            }
        });
    }
}


