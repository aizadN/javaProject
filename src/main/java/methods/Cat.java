package methods;

public class Cat {

    static boolean isCarnivare = true;
    static boolean isMamal = true;
    String type ;
    double weight;
    byte age;

    public void eat(){
        System.out.println(type + "is eating");
    }

    public  void sleep ( int hours){
        System.out.println(type + "is sleeping" + hours);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Chicago Zoo! Enter your employee id");

        Cat lion = new Cat();
        Cat tiger = new Cat();
        Cat cheetah = new Cat();
        Cat leopard = new Cat();

        lion.age = 2;
        tiger.age = 4;
        cheetah.age = 3;

        cheetah.sleep(4);
        tiger.isMamal =  false;
        System.out.println(lion.isMamal);
        System.out.println(isMamal);





    }



}
