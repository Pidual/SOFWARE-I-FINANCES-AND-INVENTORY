package presenter;

import models.Ingredient;
import models.Restaurant;
import views.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Objects;

public class Presenter implements ActionListener{

    private Restaurant restaurant;
    private MainFrame gui;

    private ArrayList<Ingredient> ingredientsOfAProduct = new ArrayList<Ingredient>();
    private ArrayList<Ingredient> ingridientsInventory = new ArrayList<Ingredient>();
    public Presenter(){
        restaurant = new Restaurant();
        gui = new MainFrame(this);
        ingridientsInventory = restaurant.getInventoryIngredients();
        gui.setAddProductIngredientListModel(ingridientsInventory);
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
                int typeProduct = gui.getTypeProduct();
                String nameProduct = gui.getAddProductName();
                float valueProduct = gui.getPriceForAddingProduct();
                if(valueProduct == 0 && Objects.equals(nameProduct, "")){
                    gui.showJOptionPaneError("El valor no puede ser 0!\nEl nombre esta vacio!");
                    return;
                } else if (valueProduct <= 0) {
                    gui.showJOptionPaneError("El precio no puede ser 0!");
                    return;
                }else if(Objects.equals(nameProduct, "")){
                    gui.showJOptionPaneError("El nombre esta vacio!");
                    return;
                }
                ArrayList<Ingredient> emptyIngredients = new ArrayList<Ingredient>();
                if(typeProduct == 1){
                    restaurant.createProduct(typeProduct, nameProduct, valueProduct, emptyIngredients);
                }else{
                    restaurant.createProduct(typeProduct, nameProduct, valueProduct, ingredientsOfAProduct);
                    ingredientsOfAProduct.clear();
                }
                gui.showJOptionPaneSuccess("Producto Agregado con exito!");
                break;

            case "AGREGAR_INGREDIENTE_A_PRODUCTO_EN_CREACION":
                ingredientsOfAProduct.add(ingridientsInventory.get(gui.getIndexFromIngridientList())) ;
                gui.addItemToTextFieldInAddProduct(ingridientsInventory.get(gui.getIndexFromIngridientList()).toString());
                break;

            case "AGREGAR_INGREDIENTE":
                String ingridientName = gui.getAddIngridientName();
                if(Objects.equals(ingridientName, "")){
                    gui.showJOptionPaneError("El nombre esta vacio!");
                    return;
                }
                restaurant.createIngredients(ingridientName,0);
                gui.showJOptionPaneSuccess("Producto Agregado con exito!");
                break;


            case "MODIFICAR_PRODUCTO":

                break;



        }
    }
}
