package pl.waw.sgh;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

    public class wordList {
        static final String FILE_LOC = "H:\\tekst.txt";

        public static void main(String[] args) throws
                FileNotFoundException {
            File file = new File(FILE_LOC);
            Scanner scanner = new Scanner(file);

            Map<String, Integer> myMap = new HashMap<>();

            while (scanner.hasNext()) {
                String myLine = scanner.nextLine();
            /*System.out.println(myLine);*/
                String pattern = " ";
                myLine=myLine.toUpperCase();
                String[] elem = myLine.split(pattern);

                for (String el : elem) {
                    for (int i = 0; i < el.length(); i++) {
                        if (el.charAt(i) == '.' || el.charAt(i) == ',') {
                            el = el.substring(0, i);
                        }
                    }
                    if (myMap.containsKey(el)) {
                        myMap.put(el, (myMap.get(el) + 1));
                    } else
                        myMap.put(el, 1);
                }
            }

            for (String key : myMap.keySet()) {
                String lista= "The word " + key + " occurs " + myMap.get(key)+ " TIMES ";
                System.out.println(lista);
            }
            System.out.println();
            /*for (String key : myMap.keySet()) {
            for (int i = 0; i < key.length(); i++) {
                if (key.charAt(i) == '.' || key.charAt(i) == ',') {
                    key = key.substring(0, i);
                }
            }
                String lista = key + " = " + myMap.get(key);
                System.out.println(lista);
            }*/




        /*List<String> list = new ArrayList<String>(myMap.keySet());
        List<Integer> list1 = new ArrayList<Integer>(myMap.values());
        System.out.println(list+"\t");
        System.out.println(list1+"\t");*/
        }
    }


