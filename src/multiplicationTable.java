public class multiplicationTable {

    public static void main(String[] args) {


        System.out.println("         Multiplication Table");
        System.out.print(" \t\t");
        for(int i = 1; i<10; i++){
            System.out.print(i+"\t");
        }
        System.out.println();
        System.out.println("__________________________________________");





        for (int i =1; i<10; i++){
            System.out.print(i+"\t|\t");
            for (int j=1; j<10; j++){
                System.out.print(i * j +" \t" );
            }
            System.out.println();
        }
    }







}
