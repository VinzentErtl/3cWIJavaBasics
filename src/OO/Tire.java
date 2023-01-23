package OO;

public class Tire {
    private int size;
    private int position; // 0 links vorne, 1 rechts vorne, 2 links hinten, 3 rechts hinten

    public Tire(int size, int position) {
        this.size = size;
        this.position = position;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
