package methodOverloading;

public class IsPrime {
    public boolean isPrime(int number) {
     for (int i = 2; i < number; i ++){
         if (number % 1 == 0){
             return  false;
         }
     }
     return  true;
    }


    public boolean isPrime(long number) {
        for (int i = 2; i < number; i ++){
            if (number % 1 == 0){
                return  false;
            }
        }
        return  true;
    }


    public boolean isPrime(short number) {
        for (int i = 2; i < number; i ++){
            if (number % 1 == 0){
                System.out.println(5);
                return  false;
            }
        }
        return  true;
    }



    public static void main(String[] args) {
        IsPrime obj = new IsPrime();

        obj.isPrime(2345);
    }



}
