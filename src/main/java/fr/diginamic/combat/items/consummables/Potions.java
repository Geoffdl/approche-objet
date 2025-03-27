package fr.diginamic.combat.items.consummables;

import fr.diginamic.combat.items.Items;

public class Potions extends Items implements Consummables
{
    int effect;
    int duration;

    public Potions(String type, String name, int effect, int duration)
    {
        super(type, name);
        this.effect = effect;
        this.duration = duration;
    }

    /**
     *
     */
    @Override
    public void consume()
    {

    }
}