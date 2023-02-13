package math.abstractMethods;

public class wrapperMethod {

//converting an Integer to int "unboxing"
public static void main(String[]args){
Integer a= new Integer(3);
int i= a.intValue(); //converting Integer to int explicitely
int j= a;            //unboxing, now compiler will write a.intValue() internally

    System.out.println(a+" "+i + " "+j); //itll print 3,3,3

//--------------------------------------------------------------------------
//converting int to integer "autoboxing"
int b=20;
Integer c= Integer.valueOf(b);
Integer d= b;

    System.out.println(b+ " "+ c+ " "+ d);


}
}
