package org.example;

public class Game {
    public static void main(String[] args) {
        GameCharacter player = new GameCharacter("Player", 100);
        GameCharacter ghoul = new GameCharacter("Ghoul", 50);

        System.out.println("A scary-looking Ghoul runs towards you. You decide to attack.");

        while (player.getHitPoints() > 0 && ghoul.getHitPoints() > 0) {
            player.takeDamage(20);
            System.out.println("Ghoul hits Player for 20 HP. Player has " + player.getHitPoints() + " HP left.");

            if (player.getHitPoints() <= 0) break;

            ghoul.takeDamage(20);
            System.out.println("Player hits Ghoul for 20 HP. Ghoul has " + ghoul.getHitPoints() + " HP left.");
        }

        if (player.getHitPoints() > 0) {
            System.out.println("Ghoul is dead.\nPlayer wins!");
        } else {
            System.out.println("Player is dead.\nGhoul wins!");
        }
    }
}