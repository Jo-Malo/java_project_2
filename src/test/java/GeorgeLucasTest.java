import film_memorabilia.GeorgeLucas;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class GeorgeLucasTest {

    GeorgeLucas georgeLucasClapperboard;
    Date date;

    @Before
    public void before() {
        georgeLucasClapperboard = new GeorgeLucas("The Empire Strikes Back", "From scenes on planet Hoth.", 300, 25, 400, date);
        }

    @Test
    public void canGetMarkUp() {
        assertEquals(75, georgeLucasClapperboard.calculateMarkup(325));
    }
}
