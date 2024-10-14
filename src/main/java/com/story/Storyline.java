package com.story;

import java.util.ArrayList;
import java.util.List;

public class Storyline {
    private List<Dialogue> dialogues = new ArrayList<>();

    public void addDialogue(Dialogue dialogue) {
        dialogues.add(dialogue);
    }

    public void displayStory() {
        for (Dialogue dialogue : dialogues) {
            dialogue.display();
        }
    }
}
