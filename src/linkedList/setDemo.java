package linkedList;
import java.util.*;

public class setDemo {


        public static void main(String[] args) {


            Set<Integer> ssns = new HashSet<>();

            ssns.add(34);
            ssns.add(21);
            ssns.add(44);
            ssns.add(23);
            ssns.add(22);
            ssns.add(66);

            System.out.println(ssns); //prints one from the top and one from the bottom
            //         >  [34, 66, 21, 22, 23, 44]// <
//               System.out.println(ssns.get(5));

            for (Integer ssn:  ssns){
                System.out.println(ssn); // >prints the same but not in the same line<//

            }

            // Convert the Set to a List

            // You can convert any Collection (List, Set, Queue) to the other by using its constructor

            List<Integer> integers = new ArrayList<>(ssns);
            System.out.println(integers);


            Set<Integer> numbers = new LinkedHashSet<>();

            numbers.add(34);
            numbers.add(21);
            numbers.add(44);
            numbers.add(23);
            numbers.add(22);
            numbers.add(66);
            numbers.add(66);
            numbers.add(22);

            System.out.println(numbers);


            List<Integer> listNotUnique =  new ArrayList<>();

            listNotUnique.add(2);
            listNotUnique.add(1);
            listNotUnique.add(3);
            listNotUnique.add(1);
            listNotUnique.add(3);
            listNotUnique.add(2);
            listNotUnique.add(5);
            listNotUnique.add(2);
            listNotUnique.add(1);
            listNotUnique.add(5);
            listNotUnique.add(0);


            System.out.println(listNotUnique);

            List<Integer> unique = new ArrayList<>( new TreeSet<>(listNotUnique) );

            System.out.println(unique);


            // Unique, remove duplicates -> think Sets



            // Getting rid of duplicates from an array


            int[] arr =  {1,1,1,1,2,2,2,2,2,3,3,4,4};
            // Convert an array to a list
            List<Integer> integers1 = Arrays.stream(arr).boxed().toList();  // using streams

            List<Integer> unique2 = new ArrayList<>( new TreeSet<>(integers1) ); // getting rid of duplicates

            System.out.println(unique2);



//i am trying to commit this again

        }
    }






