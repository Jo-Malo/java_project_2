import behaviours.ICollect;
import film_memorabilia.Item;
import film_memorabilia.MuppetsItem;
import film_memorabilia.StarWarsItem;

import java.util.ArrayList;

public class Collector{
    private String name;
    private ArrayList<ICollect> collection;

    private ArrayList<StarWarsItem> starWarsItems;
    private ArrayList<MuppetsItem> muppetsItems;
    private ArrayList<Item> forSale;


    public Collector(String name) {
        this.name = name;
        this.collection = new ArrayList<ICollect>();

        starWarsItems = new ArrayList<StarWarsItem>();
        muppetsItems = new ArrayList<MuppetsItem>();
        this.forSale = new ArrayList<Item>();
    }

//    METHODS

    public String getName() {
        return this.name;
    }

    public ArrayList<ICollect> collection() {
        return collection;
    }

    public int getTotalCollectionSize() {
        return this.collection.size();
    }

    public void addToCollection(ICollect item) {
        this.collection.add(item);
    }

    public void removeFromCollection(ICollect item) {
        this.collection.remove(item);
    }

    public int totalValueOfCollection(int calculateTotalValueOfMuppetsCollection, int calculateTotalValueOfStarWarsCollection) {
        int sum = calculateTotalValueOfMuppetsCollection + calculateTotalValueOfStarWarsCollection;
        return sum;
    }

//    STARWARS ITEMS //

    public ArrayList<StarWarsItem> getAllStarWarsItems() {
        return starWarsItems;
    }

    public int StarWarsItemCount() {
        return starWarsItems.size();
    }

    public void addToStarWarsCollection(StarWarsItem starWarsItem) {
        starWarsItems.add(starWarsItem);
    }

    public void removeFromStarWarsCollection(StarWarsItem starWarsItem) {
        starWarsItems.remove(starWarsItem);
    }

    public int calculateTotalValueOfStarWarsItems() {
        int sum = 0;
        for (StarWarsItem starWarsItem: starWarsItems) {
            sum += starWarsItem.getBuyPrice();
        }
        return sum;
    }

//    MUPPETS ITEMS //


    public ArrayList<MuppetsItem> getMuppetsItems() {
        return muppetsItems;
    }

    public int muppetsItemCount() {
        return muppetsItems.size();
    }

    public void addToMuppetsCollection(MuppetsItem muppetsItem) {
        muppetsItems.add(muppetsItem);
    }

    public void removeFromMuppetsCollection(MuppetsItem muppetsItem) {
        muppetsItems.remove(muppetsItem);
    }

    public int calculateTotalValueOfMuppetsItems() {
        int sum = 0;
        for (MuppetsItem muppetsItem: muppetsItems) {
            sum += muppetsItem.getBuyPrice();
        }
        return sum;
    }

//    FAVOURITE ITEMS

    public ArrayList<Item> forSale() {
        return new ArrayList<>(forSale);
    }

    public int countForSale() {
        return forSale.size();
    }

    public boolean isFavourite(Item item) {
        return item.marketValue > 100;
    }

    public void addToForSale(Item item) {
        if (!isFavourite(item)) {
            this.forSale.add(item);
        }
    }

    public void soldItem() {
        this.forSale.clear();
    }

}
