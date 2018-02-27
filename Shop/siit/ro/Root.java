package siit.ro;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Root {

    public static void main (String args[]) throws ParseException {

        String inputString = "01-01-2019";
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date inputDate = dateFormat.parse(inputString);

        FoodProduct fp= new FoodProduct("bread",30.0,3,"Adult",inputDate);
        Customer gigi = new Customer("Gigi",18,44.0);

        PurchaseManager.processPurchase(fp,gigi);
        PurchaseManager.processPurchase(fp,gigi);
    }
}
