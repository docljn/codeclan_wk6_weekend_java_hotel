public class FunctionRoom extends Room {
    private final int maxCapacity;
    private double price;
    private FunctionRoomSetup setup;

    public FunctionRoom(String name, boolean accessible, boolean chargeable, int maxCapacity, double price) {
        super(name, accessible, chargeable);
        this.maxCapacity = maxCapacity;
        this.setup = FunctionRoomSetup.THEATER;
        this.price = price;
    }

    public FunctionRoomSetup getSetup() {
        return this.setup;
    }


    public void setSetup(FunctionRoomSetup setup) {
        this.setup = setup;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getCapacity() {
        int modifier = getSetup().getCapacityModifier();
        return this.maxCapacity * modifier / 10;
    }


    public double getPrice() {
        if (this.getChargeable() == false) {
            return 0.00;
        } else {
            return this.price;
        }
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
