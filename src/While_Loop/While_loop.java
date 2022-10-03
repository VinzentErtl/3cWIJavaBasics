package While_Loop;

import java.util.Random;

public class While_loop {
    public static void main(String[] args) {
        // Erstelle eine Zufallszahl zwischen 10 und 30
        Random random = new Random();
        boolean isFinished = false;

        while (!isFinished) {
            int randomNumber = random.nextInt(10, 30);
            System.out.println("Nr:" + randomNumber);


            if (randomNumber == 15 || randomNumber == 25) {
                isFinished = true;
            }
        }
        System.out.println("Finished");
    }
}