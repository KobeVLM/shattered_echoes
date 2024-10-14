package com.items;

public class Potion extends Item {
    private int healingAmount;

    public Potion(String name, int healingAmount) {
        super(name);
        this.healingAmount = healingAmount;
    }

    public int getHealingAmount() {
        return healingAmount;
    }

    public void setHealingAmount(int healingAmount) {
        this.healingAmount = healingAmount;
    }

    public void use() {
        System.out.println("Using " + getName() + " to heal " + healingAmount + " health points.");
    }
}
