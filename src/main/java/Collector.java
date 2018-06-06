import behaviours.ICollect;
import enums.ItemType;
import film_memorabilia.DateBoughtComparator;
import film_memorabilia.Item;
import film_memorabilia.filmTitleParents.MuppetsItem;
import film_memorabilia.filmTitleParents.StarWarsItem;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Collector{
    private String name;
    private ArrayList<ICollect> collection;

    private ArrayList<StarWarsItem> starWarsItems;
    private ArrayList<MuppetsItem> muppetsItems;
    private ArrayList<Item> forSale;
    protected ArrayList<Item> itemsBetweenDates;


    public Collector(String name) {
        this.name = name;
        this.collection = new ArrayList<ICollect>();

        starWarsItems = new ArrayList<StarWarsItem>();
        muppetsItems = new ArrayList<MuppetsItem>();
        this.forSale = new ArrayList<Item>();
        this.itemsBetweenDates = new ArrayList<Item>();
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

    public int totalValueOfCollection(int totalValueOfMuppets, int totalValueOfStarWars) {
        int sum = totalValueOfMuppets + totalValueOfStarWars;
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

    public int totalValueOfStarWars() {
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

    public int totalValueOfMuppets() {
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

    //TO CHECK DATES

    public String getToday() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(date);
    }

    public void addItemToDatesArray(Item item) {
        itemsBetweenDates.add(item);
    }

    public int countItems() {
        return itemsBetweenDates.size();
    }

    public ArrayList<Item> getMuppetsBoughtBetweenDates(String stringDate1, String stringDate2) {
        Date date1 = DateBoughtComparator.getFromString(stringDate1);
        Date date2 = DateBoughtComparator.getFromString(stringDate2);


        for (Item item : this.muppetsItems) {
            if (item.getDate().after(date1) && item.getDate().before(date2)) {
                this.itemsBetweenDates.add(item);
            }
        }
        return this.itemsBetweenDates;
    }

    //ENUM POSTER

    public String getPosters() {
        return ItemType.POSTER.toString();
    }

}
