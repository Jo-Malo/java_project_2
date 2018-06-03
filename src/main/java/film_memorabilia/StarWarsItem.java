package film_memorabilia;

import enums.ItemType;

import java.util.ArrayList;
import java.util.Date;


public class StarWarsItem extends Item{
    private String film;
    private ItemType type;

    private ArrayList<StarWarsItem> starWarsItems;

    public StarWarsItem(String film, ItemType type, String itemDescription, int buyPrice, int shipping, int marketValue, Date date) {
        super(itemDescription, buyPrice, shipping, marketValue, date);
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


}
