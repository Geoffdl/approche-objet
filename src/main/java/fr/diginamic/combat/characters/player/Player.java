package fr.diginamic.combat.characters.player;

import fr.diginamic.combat.characters.Characters;
import fr.diginamic.combat.items.Inventory;

public class Player extends Characters
{
    private String name;
    private Inventory inventory;
    private int baseStrength;
    private int attackBonus;
    private int bonusDuration;


    public Player(String name, int hp, int strength, int score)
    {
        super(hp, strength, score);
        this.name = name;
        this.inventory = new Inventory();
        this.baseStrength = strength;
        this.attackBonus = 0;
        this.bonusDuration = 0;

    }

    public void addAttackBonus(int bonus, int duration)
    {
        this.attackBonus = bonus;
        this.bonusDuration = duration;
        System.out.println("Attack increased by " + bonus + " for " + duration + " combats!");
    }

    public void updateBonusDuration()
    {
        if (bonusDuration > 0)
        {
            bonusDuration--;
            if (bonusDuration == 0)
            {
                attackBonus = 0;
                System.out.println("Attack bonus has worn off!");
            }
        }
    }

    /**
     * Getters and setters
     */

    public String displayPlayerData()
    {
        return String.format("%s | HP: %d | Base Strength: %d | Current Strength: %d | Score: %d",
                this.name,
                this.hp,
                this.baseStrength,
                this.getPlayerStrength(),
                this.score);
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
        return this.baseStrength + attackBonus;
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

    public Inventory getInventory()
    {
        return inventory;
    }


}