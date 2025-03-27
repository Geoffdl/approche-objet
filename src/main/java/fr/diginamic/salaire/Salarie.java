package fr.diginamic.salaire;

public class Salarie extends Intervenant
{
    double monthlyIncome;

    public Salarie(String name, String lastName, double monthlyIncome)
    {
        super(name, lastName);
        this.monthlyIncome = monthlyIncome;
    }

    /**
     * @return salary
     */
    @Override
    public double getSalary()
    {
        return this.monthlyIncome;
    }

    /**
     * @return status
     */
    @Override
    public String getStatus()
    {
        return Salarie.class.getSimpleName();
    }

    @Override
    public String toString()
    {
        return "Salarie{" +
                "monthlyIncome=" + monthlyIncome +
                "} " + super.toString();
    }
}