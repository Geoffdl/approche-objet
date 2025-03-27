package fr.diginamic.combat.items;

import fr.diginamic.combat.characters.player.Player;
import fr.diginamic.combat.items.consummables.Consumables;
import fr.diginamic.combat.items.consummables.HealingPotion;
import fr.diginamic.combat.items.consummables.MajorAttackPotion;
import fr.diginamic.combat.items.consummables.MinorAttackPotion;

import java.util.ArrayList;
import java.util.List;

public class Inventory
{
    private List<Consumables> potions;

    public Inventory()
    {
        this.potions = new ArrayList<>();
        // Add starting potions
        potions.add(new HealingPotion());
        potions.add(new MinorAttackPotion());
        potions.add(new MajorAttackPotion());
    }

    public void addPotion(Consumables potion)
    {
        potions.add(potion);
    }

    public void usePotion(int index, Player player)
    {
        if (index >= 0 && index < potions.size())
        {
            Consumables potion = potions.get(index);
            potion.consume(player);
            potions.remove(index);
        }
    }

    public void displayPotions()
    {
        System.out.println("\n=== INVENTORY ===");
        if (potions.isEmpty())
        {
            System.out.println("No potions available!");
            return;
        }

        for (int i = 0; i < potions.size(); i++)
        {
            Consumables potion = potions.get(i);
            System.out.printf("%d. %s%n", i + 1, potion.getEffectDescription());
        }
    }
}