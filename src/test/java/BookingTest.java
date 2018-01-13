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
    public void bookingAddsGuest(){
        booking.addGuest(guest);
        assertEquals(1, booking.getGuests().size());
        assertEquals("Kat", booking.getGuests().get(0).getName());
    }

    @Test
    public void bookingRemovesGuest(){
        booking.addGuest(guest);
        booking.removeGuest(guest);
        assertEquals(0, booking.getGuests().size());
    }

    @Test
    public void bookingAddsRoom(){
        booking.addRoom(room);
        assertEquals(1, booking.getRooms().size());
        assertEquals(room, booking.getRooms().get(0));
    }

    @Test
    public void bookingRemovesRoom(){
        booking.addRoom(room);
        booking.removeRoom(room);
        assertEquals(0, booking.getRooms().size());
    }

    @Test
    public void bookingAddsRequirement(){
        booking.addRequirement(Requirement.WAKE_UP_CALL);
        assertEquals(1, booking.getRequirements().size());
        assertEquals(Requirement.WAKE_UP_CALL, booking.getRequirements().get(0));
    }

    @Test
    public void bookingRemovesRequirement(){
        booking.addRequirement(Requirement.WAKE_UP_CALL);
        booking.removeRequirement(Requirement.WAKE_UP_CALL);
        assertEquals(0, booking.getRequirements().size());
    }

    @Test
    public void bookingAddsCharge(){
        booking.addCharge(room.getPrice());
        assertEquals(49.50, booking.getCost(), 0.001);
    }

    @Test
    public void bookingCostCannotGoNegative(){
        booking.addCharge(100);
        booking.addCharge(-200);
        assertEquals(0.00, booking.getCost(), 0.001);
    }

    @Test
    public void bookingCanBeCompleted(){
        booking.complete();
        assertEquals(true, booking.getCompleted());
    }


}
