package model;

public class UserInfo {
    private String username;
    private String firstName;
    private String lastName;
    private String nickname;
    private String email;
    private String website;
    private String password;
    private String repeatedPassword;

    public UserInfo(String username, String firstName, String lastName, String nickname, String email, String website, String password, String repeatedPassword) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickname = nickname;
        this.email = email;
        this.website = website;
        this.password = password;
        this.repeatedPassword = repeatedPassword;
    }

    public UserInfo(String username, String email, String password, String repeatedPassword) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.repeatedPassword = repeatedPassword;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNickname() {
        return nickname;
    }

    public String getEmail() {
        return email;
    }

    public String getWebsite() {
        return website;
    }

    public String getPassword() {
        return password;
    }

    public String getRepeatedPassword() {
        return repeatedPassword;
    }
}
