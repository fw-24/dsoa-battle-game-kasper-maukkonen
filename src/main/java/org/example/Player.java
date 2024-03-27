package org.example;

import java.util.Random;

public class Player extends GameCharacter {
    public Player(String name, int hitPoints) {
        super(name, hitPoints);
        this.dexterity = 0.8;
        this.equippedWeapon = new Weapon("Sword", 30); // Default weapon
    }

    @Override
    public int attack(GameCharacter defender) {
        Random rand = new Random();
        int damageRange = equippedWeapon.getDamage() - (int)(equippedWeapon.getDamage() * dexterity);
        int damageDone = rand.nextInt(damageRange + 1) + (int)(equippedWeapon.getDamage() * dexterity);
        defender.takeDamage(damageDone);
        return damageDone;
    }
}
