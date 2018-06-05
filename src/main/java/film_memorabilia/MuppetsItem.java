package film_memorabilia;

import com.sun.org.apache.xpath.internal.operations.Bool;
import enums.ItemType;
import java.util.ArrayList;
import java.util.Date;

public class MuppetsItem extends Item {
    private ItemType type;
    private ArrayList<Integer> muppets;

    public MuppetsItem(ItemType type, String itemDescription, int buyPrice, int shipping, int marketValue, String purchaseDate) {
        super(itemDescription, buyPrice, shipping, marketValue, purchaseDate);
        this.type = type;
        this.muppets = muppets;
    }

    public ItemType getType() {
        return this.type;
    }

}
