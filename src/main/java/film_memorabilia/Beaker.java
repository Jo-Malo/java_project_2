package film_memorabilia;

import enums.ItemType;

public class Beaker extends MuppetsItem{

    public Beaker(String itemDescription, int buyPrice, int shipping, int marketValue) {
        super(ItemType.PUPPET, itemDescription, buyPrice, shipping, marketValue);
    }

}
