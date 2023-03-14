package objects;

import java.sql.SQLOutput;

public class Programmer {

    int age;
    String name;
    String gender;
   static  String profession = "programmer";


    public static void main(String[] args) {
        Programmer object1 = new Programmer();
      object1.age = 25;
       object1.name = "Mark";


        Programmer object2 = new Programmer();
        object2.age = 25;
        object2.name = "Bill";

        System.out.println(object1.name) ;///mark
        System.out.println(object1.gender);//null
        System.out.println(object1.profession);//programmer
        System.out.println(object2.name);//bill
        System.out.println(object1.profession);//programmer
        System.out.println(Programmer.profession ) ; //programmer





    }
}
