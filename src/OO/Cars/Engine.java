package OO.Cars;

public class Engine {
    public  enum TYPE {DIESEL, Gas}
    private TYPE type; // Diesel oder Benzin
    private int horsePower;

    public Engine(int horsePower, TYPE type) {
        this.type = type;
        this.horsePower = horsePower;
    }

    // amount should be between -1 and 100

    public void drive(int amount){
        System.out.println("the motor is running with " + amount);
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
