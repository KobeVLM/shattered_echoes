package com.items;

public class Weapon extends Item {
    private int damage;

    public Weapon(String name, int damage) {
        super(name);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void use() {
        System.out.println("Using " + getName() + " to deal " + damage + " damage.");
    }
}
