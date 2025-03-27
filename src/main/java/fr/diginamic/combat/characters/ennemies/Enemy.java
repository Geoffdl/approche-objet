package fr.diginamic.combat.characters.ennemies;

import fr.diginamic.combat.characters.Characters;


public abstract class Enemy extends Characters
{
    private int score;

    public enum ENEMY_TYPE
    {
        Goblin, Troll, Wolf
    }

    public Enemy(int hp, int strength, int score)
    {
        super(hp, strength);
        this.score = score;
    }
}