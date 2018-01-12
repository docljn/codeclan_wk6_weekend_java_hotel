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


    public Booking(){

    }
}
