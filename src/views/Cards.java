package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Cards extends JPanel {
    private MainMenu mainMenu;
    private LoginMenu loginMenu;
    private AddProductPanel addProductPanel;
    private SearchProductPanel searchProductPanel;
    private CardLayout cardLayout;

    public Cards(ActionListener presenterListener) {
        initComponents(presenterListener);
    }
    private void initComponents(ActionListener presenterListener) {
        cardLayout = new CardLayout();
        this.setLayout(cardLayout); //Card Layout
        mainMenu = new MainMenu(presenterListener);
        loginMenu = new LoginMenu(presenterListener);
        addProductPanel = new AddProductPanel(presenterListener);
        searchProductPanel = new SearchProductPanel(presenterListener);
        add(loginMenu.getLoginMenu(), "loginMenu");
        add(mainMenu.getMainMenu(), "mainMenu");
        add(addProductPanel.getSearchProductPanel(),"addProduct");
        add(searchProductPanel.getSearchProductPanel(),"searchProcut");
        cardLayout.show(this, "mainMenu");
    }

    public MainMenu getMainMenu() {
        return mainMenu;
    }

    public String getUser(){
        return loginMenu.getUser();
    }

    public String getPassword(){
        return loginMenu.getPassword();
    }

    public void changePanel(String panel) {
        switch (panel) {
            case "mainMenu" -> cardLayout.show(this, "mainMenu");
            case "loginMenu" -> cardLayout.show(this, "loginMenu");
            case "addProduct" -> cardLayout.show(this,"addProduct");
            case "searchProcut" -> cardLayout.show(this,"searchProcut");
        }
    }
}
