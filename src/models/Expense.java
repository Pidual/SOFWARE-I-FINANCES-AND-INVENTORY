package models;

public class Expense {
    private Category type;
    private String description;
    private Long value;
    
    public Category getType() {
        return type;
    }
    
    public void setType(Category type) {
        this.type = type;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public Long getValue() {
        return value;
    }
    
    public void setValue(Long value) {
        this.value = value;
    }
}

