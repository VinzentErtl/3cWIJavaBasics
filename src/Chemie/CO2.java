package Chemie;
import java.util.Scanner;
public class CO2 {


        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Gebe die Anzahl der Liter ein: ");
            double liters = input.nextDouble();
            double emissions = liters * 2.3;
            System.out.println("Entstandenes CO2 in Kilogramm: " + emissions);
        }
    }


