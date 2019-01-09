package builder;

public class User {

    private final String id;
    private final String firstName;
    private final String lastName;
    private final String email;

    public User(UserBuilder builder) {
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
    }

    public static class UserBuilder {
        private final String id;
        private final String firstName;
        private String lastName;
        private String email;

        public UserBuilder(String id, String firstName) {
            this.id = id;
            this.firstName = firstName;
        }

        public UserBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
