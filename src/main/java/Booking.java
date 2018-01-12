import java.sql.Date;
import java.util.ArrayList;

public class Booking {

    ArrayList<Guest> guests;
    ArrayList<Room> rooms;
    Date arrival_date;
    Date departure_date;
    ArrayList<Requirement> requirements;
    double bookingCost;
    boolean paid;


    public Booking(ArrayList<Guest> guests, ArrayList<Room> rooms, Date arrival_date, Date departure_date, ArrayList<Requirement> requirements, double bookingCost, boolean paid){

        this.guests = guests;
        this.rooms = rooms;
        this.arrival_date = arrival_date;
        this.departure_date = departure_date;
        this.requirements = requirements;
        this.bookingCost = bookingCost;
        this.paid = paid;
    }
}
