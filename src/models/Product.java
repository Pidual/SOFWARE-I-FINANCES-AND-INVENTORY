package models;
import java.util.ArrayList;

public class Product {

    private int id;

    private String name;
    private Long value;
    private ArrayList<Ingredient> ingredients;

    //Aqui va el constructor pero pues depende si queremos hacerlo


    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }
    public String getName() {
        return name;
    }

    public Long getValue() {
        return value;
    }

    public void setIngredients(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public void deleteIngredients(int id, int quantity){ //TODO

    }

    public void alterIngredients(int id, int quantity){

    }
}
