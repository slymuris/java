package linkedList;

import java.util.Vector;

public class VectorDemo {

    // Legacy class -> StringBuffer, Hashtable, Vector

    public static void main(String[] args) {


        Vector<Integer> vector = new Vector<>();

        //  synchronized is a keyword that can be applied to methods
        // which makes the method thread-safe

        // synchronized /thread-safe -> a method that takes turns when executing its logic in a multithreaded environment

        myMethod();

    }


    public static void myMethod(){
        myMethod();
    }



    // Vector is similar to ArrayList except its methods are synchronized
    // and it was replaced by ArrayList in JDK 1.2.
}





