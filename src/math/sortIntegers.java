package math;

public class sortIntegers {
    public static void main(String[] args) {

//sorting given integers 34, -1, 2 -> -1,2,34
printSorted(5,9, 6);

    }
        public static void printSorted ( int a, int b, int c){
            if (a > b) {
                int temp = a;
                a = b;
                b = temp;

            }
            if (b > c) {
                int temp = b;
                b = c;
                c = temp;
            }

            if (a > b) {
                int temp = a;
                a = b;
                b = temp;

            }
            System.out.println(a + ", " + b + ", " + c);
        }

}












