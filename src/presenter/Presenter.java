package presenter;

import models.User;
import views.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Presenter implements ActionListener{

    private User user;
    private GUI gui;
    public Presenter(){
        user = new User("carlos","123");
        gui = new GUI(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command){
            case "INGRESAR":
                if(Objects.equals(gui.getUser(), user.getName()) && Objects.equals(gui.getPassword(), user.getPassword())){
                   gui.changePanel("mainMenu");
                }
                break;

        }
    }
}

