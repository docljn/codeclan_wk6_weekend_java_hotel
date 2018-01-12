import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void before(){
        guest = new Guest("John", false);
    }

    @Test
    public void canGetName(){
        assertEquals("John", guest.getName());
    }

    @Test
    public void canGetDataProtectionStatus(){
        assertEquals(false, guest.getDataPermission());
    }




}
