package fr.diginamic.combat.utils;

import fr.diginamic.combat.characters.ennemies.Enemy;
import fr.diginamic.combat.characters.ennemies.Goblin;
import fr.diginamic.combat.characters.ennemies.Troll;
import fr.diginamic.combat.characters.ennemies.Wolf;

import static fr.diginamic.combat.utils.RandomGenerator.between;

public class EnemyFactory
{
    public static Enemy createEnemy(Enemy.ENEMY_TYPE type)
    {
        return switch (type)
        {
            case Goblin -> new Goblin(between(10, 15),
                    between(5, 10),
                    2);
            case Wolf -> new Wolf(between(5, 10),
                    between(3, 8),
                    1);
            case Troll -> new Troll(between(20, 30),
                    between(10, 15),
                    5);
        };
    }

    public static Enemy createRandomEnemy()
    {
        return createEnemy(Enemy.ENEMY_TYPE.values()[between(0, Enemy.ENEMY_TYPE.values().length - 1)]);

    }
}