package film_memorabilia;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Item {
    protected int buyPrice;
    protected int shipping;
    protected int marketValue;

    public Item(int buyPrice, int shipping, int marketValue) {
        this.buyPrice = buyPrice;
        this.shipping = shipping;
        this.marketValue = marketValue;
    }

    public int getBuyPrice() {
        return this.buyPrice;
    }

    public int getShipping() {
        return this.shipping;
    }

    public int getMarketValue() {
        return this.marketValue;
    }

}
