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

/*
I would like to make chargeable the default, and not have to set it at initialization
but how then to use new Room to make a room using information from a database?
Additionally, would you use chargeable to ensure that a booking price didn't include the room price?
*/
