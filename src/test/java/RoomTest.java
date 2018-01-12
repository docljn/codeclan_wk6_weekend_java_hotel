import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;

    @Before
    public void before(){
        room = new Room("One", 1, true, true);
    }

    @Test
    public void canGetName(){
        assertEquals("One", room.getName());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(1, room.getCapacity());
    }

    @Test
    public void canGetChargeableStatus(){
        assertEquals(true, room.getChargeable());
    }

    @Test
    public void canGetAccessibleStatus(){
        assertEquals(true, room.getAccessible());
    }


}
