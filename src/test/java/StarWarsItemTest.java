import enums.ItemType;
import film_memorabilia.StarWarsItem;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StarWarsItemTest {

    StarWarsItem starWarsCostume;

    @Before
    public void before() {
        starWarsCostume = new StarWarsItem("A New Hope", ItemType.COSTUME, "Stormtrooper helmet",1000, 20, 50000);
    }

    @Test
    public void starWarsCostumeHasFilm() {
        assertEquals("A New Hope", starWarsCostume.getFilm());
    }

    @Test
    public void starWarsCostumeHasType() {
        assertEquals(ItemType.COSTUME, starWarsCostume.getType());
    }

    @Test
    public void starWarsCostumeHasDescription() {
        assertEquals("Stormtrooper helmet", starWarsCostume.getDescription());
    }

    @Test
    public void starWarsCostumeHasBuyPrice() {
        assertEquals(1000.00, starWarsCostume.getBuyPrice(), 0.01);
    }

    @Test
    public void starWarsCostumeHasShippingCost() {
        assertEquals(20.00, starWarsCostume.getShipping(), 0.01);
    }

    @Test
    public void starWarsCostumeHasMarketValue() {
        assertEquals(50000.00, starWarsCostume.getMarketValue(), 0.01);
    }

}

