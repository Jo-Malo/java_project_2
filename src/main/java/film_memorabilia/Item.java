package film_memorabilia;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public abstract class Item{
    protected String itemDescription;
    protected int buyPrice;
    protected int shipping;
    public int marketValue;
    protected Date date;
    protected Boolean favourite;
    //protected String purchaseDate;


    public Item(String itemDescription, int buyPrice, int shipping, int marketValue, String dateToConvert) //String purchaseDate) {
    {   this.itemDescription = itemDescription;
        this.buyPrice = buyPrice;
        this.shipping = shipping;
        this.marketValue = marketValue;
        try {
            this.date = new SimpleDateFormat("dd/MM/yyyy", Locale.UK).parse(dateToConvert);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //this.purchaseDate = purchaseDate;
        this.favourite = favourite;
    }

    public String getToday() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(date);
    }

    public String getDescription() {
        return this.itemDescription;
    }

    public int getBuyPrice() {
        return this.buyPrice;
    }

    public int getShipping() {
        return this.shipping;
    }

    public int getMarketValue() {
        return this.marketValue;
    }

    public int setMarketValue(int marketValue) {
        return this.marketValue = marketValue;
    }

    //ALL OLD DATE RUBBISH BLAAARGH

//    public String getPurchaseDate() {
//        return this.purchaseDate;
//    }
//
//    public String setPurchaseDate(String date) {
//        this.purchaseDate = date;
//        return date.toString();
//    }
//
//    public String getPurchaseDay() {
//        String day = purchaseDate.split("/")[0];
//        return day;
//    }
//
//    public int getIntDay(String day) {
//        return Integer.parseInt(day);
//    }
//
//    public String getPurchaseMonth() {
//        String month = purchaseDate.split("/")[1];
//        return month;
//    }
//
//    public int getIntMonth(String month) {
//        return Integer.parseInt(month);
//    }
//
//    public String getPurchaseYear() {
//        String year = purchaseDate.split("/")[2];
//        return year;
//    }

    public int getIntYear(String year) {
        return Integer.parseInt(year);
    }

    public void compareYear(int getIntYear, int date) {
        if (getIntYear < date) {
            this.marketValue++;
        }
    }

    //DATE RELATED STUFF

    public Date getDate() {
        return date;
    }

    public static Date getDateFromString(String dateToConvert) {
        Date dateToReturn = null;
        try {
            dateToReturn = new SimpleDateFormat("dd/MM/yyyy", Locale.UK).parse(dateToConvert);
        } catch (ParseException e) {
            e.printStackTrace();

        }
        return dateToReturn;
    }

    public static Date turnIntIntoDate(int year, int month, int day){
        Date dateToReturn = null;
        Integer integerYear = (Integer) year;
        Integer integerMonth = (Integer) month;
        Integer integerDay = (Integer) day;

        String stringYear = integerYear.toString();
        String stringMonth = integerMonth.toString();
        String stringDay = integerDay.toString();

        String stringDate = stringDay + "/" + stringMonth + "/" + stringYear;

        try {
            dateToReturn = new SimpleDateFormat("dd/MM/yyyy", Locale.UK).parse(stringDate);
        } catch (ParseException e) {
            e.printStackTrace();

        }

        return dateToReturn;
    }

    public static String turnIntToStringDate(int year, int month, int day){
        Integer integerYear = (Integer) year;
        Integer integerMonth = (Integer) month;
        Integer integerDay = (Integer) day;

        String stringYear = integerYear.toString();
        String stringMonth = integerMonth.toString();
        String stringDay = integerDay.toString();

        String dateToReturn = stringDay + "/" + stringMonth + "/" + stringYear;
        return dateToReturn;
    }
}
