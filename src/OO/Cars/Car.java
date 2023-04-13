package OO.Cars;

import java.util.ArrayList;
import java.util.List;

public class Car {
    //Gedächtnisvariablen

    private int fuelConsumption;
    private List<RearMirror> mirrors;
    private List<Tire> tires;
    private int fuelAmount;
    private String serialNumber;
    private String color;
    private int Range;


    public Car(int fuelConsumption, int fuelAmount, String serialNumber, String color) {
        this.fuelConsumption = fuelConsumption;
        this.fuelAmount = fuelAmount;
        this.serialNumber = serialNumber;
        this.color = color;
        this.mirrors = new ArrayList<>();
        this.tires = new ArrayList<>();
    }

    public void addMirror(RearMirror rearMirror) {

        this.mirrors.add(rearMirror);
    }

    public void addTire(Tire tire) {
        this.tires.add(tire);
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

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void stop(){
        System.out.println("I am Stopping .... car");
    }

    public List<RearMirror> getMirrors() {
        return mirrors;
    }

    public void setMirrors(List<RearMirror> mirrors) {
        this.mirrors = mirrors;
    }

    public List<Tire> getTires() {
        return tires;
    }

    public void setTires(List<Tire> tires) {
        this.tires = tires;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getColor() {
        return color;
    }

    public int getRange() {
        return Range;
    }
}
