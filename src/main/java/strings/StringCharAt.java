package strings;

public class StringCharAt {
    public static void main(String[] args) {
     String welcomeSing = "Hello everyone! Welcome to Chicago";
        char c = welcomeSing.charAt(14);
        System.out.println(c);   //!
        char cc = welcomeSing.charAt(2);//l
        System.out.println(cc);
        char  vv = welcomeSing.charAt(0); //H
        System.out.println(vv);
        System.out.println( welcomeSing.length()); //34
        System.out.println(welcomeSing.charAt(welcomeSing.length() -1)); //o




    }
}
