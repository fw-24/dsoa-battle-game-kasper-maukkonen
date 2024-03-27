package org.example;

public abstract class GameCharacter {
    protected String name;
    protected int hitPoints;
    protected Weapon equippedWeapon;
    protected double dexterity;

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

    public Weapon getEquippedWeapon() {
        return equippedWeapon;
    }

    public abstract int attack(GameCharacter defender);
}
