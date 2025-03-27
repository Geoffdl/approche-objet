package fr.diginamic.combat.utils;

import fr.diginamic.combat.characters.ennemies.Enemy;
import fr.diginamic.combat.characters.player.Player;

public class Combat
{

    public Combat()
    {
    }

    public static void turnOutcome(Player player, Enemy enemy)
    {
        int playerAtkRoll = player.getPlayerStrength() + RandomGenerator.attackRoll();
        int enemyAtkRoll = enemy.getMonsterStrength() + RandomGenerator.attackRoll();

        int enemyHp = enemy.getMonsterHp();
        int playerHp = player.getPlayerHp();


        if (playerAtkRoll > enemyAtkRoll) // players wins, monster hp decreases
        {
            System.out.println("\nYou have the initiative for this turn and hit the " + enemy.getType().toString().toLowerCase() + " for " + (playerAtkRoll - enemyAtkRoll) + "!");
            enemyHp = enemyHp - (playerAtkRoll - enemyAtkRoll);
            enemy.setMonsterHp(enemyHp);
        } else // players loses roll, player hp decreases
        {
            System.out.println("\nYou lost the initiative for this turn and got hit for " + (playerAtkRoll - enemyAtkRoll) + "...");
            playerHp = playerHp - (enemyAtkRoll - playerAtkRoll);
            player.setPlayerHp(playerHp);
        }
    }

    public static boolean enterCombat(Player player, Enemy enemy)
    {

        boolean hasWon = true;
        int monsterHp = enemy.getMonsterHp();
        int playerHp = player.getPlayerHp();

        System.out.println("\nYou encounter a wild " + enemy.getType().toString().toLowerCase());


        while (playerHp > 0 && monsterHp > 0)
        {
            if (playerHp <= 0)
            {
                hasWon = false;
                break;
            }
            turnOutcome(player, enemy);
            monsterHp = enemy.getMonsterHp();
            playerHp = player.getPlayerHp();

            System.out.println("\nYour current hp is " + playerHp + " and the " + enemy.getType().toString().toLowerCase() + "'s current hp is " + monsterHp);
            System.out.println("Start next turn ?");
            PlayerPrompt.askNumber();
        }

        if (hasWon)
        {
            player.setPlayerScore(enemy.getMonsterScore());
            System.out.println("\nThe " + enemy.getType().toString().toLowerCase() + " has been brutally slaughtered, good job! You earned " + enemy.getMonsterScore() + " points.");
        }


        return hasWon;
    }
}