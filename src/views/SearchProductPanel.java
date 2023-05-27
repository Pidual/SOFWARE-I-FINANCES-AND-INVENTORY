package views;

import javax.swing.*;
import java.awt.event.ActionListener;

public class SearchProductPanel {


    private JPanel searchPanel;
    private JTextField textField2;
    private JTextField textField1;
    private JTable table1;
    private JButton gestionarProductosButton;
    private JButton agregarProductosButton;
    private JButton exitButton;

    public SearchProductPanel(ActionListener presenterListener){
        gestionarProductosButton.addActionListener(presenterListener);
        gestionarProductosButton.setActionCommand("BUSCAR_PRODUCTO");
        agregarProductosButton.addActionListener(presenterListener);
        agregarProductosButton.setActionCommand("AGREGAR_PRODUCTOS");
        exitButton.addActionListener(presenterListener);
        exitButton.setActionCommand("EXIT");
    }
    public JPanel getSearchProductPanel() {
        return searchPanel;
    }


    private void createUIComponents() {
        table1 = new JTable(3, 1);
    }
}
