package film_memorabilia;

import enums.ItemType;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MuppetsItem extends Item {
    private ItemType type;
    private ArrayList<Integer> muppets;

    public MuppetsItem(ItemType type, String itemDescription, int buyPrice, int shipping, int marketValue) {
        super(itemDescription, buyPrice, shipping, marketValue);
        this.type = type;
        this.muppets = muppets;
    }

    public ItemType getType() {
        return this.type;
    }

    @Override
    public int calculateTotal() {
        return 0;
//        int total = 0;
//        for (double muppet : this.muppets){
//            total += muppet;
//        }
//        return total;
    }
}
