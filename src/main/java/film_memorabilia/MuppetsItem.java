package film_memorabilia;

import enums.ItemType;

public class MuppetsItem extends Item {
    private ItemType type;

    public MuppetsItem(ItemType type, String itemDescription, int buyPrice, int shipping, int marketValue) {
        super(itemDescription, buyPrice, shipping, marketValue);
        this.type = type;
    }

    public ItemType getType() {
        return this.type;
    }
}
