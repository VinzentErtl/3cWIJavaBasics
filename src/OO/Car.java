package OO;

public class Car {
    //Gedächtnisvariablen

    public int fuelConsumption;
    public int fuelAmount;
    public String serialNumber;
    public String color;
    public int Range;


    public Car(int fuelConsumption, int fuelAmount, String color, String serialNumber){

    }

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

    public void honk(){
        int amountOfRepetitions = 4;
        System.out.println(amountOfRepetitions + " *" + " tuuut");
    }


    public void getRemainingRange(){
        this.Range = this.fuelAmount - fuelConsumption;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setRange(int range) {
        Range = range;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
