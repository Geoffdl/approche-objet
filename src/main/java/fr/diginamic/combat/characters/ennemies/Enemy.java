package fr.diginamic.combat.characters.ennemies;

import fr.diginamic.combat.characters.Characters;


public class Enemy extends Characters
{

    MonsterType type;

    public Enemy(MonsterType type, int hp, int strength, int score)
    {
        super(hp, strength, score);

        this.type = type;

    }


    public String displayMonsterData()
    {
        return this.type + " " + this.hp + " " + this.strength;
    }

    public void renderMonster()
    {
        //todo monster art
    }


    public MonsterType getType()
    {
        return type;
    }

    public void setType(MonsterType type)
    {
        this.type = type;
    }

    public void setScore(int score)
    {
        this.score = score;
    }

    public int getMonsterHp()
    {
        return this.hp;
    }

    public int getMonsterStrength()
    {
        return this.strength;
    }

    public void setMonsterHp(int hp)
    {
        this.hp = hp;
    }

    public int getMonsterScore()
    {
        return this.score;
    }

    public void setMonsterScore(int score)
    {
        this.score = score;
    }
}