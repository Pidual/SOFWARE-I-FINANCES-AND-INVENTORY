package models;

import java.util.Date;

public class Expense {
    private Category type;
    private String description;
    private Long value;
    private Date date;

	public Expense(Category type, String description, Long value) {
		super();
		this.type = type;
		this.description = description;
		this.value = value;
		this.date = new Date();
	}



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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
    
    
}

