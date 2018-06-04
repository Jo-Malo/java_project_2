package film_memorabilia;

import behaviours.ICollect;
import enums.ItemType;

import java.util.Date;

public class GeorgeLucas extends StarWarsItem implements ICollect {

    public GeorgeLucas(String film, String itemDescription, int buyPrice, int shipping, int marketValue, Date date) {
        super(film, ItemType.SIGNATURE, itemDescription, buyPrice, shipping, marketValue, date);
    }

    // write test for this
    public int totalSpendOnItem() {
        return this.buyPrice + this.shipping;
    }

    public int calculateMarkup(int totalSpendOnItem) {
        return this.marketValue - totalSpendOnItem;
    }
}
