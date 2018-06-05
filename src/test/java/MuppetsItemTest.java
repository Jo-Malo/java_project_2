import enums.ItemType;
import film_memorabilia.Item;
import film_memorabilia.MuppetsItem;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MuppetsItemTest {

    MuppetsItem muppetsItemPuppet;
    MuppetsItem muppetsItemPuppet1;

//    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");


    @Before
    public void before() {
        muppetsItemPuppet = new MuppetsItem(ItemType.PUPPET, "Animal", 200, 30,300, "22/12/2015");
        muppetsItemPuppet1 = new MuppetsItem(ItemType.POSTER, "Gonzo", 60, 5, 70, "10/2/2018");
    }

    @Test
    public void muppetsItemHasType() {
        assertEquals(ItemType.PUPPET, muppetsItemPuppet.getType());
    }

    @Test
    public void starWarsCostumeHasDescription() {
        assertEquals("Animal", muppetsItemPuppet.getDescription());
    }

    @Test
    public void starWarsCostumeHasBuyPrice() {
        assertEquals(200.00, muppetsItemPuppet.getBuyPrice(), 0.01);
    }

    @Test
    public void starWarsCostumeHasShippingCost() {
        assertEquals(30.00, muppetsItemPuppet.getShipping(), 0.01);
    }

    @Test
    public void starWarsCostumeHasMarketValue() {
        assertEquals(300.00, muppetsItemPuppet.getMarketValue(), 0.01);
    }

    @Test
    public void canSetMarketValue() {
        muppetsItemPuppet.setMarketValue(300);
        assertEquals(300, muppetsItemPuppet.getMarketValue());
    }

    @Test
    public void canGetPurchaseDate() {
        assertEquals("22/12/2015", muppetsItemPuppet.getPurchaseDate());
    }

    @Test
    public void canGetPurchaseDay() {
        assertEquals("22", muppetsItemPuppet.getPurchaseDay());
    }

    @Test
    public void canGetIntPurchaseDay() {
        assertEquals(22, muppetsItemPuppet.getIntDay("22"));
    }

    @Test
    public void canGetPurchaseMonth() {
        assertEquals("12", muppetsItemPuppet.getPurchaseMonth());
    }

    @Test
    public void canGetIntPurchaseMonth() {
        assertEquals(12, muppetsItemPuppet.getIntMonth("12"));
    }

    @Test
    public void canGetPurchaseYear() {
        assertEquals("2015", muppetsItemPuppet.getPurchaseYear());
    }

    @Test
    public void canGetIntPurchaseYear() {
        assertEquals(2015, muppetsItemPuppet.getIntYear("2015"));
    }

    @Test
    public void canCompareYear() {
      muppetsItemPuppet.getPurchaseYear();
      muppetsItemPuppet.compareYear(2016, 12/13/1986);
    }

//    @Test
//    public void canComparePurchaseYear() {
//        Integer year = new Integer(2016);
//        assertEquals(0, muppetsItemPuppet.compareTo(year));
//    }

//    @Test
//    public void canGetDateBought() {
//        Date date = new Date();
//        System.out.println(dateFormat.format(date));
//        assertEquals(null, muppetsItemPuppet.getDateBought());
//    }
//
//    @Test
//    public void canGetLengthOfTimeSinceBuying() {
//        Date date = new Date();
//        System.out.println(dateFormat.format(date));
//        Date anotherDate = new Date();
//        System.out.println(dateFormat.format(anotherDate));
//        assertEquals(0, date.compareTo(anotherDate));
//    }
}
