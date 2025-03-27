package fr.diginamic.combat.characters.player;

import fr.diginamic.combat.characters.Characters;

public class Player extends Characters
{
    private String name;


    public Player(String name, int hp, int strength, int score)
    {
        super(hp, strength, score);
        this.name = name;

    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getPlayerStrength()
    {
        return this.strength;
    }

    public int getPlayerHp()
    {
        return this.hp;
    }

    public void setPlayerHp(int hp)
    {
        this.hp = hp;
    }

    public int getPlayerScore()
    {
        return this.score;
    }

    public void setPlayerScore(int score)
    {
        this.score = score;
    }

    public String displayPlayerData()
    {
        return this.name + " " + this.hp + " " + this.strength + " " + this.score;
    }

}