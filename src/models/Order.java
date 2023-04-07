package models;

import java.sql.Date;
import java.util.ArrayList;

public class Order {

    public int id;
    public Date date;
    public ArrayList<ProductOrder> products;

    public Order(int id, Date date) {
        this.id = id;
        this.date = date;
    }

    public Long calculateValue(){
        return 36000L;
    }


}
