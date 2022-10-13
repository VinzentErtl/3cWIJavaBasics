package ATM;

import java.util.Scanner;

public class ATMexample {
    public static void main(String[] args) {

        int balance = 0;

        System.out.println("Selektieren Sie die gewünschte Funktion:");
        System.out.println("1. Einzahlen");
        System.out.println("2. Abheben");
        System.out.println("3. Kontostand");
        System.out.println("4. Ende");


        boolean isFinished = false;
        while (isFinished == false) {

            Scanner scanner = new Scanner(System.in);
            int selection = scanner.nextInt();

            if (selection == 1) {
                System.out.println("Wie viel würden Sie gerne einzahlen?");
                int payin = scanner.nextInt();
                balance = balance + payin;
                System.out.println("Sie haben " + payin + "€ eingezahlt.");
            }
            if (selection == 2) {
                System.out.println("Wie viel würden Sie gerne abheben?");
                int payout = scanner.nextInt();
                balance = balance - payout;
                System.out.println("Sie haben " + payout + "€ abgehoben.");
            }

            if (selection == 3) {
                System.out.println("Der Kontostand beträgt: " + balance + "€");
            }


            if (selection == 4) {
                isFinished = true;
                System.out.println("Machine is stopping!");
            }
        }
    }
}
