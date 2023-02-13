package linkedList;

import java.util.Stack;

public class StackDemo {




        public static void main(String[] args) {


//        Stack is LIFO(Last in First Out ) data structure
            // that lets you add and retrieve items from the collection in LIFO order with
            // built-in methods push() and pop()

            Stack<String> books = new Stack<>();

            books.push("Lord Of Rings");
            books.push("War and Peace");
            books.push("Harry Potter");
            books.push("Drongo");
            books.push("Bible");
            books.push("Software Tester");


            System.out.println(books);

            System.out.println(books.pop());

            System.out.println("After popping");

            System.out.println(books);

            System.out.println(books.peek());

            System.out.println("After peeking");

            System.out.println(books);

            System.out.println(books.search("Harry Potter"));
            //Returns the 1-based position where an object is on this stack.

            // iterate through a stack and remove items from it and print it

//        while(!books.isEmpty()){
//            System.out.println(books.pop());
//        }


        }
    }

