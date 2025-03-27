package fr.diginamic.combat.items;

public abstract class Items
{
    private String type;
    private String name;

    public Items(String type, String name)
    {
        this.type = type;
        this.name = name;
    }
}