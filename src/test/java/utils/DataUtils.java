package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtils {
    public String getCurrentFormatterDate(){
        SimpleDateFormat formatter = new SimpleDateFormat("");
        Date date = new Date();
        return formatter.format(date);
    }
}
