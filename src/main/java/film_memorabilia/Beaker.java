package film_memorabilia;

import behaviours.ICollect;
import enums.ItemType;


public class Beaker extends MuppetsItem implements ICollect {

    public Beaker(String itemDescription, int buyPrice, int shipping, int marketValue, String purchaseDate) {
        super(ItemType.PUPPET, itemDescription, buyPrice, shipping, marketValue, purchaseDate);
    }

    public int totalSpendOnItem() {
        return this.buyPrice + this.shipping;
    }

    public int calculateMarkup(int totalSpendOnItem) {
        return this.marketValue - totalSpendOnItem;
    }
}
