package pl.waw.sgh;

import com.oracle.webservices.internal.api.message.PropertySet;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class FileWr {

    static final String FILE_LOC = "h:\\savfile.txt";

    public static void main(String[] args) throws IOException {
        File file = new File(FILE_LOC);
        // file, append existing file or not
        FileWriter fw = new FileWriter(file, false);
        BufferedWriter bw = new BufferedWriter(fw, 688);
        //bw.
        bw.write("Hello");
        bw.newLine();
        bw.write("2nd line...\n3rd line\n4th line\tAfter tab");
        bw.close();
        fw.close();

/*        System.out.println("CWD: " + System.getProperty("user.dir"));
        System.out.println(System.getProperties());*/

        //for (String propName : System.getProperties().elements())
    }
}
