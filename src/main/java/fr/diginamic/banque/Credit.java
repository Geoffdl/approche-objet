package fr.diginamic.banque;

public class Credit extends Operation{
    public Credit(String date, double amount) {
        super(date, amount);
    }

    @Override
    public String getType() {
        return "Credit";
    }

    @Override
    public double calcBalance(double currentBalance) {
        return currentBalance + getAmount();
    }
}