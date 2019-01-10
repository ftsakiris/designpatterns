package interface_builder;

public class DefaultUser implements User {

    private final String firstName;
    private final String lastName;

    protected String phone;
    protected String address;

    public DefaultUser(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public DefaultUser(Builder builder) {
        this(builder.getFirstName(), builder.getLastName());
        this.phone = builder.phone;
        this.address = builder.address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    class Builder extends DefaultUser {

        public Builder(String firstName, String lastName) {
            super(firstName, lastName);
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new DefaultUser(this);
        }
    }
}