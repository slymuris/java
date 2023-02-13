package math.abstractMethods;

public class stringManupilation {

    static void main(String[] args) {
        String str = "have a nice day nice";
        int last = str.lastIndexOf("nice"); // is gonna give "nice" at the end
        int first = str.indexOf("nice"); //gonna give me"nice in the beginning of sentence

//substring          012345678910
        String s1 = "java is fun";
        String subStr= s1.substring(2,4);
        System.out.println(subStr); //gonna give "ja"
        String subStr1=s1.substring(0);
        System.out.println(subStr1); //gonna give "all of it from 0 till end"

    }
}