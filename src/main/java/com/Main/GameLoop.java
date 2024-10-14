package com.Main;

import com.characters.Player;
import com.combat.Enemy;
import com.combat.Combat;
import com.utils.InputHandler;

public class GameLoop {
    public void start() {
        Player player = new Player("Hero", 100);
        Enemy enemy = new Enemy("Goblin", 50);
        Combat combat = new Combat();

        System.out.println("Welcome to the Text-Based RPG!");
        InputHandler inputHandler = new InputHandler();
        inputHandler.waitForEnter("Press Enter to start the combat...");

        combat.startCombat(player, enemy);
    }
}
