package film_memorabilia;

import behaviours.ICollect;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;

public abstract class Item{
    protected String itemDescription;
    protected int buyPrice;
    protected int shipping;
    public int marketValue;
    protected Date date;
    protected Boolean favourite;


    public Item(String itemDescription, int buyPrice, int shipping, int marketValue, String dateToConvert) {
        this.itemDescription = itemDescription;
        this.buyPrice = buyPrice;
        this.shipping = shipping;
        this.marketValue = marketValue;
        try {
            this.date = new SimpleDateFormat("dd/MM/yyyy", Locale.UK).parse(dateToConvert);
        } catch (ParseException e) {
            e.printStackTrace();
        }
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

    public void compareDate(Date dateBought, Date date2) {
        if ( dateBought.compareTo(date2) == 0 ){
            System.out.println("Yep, you bought this today!");
        } else if (dateBought.compareTo(date2) == -1) {
            System.out.println("You've had this for a bit");
        } else {
            System.out.println("this shouldn't be possible");
        }
    }
}
