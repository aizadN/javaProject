package objects;

public class School {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Leo";
        student1.phone = "12345668";
        student1.email = "leo@gmail.com";
        student1.age = 18;
        student1.major = "law";


        Student student2 = new Student();
        student2.name = "Aizad";
        student2.age = 5;
        student2.phone = "566777";
        student2.major = "Accounting";
        student2.email = "hjhvjfhnfj";

        student1.read();
        student2.read();

        student1.attendClass();
        student2.attendClass();

        student1.info();
        student2.info();



    }
}
