package com.quests;

public class Quest {
    private String description;

    public Quest(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void start() {
        System.out.println("Starting quest: " + description);
    }
}
