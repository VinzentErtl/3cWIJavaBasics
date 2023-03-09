package OO.Lamp;

public class Annealing_element {

    private int Power_consumption;
    private String Name;
    private String Color;
    private String Status;

    public Annealing_element(int power_consumption, String name, String color, String status) {
        Power_consumption = power_consumption;
        Name = name;
        Color = color;
        Status = status;
    }

    public String getStatus(){
        return Status;
    }
}
