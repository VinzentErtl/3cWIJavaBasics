package Dicegame;

import java.util.Random;

public class DiceGame {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("Started");

        int winsOfPlayer = 0;
        int winsOfComputer = 0;
        int amountOfDraws = 0;

        for (int i = 0; i < 6; i++) {
            int randomPlayer = random.nextInt(6) + 1;
            int randomComputer = random.nextInt(6) + 1;

            if(randomPlayer>randomComputer){
                winsOfPlayer++;
                System.out.println("Player wins!");
            } else if (randomPlayer<randomComputer) {
                winsOfComputer++;
                System.out.println("Computer wins!");
            }else {
                amountOfDraws++;
                System.out.println("It's a draw!");
            }

            System.out.println("Computer: " + randomComputer + " Player: " + randomPlayer);
        }
        System.out.println("Computer: " + winsOfComputer + " Player: " + winsOfPlayer + " Draws: " + amountOfDraws);

    }
}
