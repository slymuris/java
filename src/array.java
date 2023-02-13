import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Element;

public class array {

@SuppressWarnings("ReassignedVariable")
public static void main(String[]args){

int num;
int[]list= {1,2,3,4,5,6};
for(int i= 1; i<list.length; i++){
list[i]= list[i-1]; //this makes all the numbers the same as the first one
}
for(int i=0; i<list.length; i++){
    System.out.println(list[i]+ " ");
}



String [] cars= {"volvo", "audi", "mercedes", "bmw"};
    System.out.println(cars.length); //itll print 4 ^
int []numbers={10,20,30,40};
    System.out.println(numbers.length); //itll print 4 aswell^

    int[] items = {2, 7, 3, 5, 8, 9};
    num = items[0];
    for (int i = 0; i < items.length; i++) {
        if (items[i] > num)
            num = items[i];
    }
    System.out.println(num);  // print out 9

    int[] a = new int[5];
    a[0] = 5;
    a[1] = 4;
    a[2] = 3;
    System.out.println(a[0] + a[1] + a[4]); //prints 9



}


}
