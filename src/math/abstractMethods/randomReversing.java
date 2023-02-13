package math.abstractMethods;

public class randomReversing {
public static void main(String[]args){

printReverse();
}
public static void printReverse(){
int num= (int)(1000 + Math.random()*9000); //generates a 4 digit number 1000-9999
    System.out.println("the generated random number is:" + (num));

int n1= num%10;
int n2= (num%100)/10;
int n3= (num%1000)/100;
int n4= (num%10000)/1000;

System.out.println(n1);
System.out.println(n2);
System.out.println(n3);
System.out.println(n4);

    System.out.println("" +n1+n2+n3+n4); //printed in reverse
}




}
