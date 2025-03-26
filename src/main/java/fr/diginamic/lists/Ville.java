package fr.diginamic.lists;

public class Ville {
    public String name;
    public int inhabitants;

    public Ville(String name, int inhabitants) {
        this.name = name;
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
        return "Ville{" +
                "name='" + name + '\'' +
                ", inhabitants=" + inhabitants +
                '}'+"\n";
    }
}