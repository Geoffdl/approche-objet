package fr.diginamic.combat.characters.player;

import fr.diginamic.combat.characters.Characters;

public class Player extends Characters
{
    private String name;


    public Player(String name, int hp, int strength)
    {
        super(hp, strength);
    }
}