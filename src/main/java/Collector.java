import behaviours.ICollect;
import film_memorabilia.MuppetsItem;
import film_memorabilia.StarWarsItem;

import java.util.ArrayList;

public class Collector {
    private String name;
    private ArrayList<ICollect> collection;

//ITEMS BY CATEGORY
    private ArrayList<StarWarsItem> starWarsItems;
    private ArrayList<MuppetsItem> muppetsItems;

    public Collector(String name) {
        this.name = name;
        this.collection = new ArrayList<ICollect>();

//ITEMS BY CATEGORY
        starWarsItems = new ArrayList<StarWarsItem>();
        muppetsItems = new ArrayList<MuppetsItem>();
//        this.starWarsItems = starWarsItems;
    }

//    METHODS

    public String getName() {
        return this.name;
    }

    public int getCollectionSize() {
        return this.collection.size();
    }

    public void addToCollection(ICollect item) {
        this.collection.add(item);
    }

    public void removeFromCollection(ICollect item) {
        this.collection.remove(item);
    }

//    public int totalValueOfCollection() {
//        int totalValue = 0;
//        for (ICollect item : this.collection) {
//            totalValue += item.calculateTotal();
//        }
//        return totalValue;
//    }

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

//    public static Double totalValueOfStarWarsItems(ArrayList<StarWarsItem> starWarsItems) {
//        int sum = 0;
//        for (StarWarsItem i : starWarsItems) {
//            sum += i;
//        }
//        return sum;
//    }

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
}
