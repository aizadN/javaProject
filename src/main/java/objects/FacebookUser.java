package objects;

public class FacebookUser {
    String username;
    String password;
    String firstName;
    String lastName;


    public void login(String username, String password){
        System.out.println(username + " logged in to the application");
    }

    public static void main(String[] args) {
        FacebookUser user = new FacebookUser();
        user.login("abc", "abc123");
        user.username = "tokyo";
        user.password = "abc123";

        FacebookUser user2 = new FacebookUser();
        user2 .username = " bena";
        user.password = "2023";
        user.login(user2.username, user2.password);

    }
}
