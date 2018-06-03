package film_memorabilia;


public abstract class Item{
    protected String itemDescription;
    protected int buyPrice;
    protected int shipping;
    protected int marketValue;


    public Item(String itemDescription, int buyPrice, int shipping, int marketValue) {
        this.itemDescription = itemDescription;
        this.buyPrice = buyPrice;
        this.shipping = shipping;
        this.marketValue = marketValue;
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
}
