package fr.diginamic.banque;

public class Debit extends Operation {

    public Debit(String date, double amount) {
        super(date, amount);
    }

    @Override
    public String getType() {

        return "Debit";
    }

    @Override
    public double calcBalance(double currentBalance) {
        return currentBalance - getAmount();
    }


}