package ifElse;

public class PracticeBooleanStatements {
    public static void main(String[] args) {
        String str = "apple";
        boolean b2 = str.equals(str);
        System.out.println(b2); ///true


        boolean a1 = 120 <1;
        System.out.println(a1); //false
        boolean a2 = 130>=45;
        System.out.println(a2); //true
        boolean a3 = 120==45;
        System.out.println(a3); //false
        boolean a4 = 1 >=888;
        System.out.println(a4);//false

        String str2 = "strawberry";
        String str3 = "banana";
        System.out.println(str2.equals(str3)); //false
        System.out.println(!str2.equals(str3)); //  //true

        String aa = "Hello";
        String bb = "HELLOO";

        System.out.println(aa.equals(bb));// false
        System.out.println(aa.equals(bb) + aa.toUpperCase());

        int usersAge = 48;
        int user = 34;
        System.out.println(usersAge / 3 == 0); //false
        System.out.println(user % 2 >= 0); // true

         String  tt = "codewise";
        System.out.println(tt.startsWith("H")); //FALSE
        System.out.println(tt.length() == 0); //false





    }
}
