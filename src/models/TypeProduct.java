package models;

public enum TypeProduct {
    ENVASADO("1"),
    COCINADO("2");
    
    private String typeProductName;
    
    private TypeProduct(String typeProductName) {
        this.typeProductName = typeProductName;
    }
    
    public String getCategoryName() {
        return typeProductName;
    }
}

