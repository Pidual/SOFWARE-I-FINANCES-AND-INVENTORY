package models;

import java.sql.Date;
import java.util.ArrayList;

public class Restaurant {

    private Order order;
    private ArrayList<Product> products;

    private ArrayList<User> user;

    private inventory<Ingredient> ingredientinventory;
    private inventory<Product> packedInventory;


    public boolean login(String user, String password){
        //TODO
        return true;
    }

    public void createOrder(){ //TODO

    }

    public void payExpense(String category, String description, Long value){//TODO

    }

    public void addProductOrder(int id, int type){//TODO

    }

    public void subtracProductOrder(int id){//TODO

    }

    public void payOrder(){//TODO

    }

    public void createIngredients(int id, String name, int quantity){//TODO

    }

    public void substracQuantityIngredients(int id, int quiantity){
        //TODO
    }

    public void addQuantityIngredients(int id, int quiantity){
        //TODO
    }

    public void totalReport(Date dateInit, Date dateEnd){

    }

    public void costReport(Date dateInit, Date dateEnd){
    //TODO
    }
}
