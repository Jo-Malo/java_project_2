package film_memorabilia;

import enums.ItemType;

public class StarWarsItem extends Item{
    private String film;
    private ItemType type;

    public StarWarsItem(String film, ItemType type, String itemDescription, double buyPrice, double shipping, double marketValue) {
        super(itemDescription, buyPrice, shipping, marketValue);
            this.film = film;
            this.type = type;
        }

    public String getFilm() {
            return this.film;
        }

    public ItemType getType() {
        return this.type;
    }
}
