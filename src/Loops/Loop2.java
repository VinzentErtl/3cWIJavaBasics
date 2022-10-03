package Loops;

import java.util.Random;

public class Loop2 {
    public static void main(String[] args) {
        // Erstelle eine Zufallszahl zwischen 5 und 10
        Random random = new Random();
        int randomNumber = random.nextInt(5);

        for (int i = 0; i <= 1000; i = i + 2) {
            System.out.println(i);
        }
    }
}