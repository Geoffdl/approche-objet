package fr.diginamic.encapsulation.operation;

public class Credit extends Operation{
    public Credit(String date, double amount) {
        super(date, amount);
    }

    @Override
    public String getType() {
        return "Credit";
    }
}