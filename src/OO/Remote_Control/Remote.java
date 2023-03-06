package OO.Remote_Control;

public class Remote {

    private Battery battery;
    private Battery battery2;


    public Remote(Battery battery, Battery battery2) {
        this.battery = battery;
        this.battery2 = battery2;
    }

    public int getStatus() {
        int d = (this.battery.getMemoryStatus() + this.battery2.getMemoryStatus()) / 2;
        return d;
    }

    public void turnOn() {
        this.battery.setMemoryStatus(this.battery.getMemoryStatus() - 5);
        this.battery2.setMemoryStatus(this.battery2.getMemoryStatus() - 5);
        System.out.println("Verbraucher angeschlossen!");

    }

    public void turnOff() {
        System.out.println("Kein Verbraucher angeschlossen!");
    }
}
