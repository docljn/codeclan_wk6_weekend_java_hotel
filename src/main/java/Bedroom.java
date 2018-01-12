public class Bedroom extends Room {
    private BedroomType type;

    public Bedroom(String name, int capacity, boolean accessible, boolean chargeable, BedroomType type) {
        super(name, capacity, accessible, chargeable);
        this.type = type;
    }

    public BedroomType getBedroomType() {
        return this.type;
    }
}
