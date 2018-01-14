
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;


public class Booking {

    private ArrayList<Guest> guests;
    private ArrayList<Room> rooms;
    private LocalDate startDate;
    private LocalDate endDate;
    private ArrayList<Requirement> requirements;
    private double cost;
//    to do: change active, completed etc to an enum called status.
    private boolean active;
    private boolean completed;
    private final int reference;


    public Booking(int reference){
        this.reference = reference;
        this.guests = new ArrayList<>();
        this.rooms = new ArrayList<>();
//        this.room_allocation = new HashMap<Room, ArrayList<Guest>>();
        this.startDate = null;    //consider setting the default to 'today'
        this.endDate = null;  //consider setting the default to 'tomorrow'
        this.requirements = new ArrayList<>();
        this.cost = 0.00;
        this.active = false;
        this.completed = false;
    }

//    how to get a current date: https://stackoverflow.com/questions/18257648/get-the-current-date-in-java-sql-date-format

    public int getReference() {
        return this.reference;
    }

    public ArrayList<Guest> getGuests() {
        return this.guests;
    }

    public ArrayList<Room> getRooms() {
        return this.rooms;
    }

    public LocalDate getStartDate() {
        return this.startDate;
    }

    public LocalDate getEndDate() {
        return this.endDate;
    }

    public double getCost() {
        return this.cost;
    }

    public ArrayList<Requirement> getRequirements() {
        return this.requirements;
    }

    public boolean getActive() {
        return this.active;
    }

    public boolean getCompleted() {
        return this.completed;
    }


    public void addGuest(Guest guest) {
        this.guests.add(guest);
    }

    public void removeGuest(Guest guest) {
        this.guests.remove(guest);
    }


    public void addRoom(Room room) {
        this.rooms.add(room);
    }

    public void removeRoom(Bedroom room) {
        this.rooms.remove(room);
    }


    public void addRequirement(Requirement requirement) {
        this.requirements.add(requirement);
    }

    public void removeRequirement(Requirement requirement) {
        this.requirements.remove(requirement);
    }

    public void addCharge(double amount) {
        this.cost = this.cost + amount;
        if(this.cost < 0) {
            this.cost = 0.00;
        }
    }

    public void activate() {
        this.active = true;
    }

    public void complete() {
        /*
        add logic to check that:
            booking is currently active (i.e. someone checked in)
            everything has been paid
            all rooms/guests have been checked out
            departure date is today or past (or allow departure date to be changed?)
        */
        this.completed = true;
        this.active = false;

    }

    public int getRoomCount() {
        return this.rooms.size();
    }

//    extract into helper class?
    public DateTimeFormatter dateFormatter (){
        return DateTimeFormatter.ofPattern("uuuu-MM-dd", Locale.ENGLISH);
    }

    public void addStartDate(String startDate) {
        this.startDate = LocalDate.parse(startDate, dateFormatter());
    }

    public void addEndDate(String endDate) {
        this.endDate = LocalDate.parse(endDate, dateFormatter());
    }

    public int getNights() {
//          need to add logic somewhere to make sure that number of nights cannot be negative,
//          could be zero if booking cancelled
        return Period.between(startDate, endDate).getDays();
    }


//    having trouble with dates: https://www.ntu.edu.sg/home/ehchua/programming/java/DateTimeCalendar.html

//    to convert a string to a date: date = valueOf("yyyy-mm-dd")
}
