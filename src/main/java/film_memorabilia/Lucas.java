package film_memorabilia;

import enums.ItemType;

public class Lucas extends StarWarsItem {

    public Lucas(String film, String itemDescription, int buyPrice, int shipping, int marketValue) {
        super(film, ItemType.SIGNATURE, itemDescription, buyPrice, shipping, marketValue);
    }
}
