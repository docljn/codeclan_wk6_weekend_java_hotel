public class Room {


    private boolean accessible;
    private boolean chargeable;
    protected int capacity;
    private String name;

    public Room(String name, int capacity, boolean accessible, boolean chargeable) {
        this.name = name;
        this.capacity = capacity;
        this.chargeable = chargeable;
        this.accessible = accessible;
    }

    public String getName() {
        return this.name;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public boolean getChargeable() {
        return this.chargeable;
    }

    public boolean getAccessible() {
        return this.accessible;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setChargeable(boolean chargeable) {
        this.chargeable = chargeable;
    }

    public void setAccessible(boolean accessible) {
        this.accessible = accessible;
    }
}
