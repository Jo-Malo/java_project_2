import enums.ItemType;
import film_memorabilia.MuppetsItem;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MuppetsItemTest {

    MuppetsItem muppetsItemPuppet;

    @Before
    public void before() {
        muppetsItemPuppet = new MuppetsItem(ItemType.PUPPET, "Animal", 200, 30,300);
    }

    @Test
    public void muppetsItemHasType() {
        assertEquals(ItemType.PUPPET, muppetsItemPuppet.getType());
    }

    @Test
    public void starWarsCostumeHasDescription() {
        assertEquals("Animal", muppetsItemPuppet.getDescription());
    }

    @Test
    public void starWarsCostumeHasBuyPrice() {
        assertEquals(200.00, muppetsItemPuppet.getBuyPrice(), 0.01);
    }

    @Test
    public void starWarsCostumeHasShippingCost() {
        assertEquals(30.00, muppetsItemPuppet.getShipping(), 0.01);
    }

    @Test
    public void starWarsCostumeHasMarketValue() {
        assertEquals(300.00, muppetsItemPuppet.getMarketValue(), 0.01);
    }

    @Test
    public void canSetMarketValue() {
        muppetsItemPuppet.setMarketValue(300);
        assertEquals(300, muppetsItemPuppet.getMarketValue());
    }
}
