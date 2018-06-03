import film_memorabilia.Beaker;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class BeakerTest {

    Beaker puppetPrototype;
    Date date;

    @Before
    public void before() {
        puppetPrototype = new Beaker("The Muppets (2011)", 90, 40, 110, date);
    }

    @Test
    public void canGetMarkUp() {
        assertEquals(20, puppetPrototype.calculateMarkup());
    }
}
