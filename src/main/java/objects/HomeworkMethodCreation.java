package objects;

public class HomeworkMethodCreation {

    /*


Create a public static method that takes two integers and returns the multiplication of 2 ints.
Create a public instance method that takes a String and returns a new String with all lowercase letters.
Create a public instance method that takes two integers, divides one int by another and returns the result as a double.
Create a static method that takes a string and returns true if it is a palindrome (reads the same forwards and backwards) and false otherwise.
Create an instance method that takes a double and returns that double multiplied by 100.
Create a static method that takes a char and returns true if it is a consonant (a letter that is not a vowel) and false otherwise.
Create a public instance method that takes two integers and returns true if difference between them equals to 5 or -5, else false.
Create an instance method that takes a String and returns true if it is a valid email address format (contains "@" and ".") and false otherwise.
Create a public instance method that takes an integer and returns true if it is a prime number and false otherwise.
Create a static method that takes two integers and returns true if they have the same parity (both even or both odd) and false otherwise.


     */

   //9 Create a public instance method that takes an integer and returns true if it is a prime number and false otherwise.
    public boolean idPrime(int number) {
        boolean result = true;
            if (number % 2 == 0 || number % 3 != 0 || number % 5 == 0) {
                result = false;
            }
            return result;
        }
    }







