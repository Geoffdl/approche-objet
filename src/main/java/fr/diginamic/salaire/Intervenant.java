package fr.diginamic.salaire;

public abstract class Intervenant
{
    private String name;
    private String lastName;

    public Intervenant(String name, String lastName)
    {
        this.name = name;
        this.lastName = lastName;
    }


    public abstract double getSalary();

    public abstract String getStatus();

    public String afficherDonnees()
    {

        return "The employee "
                + this.name
                + ", "
                + this.lastName
                + " has earned this month "
                + this.getSalary()
                + "\u200E. This employee is hired as a : "
                + this.getStatus()
                ;
    }

    @Override
    public String toString()
    {
        return "Intervenant{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}