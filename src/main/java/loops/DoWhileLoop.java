package loops;

public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);



        int number = 1;
        do {
            if (number % 2 != 0) {
                System.out.println(number);
            }

            number++;

        } while ( number <= 100);
    }
}