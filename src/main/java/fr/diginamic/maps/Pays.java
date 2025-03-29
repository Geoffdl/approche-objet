package fr.diginamic.maps;

public class Pays
{
    private String name;
    private double inhabitants;
    private String continent;

    public Pays(String name, double inhabitants, String continent)
    {
        this.name = name;
        this.inhabitants = inhabitants;
        this.continent = continent;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getInhabitants()
    {
        return inhabitants;
    }

    public void setInhabitants(int inhabitants)
    {
        this.inhabitants = inhabitants;
    }

    public String getContinent()
    {
        return continent;
    }

    public void setContinent(String continent)
    {
        this.continent = continent;
    }
}