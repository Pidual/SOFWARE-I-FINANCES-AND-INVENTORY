package presenter;

import models.Restaurant;
import views.Views;

public class Presenter {

    Restaurant guaranii; //Clase principal del modelo
    Views view; //La vista jua jua jua
    public Presenter() {
        guaranii = new Restaurant();
        mainThread();
    }

    private void mainThread(){
        guaranii.login(view.getInput("Escriba el user"), view.getInput("Escriba la clave: "));

    }
}
