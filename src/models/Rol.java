package models;

public enum Rol {
    ADMIN("admin"),
    CASHIER("cashier");
    
    private final String value;
    
    private Rol(String value) {
        this.value = value;
    }
    
    public String getValue() {
        return value;
    }
}

