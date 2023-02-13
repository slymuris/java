package math.abstractMethods;

import java.util.ArrayList;

public class arrayList {
//import arraylist import java.ArrayList;
public static void main(String[]args) {
    ArrayList<String> cars = new ArrayList<String>(); //arraylist created
    cars.add("volvo"); //added
    cars.add("bmw");   //added
    cars.add("audi");  //added
    cars.add("mazda"); //added
    System.out.println(cars); //prints this [volvo, bmw, audi, mazda]
    System.out.println(cars.get(0)); // prints only volvo
    System.out.println(cars.set(0, "bmw")); //it changed the first index(volvo) to bmw
    System.out.println(cars); //printed it with the new list [bmw, bmw, audi, mazda]
    System.out.println(cars.remove(0)); //removed the bmw we updated
    System.out.println(cars); //now prints [bmw, audi, mazda ]
    //cars.clear(); // removed everything in the arrayList
    System.out.println(cars); //now prints just this []
    System.out.println(cars.size()); //prints the size which shows 3

    //looping through an arrayList
   // for(String i: cars){
       // System.out.println(i);  //printing the contents in the list =bmw audi mazda


      //other types of list
      ArrayList<Integer>myNumbers=new ArrayList<Integer>();
      myNumbers.add(10);
      myNumbers.add(15);
      myNumbers.add(20);
      myNumbers.add(25);

      for(int i: myNumbers){
          System.out.println(i); //prints the content= 10 15 20 25
      }





    }


}





