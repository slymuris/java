package linkedList;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

    public class Utility {
        public static List<List<String>> readFromCSV(String path)  throws IOException {
            //     List<String[]> rows = new ArrayList<>();

            //     Scanner reader = null;


            // try {

            //         reader = new Scanner(new File(path));
            //         while(reader.hasNext()){
            //             rows.add(reader.nextLine().split("  "));
            //         }
            //     }
            //     catch (FileNotFoundException e) {
            //         e.printStackTrace();
            //     }
            //     return rows;

            String l = "";
            String splitter = ",";
            List<List<String>> accountClasses = new ArrayList<>();

            try {
                BufferedReader reader = new BufferedReader(new FileReader(path));
                while ((l = reader.readLine()) != null) {
                    String[] word = l.split(splitter);
                    //   if (word [2].equals("Checking")) {
                    //     accountClasses.add(new Checking(word[0], word[1], word[3]));
                    // }
                    //   else if (word [2].equals("Savings")) {
                    //     accountClasses.add(new Savings(word[0], word[1], word[3]));
                    // }
                    accountClasses.add(Arrays.asList(word));
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            return accountClasses;
        }
    }

