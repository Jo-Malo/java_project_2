import behaviours.ICollect;
import film_memorabilia.MuppetsItem;
import film_memorabilia.StarWarsItem;

import java.util.ArrayList;

public class Collector{
    private String name;
    private ArrayList<ICollect> collection;

    private ArrayList<StarWarsItem> starWarsItems;
    private ArrayList<MuppetsItem> muppetsItems;

    public Collector(String name) {
        this.name = name;
        this.collection = new ArrayList<ICollect>();

        starWarsItems = new ArrayList<StarWarsItem>();
        muppetsItems = new ArrayList<MuppetsItem>();
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

    public int MuppetsItemCount() {
        return muppetsItems.size();
    }

    public void addToMuppetsCollection(MuppetsItem muppetsItem) {
        muppetsItems.add(muppetsItem);
    }

    public int calculateTotalValueOfMuppetsItems() {
        int sum = 0;
        for (MuppetsItem muppetsItem: muppetsItems) {
            sum += muppetsItem.getBuyPrice();
        }
        return sum;
    }

}
