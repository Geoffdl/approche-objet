package fr.diginamic.lists;

public class Ville implements Comparable<Ville> {
    public String name;
    public int inhabitants;
    public int departmentCode;
    public String regionName;


    public Ville(String name, int inhabitants) {
        this.name = name;
        this.inhabitants = inhabitants;
    }

    public Ville(String name, int departmentCode, String regionName, int inhabitants) {
        this.name = name;
        this.departmentCode = departmentCode;
        this.regionName = regionName;
        this.inhabitants = inhabitants;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInhabitants() {
        return inhabitants;
    }

    public void setInhabitants(int inhabitants) {
        this.inhabitants = inhabitants;
    }

    @Override
    public String toString() {
        if (regionName == null || departmentCode == 0) {
            // Simple version for constructor with just name and inhabitants
            return String.format("%s : %d habitants", name, inhabitants);
        } else {
            // Detailed version for constructor with all fields
            return String.format("%s (département %d, région %s) : %d habitants",
                    name, departmentCode, regionName, inhabitants);
        }
    }

    /*
    @Override
    public int compareTo(Ville o) {
        return this.name.compareTo(o.name);
    }

     */

    @Override
    public int compareTo(Ville o) {
        return Integer.compare(this.inhabitants, o.inhabitants);
    }
}