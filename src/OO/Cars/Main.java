package OO.Cars;

public class Main {
    public static void main(String[] args) {
        int a = 7;

        Car c1 = new Car(29,50,"green","A2300");

        RearMirror m1 = new RearMirror(10,5);
        RearMirror m2 = new RearMirror(10,5);
        c1.addMirror(m1);
        c1.addMirror(m2);

        Tire t1 = new Tire(20, 0);
        Tire t2 = new Tire(20, 1);
        Tire t3 = new Tire(20, 2);
        Tire t4 = new Tire(20,3);
        c1.addTire(t1);
        c1.addTire(t2);
        c1.addTire(t3);
        c1.addTire(t4);

        Engine e1 = new Engine(90, Engine.TYPE.DIESEL);
        e1.drive(60);

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
