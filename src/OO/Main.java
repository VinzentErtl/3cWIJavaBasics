package OO;

public class Main {
    public static void main(String[] args) {
        int a = 7;

        Car c1 = new Car();
        c1.color = "green";
        c1.fuelConsumption = 29;
        c1.serialNumber = "B69420";
        c1.fuelAmount = 70;


        System.out.println(c1.serialNumber);
        System.out.println(c1.fuelConsumption);
        System.out.println(c1.color);

        System.out.println(c1.fuelAmount);
        c1.drive();
        c1.drive();
        c1.drive();
        System.out.println(c1.fuelAmount);


        c1.brake();

        c1.turboBoost();

    }
}
