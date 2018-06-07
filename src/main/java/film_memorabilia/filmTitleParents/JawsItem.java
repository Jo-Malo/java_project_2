package film_memorabilia.filmTitleParents;

import enums.Edition;
import enums.ItemType;
import film_memorabilia.Item;

import java.util.ArrayList;

public class JawsItem extends Item {
    private String film;
    private ItemType type;
    private Edition edition;

    private ArrayList<StarWarsItem> starWarsItems;

    public JawsItem(String film, ItemType type, Edition edition, String itemDescription, int buyPrice, int shipping, int marketValue, String purchaseDate) {
        super(type, edition, itemDescription, buyPrice, shipping, marketValue, purchaseDate);
        this.film = film;
        this.type = type;
        this.edition = edition;

        starWarsItems = new ArrayList<StarWarsItem>();
    }

    public String getFilm() {
        return this.film;
    }

    public ItemType getType() {
        return this.type;
    }

    public Edition getEdition() {
        return this.edition;
    }
}
