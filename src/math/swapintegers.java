package math;

import java.util.Objects;

public class swapintegers {
public static void main(String[]args){

int x= 5;
int y= 10;

    System.out.println( "X is "+ x );
    System.out.println( "Y is "+ y );

    System.out.println("after swapping");

    int temp= x;    //swapping with a third temp variable
     x= y;
     y= temp;
    System.out.println("X is "+x);
    System.out.println("Y is "+y);

    //swapping without a third temp variable
    x= x+y;
    y= x-y;
    x= x-y;
//dont understand it too much check over it




}


    public static class Student implements Comparable<Student>, math.Student {




            private String name;
            private int age;
            private int id;
            private double gpa;

            public Student(String name, int age, int id, double gpa) {
                this.name = name;
                this.age = age;
                this.id = id;
                this.gpa = gpa;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public double getGpa() {
                return gpa;
            }

            public void setGpa(double gpa) {
                this.gpa = gpa;
            }

            @Override
            public String toString() {
                return "math.swapintegers.Student{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        ", id=" + id +
                        ", gpa=" + gpa +
                        '}';
            }


            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Student student = (Student) o;
                return age == student.age && id == student.id && Double.compare(student.gpa, gpa) == 0 && Objects.equals(name, student.name);
            }

            @Override
            public int hashCode() {
                return Objects.hash(name, age, id, gpa);
            }

    //    @Override
    //    public int compareTo(math.swapintegers.Student o) {
    //        if(this.getAge() > o.getAge() ){
    //            return 1;
    //        } else if (this.getAge()<o.getAge()) {
    //            return -1;
    //        }else {
    //            return 0;
    //        }
    //
    //
    //    }


    //    @Override
    //    public int compareTo(math.swapintegers.Student o) {
    //
    //        return  this.getAge() - o.getAge();
    //
    //


            @Override
            public int compareTo(Student o) {

                if(this.getGpa() > o.getGpa() ){
                    return 1;
                } else if (this.getGpa()<o.getGpa()) {
                    return -1;
                }else {
                    return 0;
                }


            }

    //    @Override
    //    public int compareTo(math.swapintegers.Student o) {
    //
    //        return this.getName().compareTo(o.getName());
    //
    //
    //    }
        }
}
