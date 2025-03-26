package fr.diginamic.banque;

public abstract class Operation {
    private String date;
    private double amount;

    public Operation(String date, double amount) {
        this.date = date;
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public abstract String getType();

    public abstract double calcBalance(double amount);

    @Override
    public String toString() {
        return "Operation{" +
                "date='" + date + '\'' +
                ", amount=" + amount +
                '}';
    }
}