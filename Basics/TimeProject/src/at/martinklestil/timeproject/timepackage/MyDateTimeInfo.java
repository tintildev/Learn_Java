package at.martinklestil.timeproject.timepackage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDateTimeInfo {

    public String getMyDateTime(String pFor){
        //Klasse Date (aus java.util) --> liefert die akutelle Zeit
        //Klasse SimpleDateFormat (aus java.text) --> ermoeglicht die Zeit zu formatieren

        Date myDate = new Date();
        SimpleDateFormat sbf = new SimpleDateFormat(pFor);


        return sbf.format(myDate);
    }
}
