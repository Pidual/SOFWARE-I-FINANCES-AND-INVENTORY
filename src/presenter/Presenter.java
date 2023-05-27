package presenter;

import models.User;
import views.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Presenter implements ActionListener{

    private User user;
    private GUI gui;
    public Presenter(){
        user = new User("123","123");
        gui = new GUI(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command){
            case "INGRESAR":
                if(Objects.equals(gui.getUser(), user.getUser()) && Objects.equals(gui.getPassword(), user.getPassword())){
                   gui.changeMainPanel("mainMenu");
                }
                System.out.println("cambiando panel...");
                break;
            case "GESTIONAR_PRODUCTOS":
                gui.changeMainPanel("addProductPanel");
                    break;
            case "EXIT":
                JOptionPane JOptionPane = null;
                int opcion = JOptionPane.showConfirmDialog(null, "¿Deseas cerrar la aplicación?", "Confirmar cierre", JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
                
                break;
            case "BUSCAR_PRODUCTO":
                gui.changeMainPanel("searchProcut");
                break;

            case "AGREGAR_PRODUCTOS":
                gui.changeMainPanel("addProduct");
                break;

        }
    }
}
