package fr.diginamic.combat.items.consummables;

import fr.diginamic.combat.characters.player.Player;
import fr.diginamic.combat.items.Items;

public class MajorAttackPotion extends Items implements Consumables
{
    public MajorAttackPotion() {}

    private static final int ATTACK_BONUS = 5;
    private static final int DURATION = 2;

    /**
     * @param player
     */
    @Override
    public void consume(Player player)
    {
        player.addAttackBonus(ATTACK_BONUS, DURATION);
        System.out.println("Attack increased by " + ATTACK_BONUS + " for next combat!");
    }

    /**
     * @return item description
     */
    @Override
    public String getEffectDescription()
    {
        return "Major Attack Potion (+" + ATTACK_BONUS + " attack for " + DURATION + " combats)";
    }
}