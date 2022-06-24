package model;

public class UserInfoBuilder {
    private String username;
    private String firstName;
    private String lastName;
    private String nickname;
    private String email;
    private String website;
    private String password;
    private String repeatedPassword;

    public UserInfo build() {
        return new UserInfo(username, firstName, lastName, nickname, email, website, password, repeatedPassword);
    }

    public UserInfoBuilder withUsername(String username) {
        this.username = username;
        return this;
    }

    public UserInfoBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UserInfoBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public UserInfoBuilder withPassword(String password) {
        this.password = password;
        return this;
    }

    public UserInfoBuilder withEmail(String email) {
        this.email = email;
        return this;
    }
}
