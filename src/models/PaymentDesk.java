package models;

import java.sql.Date;
import java.util.ArrayList;

public class PaymentDesk {

    private Order order;
    private ArrayList<Product> cookedProducts;
    private inventory<Product> packagedInventory;
    private inventory<Product> ingredientInventory;

    public void createOrder(){//TODO

    }

    public void addProductOrder(int id, int type){//TODO

    }

    public void substracProductOrder(int id){//TODO

    }

    public Order payOrder(){
        return new Order(11,new Date(2023,7,22));
    }


}
