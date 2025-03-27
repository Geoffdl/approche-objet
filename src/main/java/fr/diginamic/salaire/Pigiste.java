package fr.diginamic.salaire;

public class Pigiste extends Intervenant
{
    int daysWorkedThisMonth;
    double dailyPay;

    public Pigiste(String name, String lastName, int daysWorkedThisMonth, double dailyPay)
    {
        super(name, lastName);
        this.daysWorkedThisMonth = daysWorkedThisMonth;
        this.dailyPay = dailyPay;
    }

    /**
     * @return salary
     */
    @Override
    public double getSalary()
    {
        return this.daysWorkedThisMonth * this.dailyPay;
    }

    /**
     * @return Status
     */
    @Override
    public String getStatus()
    {
        return Pigiste.class.getSimpleName();
    }

    @Override
    public String toString()
    {
        return "Pigiste{" +
                "daysWorkedThisMonth=" + daysWorkedThisMonth +
                ", dailyPay=" + dailyPay +
                "} " + super.toString();
    }
}