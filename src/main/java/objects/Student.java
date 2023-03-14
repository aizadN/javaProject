package objects;

public class Student {

    String name;
    int age;
    String major;
    String email;
    String phone;

    public  void read(){

        System.out.println(name +" is reading");
    }
    public  void attendClass (){
        System.out.println(name + "is attending " + major);

    }
    public  void sleep(){
        System.out.println(name + "is sleeping.");
    }
    public void  info(){
        System.out.println("Student's name is " + name + ". And student is " + age + "years old");
        System.out.println("Student age is " + major);
        System.out.println("Student's contact detail (email:" + email + ",phone:" +phone + ")");

    }
}
