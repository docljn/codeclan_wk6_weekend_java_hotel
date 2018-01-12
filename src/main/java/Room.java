public class Room {


    private boolean accessible;
    private boolean chargeable;
    private int capacity;
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
}
