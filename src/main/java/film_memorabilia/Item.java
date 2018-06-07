package film_memorabilia;

import enums.Edition;
import enums.ItemType;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public abstract class Item{
    private ItemType type;
    private Edition edition;
    protected String itemDescription;
    protected int buyPrice;
    protected int shipping;
    public int marketValue;
    protected Date date;


    public Item(ItemType type, Edition edition, String itemDescription, int buyPrice, int shipping, int marketValue, String dateToConvert) {
        this.type = type;
        this.edition = edition;
        this.itemDescription = itemDescription;
        this.buyPrice = buyPrice;
        this.shipping = shipping;
        this.marketValue = marketValue;
        try {
            this.date = new SimpleDateFormat("dd/MM/yyyy", Locale.UK).parse(dateToConvert);
        } catch (ParseException e) {
            e.printStackTrace();
        }
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

    public Date getDate() {
        return date;
    }
}
