package arithmeticOperators;

public class AssignmentEqualOperators {
    public static void main(String[] args) {
        /*
         = Assingment operator (naznachat)(when you give value to variable)
         == equal equal operator (compares 2 variables if they are equal or not )

         != not equal operator (compares if two variables are not equal)

         */

        int number1 = 10; //assignment
        int number2 = 8; //
        System.out.println(number1 == number2);
        System.out.println(100 == 100); //true - boolean

        boolean isEqual = 100 == 101;
        System.out.println(isEqual); //false


        boolean isEven;
        isEven = 80 % 2 == 0;

        System.out.println(isEven); //true

        isEven = 4 % 2 == 0; //true
        System.out.println(isEven);

        int usersAge = 43;
        System.out.println(usersAge % 2 == 0); //false


    }

}
