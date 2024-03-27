package org.example;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepPlaying = true;

        while (keepPlaying) {
            System.out.println("Welcome brave warrior! Enter your name:");
            String playerName = scanner.nextLine();
            Player player = new Player(playerName, 100);
            // Randomizing the npc's weapon for variety
            Npc ghoul = new Npc("Ghoul", 50 + new Random().nextInt(51)); // Ghoul has between 50 and 100 HP for variety

            System.out.println("\nA scary-looking Ghoul runs towards you.\n");

            while (player.getHitPoints() > 0 && ghoul.getHitPoints() > 0) {
                System.out.println("Attack (Enter) or flee (q)?");
                String action = scanner.nextLine();
                if ("q".equalsIgnoreCase(action)) {
                    System.out.println("You decide to make a run for it.\n");
                    break;
                }

                int playerDamage = player.attack(ghoul);
                System.out.println(player.getName() + " hits Ghoul with " + player.getEquippedWeapon().getName() + " for " + playerDamage + " HP\n ➜ Ghoul has " + ghoul.getHitPoints() + " HP left.");
                if (ghoul.getHitPoints() <= 0) {
                    System.out.println("Ghoul is dead. " + player.getName() + " wins with " + player.getHitPoints() + " health left.\n");
                    break;
                }

                int ghoulDamage = ghoul.attack(player);
                System.out.println("Ghoul hits " + player.getName() + " with " + ghoul.getEquippedWeapon().getName() + " for " + ghoulDamage + " HP\n ➜ " + player.getName() + " has " + player.getHitPoints() + " HP left.\n");
                if (player.getHitPoints() <= 0) {
                    System.out.println(player.getName() + " is dead. Ghoul wins with " + ghoul.getHitPoints() + " health left.");
                }
            }

            System.out.println("Play again (Enter), or quit (q)?");
            String playAgain = scanner.nextLine();
            if ("q".equalsIgnoreCase(playAgain)) {
                keepPlaying = false;
                System.out.println("Game Over.\nThanks for playing!");
            }
        }
    }
}
