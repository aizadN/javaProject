package objects;

public class Animal {
    /*
    create variables and methods that belongs to animals
     */
     String type;
      boolean isMammal;
     boolean isCarnivare;
     int  age;
     String habitant;

     public void eat(){
         System.out.println( type + "is carnivore: " + isCarnivare +  " is eating");

    }

    public void sleep(){
        System.out.println( type + " is sleeping " + habitant);
    }
    public  void play(){
        System.out.println(type + " is playing");
    }
    public void jump(){
        System.out.println(type + " is jumping");
    }

    public void info(){
        System.out.println("Animal's type is " + type );
        System.out.println("Animal is " + isMammal);
        System.out.println("Animal is " + age);
        System.out.println("Animal is " + habitant);
    }
}
