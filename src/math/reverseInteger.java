package math;

public class reverseInteger {

    public static void main(String[] args) {

//how to reverse an integer
        // int number = 378;

//int thirdNumber= number %10; //8
//number= number/10; //378 -> 37

//int secondNumber= number% 10; //7
//number=number/10; //37 -> 3

//int first= number%10; //3
//number=number/10; //3->0
        System.out.println(reverse(50556));

//}
    }

//reversing an integer
//public static void reverse(int num){         //this will give you reverse 12345->54321
//while(num>0){
// System.out.println(num%10);
//num=num/10;
//}
//}


// returning that reverse integer

    public static int reverse(int num) {
        int revNum = 0;
        while (num > 0) {
            revNum = revNum * 10 + num % 10;
            num = num / 10;
        }
        return revNum;
    }
}
// 0*10+6=6, 6*10=60+5=65, 65*10=650+5=655, 655*10=6550+0=6550