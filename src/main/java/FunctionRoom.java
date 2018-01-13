public class FunctionRoom extends Room {
    private final int maxCapacity;
    private double price;
    private FunctionRoomSetup setup;

    public FunctionRoom(String name, boolean accessible, boolean chargeable, int maxCapacity, FunctionRoomSetup setup, double price) {
        super(name, accessible, chargeable);
        this.maxCapacity = maxCapacity;
        this.setup = setup;
        this.price = price;
    }

    public FunctionRoomSetup getSetup() {
        return this.setup;
    }


    public void setType(FunctionRoomSetup setup) {
        this.setup = setup;
    }

    public int getCapacity() {
        int modifier = getSetup().getCapacityModifier();
        return this.maxCapacity * modifier / 10;
//        CARE: calling.capacity will give the room's max capacity as set by the room at initialization
    }


    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
