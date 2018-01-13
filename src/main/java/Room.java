public class Room {


    private boolean accessible;
    private boolean chargeable;
    private String name;

    public Room(String name, boolean accessible, boolean chargeable) {
        this.name = name;
        this.chargeable = chargeable;
        this.accessible = accessible;
    }

    public String getName() {
        return this.name;
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

    public void setChargeable(boolean chargeable) {
        this.chargeable = chargeable;
    }

    public void setAccessible(boolean accessible) {
        this.accessible = accessible;
    }
}
