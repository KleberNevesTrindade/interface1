package model.entities;

public class Invoice {
    
    private Double basePayemnt;
    private Double tax;

    public Invoice() {
    }

    public Invoice(Double basePayemnt, Double tax) {
        this.basePayemnt = basePayemnt;
        this.tax = tax;
    }

    public Double getBasePayemnt() {
        return basePayemnt;
    }

    public void setBasePayemnt(Double basePayemnt) {
        this.basePayemnt = basePayemnt;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double gettotalPayment() {
        return getBasePayemnt() + getTax();
    }
        
}
