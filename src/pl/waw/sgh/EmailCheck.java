package pl.waw.sgh;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class EmailCheck {

    public static void main(String[] args) {
        final String EMAIL_OK = "user@sgh.pl";
        final String EMAIL_NOT_OK = "@sgh.pl";

        String email = EMAIL_NOT_OK;

        System.out.println(" Please provide your email ");
        String input = new Scanner(System.in).nextLine();
        System.out.println(("got: " + input));

        int atPos = input.indexOf("@");
        int dotPos = input.indexOf(".");
        System.out.println("at position = " + atPos);
        System.out.println("dot position = " + dotPos);
        if (atPos>=2 && (dotPos > atPos+1) ) {
            System.out.println("EMAIL_OK ");
        }
        else {
            System.out.println("EMAIL_NOT_OK ");
        }

    }
}
