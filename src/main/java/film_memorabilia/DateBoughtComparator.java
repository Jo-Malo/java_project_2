package film_memorabilia;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;

public class DateBoughtComparator implements Comparator<Item>{

    public int compare(Item date1, Item date2) {
        if (date1.getDate().before(date2.getDate())) {
            return -1;
        } else if (date1.getDate().after(date2.getDate())) {
            return 1;
        } else {
            return 0;
        }
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

}
