package linkedList;

import java.util.Objects;

public class Student  implements  Comparable<Student> {


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
        return "Student{" +
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
    //   public int compareTo(Student o) {
    //       if(this.getAge() > o.getAge() ){
    //           return 1;
    //      } else if (this.getAge()<o.getAge()) {
    //           return -1;
//        }else {
//            return 0;
//       }
//
//


//    @Override
//    public int compareTo(Student o) {
//
//        return  this.getAge() - o.getAge();
//
//


    @Override
    public int compareTo(Student o) {

        if (this.getGpa() > o.getGpa()) {
            return 1;
        } else if (this.getGpa() < o.getGpa()) {
            return -1;
        } else {
            return 0;
        }
    }
    }


