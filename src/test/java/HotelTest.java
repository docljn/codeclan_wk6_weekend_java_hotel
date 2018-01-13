import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Bedroom singleRoom;
    private ArrayList<Bedroom> bedRooms;
    private ArrayList<DiningRoom> diningRooms;
    private DiningRoom diningRoom;
    private FunctionRoom functionRoom;
    private ArrayList<FunctionRoom> functionRooms;

    @Before
    public void before(){
        singleRoom = new Bedroom("Single", true, true, 49.50, BedroomType.SINGLE);
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





}
