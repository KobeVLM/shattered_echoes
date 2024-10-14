package com.story;

public class Dialogue {
    private String text;

    public Dialogue(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void display() {
        System.out.println(text);
    }
}
