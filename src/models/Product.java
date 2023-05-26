package models;

import java.util.ArrayList;

public class Product {
    private int id;
    private String name;
    private Long value;
    private ArrayList<Ingredient> ingredients;

    public Product(int id2, int type) {
		// TODO Auto-generated constructor stub
	}
    
    

	public String getName() {
        return name;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public Long getValue() {
        return value;
    }

    public void setIngredients(int id, int quantity) {
        Ingredient ingredient = new Ingredient(id, quantity);
        ingredients.add(ingredient);
    }

    public void deleteIngredients(int id) {
        for (Ingredient ingredient : ingredients) {
            if (ingredient.getId() == id) {
                ingredients.remove(ingredient);
                break;
            }
        }
    }

    public void alterIngredients(int id, int quantity) {
        for (Ingredient ingredient : ingredients) {
            if (ingredient.getId() == id) {
                ingredient.setQuantity(quantity);
                break;
            }
        }
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setIngredients(ArrayList<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}
    
    
}
