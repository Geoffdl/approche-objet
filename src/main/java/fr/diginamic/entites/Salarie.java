package fr.diginamic.entites;

public class Salarie
{
    private String lName;
    private String fName;
    double salary;

    public Salarie(String lName, String fName, double salary)
    {
        this.lName = lName;
        this.fName = fName;
        this.salary = salary;
    }

    public String getlName()
    {
        return lName;
    }

    public void setlName(String lName)
    {
        this.lName = lName;
    }

    public String getfName()
    {
        return fName;
    }

    public void setfName(String fName)
    {
        this.fName = fName;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    @Override
    public String toString()
    {
        return "Salarie{" +
                "lName='" + lName + '\'' +
                ", fName='" + fName + '\'' +
                ", salary=" + salary +
                '}';
    }
}