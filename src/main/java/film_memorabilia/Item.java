package film_memorabilia;

import java.util.Date;

public abstract class Item{
    protected String itemDescription;
    protected int buyPrice;
    protected int shipping;
    protected int marketValue;
    protected Date date;


    public Item(String itemDescription, int buyPrice, int shipping, int marketValue, Date date) {
        this.itemDescription = itemDescription;
        this.buyPrice = buyPrice;
        this.shipping = shipping;
        this.marketValue = marketValue;
        this.date = date;
    }

    public String getDescription() {
        return this.itemDescription;
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

    public int setMarketValue(int marketValue) {
        return this.marketValue = marketValue;
    }

    public Date getDateBought() {
        return date;
    }
}
