package film_memorabilia;

import behaviours.ICollect;
import enums.ItemType;

import java.util.Date;

public class Beaker extends MuppetsItem implements ICollect {

    public Beaker(String itemDescription, int buyPrice, int shipping, int marketValue, Date date) {
        super(ItemType.PUPPET, itemDescription, buyPrice, shipping, marketValue, date);
    }
    
    public int totalSpendOnItem() {
        return this.buyPrice + this.shipping;
    }

    public int calculateMarkup(int totalSpendOnItem) {
        return this.marketValue - totalSpendOnItem;
    }
}
