package fr.diginamic.combat.logic;

import fr.diginamic.combat.characters.player.Player;
import fr.diginamic.combat.items.RewardType;
import fr.diginamic.combat.items.consummables.HealingPotion;
import fr.diginamic.combat.items.consummables.MajorAttackPotion;
import fr.diginamic.combat.items.consummables.MinorAttackPotion;

public class Reward
{
    private RewardType type;

    public Reward(RewardType type)
    {
        this.type = type;
    }

    public void apply(Player player)
    {
        switch (type)
        {
            case HEALING_POTION -> player.getInventory().addPotion(new HealingPotion());
            case MINOR_ATTACK_POTION -> player.getInventory().addPotion(new MinorAttackPotion());
            case MAJOR_ATTACK_POTION -> player.getInventory().addPotion(new MajorAttackPotion());
            case SCORE_POINTS -> player.setPlayerScore(player.getPlayerScore() + 5);
        }

        System.out.println("You received: " + getRewardDescription());
    }

    private String getRewardDescription()
    {
        return switch (type)
        {
            case HEALING_POTION -> "a Healing Potion";
            case MINOR_ATTACK_POTION -> "a Minor Attack Potion";
            case MAJOR_ATTACK_POTION -> "a Major Attack Potion";
            case SCORE_POINTS -> "5 Score Points";
        };
    }
}