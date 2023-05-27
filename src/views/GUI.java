package views;

import javax.swing.*;
import java.awt.event.ActionListener;

public class GUI extends JFrame {

    private Cards cardLayout;
    public GUI(ActionListener presenterListener){
        cardLayout = new Cards(presenterListener);
        initComponents();
    }
    private void initComponents(){
        setContentPane(cardLayout); //CardLayout para ir cambiando de paneles
        setTitle("SISTEMA DE INFROMACION GUARANII"); //Titulo de la app
        setSize(900,666); //Dimensiones altura y anchura
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //Que se pare cuando se cierre
        setLocationRelativeTo(null);
        cardLayout.setPreferredSize(cardLayout.getPreferredSize());
        setVisible(true); //Hacer visible el panel
    }


    public String getUser(){
        return cardLayout.getUser();
    }

    public String getPassword(){
        return cardLayout.getPassword();
    }

    public void changeMainPanel(String panel){
        cardLayout.changePanel(panel);
    }

}
