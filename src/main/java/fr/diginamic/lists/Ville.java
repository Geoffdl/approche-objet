package fr.diginamic.lists;

import fr.diginamic.testenumeration.Continent;

public class Ville implements Comparable<Ville>
{
    public String name;
    public int inhabitants;
    public int departmentCode;
    public String regionName;
    public Continent continent;

    public Ville(String name, int inhabitants)
    {
        this.name = name;
        this.inhabitants = inhabitants;
    }

    public Ville(String name, int departmentCode, String regionName, int inhabitants)
    {
        this.name = name;
        this.departmentCode = departmentCode;
        this.regionName = regionName;
        this.inhabitants = inhabitants;
    }

    public Ville(String name, int inhabitants, Continent continent)
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

    public int getInhabitants()
    {
        return inhabitants;
    }

    public void setInhabitants(int inhabitants)
    {
        this.inhabitants = inhabitants;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Ville{");
        sb.append("name='").append(name).append('\'');
        sb.append(", inhabitants=").append(inhabitants);
        sb.append(", departmentCode=").append(departmentCode);
        sb.append(", regionName='").append(regionName).append('\'');
        sb.append(", continent=").append(continent);
        sb.append('}');
        return sb.toString();
    }

    /*
    @Override
    public int compareTo(Ville o) {
        return this.name.compareTo(o.name);
    }

     */

    @Override
    public int compareTo(Ville o)
    {
        return Integer.compare(this.inhabitants, o.inhabitants);
    }

    public Continent getContinent()
    {
        return continent;
    }

    public void setContinent(Continent continent)
    {
        this.continent = continent;
    }

    public String getRegionName()
    {
        return regionName;
    }

    public void setRegionName(String regionName)
    {
        this.regionName = regionName;
    }

    public int getDepartmentCode()
    {
        return departmentCode;
    }

    public void setDepartmentCode(int departmentCode)
    {
        this.departmentCode = departmentCode;
    }
}