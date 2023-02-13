package linkedList;

import java.util.LinkedList;

public class linkedList1 {


    public static void main(String[] args) {



        LinkedList<String > linkedList = new LinkedList<>();

        linkedList.add("hello");
        linkedList.add("hi");
        linkedList.add("hola");

        linkedList.addFirst("bonjour");
        linkedList.addLast("guten tag");
        //linkedList.removeFirst();
       // linkedList.removeLast();

        System.out.println(linkedList);

    }



}
