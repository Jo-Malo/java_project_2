package film_memorabilia;

import behaviours.ICollect;
import enums.ItemType;

public class Lucas extends StarWarsItem implements ICollect {

    public Lucas(String film, String itemDescription, int buyPrice, int shipping, int marketValue) {
        super(film, ItemType.SIGNATURE, itemDescription, buyPrice, shipping, marketValue);
    }
}
