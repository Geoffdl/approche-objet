package fr.diginamic.combat.utils;

import fr.diginamic.combat.characters.ennemies.Enemy;
import fr.diginamic.combat.characters.ennemies.MonsterType;

import static fr.diginamic.combat.utils.RandomGenerator.between;

public class EnemyFactory
{
    public static Enemy createEnemy(MonsterType type)
    {
        return switch (type)
        {
            case GOBLIN -> new Enemy(type, between(10, 15), between(5, 10), 2);
            case WOLF -> new Enemy(type, between(5, 10), between(3, 8), 1);
            case TROLL -> new Enemy(type, between(20, 30), between(10, 15), 5);
        };
    }

    public static Enemy createRandomEnemy()
    {
        return createEnemy(MonsterType.values()[between(0, MonsterType.values().length - 1)]);
    }
}