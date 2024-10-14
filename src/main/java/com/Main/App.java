package com.Main;

/**
 * Hello world!
 *
 */
import java.util.Scanner;

public class App {
    public static void main( String[] args ){
        System.out.println( "Hello World!" );
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name please: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        scanner.close();
    }
}