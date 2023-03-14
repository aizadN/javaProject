package ifElse;

import strings.StringReplace;

public class IfElseIF {
    public static void main(String[] args) {


        if (2<5){
            System.out.println("2 is less then 5");
        }else if(2>5) {
            System.out.println( "2 is more than 5");
        }else{
            System.out.println("2 is equal to 5");
        }

        if (20<5){
            System.out.println("2 is less then 5");
        }else if(2>5) {
            System.out.println( "2 is more than 5");
        }else{
            System.out.println("2 is equal to 5");
        }

        if (20<5){
            System.out.println("2 is less then 5");
        }else if(2>5) {
            System.out.println( "2 is more than 5");
        }else if (100 == 19){
            System.out.println("whatever");
        }else if ("apple".equals("apple")){
            System.out.println("false");

        }
        else{
            System.out.println("2 is equal to 5 ");
        }



        String actualPassword = "abc123";
        String enteredPassword = "Abc123";
        if(actualPassword.equals(enteredPassword)){
            System.out.println("Successfuly logged in");
        }

    }
}
