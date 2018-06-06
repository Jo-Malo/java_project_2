package film_memorabilia;

import enums.Edition;
import enums.ItemType;
import java.util.ArrayList;

public class MuppetsItem extends Item {
    private ItemType type;
    private Edition edition;
    private ArrayList<Integer> muppets;

    public MuppetsItem(ItemType type, Edition edition, String itemDescription, int buyPrice, int shipping, int marketValue, String purchaseDate) {
        super(itemDescription, buyPrice, shipping, marketValue, purchaseDate);
        this.type = type;
        this.edition = edition;
        this.muppets = muppets;
    }

    public ItemType getType() {
        return this.type;
    }

    public Edition getEdition() {
        return this.edition;
    }
}
