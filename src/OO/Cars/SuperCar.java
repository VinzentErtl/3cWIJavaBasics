package OO.Cars;

public class SuperCar extends Car{
    private String spoiler;

    public SuperCar(int fuelConsumption, int fuelAmount, String serialNumber, String color, String spoiler) {
        super(fuelConsumption, fuelAmount, serialNumber, color);
        this.spoiler = spoiler;

    }

    public String getSpoiler() {
        return spoiler;
    }

    public void setSpoiler(String spoiler) {
        this.spoiler = spoiler;
    }
}
