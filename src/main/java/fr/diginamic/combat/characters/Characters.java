package fr.diginamic.combat.characters;

public abstract class Characters
{
    private int hp;
    private int strength;

    public Characters(int hp, int strength)
    {
        this.hp = hp;
        this.strength = strength;
    }
}