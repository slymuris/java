package math;

public class forLoop {
    public static void main(String[] args) {
        //String str = "java";
        System.out.println(isVowelPresent("jvvv"));
//checking for vowels "a, i, e, o, u' in a string
    }

    public static boolean isVowelPresent(String str) {
        str = str.toLowerCase(); //make it lowercase or it wont detect the vowels
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u') {
                return true;
            }
        }
        return false;
    }
}
// if you want those vowels in the string printed

//public static void isVowelPresent(String str) {
    //str = str.toLowerCase(); //make it lowercase or it wont detect the vowels
   // for (int i = 0; i < str.length(); i++) {
       // char ch = str.charAt(i);
       // if (ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u') {
     //System.out.print(ch);


//if you want it to check for continents and not vowels
//if (!(ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u')) {
//and add the capital versions of the letters above ^