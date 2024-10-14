package com.utils;

import java.io.IOException;
import java.util.Scanner;

public class InputHandler {
    private Scanner scanner = new Scanner(System.in);

    public void waitForEnter(String prompt) {
        System.out.println(prompt);
        scanner.nextLine();
    }

    public void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (IOException | InterruptedException ex) {
            System.out.println("Error clearing the screen: " + ex.getMessage());
        }
    }
}
