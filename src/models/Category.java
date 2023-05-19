package models;

public enum Category {
    SALARY("Salary"),
    RECEIPTS("Receipts"),
    RENT("Rent"),
    NEWS("News"),
    INPUTS("Inputs"),
    INVESTMENT("Investment");
    
    private String categoryName;
    
    private Category(String categoryName) {
        this.categoryName = categoryName;
    }
    
    public String getCategoryName() {
        return categoryName;
    }
}

