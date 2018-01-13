import java.math.BigDecimal;

public class Bedroom extends Room {
    private final int maxCapacity;
    private final BedroomType type;
    private double price;

    public Bedroom(String name, boolean accessible, boolean chargeable, BedroomType type, double price) {
        super(name, accessible, chargeable);
        this.type = type;
        this.maxCapacity = getMaxCapacity();
        this.price = price;
    }

    public BedroomType getBedroomType() {
        return this.type;
    }

    public int getMaxCapacity() {
        return this.getBedroomType().getCapacity();
    }


    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }




//    I don't want to be able to change the type of the bedroom



}
