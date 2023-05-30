package presenter;

import models.Restaurant;
import views.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
                System.out.println(gui.getUsername());
                System.out.println(gui.getPassword());
                if (restaurant.login(gui.getUsername(),gui.getPassword())){ //John Doe password
                    gui.login();
                }else{
                    System.out.println("login fallado");
                }
                break;

            case "GESTIONAR_PRODUCTOS":
                    break;
            case "EXIT":
                JOptionPane JOptionPane = null;
                int opcion = javax.swing.JOptionPane.showConfirmDialog(null, "¿Deseas cerrar la aplicación?", "Confirmar cierre", JOptionPane.YES_NO_OPTION);
                if (opcion == javax.swing.JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
                break;
            case "BUSCAR_PRODUCTO":

                break;

            case "AGREGAR_PRODUCTOS":

                break;

        }
    }
}
