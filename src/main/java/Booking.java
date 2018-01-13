import java.sql.Date;
import java.util.ArrayList;

import static jdk.nashorn.internal.objects.NativeDate.valueOf;

public class Booking {

    private ArrayList<Guest> guests;
    private ArrayList<Room> rooms;
    private Date arrivalDate;
    private Date departureDate;
    private ArrayList<Requirement> requirements;
    private double cost;
    private boolean completed;


    public Booking(){

        this.guests = new ArrayList<>();
        this.rooms = new ArrayList<>();
//        this.room_allocation = new HashMap<Room, ArrayList<Guest>>();
        this.arrivalDate = null;    //consider setting the default to 'today'
        this.departureDate = null;  //consider setting the default to 'tomorrow'
        this.requirements = new ArrayList<>();
        this.cost = 0.00;
        this.completed = false;
    }

//    how to get a current date: https://stackoverflow.com/questions/18257648/get-the-current-date-in-java-sql-date-format

    public ArrayList<Guest> getGuests() {
        return this.guests;
    }

    public ArrayList<Room> getRooms() {
        return this.rooms;
    }

    public Object getArrivalDate() {
        return this.arrivalDate;
    }

    public Date getDepartureDate() {
        return this.departureDate;
    }

    public double getCost() {
        return this.cost;
    }

    public ArrayList<Requirement> getRequirements() {
        return this.requirements;
    }

    public boolean getCompleted() {
        return this.completed;
    }

    public void addGuest(Guest guest) {
        this.guests.add(guest);
    }

    public void addRoom(Room room) {
        this.rooms.add(room);
    }

    public void addRequirement(Requirement requirement) {
        this.requirements.add(requirement);
    }

    public void charge(double amount) {
        this.cost = this.cost + amount;
    }
//    having trouble with dates: https://www.ntu.edu.sg/home/ehchua/programming/java/DateTimeCalendar.html

//    to convert a string to a date: date = valueOf("yyyy-mm-dd")
}
