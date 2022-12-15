package OO;

import static java.awt.Color.white;

public class Main {
    public static void main(String[] args) {
        int a = 7;

        Car c1 = new Car(29,50,"green","A2300");



        System.out.println(c1.serialNumber);
        System.out.println(c1.fuelConsumption);
        System.out.println(c1.color);

        System.out.println(c1.fuelAmount);
        c1.drive();
        System.out.println(c1.fuelAmount);


        c1.brake();

        c1.turboBoost();

        c1.honk();

        System.out.println(c1.Range);
    }

    Car c2 = new Car(13, 80, "black", "A22045");

}
