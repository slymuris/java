import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in); //imported the scanner
        int num =input.nextInt();  //so they can make their input
        int square= num*num; // it will get the number input and multiply by itself

        System.out.println("the square of "+ num+ " is "+ square);

    }
}