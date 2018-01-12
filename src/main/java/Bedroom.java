import java.math.BigDecimal;

public class Bedroom extends Room {
    private BedroomType type;
    private double price;

    public Bedroom(String name, int maxCapacity, boolean accessible, boolean chargeable, BedroomType type, double price) {
        super(name, maxCapacity, accessible, chargeable);
        this.type = type;
        this.price = price;
    }

    public BedroomType getBedroomType() {
        return this.type;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


//    I don't want to be able to change the type of the bedroom



}
