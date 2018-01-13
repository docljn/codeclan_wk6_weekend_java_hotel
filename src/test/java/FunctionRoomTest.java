import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FunctionRoomTest {

    FunctionRoom functionRoom;

    @Before
    public void before(){
        functionRoom = new FunctionRoom("Large",  true, true, 100, FunctionRoomSetup.THEATER, 400);
    }

    @Test
    public void hasType(){
        assertEquals(FunctionRoomSetup.THEATER, functionRoom.getSetup());
    }

    @Test
    public void canSetType(){
        functionRoom.setType(FunctionRoomSetup.BOARDROOM);
        assertEquals(FunctionRoomSetup.BOARDROOM, functionRoom.getSetup());
    }

    @Test
    public void capacityChangedByType(){
        functionRoom.setType(FunctionRoomSetup.BOARDROOM);
        assertEquals(30, functionRoom.getCapacity());
    }

    @Test
    public void canGetPrice(){
        assertEquals(400.00, functionRoom.getPrice(), 0.001);
    }

    @Test
    public void canSetPrice(){
        functionRoom.setPrice(89.00);
        assertEquals(89.00, functionRoom.getPrice(), 0.001);
    }

}
