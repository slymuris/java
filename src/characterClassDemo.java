public class characterClassDemo {

    public static void main(String[] args) {



        int i = 8;
        Integer i2 = 5;


        System.out.println(i2.doubleValue());  //prints 5.0

        char ch = '%';

        Character ch2 = '@';




        boolean result = Character.isDigit('5');

        System.out.println(result);                            //true
        System.out.println(Character.isLetter('a'));       //true
        System.out.println(Character.isLetter('$'));       //false
        System.out.println(Character.isLetter('\u00FC')); //true // chars from other languages are also considered
        System.out.println(Character.isLetterOrDigit('1'));  //true
        System.out.println(Character.isLetterOrDigit('a'));  //true
        System.out.println(Character.isLetterOrDigit('!'));  //false

        //you're forlooping to get only the numbers of this string below
        String str  ="0x71C7656EC7ab88b098defB751B7401B5f6d8976F";
        // Create a new string that consists of only numbers from the string

        String onlyNums = "";


        for (int j = 0; j < str.length(); j++) {

            if(Character.isDigit(str.charAt(j))){
                onlyNums += str.charAt(j);
            }

        }

        System.out.println(onlyNums);    //prints 07176567880987517401568976


        System.out.println(Character.isUpperCase('A'));  //true
        System.out.println(Character.isUpperCase('c'));  //false
        System.out.println(Character.isUpperCase('X'));  //true
        System.out.println(Character.isLowerCase('z'));  //true
        System.out.println(Character.isLowerCase('V'));  //false
        System.out.println(Character.isLowerCase('@'));  //false
        System.out.println(Character.isLowerCase('4'));  //false

        // convert a single char to Uppercase/Lowercase

        char a = Character.toUpperCase('a');
        char b = Character.toUpperCase('b');

        System.out.println(a);     //prints A
        System.out.println(b);     //prints B


        // Create a new string that consists of only Uppercase letters from the string

        String allUpper = "";
        for (int j = 0; j < str.length(); j++) {
            if(Character.isUpperCase(str.charAt(j))){
                allUpper += str.charAt(j);
            }
        }

        System.out.println(allUpper);  //CECBBBF

        String text = "hELloWOrLd";  // HeLlOwOrLd

        String diffCAse = "";
        for (int j = 0; j < text.length(); j++) {

            if(j % 2 == 0){
                diffCAse += Character.toUpperCase(text.charAt(j));
            }else{
                diffCAse += Character.toLowerCase(text.charAt(j));
            }


        }

        System.out.println(diffCAse);  //HeLlOwOrLd




    }
}





