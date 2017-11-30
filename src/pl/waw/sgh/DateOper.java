package pl.waw.sgh;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class DateOper {

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
        String formattedDate = sdf.format(date);
        System.out.println(formattedDate);
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        Date outDate = null;
        Boolean success = false;
        while (!success) {
            try {
                String inDate = JOptionPane.showInputDialog(null, "Please provide a date:");
                outDate = sdf2.parse(inDate);
                success = true;
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(null, "can't interpret the provided date, please try again");
            }

        }
        JOptionPane.showMessageDialog(null, "Success, your date: " + sdf.format(outDate));
    }
}