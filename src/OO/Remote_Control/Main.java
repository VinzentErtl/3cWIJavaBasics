package OO.Remote_Control;

public class Main {
    public static void main(String[] args) {


        Battery b1 = new Battery(70);
        Battery b2 = new Battery(60);
        Remote r1 = new Remote(b1,b2);

        System.out.println(r1.getStatus());

        r1.turnOn();
        System.out.println(r1.getStatus());



    }

}
