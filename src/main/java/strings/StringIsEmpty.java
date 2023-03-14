package strings;

public class StringIsEmpty {
    public static void main(String[] args) {
        String veggies1 ="potato";
        String veggies2 = "";
        boolean isEmptyVeggie = veggies1.isEmpty();  //false
        System.out.println(isEmptyVeggie);
        System.out.println(veggies2.isEmpty());  //true
    }
}
