package film_memorabilia;

import enums.Edition;
import enums.ItemType;

public class MuppetsItem extends Item {
    private ItemType type;
    private Edition edition;

    public MuppetsItem(ItemType type, Edition edition, String itemDescription, int buyPrice, int shipping, int marketValue, String purchaseDate) {
        super(itemDescription, buyPrice, shipping, marketValue, purchaseDate);
        this.type = type;
        this.edition = edition;
    }

    public ItemType getType() {
        return this.type;
    }

    public Edition getEdition() {
        return this.edition;
    }
}
