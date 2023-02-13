public class reverseString {


    public static void main(String[] args) {
    //prints hello in reverse= olleH

        // print string in reverse
        // access each character of the string from the end index till the beginning index and print/accumulate into another string

        String str ="Hello";
        String newStr = "";
        for (int i = str.length()-1; i >=0 ; i--) {
//            System.out.print(str.charAt(i) ); // print
            newStr += str.charAt(i); // accumulate into another string
        }

        System.out.println(newStr);  //prints olleh

        String str1 ="Hello";
        String newStr1 = "";
        for (int i = str.length()-1; i >=0 ; i--) {
//            System.out.print(str.charAt(i) ); // print
            newStr += str.charAt(i); // accumulate into another string
        }

        System.out.println(newStr); //printing olleholleh
    }


    }






