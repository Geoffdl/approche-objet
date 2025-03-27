package fr.diginamic.combat.items.consummables;

import fr.diginamic.combat.characters.player.Player;
import fr.diginamic.combat.items.Items;
import fr.diginamic.combat.utils.RandomGenerator;

public class HealingPotion extends Items implements Consumables
{
    public HealingPotion()
    {

    }

    private static final int MIN_HEAL = 5;
    private static final int MAX_HEAL = 10;

    /**
     * @param player
     */
    @Override
    public void consume(Player player)
    {
        int healAmount = RandomGenerator.between(MIN_HEAL, MAX_HEAL);
        player.setPlayerHp(player.getPlayerHp() + healAmount);
        System.out.println("Healed for " + healAmount + " HP!");
    }

    /**
     * @return item description
     */
    @Override
    public String getEffectDescription()
    {
        return "Healing Potion (+" + MIN_HEAL + " to " + MAX_HEAL + " HP)";
    }
}