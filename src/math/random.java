package math;
import java.util.Random;
public class random {
public static void main(String[]args){

    System.out.println(Math.random()*10);   //itll generate 0-10 =5.6979897
    System.out.println((int)(Math.random()*10));  //to make it a int = 5
    System.out.println(10+ (int)(Math.random()*10)); //between 10-20 not including 20
    System.out.println(10+(int)(Math.random()*90)); //2 digits between 10-99
    System.out.println(10000000000L+(int)(Math.random()*10000000000L)); //when number is big cast it to L

   //using same method for char in ascii table
    System.out.println((char)('A'+(int)(Math.random()*26))); //A-Z letters
   System.out.println((char)('a'+(int)(Math.random()*26))); //supposed to be a-z

   //another way to generate random int/number

   Random random= new Random(); //have to import in the class java.util.Random
   int randInt= random.nextInt(100); //0-100
    System.out.println(randInt);
    System.out.println(10+random.nextInt(50)); //10-60

  //boolean random generator true/false

  boolean ishHead= random.nextBoolean();
  if(ishHead){
      System.out.println("head");
  }else{
      System.out.println("tails");
  }
}




}
