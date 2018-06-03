package film_memorabilia;

import enums.ItemType;
import java.util.ArrayList;
import java.util.Date;

public class MuppetsItem extends Item {
    private ItemType type;
    private ArrayList<Integer> muppets;

    public MuppetsItem(ItemType type, String itemDescription, int buyPrice, int shipping, int marketValue, Date date) {
        super(itemDescription, buyPrice, shipping, marketValue, date);
        this.type = type;
        this.muppets = muppets;
    }

    public ItemType getType() {
        return this.type;
    }

}
