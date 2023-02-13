package math;

public class divisibility {
    public static void main(String[] args) {
//1-100 showing which numbers are divisible by 1 and 5 and (1&5) together
        fizzBuzz();
    }


    public static void fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
               System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0){

        }else {
            System.out.println(i);
        }
        //we can write this whole expression in one line
           // System.out.println((i%3==0 && i%5==0) ? "FizzBuzz" : (i%3==0) ? "Fizz" : (i%5==0) ? "Buzz" : i);
        }
        }
        }

