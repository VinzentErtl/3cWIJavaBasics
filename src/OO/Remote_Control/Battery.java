package OO.Remote_Control;

public class Battery {

    public int memoryStatus;

    public Battery(int memoryStatus) {
        this.memoryStatus = memoryStatus;
    }

    public int getMemoryStatus() {
        return memoryStatus;
    }

    public void setMemoryStatus(int memoryStatus) {
        this.memoryStatus = memoryStatus;
    }
}
