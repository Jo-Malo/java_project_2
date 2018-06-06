import enums.Edition;
import enums.ItemType;
import film_memorabilia.JawsItem;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JawsItemTest {

    JawsItem jawsReplica;

    @Before
    public void before() {
        jawsReplica= new JawsItem("Jaws", ItemType.PROP, Edition.LIMITED_EDITION,"Giant great white shark double from film.", 1000, 20, 50000, "03/01/2018");
    }

    @Test
    public void jawsReplicaHasFilm() {
        assertEquals("Jaws", jawsReplica.getFilm());
    }

    @Test
    public void jawsReplicaHasType() {
        assertEquals(ItemType.PROP, jawsReplica.getType());
    }

    @Test
    public void jawsReplicaHasEdition() {
        assertEquals(Edition.LIMITED_EDITION, jawsReplica.getEdition());
    }

    @Test
    public void jawsReplicaHasDescription() {
        assertEquals("Giant great white shark double from film.", jawsReplica.getDescription());
    }

    @Test
    public void jawsReplicaHasBuyPrice() {
        assertEquals(1000.00, jawsReplica.getBuyPrice(), 0.01);
    }

    @Test
    public void jawsReplicaHasShippingCost() {
        assertEquals(20.00, jawsReplica.getShipping(), 0.01);
    }

    @Test
    public void jawsReplicaHasMarketValue() {
        assertEquals(50000.00, jawsReplica.getMarketValue(), 0.01);
    }

    @Test
    public void canGetDatejawsReplicaBought() {
        assertEquals("Wed Jan 03 00:00:00 GMT 2018", jawsReplica.getDate().toString());
    }

    @Test
    public void canSetMarketValue() {
        jawsReplica.setMarketValue(300);
        assertEquals(300, jawsReplica.getMarketValue());
    }

}
