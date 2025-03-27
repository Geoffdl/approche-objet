package fr.diginamic.combat;

import fr.diginamic.combat.characters.player.Player;
import fr.diginamic.combat.logic.GameState;
import fr.diginamic.combat.utils.Menu;
import fr.diginamic.combat.utils.PlayerPrompt;
import fr.diginamic.combat.utils.RandomGenerator;

public class MoldusGate
{
    public static void main(String[] args)
    {
        // Show start menu
        Menu.startMenu();

        // Setup initial game state
        Player player = new Player(PlayerPrompt.askName(), RandomGenerator.between(20, 50), RandomGenerator.between(12, 18), 0);

        // Start game loop
        GameState game = new GameState(player);
        game.start();
    }
}