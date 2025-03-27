package fr.diginamic.combat.characters;

public abstract class Characters
{
    public int hp;
    public int strength;
    public int score;

    public Characters(int hp, int strength, int score)
    {
        this.hp = hp;
        this.strength = strength;
        this.score = score;
    }

}