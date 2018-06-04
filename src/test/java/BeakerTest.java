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
        puppetPrototype = new Beaker("The Muppets (2011)", 90, 10, 110, date);
    }

    @Test
    public void canGetBuyPriceAndShipping() {
        assertEquals(100, puppetPrototype.totalSpendOnItem());
    }

    @Test
    public void canGetMarkUp() {
        assertEquals(10, puppetPrototype.calculateMarkup(100));
    }
}