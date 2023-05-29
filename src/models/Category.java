package models;

public enum Category {
    SALARIO("1"),
    SERVICIOS_PUBLICOS("2"),
    RENTA("3"),
    NOVEDADES("4"),
    INSUMOS("5"),
    INVERSIONES("6");
    
    private String categoryName;
    
    private Category(String categoryName) {
        this.categoryName = categoryName;
    }
    
    public String getCategoryName() {
        return categoryName;
    }
}

