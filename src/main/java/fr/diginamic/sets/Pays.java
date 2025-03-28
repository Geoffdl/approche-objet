package fr.diginamic.sets;

public class Pays
{
    private String name;
    private int population;
    private double gdp;

    public Pays(String nom, int population, double gdp)
    {
        this.name = nom;
        this.population = population;
        this.gdp = gdp;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getPopulation()
    {
        return population;
    }

    public void setPopulation(int population)
    {
        this.population = population;
    }

    public double getGdp()
    {
        return gdp;
    }

    public void setGdp(double gdp)
    {
        this.gdp = gdp;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Pays{");
        sb.append("name='").append(name).append('\'');
        sb.append(", population=").append(population);
        sb.append(", gdp=").append(gdp);
        sb.append('}');
        return sb.toString();
    }
}