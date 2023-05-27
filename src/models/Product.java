package models;

import java.util.ArrayList;

public class Product {
    private int id;
    private String name;
    private double value;
    private ArrayList<Ingredient> ingredients;


	public Product(int id, String name, double value) {
		super();
		this.id = id;
		this.name = name;
		this.value = value;
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

    public double getValue() {
        return value;
    }

    public void setIngredients(Ingredient ingredient) {
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





	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", value=" + value + ", ingredients=" + ingredients.toString() + "]";
	}
    
    
}
