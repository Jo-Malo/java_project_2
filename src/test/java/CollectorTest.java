import film_memorabilia.*;
import org.junit.Before;
import org.junit.Test;


import java.util.Date;

import static org.junit.Assert.assertEquals;

public class CollectorTest {
    Collector collector;
    Beaker beaker;
    GeorgeLucas georgeLucas;
    MuppetsItem muppetsItem;
    StarWarsItem starWarsItem;
    Date date;

    @Before
    public void before() {
        collector = new Collector("Finn");
        beaker = new Beaker("Red, fluffy and gormless looking", 250, 50,300, date);
        georgeLucas = new GeorgeLucas("The Force Awakens", "genuine autograph from 2015", 100, 25, 150, date);
    }

    @Test
    public void hasName() {
        assertEquals("Finn", collector.getName());
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

//    STARWARS COLLECTION //

    @Test
    public void starWarsCollectionCountStartAtZero() {
        assertEquals(0, collector.StarWarsItemCount());
    }

    @Test
    public void canAddToStarWarsCollection() {
        collector.addToStarWarsCollection(starWarsItem);
        assertEquals(1, collector.StarWarsItemCount());
    }

    @Test
    public void canGetTotalValueOfStarWars() {
        collector.addToStarWarsCollection(georgeLucas);
        assertEquals(100, collector.calculateTotalValueOfStarWarsItems());
    }

//    MUPPETS COLLECTION //

    @Test
    public void muppetsItemCountStartAtZero() {
        assertEquals(0, collector.MuppetsItemCount());
    }

    @Test
    public void canAddToMuppetsCollection() {
        collector.addToMuppetsCollection(muppetsItem);
        assertEquals(1, collector.MuppetsItemCount());
    }

    @Test
    public void canGetTotalValueOfMuppets() {
        collector.addToMuppetsCollection(beaker);
        collector.addToMuppetsCollection(beaker);
        assertEquals(500, collector.calculateTotalValueOfMuppetsItems());
    }
}
