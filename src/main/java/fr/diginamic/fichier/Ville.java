package fr.diginamic.fichier;

public class Ville
{
    private String name;
    private String dptCode;
    private String regionName;
    private int population;

    public Ville(String name, String dptCode, String regionName, int population)
    {
        this.name = name;
        this.dptCode = dptCode;
        this.regionName = regionName;
        this.population = population;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDptCode()
    {
        return dptCode;
    }

    public void setDptCode(String dptCode)
    {
        this.dptCode = dptCode;
    }

    public String getRegionName()
    {
        return regionName;
    }

    public void setRegionName(String regionName)
    {
        this.regionName = regionName;
    }

    public int getPopulation()
    {
        return population;
    }

    public void setPopulation(int population)
    {
        this.population = population;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Ville{");
        sb.append("name='").append(name).append('\'');
        sb.append(", dptCode='").append(dptCode).append('\'');
        sb.append(", regionName='").append(regionName).append('\'');
        sb.append(", population=").append(population);
        sb.append('}');
        return sb.toString();
    }
}