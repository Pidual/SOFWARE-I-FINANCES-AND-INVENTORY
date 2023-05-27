package models;

public enum Category {
    SALARY("1"),
    RECEIPTS("2"),
    RENT("3"),
    NEWS("4"),
    INPUTS("5"),
    INVESTMENT("6");
    
    private String categoryName;
    
    private Category(String categoryName) {
        this.categoryName = categoryName;
    }
    
    public String getCategoryName() {
        return categoryName;
    }
}

