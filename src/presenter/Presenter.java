package presenter;

import models.Ingredient;
import models.ProductOrder;
import models.Restaurant;
import views.MainFrame;
import views.NewMainFrame;

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
            case "LOGIN":
                if (restaurant.login(gui.getUsername(),gui.getPassword())){ //John Doe password
                    gui.login();
                }else{
                    gui.showJOptionPaneError("Contraseña/Usuario incorrecto");
                }
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
                String productName = gui.getSearchedProduct();
                if(Objects.equals(productName, "")){
                    gui.showJOptionPaneError("El nombre esta vacio!");
                    return;
                }
                ArrayList<ProductOrder> productOrders = restaurant.getProductOrdersByKeyword(gui.getSearchedProduct());
                gui.setSearchProductTable(productOrders);
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
                String idString = gui.getIntegerJOptionPane("Ingrese el ID del producto(Solo numeros):");
                if(idString.isBlank() ){
                    gui.showJOptionPaneError("El ID esta vacio");
                    return;
                } else if (!idString.matches("[0-9]+")) {
                    gui.showJOptionPaneError("El ID ingresado contiene un caracter no numerico");
                    return;
                }
                String quantityString = gui.getIntegerJOptionPane("Ingrese la cantidad a sumar a la cantidad de producto\n(para restar una cantidad use numeros negativos)");
                if(quantityString.isBlank() ){
                    gui.showJOptionPaneError("El ID esta vacio");
                    return;
                } else if (!quantityString.matches("-?[0-9]+")) {
                    gui.showJOptionPaneError("Ingreso un caracter no numerico!");
                    return;
                }
                restaurant.addQuantityProduct(Integer.parseInt(idString),Integer.parseInt(quantityString));
                gui.showJOptionPaneSuccess("Cantidad de producto modificada con exito");
                break;

            case "ELIMINAR_PRODUCTO":
                String deletionID = gui.getIntegerJOptionPane("Ingrese el ID del producto a eleminar");
                if(deletionID.isBlank() ){
                    gui.showJOptionPaneError("El ID esta vacio");
                    return;
                } else if (!deletionID.matches("[0-9]+")) {
                    gui.showJOptionPaneError("El ID ingresado contiene un caracter no numerico");
                    return;
                }
                if(gui.confirmDialog()){
                    restaurant.deleteProduct(Integer.parseInt(deletionID));
                    gui.showJOptionPaneSuccess("Se elimino el producto con exito");
                }else{
                    gui.showJOptionPaneError("No se elimino el producto");
                }
                break;

            case "BUSCAR_INGREDIENTE":
                String searchedIngredient = gui.getSearchedIngridient();
                if(Objects.equals(searchedIngredient, "")){
                    gui.showJOptionPaneError("El nombre esta vacio!");
                    return;
                }
                ArrayList<Ingredient> ingredients = restaurant.searchIngredientsByName(searchedIngredient);
                gui.setSearchIngridientTable(ingredients);
                break;

            case "MODIFICAR_INGREDIENTE":
                String ingredientID = gui.getIntegerJOptionPane("Ingrese el ID del ingrediente(Solo numeros):");
                if(ingredientID.isBlank() ){
                    gui.showJOptionPaneError("El ID esta vacio");
                    return;
                } else if (!ingredientID.matches("[0-9]+")) {
                    gui.showJOptionPaneError("El ID ingresado contiene un caracter no numerico");
                    return;
                }
                String ingredientValue = gui.getIntegerJOptionPane("Ingrese la cantidad a sumar a la cantidad de ingrediente\n(para restar una cantidad use numeros negativos)");
                if(ingredientValue.isBlank() ){
                    gui.showJOptionPaneError("El ID esta vacio");
                    return;
                } else if (!ingredientValue.matches("-?[0-9]+")) {
                    gui.showJOptionPaneError("Ingreso un caracter no numerico!");
                    return;
                }
                restaurant.addQuantityIngredients(Integer.parseInt(ingredientID),Integer.parseInt(ingredientValue));
                gui.showJOptionPaneSuccess("Cantidad de ingrediente modificada con exito");
                break;

            case "MOSTRAR_INVENTARIO":
                gui.showinventory();
                gui.updateInventoryTables(restaurant.getInventoryProducts(),restaurant.getInventoryIngredients());
                break;

            case "ELIMINAR_INGREDIENTE":
                String ingredientDeletionID = gui.getIntegerJOptionPane("Ingrese el ID del ingrediente a eleminar");
                if(ingredientDeletionID.isBlank() ){
                    gui.showJOptionPaneError("El ID esta vacio");
                    return;
                } else if (!ingredientDeletionID.matches("[0-9]+")) {
                    gui.showJOptionPaneError("El ID ingresado contiene un caracter no numerico");
                    return;
                }
                if(gui.confirmDialog()){
                    restaurant.deleteIngredientById(Integer.parseInt(ingredientDeletionID));
                    gui.showJOptionPaneSuccess("Se elimino el ingrediente con exito");
                }else{
                    gui.showJOptionPaneError("No se elimino el ingrediente");
                }
                break;


        }
    }
}
