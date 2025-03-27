package fr.diginamic.combat.items.consummables;

import fr.diginamic.combat.characters.player.Player;

public interface Consumables
{
    /**
     * @consume uses the item
     */
    void consume(Player player);

    String getEffectDescription();
}