package objects;

public class Zoo {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.type = " Giraffe";
        animal1.isMammal = false ;
        animal1.isCarnivare = true;
        animal1.age = 3;
        animal1.habitant = "Africa";


        Animal animal2 = new Animal();
        animal2.type = "Crocodile";
        animal2.isCarnivare = true;
        animal2.isMammal = false;
        animal2.age = 2;
        animal2.habitant = "Africa";


        animal1.eat();
        animal2.eat();

        animal2.sleep();
        animal1.sleep();

        animal1.play();
        animal2.play();


    }
}
