package models;

import java.util.ArrayList;

public class Inventory<T> {
    private ArrayList<T> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    public void setItems(ArrayList<T> items) {
        this.items = items;
    }

    public ArrayList<T> getItems() {
        return items;
    }

    public void createItem(int id, String name, int quantity) {
        // Crear un nuevo objeto del tipo T con los parámetros proporcionados
        // y añadirlo a la lista items
        // Suponiendo que T tenga un constructor que acepte los parámetros id, name y quantity
        T newItem = createNewItem(id, name, quantity);
        items.add(newItem);
    }

    public void addQuantity(int id, int quantity) {
        // Buscar el objeto del tipo T en la lista items con el id proporcionado
        // y aumentar su cantidad en la cantidad proporcionada
        // Suponiendo que T tenga un método setQuantity(int quantity)
        for (T item : items) {
            if (getItemId(item) == id) {
                setItemQuantity(item, getItemQuantity(item) + quantity);
                break;
            }
        }
    }

    public void subtractQuantity(int id, int quantity) {
        // Buscar el objeto del tipo T en la lista items con el id proporcionado
        // y disminuir su cantidad en la cantidad proporcionada
        // Suponiendo que T tenga un método setQuantity(int quantity)
        for (T item : items) {
            if (getItemId(item) == id) {
                setItemQuantity(item, getItemQuantity(item) - quantity);
                break;
            }
        }
    }

    // Métodos abstractos que deben ser implementados en subclases de Inventory<T>
    protected T createNewItem(int id, String name, int quantity) {
        return null;
    }

    protected int getItemId(T item) {
        return -1;
    }

    protected int getItemQuantity(T item) {
        return -1;
    }

    protected void setItemQuantity(T item, int quantity) {
    }
}

