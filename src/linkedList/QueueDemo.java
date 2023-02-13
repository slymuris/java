package linkedList;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {


        Queue<String> tickets = new LinkedList<>();

        tickets.offer("1B");
        tickets.offer("1C");
        tickets.offer("2A");
        tickets.offer("2B");
        tickets.offer("2C");
        tickets.offer("3A");


        System.out.println(tickets);
        System.out.println( tickets.poll() );  // FIFO
        System.out.println("Queue after polling");
        System.out.println(tickets);

        while (!tickets.isEmpty()){
            System.out.println(tickets.poll());
        }


        ///


        Queue<String> students = new LinkedList<>();

        students.offer("Maksym");
        students.offer("Nazrin");
        students.offer("Nazar");
        students.offer("Zaur");
        students.offer("Nilufar");
        students.offer("Erick");
        students.offer(null);
        students.offer(null);

        System.out.println(students);

        while (!students.isEmpty()){
            System.out.println(students.poll());
        }

    }





}
