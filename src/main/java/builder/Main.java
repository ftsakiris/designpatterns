package builder;

public class Main {

    public static void main(String[] args) {

        User user = new User.UserBuilder("a", "dsd")
                .email("@dsds").build();
    }

}