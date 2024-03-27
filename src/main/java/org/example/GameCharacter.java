package org.example;

public class GameCharacter {
    private String name;
    private int hitPoints;

    public GameCharacter(String name, int hitPoints) {
        this.name = name;
        this.hitPoints = hitPoints;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void takeDamage(int damage) {
        hitPoints -= damage;
    }
}