import java.util.ArrayList;

public class Hotel {
    private final ArrayList<Booking> bookings;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<DiningRoom> diningRooms;
    private ArrayList<FunctionRoom> functionRooms;
    private String name;

    public Hotel(String name, ArrayList<Bedroom> bedrooms, ArrayList<DiningRoom> diningRooms, ArrayList<FunctionRoom> functionRooms) {
        this.name = name;
        this.bedrooms = bedrooms;
        this.diningRooms = diningRooms;
        this.functionRooms = functionRooms;
        this.bookings = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Bedroom> getBedrooms() {
        return this.bedrooms;
    }


    public ArrayList<DiningRoom> getDiningRooms() {
        return this.diningRooms;
    }

    public ArrayList<FunctionRoom> getFunctionRooms() {
        return this.functionRooms;
    }

    public ArrayList<Booking> getBookings() {
        return this.bookings;
    }
}
