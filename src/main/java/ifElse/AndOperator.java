package ifElse;

public class AndOperator {
    public static void main(String[] args) {
        if (2 < 3) {
            System.out.println("hello");
        }
        if (5 < 10) {
            System.out.println("hello");
        }
        //////in one statement

        if (2 < 3 && 5 < 10) {
            System.out.println("bye bye ");
        }

        if (false && true) {
            System.out.println("potato");
            if (true && false) {
                System.out.println("do something");
            }

            if (true && true) {
                System.out.println("finally bye");
            }
        }

        //////////////////////////
        String actualUsername = "sunshine123";
        String actualPassword = "moonlight456!truejkasdhgj";
        String actualEmail = "sunshine123@gmail.com";
        String enteredUserName = "sunshine123";
        String enteredPassword = "moonlight456!true";
        String enteredEmail = "sunshine123@gmail.com ";

        if (actualUsername.equals(enteredUserName) && enteredPassword.equals(actualPassword)) {
            System.out.println("logged in");
        }
        if (!enteredEmail.equals(actualEmail)) {
            System.out.println("recover email");
        }
        if (enteredUserName.equals(actualUsername) && !enteredPassword.equals(actualPassword)) {
            System.out.println("incorrect password,try again");
        }
        if (!enteredUserName.equals(actualUsername)) {
            System.out.println("user name is does not exist");
        }


    }
}
