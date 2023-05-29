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
    
    public static TypeProduct getTypeProductFromNumber(String number) {
        for (TypeProduct typeProduct : TypeProduct.values()) {
            if (typeProduct.getCategoryName().equals(number)) {
                return typeProduct;
            }
        }
        return null; // Si el número no coincide con ningún tipo de producto
    }
}

