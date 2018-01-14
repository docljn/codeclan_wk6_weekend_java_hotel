import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Bedroom singleRoom;
    private ArrayList<Bedroom> bedRooms;
    private Bedroom doubleRoom;
    private ArrayList<DiningRoom> diningRooms;
    private DiningRoom diningRoom;
    private FunctionRoom functionRoom;
    private ArrayList<FunctionRoom> functionRooms;

    @Before
    public void before(){
        singleRoom = new Bedroom("Single", true, true, 49.50, BedroomType.SINGLE);
        doubleRoom = new Bedroom ("Double", false, true, 99.00, BedroomType.DOUBLE);
        bedRooms = new ArrayList<>();
        bedRooms.add(singleRoom);
        diningRoom = new DiningRoom("Dining Room", true, false, 400, 50, 10);
        diningRooms = new ArrayList<>();
        diningRooms.add(diningRoom);
        functionRoom = new FunctionRoom("Function Room", true, true, 400, 100);
        functionRooms = new ArrayList<>();
        functionRooms.add(functionRoom);
        hotel = new Hotel("CodeClan Towers", bedRooms, diningRooms, functionRooms);
    }

    @Test
    public void canReturnName(){
        assertEquals("CodeClan Towers", hotel.getName());
    }

    @Test
    public void canReturnBedrooms(){
        assertEquals(bedRooms, hotel.getBedrooms());
    }

    @Test
    public void canReturnDiningRooms(){
        assertEquals(diningRooms, hotel.getDiningRooms());
    }

    @Test
    public void canReturnFunctionRooms(){
        assertEquals(functionRooms, hotel.getFunctionRooms());
    }

    @Test
    public void startsWithNoBookings(){
        assertEquals(0, hotel.getBookings().size());
    }


    @Test
    public void canSetName(){
        hotel.setName("CodeBase Towers");
        assertEquals("CodeBase Towers", hotel.getName());
    }

    @Test
    public void canAddBedroom(){
        hotel.addBedroom(doubleRoom);
        assertEquals(2, hotel.getBedrooms().size());
    }

    @Test
    public void canAddDiningRoom(){
        hotel.addDiningRoom(diningRoom);
        assertEquals(2, hotel.getDiningRooms().size());
    }

    @Test
    public void canAddFunctionRoom(){
        hotel.addFunctionRoom(functionRoom);
        assertEquals(2, hotel.getFunctionRooms().size());
    }

    @Test
    public void canGetMaxBeds(){
        hotel.addBedroom(doubleRoom);
        assertEquals(3, hotel.getBedCount());
    }


    @Ignore("not ready yet") @Test
    public void canCreateNewBooking(){
        assertEquals(1, 1);
    }

    @Ignore("not ready yet") @Test
    public void canCancelBooking(){
        assertEquals(1, 1);
    }

    @Ignore("not ready yet") @Test
    public void canAmendBooking(){
        assertEquals(1, 1);
    }


    @Ignore("not ready yet") @Test
    public void canGetOccupiedRooms(){
        assertEquals(1, 1);

    }

    @Ignore("not ready yet") @Test
    public void canGetVacantRooms(){
        assertEquals(1, 1);

    }

    @Ignore("not ready yet") @Test
    public void newBookingRequiresVacantRoom(){
        assertEquals(1, 1);

    }



    @Ignore("not ready yet") @Test
    public void canCheckInGuests(){
        assertEquals(1, 1);
    }

    @Ignore("not ready yet") @Test
    public void canCheckOutGuests(){
        assertEquals(1, 1);
    }

}