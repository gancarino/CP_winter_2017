package pl.waw.sgh;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class EmailCheck {

    public static void main(String[] args) {


        System.out.println(" Please provide your email ");
        String input = new Scanner(System.in).nextLine();
        System.out.println(("got: " + input));

        int atPos = input.indexOf("@");
        int lz = input.length();
        String Posi="";
        boolean popr = false;
        for(int i=0;i<lz;i++) {
            char z=input.charAt(i);
            System.out.println(z);
            if (input.charAt(i) == '.' && (i > atPos + 1)) {
                Posi = Posi + i + ";";
                popr = true;
            }
        }
        int dotPos = input.indexOf(".");
        System.out.println("at position = " + atPos);
        if (atPos>=2 && (popr) ) {
            System.out.println("EMAIL_OK ");
        }
        else {
            System.out.println("EMAIL_NOT_OK ");
        }

    }

}
