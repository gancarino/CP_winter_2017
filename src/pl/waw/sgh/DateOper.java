package pl.waw.sgh;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateOper {

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
        String formattedDate =sdf.format(date);
        System.out.println(formattedDate);
    }
}
