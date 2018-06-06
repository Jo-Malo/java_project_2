import enums.Edition;
import enums.ItemType;
import film_memorabilia.MuppetsItem;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MuppetsItemTest {

    MuppetsItem muppetsPuppet;
    MuppetsItem muppetsPuppet1;


    @Before
    public void before() {
        muppetsPuppet = new MuppetsItem(ItemType.PUPPET, Edition.REPLICA, "Animal", 200, 30,300, "22/12/2015");
        muppetsPuppet1 = new MuppetsItem(ItemType.POSTER, Edition.ORIGINAL,"Gonzo", 60, 5, 70, "10/2/2018");
    }

    @Test
    public void muppetsItemHasType() {
        assertEquals(ItemType.PUPPET, muppetsPuppet.getType());
    }

    @Test
    public void muppetsItemHasEdition() {
        assertEquals(Edition.REPLICA, muppetsPuppet.getEdition());
    }

    @Test
    public void starWarsCostumeHasDescription() {
        assertEquals("Animal", muppetsPuppet.getDescription());
    }

    @Test
    public void starWarsCostumeHasBuyPrice() {
        assertEquals(200.00, muppetsPuppet.getBuyPrice(), 0.01);
    }

    @Test
    public void starWarsCostumeHasShippingCost() {
        assertEquals(30.00, muppetsPuppet.getShipping(), 0.01);
    }

    @Test
    public void starWarsCostumeHasMarketValue() {
        assertEquals(300.00, muppetsPuppet.getMarketValue(), 0.01);
    }

    @Test
    public void canSetMarketValue() {
        muppetsPuppet.setMarketValue(300);
        assertEquals(300, muppetsPuppet.getMarketValue());
    }
}
