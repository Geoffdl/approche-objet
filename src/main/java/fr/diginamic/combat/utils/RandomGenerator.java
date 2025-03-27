package fr.diginamic.combat.utils;

import fr.diginamic.combat.items.RewardType;
import fr.diginamic.combat.logic.Reward;

import java.util.Random;

public class RandomGenerator
{
    private static final Random random = new Random();

    public static int between(int minVal, int maxVal)
    {
        return random.nextInt(maxVal - minVal + 1) + minVal;
    }

    public static int attackRoll()
    {
        return between(1, 10);
    }

    public static int potionHeal()
    {
        return between(5, 10);
    }

    /**
     * @return Boolean
     */
    public static boolean hasReward() {return random.nextBoolean();}

    /**
     * Generates a reward
     *
     * @return element from enum RewardType
     */
    public static Reward selectReward()
    {
        int randomIndex = between(0, RewardType.values().length - 1);
        RewardType type = RewardType.values()[randomIndex];
        return new Reward(type);
    }
}