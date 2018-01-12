public class Room {


    private boolean accessible;
    private boolean chargeable;
    protected int maxCapacity;
    private String name;

    public Room(String name, int maxCapacity, boolean accessible, boolean chargeable) {
        this.name = name;
        this.maxCapacity = maxCapacity;
        this.chargeable = chargeable;
        this.accessible = accessible;
    }

    public String getName() {
        return this.name;
    }

    public int getMaxCapacity() {
        return this.maxCapacity;
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

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public void setChargeable(boolean chargeable) {
        this.chargeable = chargeable;
    }

    public void setAccessible(boolean accessible) {
        this.accessible = accessible;
    }
}
