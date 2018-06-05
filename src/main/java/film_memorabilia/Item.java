package film_memorabilia;

import java.util.Date;

public abstract class Item{
    protected String itemDescription;
    protected int buyPrice;
    protected int shipping;
    public int marketValue;
    protected Date date;
    protected String purchaseDate;
    protected Boolean favourite;


    public Item(String itemDescription, int buyPrice, int shipping, int marketValue, String purchaseDate) {
        this.itemDescription = itemDescription;
        this.buyPrice = buyPrice;
        this.shipping = shipping;
        this.marketValue = marketValue;
        this.purchaseDate = purchaseDate;
        this.favourite = favourite;
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

    public String getPurchaseDate() {
        return this.purchaseDate;
    }

    public String setPurchaseDate(String date) {
        this.purchaseDate = date;
        return date.toString();
    }

    public String getPurchaseDay() {
        String day = purchaseDate.split("/")[0];
        return day;
    }

    public int getIntDay(String day) {
        return Integer.parseInt(day);
    }

    public String getPurchaseMonth() {
        String month = purchaseDate.split("/")[1];
        return month;
    }

    public int getIntMonth(String month) {
        return Integer.parseInt(month);
    }

    public String getPurchaseYear() {
        String year = purchaseDate.split("/")[2];
        return year;
    }

    public int getIntYear(String year) {
        return Integer.parseInt(year);
    }

    public void compareYear(int getIntYear, int date) {
        if (getIntYear < date) {
            this.marketValue++;
        }
    }

}
