import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking;
    Guest guest;
    Bedroom room;


    @Before
    public void before(){
        booking = new Booking();
        guest = new Guest("Kat", true);
        room = new Bedroom("1", true, true, BedroomType.SINGLE, 49.50);
    }


    @Test
    public void bookingStartsEmpty(){
        assertEquals(0, booking.getGuests().size());
        assertEquals(0, booking.getRooms().size());
        assertEquals(null, booking.getArrivalDate());
        assertEquals(null, booking.getDepartureDate());
        assertEquals(0, booking.getRequirements().size());
        assertEquals(0.00, booking.getCost(), 0.001);
        assertEquals(false, booking.getCompleted());
    }

    @Test
    public void bookingAcceptsGuest(){
        booking.addGuest(guest);
        assertEquals(1, booking.getGuests().size());
        assertEquals("Kat", booking.getGuests().get(0).getName());
    }

    @Test
    public void bookingAcceptsRoom(){
        booking.addRoom(room);
        assertEquals(1, booking.getRooms().size());
        assertEquals(room, booking.getRooms().get(0));
    }

    @Test
    public void bookingAcceptsRequirement(){
        booking.addRequirement(Requirement.WAKE_UP_CALL);
        assertEquals(1, booking.getRequirements().size());
        assertEquals(Requirement.WAKE_UP_CALL, booking.getRequirements().get(0));
    }

    @Test
    public void bookingAcceptsCharge(){
        booking.charge(room.getPrice());
        assertEquals(49.50, booking.getCost(), 0.001);
    }


}
