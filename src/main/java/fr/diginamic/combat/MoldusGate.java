package fr.diginamic.combat;

import fr.diginamic.combat.characters.ennemies.Enemy;
import fr.diginamic.combat.characters.player.Player;
import fr.diginamic.combat.utils.Combat;
import fr.diginamic.combat.utils.EnemyFactory;
import fr.diginamic.combat.utils.PlayerPrompt;
import fr.diginamic.combat.utils.RandomGenerator;

public class MoldusGate
{
    private static Player player;    // Make them class fields
    private static Enemy monster;

    public static void main(String[] args)
    {
        setupGame();
        runGame();

    }

    public static void setupGame()
    {

        player = new Player(PlayerPrompt.askName(), RandomGenerator.between(20, 50), RandomGenerator.between(12, 18), 0);
        monster = EnemyFactory.createRandomEnemy();


        System.out.println(player.getName());
        System.out.println(monster.displayMonsterData());
    }

    public static void runGame()
    {
        Combat.enterCombat(player, monster);

        while (Combat.enterCombat(player, monster))
        {

            monster = EnemyFactory.createRandomEnemy();
            Combat.enterCombat(player, monster);

            if (player.getPlayerHp() <= 0 || PlayerPrompt.askNumber() == 3)
            {
                endGame();
            }

        }


    }

    public static void endGame()
    {
        System.out.println("gj here are your stats");
    }
}