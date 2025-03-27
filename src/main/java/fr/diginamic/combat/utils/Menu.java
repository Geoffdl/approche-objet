package fr.diginamic.combat.utils;


import fr.diginamic.combat.characters.ennemies.Enemy;
import fr.diginamic.combat.characters.player.Player;

public class Menu
{
    public static void startMenu()
    {
        System.out.println("\n=== WELCOME TO MOLDUS GATE ===");
        System.out.println("1. Start New Game");
        System.out.println("2. Set Difficulty");
        System.out.println("3. Exit");

        switch (PlayerPrompt.askNumber())
        {
            case 1 -> setupGame();
            case 2 -> difficultyMenu();
            case 3 -> System.exit(0);
            default -> startMenu();
        }
    }

    private static void setupGame() {}

    public static void difficultyMenu()
    {
        System.out.println("\n=== SELECT DIFFICULTY ===");
        System.out.println("1. Easy (50% chance for rewards)");
        System.out.println("2. Normal (30% chance for rewards)");
        System.out.println("3. Hard (15% chance for rewards)");
        System.out.println("4. Back to Main Menu");

        int choice = PlayerPrompt.askNumber();
    }

    public static void idleMenu(Player player)
    {
        System.out.println("\n=== PREPARE FOR NEXT BATTLE ===");
        System.out.println("1. Enter Combat");
        System.out.println("2. Check Stats");
        System.out.println("3. Open Inventory");
        System.out.println("4. Quit Game");

        switch (PlayerPrompt.askNumber())
        {
            case 1 ->
            {
                return;
            }  // Proceed to combat
            case 2 -> statusMenu(player);
            case 3 -> inventoryMenu(player);
            case 4 -> endGame(player);
            default -> idleMenu(player);
        }
    }

    public static void statusMenu(Player player)
    {
        System.out.println("\n=== CHARACTER STATUS ===");
        System.out.println("Name: " + player.getName());
        System.out.println("HP: " + player.getPlayerHp());
        System.out.println("Strength: " + player.getPlayerStrength());
        System.out.println("Score: " + player.getPlayerScore());
        System.out.println("\nPress any number to continue...");
        PlayerPrompt.askNumber();
        idleMenu(player);
    }

    public static void inventoryMenu(Player player)
    {
        System.out.println("\n=== INVENTORY ===");
        System.out.println("Available Potions:");
        // List potions with numbers
        System.out.println("1-3. Use Potion");
        System.out.println("4. Back");

        int choice = PlayerPrompt.askNumber();
        if (choice >= 1 && choice <= 3)
        {
            // Use selected potion
            // player.usePotion(choice - 1);
        }
        idleMenu(player);
    }

    public static void combatMenu(Player player, Enemy enemy)
    {
        System.out.println("\n=== COMBAT MENU ===");
        System.out.println("1. Attack");
        System.out.println("2. Use Potion");
        System.out.println("3. Show Combat Stats");
        System.out.println("4. Try to Flee");

        switch (PlayerPrompt.askNumber())
        {
            case 1 ->
            {
                return;
            }  // Continue combat
            case 2 -> combatInventoryMenu(player, enemy);
            case 3 -> showCombatStats(player, enemy);
            case 4 -> attemptFlee();
            default -> combatMenu(player, enemy);
        }
    }

    private static void combatInventoryMenu(Player player, Enemy enemy)
    {
        System.out.println("\n=== COMBAT INVENTORY ===");
        // Show combat-usable potions
        System.out.println("\nPress any number to return to combat...");
        PlayerPrompt.askNumber();
        combatMenu(player, enemy);
    }

    private static void showCombatStats(Player player, Enemy enemy)
    {
        System.out.println("\n=== COMBAT STATUS ===");
        System.out.println("YOUR HP: " + player.getPlayerHp());
        System.out.println("ENEMY HP: " + enemy.getMonsterHp());
        System.out.println("\nPress any number to return to combat...");
        PlayerPrompt.askNumber();
        combatMenu(player, enemy);
    }

    private static void attemptFlee()
    {
        if (RandomGenerator.between(1, 100) > 50)
        {
            System.out.println("Successfully fled!");
        } else
        {
            System.out.println("Failed to flee!");

        }
    }

    private static void endGame(Player player)
    {
        System.out.println("\n=== GAME OVER ===");
        System.out.println("Final Score: " + player.getPlayerScore());
        System.out.println("Thanks for playing!");
        System.exit(0);
    }
}