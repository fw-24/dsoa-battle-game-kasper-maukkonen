package org.example;

import java.util.Random;

public class Npc extends GameCharacter {
    public Npc(String name, int hitPoints) {
        super(name, hitPoints);
        this.dexterity = 0.5;
        Random rand = new Random();
        this.equippedWeapon = new Weapon("Club", 10 + rand.nextInt(11)); // Damage between 10 and 20
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
