package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class SubMenus extends JPanel{

    private SearchProducto searchProductoPanel;
    private AddProductPanel addProductPanel;
    public SubMenus(ActionListener presenterListener){
        this.setLayout(new CardLayout());
        add(searchProductoPanel.getSearchProductPanel(),"searchPanel");
        add(addProductPanel.getAddProductPanel(),"addProductPanel");
    }

}
