package math.abstractMethods;

public class stringBuilder {

public static void main(String[]args){
//StringBuilder setlength method//
StringBuilder str= new StringBuilder("Welcome Geeks");
    System.out.println("String length= "+ str.length()+ "and contains= "+ str);
    //^//showing the legnth and what is contained in it^   which is length 13 and "Welcome Geeks"

//setting lenght to 10
    str.setLength(10);

    System.out.println("after doing setlength() String= " + str.toString());
//prints "Welcome to Ge"

//--------------------------------------------------------------------------------
//toString method turns in into letters
//substring//
StringBuilder str1= new StringBuilder("GeeksforGeeks");

    System.out.println("String contains= "+ str1); //prints "GeeksforGeeks"

    System.out.println("Subsequence= "+ str1.substring(5)); //prints forGeeks

//when you substring a number out of spectrum substring(-7) it doesnt contain so it would throw outofboundsexcepmtion
}
}
//----------------------------------------------------------------------------


