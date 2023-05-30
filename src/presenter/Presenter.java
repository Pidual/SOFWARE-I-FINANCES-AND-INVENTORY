package presenter;

import models.ProductOrder;
import models.Restaurant;
import views.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import static connect.Connect.getProductOrdersByKeyword;

public class Presenter implements ActionListener{

    private Restaurant restaurant;
    private MainFrame gui;
    public Presenter(){
        restaurant = new Restaurant();
        gui = new MainFrame(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command){
            case "LOGIN": //cesarc 12345678
//                if (restaurant.login(gui.getUsername(),gui.getPassword())){ //John Doe password
//                    gui.login();
//                }
                gui.login();
                break;

            case "GESTIONAR_PRODUCTOS":
                    gui.changeHeader("GESTIONAR_PRODUCTOS");
                    break;
            case "EXIT":
                JOptionPane JOptionPane = null;
                int opcion = javax.swing.JOptionPane.showConfirmDialog(null, "¿Deseas cerrar la aplicación?", "Confirmar cierre", JOptionPane.YES_NO_OPTION);
                if (opcion == javax.swing.JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
                break;
            case "BUSCAR_PRODUCTO":
                //System.out.println("buscando producto...");
                //ArrayList<ProductOrder> productOrders = restaurant.getProductOrdersByKeyword(gui.getSearchedProduct());

                break;

            case "AGREGAR_PRODUCTOS":

                break;

            case "MODIFICAR_PRODUCTO":

                break;



        }
    }
}
