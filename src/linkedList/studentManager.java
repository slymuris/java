package linkedList;
import java.util.*;
public class studentManager {


        public static void main(String[] args) {



            List<Student> studentList = Arrays.asList(
                    new Student("Maksym", 29, 234423, 3.6),
                    new Student("Zaur", 32, 4345343, 3.2),
                    new Student("Nilufar", 26, 433424, 3.7),
                    new Student("Nazar", 59, 234232, 3.9),
                    new Student("Erick", 45, 123234, 4.0)
            );







            Collections.sort(studentList);

            for (Student student : studentList) {
                System.out.println(student);
            }


            ComparatorByAge ageComparator = new ComparatorByAge();

            Collections.sort(studentList, ageComparator);

            System.out.println("Comparing by age");


            for (Student student : studentList) {
                System.out.println(student);
            }

            // Lambda syntax
            // Method parameters   lambda symbol      method body
            //         ()              ->                  {}

            // Create comparator using lambda
            // Longer syntax
            Comparator<Student> ageComparatorUsingLambda = (Student o1, Student o2) -> {

                return o1.getAge() - o2.getAge();
            };

            //Shorter syntax
            Comparator<Student> nameComparatorUsingLambda = (o1,  o2) ->  o1.getName().compareTo(o2.getName());
            Collections.sort(studentList, nameComparatorUsingLambda);


            // Pass lambda to a method without storing it into a variable
            Collections.sort(studentList, (o1,  o2) ->  o1.getName().compareTo(o2.getName()) );



            System.out.println("Comparing by name");
            for (Student student : studentList) {
                System.out.println(student);
            }


        }
    }




