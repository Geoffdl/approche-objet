package fr.diginamic.combat;

import fr.diginamic.combat.characters.ennemies.Enemy;
import fr.diginamic.combat.characters.player.Player;
import fr.diginamic.combat.utils.EnemyFactory;
import fr.diginamic.combat.utils.PlayerPrompt;
import fr.diginamic.combat.utils.RandomGenerator;

public class MoldusGate
{
    public static void main(String[] args)
    {

        Player player = new Player(PlayerPrompt.askName(), RandomGenerator.between(20, 50), RandomGenerator.between(12, 18));
        Enemy monster1 = EnemyFactory.createRandomEnemy();


        System.out.println(player);
        System.out.println(monster1);
    }
}