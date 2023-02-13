public class using2Indexes {





        public static void main(String[] args) {

// this prints out innofilt, prints characters from both ends of the word together
// minus the middle character

            String str = "inflation";  // innofilta

            // print characters from both ends till they meet in the middle

            // skips the middle char
            for (int i = 0, j = str.length()-1; i < j ; i++, j--) {
                System.out.print("" + str.charAt(i)+ str.charAt(j));

            }
//does the same as above but with the middle character= innofilta
            System.out.println();
            // prints the middle char
            for (int i = 0, j = str.length()-1; i <= j ; i++, j--) {
                if(i == j){
                    System.out.print(str.charAt(i));
                }else{
                    System.out.print("" + str.charAt(i) + str.charAt(j));
                }


            }
            // You can use the above logic to check if string is a palindrome
            // civic, mom, dad, anna,





        }
    }








