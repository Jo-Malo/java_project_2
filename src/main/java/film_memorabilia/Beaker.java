package film_memorabilia;

import behaviours.ICollect;
import enums.ItemType;

import java.util.Date;

public class Beaker extends MuppetsItem implements ICollect {

    public Beaker(String itemDescription, int buyPrice, int shipping, int marketValue, Date date) {
        super(ItemType.PUPPET, itemDescription, buyPrice, shipping, marketValue, date);
    }

    // write test for this
    public int totalSpendOnItem() {
        return this.buyPrice + this.shipping;
    }

    // edit this using method above
    public int calculateMarkup() {
        return this.marketValue - this.buyPrice;
    }
}
