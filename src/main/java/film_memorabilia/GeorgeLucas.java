package film_memorabilia;

import behaviours.ICollect;
import enums.Edition;
import enums.ItemType;
import film_memorabilia.filmTitleParents.StarWarsItem;


public class GeorgeLucas extends StarWarsItem implements ICollect {

    public GeorgeLucas(String film, String itemDescription, int buyPrice, int shipping, int marketValue, String purchaseDate) {
        super(film, ItemType.SIGNATURE, Edition.ORIGINAL, itemDescription, buyPrice, shipping, marketValue, purchaseDate);
    }

    public int totalSpendOnItem() {
        return this.buyPrice + this.shipping;
    }

    public int calculateMarkup(int totalSpendOnItem) {
        return this.marketValue - totalSpendOnItem;
    }
}
