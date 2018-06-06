import enums.Edition;
import enums.ItemType;
import film_memorabilia.MuppetsItem;
import org.junit.Before;
import org.junit.Test;


import java.util.Date;

import static org.junit.Assert.assertEquals;


public class MuppetsItemTest {

    MuppetsItem muppetsItemPuppet;
    MuppetsItem muppetsItemPuppet1;
    Date date;


    @Before
    public void before() {
        muppetsItemPuppet = new MuppetsItem(ItemType.PUPPET, Edition.REPLICA, "Animal", 200, 30,300, "22/12/2015");
        muppetsItemPuppet1 = new MuppetsItem(ItemType.POSTER, Edition.ORIGINAL,"Gonzo", 60, 5, 70, "10/2/2018");
    }

    @Test
    public void muppetsItemHasType() {
        assertEquals(ItemType.PUPPET, muppetsItemPuppet.getType());
    }

    @Test
    public void muppetsItemHasEdition() {
        assertEquals(Edition.REPLICA, muppetsItemPuppet.getEdition());
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

    //DATE RELATED STUFF

    @Test
    public void getToday() {
        assertEquals("06/06/2018", muppetsItemPuppet.getToday().toString());
    }

//    @Test
//    public int compareTodayWithDateBought() {
////        Date buyDate = new Date();
////        Date otherDate = new Date();
////        int result = buyDate.compareDate();
//        assertEquals(-1, muppetsItemPuppet.compareDate("Tue Jun 05 00:00:00 GMT 2018", "Thu Nov 15 00:00:00 GMT 2018"););
////        return result;
//        }

    @Test
    public void canGetDateBought() {
        assertEquals("Tue Dec 22 00:00:00 GMT 2015", muppetsItemPuppet.getDate().toString());
    }

    @Test
    public void forComparison() {
        assertEquals("Tue Jun 05 00:00:00 BST 2018", muppetsItemPuppet.turnIntIntoDate(2018, 06, 05).toString());
    }

    @Test
    public void canGetDateFromString() {
        assertEquals("Thu Mar 15 00:00:00 GMT 2018", muppetsItemPuppet.getDateFromString("15/03/2018").toString());
    }

    @Test
    public void canTurnIntegerIntoDate() {
        assertEquals("Thu Mar 15 00:00:00 GMT 2018", muppetsItemPuppet.turnIntIntoDate(2018, 03, 15).toString());
    }

    //ALL OLD DATE RUBBISH BLAAARGH

//    @Test
//    public void canGetPurchaseDate() {
//        assertEquals("22/12/2015", muppetsItemPuppet.getPurchaseDate());
//    }
//
//    @Test
//    public void canGetPurchaseDay() {
//        assertEquals("22", muppetsItemPuppet.getPurchaseDay());
//    }
//
//    @Test
//    public void canGetIntPurchaseDay() {
//        assertEquals(22, muppetsItemPuppet.getIntDay("22"));
//    }
//
//    @Test
//    public void canGetPurchaseMonth() {
//        assertEquals("12", muppetsItemPuppet.getPurchaseMonth());
//    }
//
//    @Test
//    public void canGetIntPurchaseMonth() {
//        assertEquals(12, muppetsItemPuppet.getIntMonth("12"));
//    }
//
//    @Test
//    public void canGetPurchaseYear() {
//        assertEquals("2015", muppetsItemPuppet.getPurchaseYear());
//    }
//
//    @Test
//    public void canGetIntPurchaseYear() {
//        assertEquals(2015, muppetsItemPuppet.getIntYear("2015"));
//    }
//
//    @Test
//    public void canCompareYear() {
//      muppetsItemPuppet.getPurchaseYear();
//      muppetsItemPuppet.compareYear(2016, 12/13/1986);
//    }

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
