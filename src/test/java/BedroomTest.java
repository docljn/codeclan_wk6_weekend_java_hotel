import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    private Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom("Two", true, true, BedroomType.DOUBLE, 99.00);
    }

    @Test
    public void canGetType(){
        assertEquals(BedroomType.DOUBLE ,bedroom.getBedroomType());
    }

    @Test
    public void canGetMaxCapacity(){
        bedroom.getMaxCapacity();
        assertEquals(2, bedroom.getMaxCapacity());
    }

    @Test
    public void canGetPrice(){
        assertEquals(99.00, bedroom.getPrice(), 0.001);
    }

    @Test
    public void canSetPrice(){
        bedroom.setPrice(89.00);
        assertEquals(89.00, bedroom.getPrice(), 0.001);
    }


}
