package fr.diginamic.combat.logic;

import fr.diginamic.combat.characters.ennemies.Enemy;
import fr.diginamic.combat.characters.player.Player;
import fr.diginamic.combat.utils.*;

public class GameState
{
    private Player player;
    private Enemy currentMonster;
    private boolean isRunning;

    public GameState(Player player)
    {
        this.player = player;
        this.isRunning = true;
    }

    public void start()
    {
        while (isRunning)
        {
            // Show menu between battles
            Menu.idleMenu(player);

            // Start new combat
            startNewCombat();

            // Check if player died
            if (player.getPlayerHp() <= 0)
            {
                playerDied();
                break;
            }
            // Check if player wants to continue
            if (!checkContinue())
            {
                break;
            }
        }
        endGame();
    }

    private void startNewCombat()
    {
        player.displayPlayerData();
        currentMonster = EnemyFactory.createRandomEnemy();
        boolean wonCombat = Combat.enterCombat(player, currentMonster);

        if (wonCombat && RandomGenerator.hasReward())
        {
            giveReward();
        }
        if (wonCombat)
        {
            player.updateBonusDuration();
        }
    }

    private void playerDied()
    {
        System.out.println("You have died!");
        isRunning = false;
    }

    private boolean checkContinue()
    {
        System.out.println("Continue playing? (1: Yes, 2: No)");
        return PlayerPrompt.askNumber() == 1;
    }

    private void giveReward()
    {
        Reward reward = RandomGenerator.selectReward();
        reward.apply(player);
    }

    private void endGame()
    {
        System.out.println("\n=== GAME OVER ===");
        System.out.println("Final Score: " + player.getPlayerScore());

    }
}