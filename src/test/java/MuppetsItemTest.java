import enums.ItemType;
import film_memorabilia.MuppetsItem;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MuppetsItemTest {

    MuppetsItem muppetsItemPuppet;

    @Before
    public void before() {
        muppetsItemPuppet = new MuppetsItem(ItemType.PUPPET, "Animal", 200.00, 30.00,300.00);
    }

    @Test
    public void muppetsItemHasType() {
        assertEquals(ItemType.PUPPET, muppetsItemPuppet.getType());
    }
}
