package Loops;

import java.util.Random;


public class Loop1 {
    public static void main(String[] args) {
        // Erstelle eine Zufallszahl zwischen 5 und 10
        Random random = new Random();
        int randomNumber = random.nextInt(5);

        //FOR Schleife
        for (int i = 0; i <= 100; i++) {
            System.out.println("Zahl" + i);
        }
    }
}
