package linkedList;

import java.util.List;

public class listAndMaps {

    public static void main(String[] args) {


        // 10001	1953-09-02	Joe	Schmo	M	1986-06-26
        //10002	1964-06-02	Asif	Hamzaev	M	1985-11-21
        //10003	1959-12-03	Tess	Watson	F	1986-08-28
        //10004	1954-05-01	Chirstian	Koblick	M	1986-12-01
        //10005	1955-01-21	Lev	Tolstoy	M	1989-09-12

        List<List<String>> people =   // table can be stored in list of lists
                List.of(
                        List.of("10001",	"1953-09-02",	"Joe	Schmo", 	"M",	"1986-06-26"),
                        List.of("10002",	"1954-09-02",	"John Doe", 	"M",	"1984-06-26"),
                        List.of("10001",	"1953-09-02",	"Joe	Schmo", 	"M",	"1986-06-26"),
                        List.of("10002",	"1954-09-02",	"John Doe", 	"M",	"1984-06-26")

                );


        System.out.println(people.get(1).get(2));    //this prints john doe


        for (List<String> person : people) {
            System.out.println(person); // prints the whole list
        }





    }



}
