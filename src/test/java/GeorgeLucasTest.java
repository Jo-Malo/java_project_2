import enums.Edition;
import enums.ItemType;
import film_memorabilia.GeorgeLucas;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class GeorgeLucasTest {

    GeorgeLucas georgeLucasClapperboard;

    @Before
    public void before() {
        georgeLucasClapperboard = new GeorgeLucas("The Empire Strikes Back", ItemType.SIGNATURE, Edition.ORIGINAL,"From scenes on planet Hoth.", 300, 25, 400, "5/11/2017");
        }

    @Test
    public void canGetClapperboardType() {
        assertEquals(ItemType.SIGNATURE, georgeLucasClapperboard.getType());
    }

    @Test
    public void canGetBuyPriceAndShipping() {
        assertEquals(325, georgeLucasClapperboard.totalSpendOnItem());
    }

    @Test
    public void canGetMarkUp() {
        assertEquals(75, georgeLucasClapperboard.calculateMarkup(325));
    }
}
