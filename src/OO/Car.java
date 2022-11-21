package OO;

public class Car {
    //Gedächtnisvariablen

    public int fuelConsumption;
    public int fuelAmount;
    public String serialNumber;
    public String color;

    //Methode
    public void drive(){
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("I am driving.");
    }

    public void brake(){
        System.out.println("I am braking.");
    }

    public void turboBoost(){
        if (fuelAmount > fuelConsumption * 0.1)
            System.out.println("SuperBoostMode");
        else
            System.out.println("Not enough fuel to go to SuperBoost");
    }


}
