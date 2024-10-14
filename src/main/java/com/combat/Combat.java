package com.combat;

import com.characters.Player;
import com.utils.InputHandler;
import java.util.Random;
import java.util.Scanner;

public class Combat {
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);
    private InputHandler inputHandler = new InputHandler();

    public void startCombat(Player player, Enemy enemy) {
        System.out.println("Combat started between " + player.getName() + " and " + enemy.getName());

        while (player.getHealth() > 0 && enemy.getHealth() > 0) {
            playerTurn(player, enemy);
            if (enemy.getHealth() > 0) {
                enemyTurn(player, enemy);
            }
        }

        if (player.getHealth() > 0) {
            System.out.println(player.getName() + " has defeated " + enemy.getName() + "!");
        } else {
            System.out.println(player.getName() + " has been defeated by " + enemy.getName() + "...");
        }
    }

    private void playerTurn(Player player, Enemy enemy) {
        inputHandler.clearScreen();
        System.out.println("It's " + player.getName() + "'s turn.");
        System.out.println("1. Attack");
        System.out.println("2. Use Potion");
        System.out.println("3. Exit");
        System.out.print("Choose an action: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                playerAttack(player, enemy);
                break;
            case 2:
                usePotion(player);
                break;
            case 3:
                System.out.println("Exiting combat...");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. You lose your turn.");
                break;
        }
        inputHandler.waitForEnter("Press Enter to continue...");
    }

    private void enemyTurn(Player player, Enemy enemy) {
        inputHandler.clearScreen();
        System.out.println("It's " + enemy.getName() + "'s turn.");
        enemyAttack(player, enemy);
        inputHandler.waitForEnter("Press Enter to continue...");
    }

    private void playerAttack(Player player, Enemy enemy) {
        int damage = random.nextInt(10) + 1; // Random damage between 1 and 10
        enemy.setHealth(enemy.getHealth() - damage);
        System.out.println(player.getName() + " attacks " + enemy.getName() + " for " + damage + " damage.");
        System.out.println(enemy.getName() + " has " + enemy.getHealth() + " health remaining.");
    }

    private void enemyAttack(Player player, Enemy enemy) {
        int damage = random.nextInt(10) + 1; // Random damage between 1 and 10
        player.setHealth(player.getHealth() - damage);
        System.out.println(enemy.getName() + " attacks " + player.getName() + " for " + damage + " damage.");
        System.out.println(player.getName() + " has " + player.getHealth() + " health remaining.");
    }

    private void usePotion(Player player) {
        int healingAmount = random.nextInt(10) + 1; // Random healing between 1 and 10
        player.setHealth(player.getHealth() + healingAmount);
        System.out.println(player.getName() + " uses a potion and heals for " + healingAmount + " health.");
        System.out.println(player.getName() + " now has " + player.getHealth() + " health.");
    }
}