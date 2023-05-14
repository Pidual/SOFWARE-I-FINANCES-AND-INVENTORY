package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Cards extends JPanel {
    private MainFrame mainMenu;
    private LoginMenu loginMenu;
    private CardLayout cardLayout;

    public Cards(ActionListener presenterListener) {
        initComponents(presenterListener);
    }
    private void initComponents(ActionListener presenterListener) {
        cardLayout = new CardLayout();
        this.setLayout(cardLayout); //Card Layout
        mainMenu = new MainFrame();
        loginMenu = new LoginMenu(presenterListener);
        add(loginMenu.getLoginMenu(), "loginMenu");
        add(mainMenu, "mainMenu");
        cardLayout.show(this, "loginMenu");
    }

    public String getUser(){
        return loginMenu.getUser();
    }

    public String getPassword(){
        return loginMenu.getPassword();
    }

    public void changePanel(String panel) {
        switch (panel) {

            case "mainMenu":
                cardLayout.show(this, "mainMenu");
                break;
            case "loginMenu":
                cardLayout.show(this, "loginMenu");
                break;
        }
    }
}
