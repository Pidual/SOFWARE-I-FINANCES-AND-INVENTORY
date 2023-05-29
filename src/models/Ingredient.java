package models;

public class Ingredient {
    private int id;
    private String name;
    private float quantity;

    public Ingredient(int id, String name, float quantity) {
    	this.id = id;
        this.name = name;
        this.quantity = quantity;
    }
    
    public Ingredient(String name, int quantity) {
		super();
		this.name = name;
		this.quantity = quantity;
	}



	public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Ingredient [id=" + id + ", name=" + name + ", quantity=" + quantity + "]";
	}
    
    
}
