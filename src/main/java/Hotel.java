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

    public void setName(String name) {
        this.name = name;
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public void addDiningRoom(DiningRoom diningRoom) {
        this.diningRooms.add(diningRoom);
    }

    public void addFunctionRoom(FunctionRoom functionRoom) {
        this.functionRooms.add(functionRoom);
    }

    public int getBedCount() {
        int count = 0;
        for (Bedroom bedroom: bedrooms) {
            count = count + bedroom.getCapacity();
        }
        return count;
    }


    public int getBedroomCount() {
        return getBedrooms().size();
    }

    public int getDiningRoomCount() {
        return getDiningRooms().size();
    }

    public int getFunctionRoomCount() {
        return getFunctionRooms().size();
    }

    public void newBooking(int reference) {
        Booking booking = new Booking(reference);
        this.bookings.add(booking);
    }

    public Booking selectBooking(int reference) {
        for (Booking booking: getBookings()){
            if (booking.getReference() == reference){
                return booking;
            }
        } return null;
    }

    public void deleteBooking(int reference) {
        // you would only use this if a booking had not been fully added to the db or other storage system
        this.bookings.remove(selectBooking(reference));
    }

    public ArrayList<Room> getOccupiedRooms() {
        ArrayList<Room> occupiedRooms = new ArrayList<>();
        for (Booking booking: getBookings()){
            for (Room room: booking.getRooms()) {
                occupiedRooms.add(room);
            }
        }
        return occupiedRooms;
    }

    public ArrayList<Room> getVacantRooms() {
        ArrayList<Room> vacantRooms = new ArrayList<>();
        for (Room room: bedrooms) {
            vacantRooms.add(room);
        }
        for (Room room: diningRooms) {
            vacantRooms.add(room);
        }
        for (Room room: functionRooms) {
            vacantRooms.add(room);
        }
        for (Room room: getOccupiedRooms()) {
                vacantRooms.remove(room);
            }
        return vacantRooms;
    }
}
