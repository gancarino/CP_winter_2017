package pl.waw.sgh;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showOptionDialog;

public class DateOper {

    public static void main(String[] args) {
        // rozpoczęcie odliczania czasu
        Long startMillis = System.currentTimeMillis();
        Date date = new Date();
        System.out.println(date);
        //sprawdzenie obecnej daty w formacie liczbowym
        System.out.println(System.currentTimeMillis());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
        String formattedDate = sdf.format(date);
        System.out.println(formattedDate);
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        Date outDate = null;
        Boolean success = false;
        while (!success) {
            try {
                /*String inDate=null;*/
                String inDate = JOptionPane.showInputDialog(null, "Please provide a date:");
                outDate = sdf2.parse(inDate);

                // adding 10 days to date
                Calendar c = Calendar.getInstance();
                c.setTime(outDate);
                c.add(Calendar.DATE, 10);
                outDate = c.getTime();
                success = true;
            } catch (ParseException/*|NullPointerException*/ e) {
                JOptionPane.showMessageDialog(null, "can't interpret the provided date, please try again");
                e.printStackTrace(); // pomaga dowiedziec sie gdzie jest problem, application crushes
            } /*catch ( NullPointerException ne) {
                JOptionPane.showMessageDialog(null,"ops....");
                break;
            }*/

        }
        JOptionPane.showMessageDialog(null, "Success, your date: " + sdf.format(outDate));

        // liczenie ile zajelo nam wprowadzenie daty
        Long stopMillis = System.currentTimeMillis();
        JOptionPane.showMessageDialog(null, "Success, it tooks you: " + (stopMillis-startMillis) + " ms");

    }
}