import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    private Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom("One", 1, true, true, BedroomType.SINGLE);
    }

    @Test
    public void canGetType(){
        assertEquals(BedroomType.SINGLE ,bedroom.getBedroomType());
    }


}
