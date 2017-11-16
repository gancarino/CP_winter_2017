package pl.waw.sgh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileOps {
    static final String FILE_LOC = "h:\\myfile.txt";

    public static void main(String[] args)  throws
            FileNotFoundException {
        File file = new File(FILE_LOC);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext())  {
            String myLine = scanner.nextLine();
            System.out.println(myLine);
            String[] elem = myLine.split(":");
            for (String el : elem)
            System.out.println("= "+el);
        }
    }
}
