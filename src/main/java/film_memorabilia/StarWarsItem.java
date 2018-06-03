package film_memorabilia;

import enums.ItemType;

import java.util.ArrayList;


public class StarWarsItem extends Item{
    private String film;
    private ItemType type;

    private ArrayList<StarWarsItem> starWarsItems;

    public StarWarsItem(String film, ItemType type, String itemDescription, int buyPrice, int shipping, int marketValue) {
        super(itemDescription, buyPrice, shipping, marketValue);
            this.film = film;
            this.type = type;

            starWarsItems = new ArrayList<StarWarsItem>();
        }

    public String getFilm() {
            return this.film;
        }

    public ItemType getType() {
        return this.type;
    }

    public int getBuyPrice() {
        return this.buyPrice;
    }

    public void setMarketValue(int marketValue) {
        this.marketValue = marketValue;
    }

    public int calculateTotal() {
        return 0;
    }


}
