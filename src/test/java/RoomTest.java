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


    @Test
    public void canSetName(){
        room.setName("Number One");
        assertEquals("Number One", room.getName());
    }

    @Test
    public void canSetCapacity(){
        room.setCapacity(2);
        assertEquals(2, room.getCapacity());
    }

    @Test
    public void canSetChargeableStatus(){
        room.setChargeable(false);
        assertEquals(true, room.getChargeable());
    }

    @Test
    public void canSetAccessibleStatus(){
        room.setAccessible(false);
        assertEquals(true, room.getAccessible());
    }


}