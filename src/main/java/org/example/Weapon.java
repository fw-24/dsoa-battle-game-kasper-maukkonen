package org.example;

public class Weapon {
    private String name;
    private int damage;

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

}
