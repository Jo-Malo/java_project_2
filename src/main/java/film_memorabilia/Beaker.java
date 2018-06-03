package film_memorabilia;

import behaviours.ICollect;
import enums.ItemType;

public class Beaker extends MuppetsItem implements ICollect {

    public Beaker(String itemDescription, int buyPrice, int shipping, int marketValue) {
        super(ItemType.PUPPET, itemDescription, buyPrice, shipping, marketValue);
    }

}
