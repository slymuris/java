package linkedList;

import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueueDemo {

    public static void main(String[] args) {


        Queue<String> students = new PriorityQueue<>();

        students.offer("Maksym");
        students.offer("Nazrin");
        students.offer("Nazar");
        students.offer("Zaur");
        students.offer("Nilufar");
        students.offer("Erick");
        students.offer("annie");       //when one is null it throws NullPointerException

        System.out.println(students);

        while (!students.isEmpty()){  // in PQ the items will be retrieved based on the priority
            System.out.println(students.poll());
        }
    }




}
