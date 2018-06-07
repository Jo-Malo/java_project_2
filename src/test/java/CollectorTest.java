import enums.Edition;
import enums.ItemType;
import film_memorabilia.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CollectorTest {
    Collector collector;
    GeorgeLucas georgeLucas;
    Beaker beaker;

    @Before
    public void before() {
        collector = new Collector("Finn - DON'T LEAVE US!");
        beaker = new Beaker(ItemType.POSTER, Edition.NOVELTY, "Red, fluffy and gormless looking", 250, 50, 300, "05/06/2018");
        georgeLucas = new GeorgeLucas("The Empire Strikes Back", ItemType.SIGNATURE, Edition.ORIGINAL, "genuine autograph from 2015", 100, 25, 99, "10/05/2018");
    }

    @Test
    public void hasName() {
        assertEquals("Finn - DON'T LEAVE US!", collector.getName());
    }

    @Test
    public void collectionStartsEmpty() {
        assertEquals(0, collector.getTotalCollectionSize());
    }

    @Test
    public void canAddItemToCollection() {
        collector.addToCollection(beaker);
        assertEquals(1, collector.getTotalCollectionSize());
    }

    @Test
    public void canAddLucasAndBeakerToCollection() {
        collector.addToCollection(georgeLucas);
        collector.addToCollection(beaker);
        assertEquals(2, collector.getTotalCollectionSize());
    }

    @Test
    public void canRemoveItemFromCollection() {
        collector.addToCollection(beaker);
        collector.removeFromCollection(beaker);
        assertEquals(0, collector.getTotalCollectionSize());
    }

    @Test
    public void canGetValueOfTotalCollection() {
        collector.addToCollection(beaker);
        collector.addToCollection(georgeLucas);
        assertEquals(350, collector.totalValueOfCollection(250, 100));
    }

//    STARWARS COLLECTION TESTS//

    @Test
    public void starWarsCollectionCountStartAtZero() {
        assertEquals(0, collector.StarWarsItemCount());
    }

    @Test
    public void canAddToStarWarsCollection() {
        collector.addToStarWarsCollection(georgeLucas);
        collector.getAllStarWarsItems();
        assertEquals(1, collector.StarWarsItemCount());
    }

    @Test
    public void canRemoveFromStarWarsCollection() {
        collector.addToStarWarsCollection(georgeLucas);
        collector.removeFromStarWarsCollection(georgeLucas);
        assertEquals(0, collector.StarWarsItemCount());
    }

    @Test
    public void canGetTotalValueOfStarWars() {
        collector.addToStarWarsCollection(georgeLucas);
        assertEquals(100, collector.totalValueOfStarWars());
    }

//    MUPPETS COLLECTION TESTS//

    @Test
    public void muppetsItemCountStartAtZero() {
        assertEquals(0, collector.muppetsItemCount());
    }

    @Test
    public void canAddToMuppetsCollection() {
        collector.addToMuppetsCollection(beaker);
        collector.getMuppetsItems();
        assertEquals(1, collector.muppetsItemCount());
    }

    @Test
    public void canRemoveFromMuppetsCollection() {
        collector.addToMuppetsCollection(beaker);
        collector.removeFromMuppetsCollection(beaker);
        assertEquals(0, collector.muppetsItemCount());
    }

    @Test
    public void canGetTotalValueOfMuppets() {
        collector.addToMuppetsCollection(beaker);
        collector.addToMuppetsCollection(beaker);
        assertEquals(500, collector.totalValueOfMuppets());
    }

    //FAVOURITE ITEM TESTS

    @Test
    public void canCheckForSaleListSize() {
        assertEquals(0, collector.countForSale());
    }

    @Test
    public void canGetMarketValue() {
        assertEquals(300, beaker.getMarketValue());
    }

    @Test
    public void canCheckBeakerIsFavourite() {
        assertEquals(true, collector.isFavourite(beaker));
    }

    @Test
    public void canCheckIsNotFavourite() {
        assertEquals(false, collector.isFavourite(georgeLucas));
    }

    @Test
    public void canAddIfNotFavourite() {
        collector.isFavourite(georgeLucas);
        collector.addToForSale(georgeLucas);
        assertEquals(1, collector.countForSale());
    }

    @Test
    public void canGetForSaleList() {
        assertEquals(0, collector.forSale().size());
    }

    @Test
    public void canClearForSaleList() {
        collector.addToForSale(georgeLucas);
        assertEquals(1, collector.countForSale());
        collector.soldItem();
        assertEquals(0, collector.countForSale());
    }

    //DATE TESTS

    @Test
    public void getToday() {
        assertEquals("07/06/2018", collector.getToday().toString());
    }

    @Test
    public void canAddItemAndCountItemsBetweenDates() {
        collector.addItemToDatesArray(beaker);
        assertEquals(1,collector.countItems());
    }

    @Test
    public void canReturnItemsBoughtBetweenGivenDates() {
        collector.addToMuppetsCollection(beaker);
        collector.getMuppetsBoughtBetweenDates("05/05/2018", "11/08/2018");
        assertEquals(1, collector.itemsBetweenDates.size());
    }

    @Test
    public void canGetEnumPosters() {
        assertEquals("POSTER", collector.getPosters());
    }

}
