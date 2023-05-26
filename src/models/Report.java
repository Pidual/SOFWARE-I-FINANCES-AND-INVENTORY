package models;

import java.util.Date;

public class Report {
    private Date dateInit;
    private Date dateEnd;
    private Long expenses;
    private Long profit;

    public Report(Date dateInit, Date dateEnd, Long expenses, Long profit) {
        this.dateInit = dateInit;
        this.dateEnd = dateEnd;
        this.expenses = expenses;
        this.profit = profit;
    }
    
    

    public Report(Date dateInit, Date dateEnd) {
		super();
		this.dateInit = dateInit;
		this.dateEnd = dateEnd;
	}



	public float calculateDifference() {
        return profit - expenses;
    }

    public boolean qualifyDifference() {
        return calculateDifference() > 0;
    }

    public Date getDateInit() {
        return dateInit;
    }

    public void setDateInit(Date dateInit) {
        this.dateInit = dateInit;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public Long getExpenses() {
        return expenses;
    }

    public void setExpenses(Long expenses) {
        this.expenses = expenses;
    }

    public Long getProfit() {
        return profit;
    }

    public void setProfit(Long profit) {
        this.profit = profit;
    }
}
