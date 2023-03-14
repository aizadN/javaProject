package ifElse;

import java.util.Scanner;

public class ContainsI {
    public static void main(String[] args) {
//
//        String word = "hello everyone";
//        if( word.contains("e")){
//            System.out.println(word.indexOf('e'));
//        }
//        if (word.contains("l")){
//            System.out.println(word.indexOf('l'));
//        }
//        else{
//            System.out.println("thw word does not contais e ");
//        }

////////////////////////

        String word = "hello everyone";
        if( word.contains("e")){
            System.out.println(word.indexOf('e'));
        }
        else if (word.contains("l")){
            System.out.println(word.indexOf('l'));
        }
        else{
            System.out.println("thw word does not contais e ");  ///1 toest index of e equals to 1
        }


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 digit zipcode");

        int zipCode = sc.nextInt();
        String zip  = zipCode + "";
        if ((zip.length()) == 5  && !zip.contains("9") &&  !zip.startsWith("0")){
            System.out.println("The entered zipcode is valid");
        }
        else{
            System.out.println("The entered zipcode is not valid ");
        }

    }
}
