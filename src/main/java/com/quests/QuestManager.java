package com.quests;

import java.util.ArrayList;
import java.util.List;

public class QuestManager {
    private List<Quest> quests = new ArrayList<>();

    public void addQuest(Quest quest) {
        quests.add(quest);
    }

    public void startAllQuests() {
        for (Quest quest : quests) {
            quest.start();
        }
    }
}
