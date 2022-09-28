package at.ve.java.basics;

import java.util.Random;

public class ifclauses {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        // Erstelle eine Zufallszahl zwischen 0 und 100

        if (randomNumber < 20) {
            System.out.println("Mini");
        } else if (randomNumber > 20 && randomNumber < 50) {
            System.out.println("Medium");

        } else {
            System.out.println("Largo");
        }

    }
}