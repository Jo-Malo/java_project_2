package film_memorabilia;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Item {
    protected String itemDescription;
    protected double buyPrice;
    protected double shipping;
    protected double marketValue;

    public Item(String itemDescription, double buyPrice, double shipping, double marketValue) {
        this.itemDescription = itemDescription;
        this.buyPrice = buyPrice;
        this.shipping = shipping;
        this.marketValue = marketValue;
    }

    public String getDescription() {
        return this.itemDescription;
    }

    public double getBuyPrice() {
        return this.buyPrice;
    }

    public double getShipping() {
        return this.shipping;
    }

    public double getMarketValue() {
        return this.marketValue;
    }

}
