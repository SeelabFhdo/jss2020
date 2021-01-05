package org.example.useraccess.domain.UserAccess;

public class RegisterNewUserCommand {

    public RegisterNewUserCommand() {
    }

    private String login;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private String lastName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String confirmLink;

    public String getConfirmLink() {
        return confirmLink;
    }

    public void setConfirmLink(String confirmLink) {
        this.confirmLink = confirmLink;
    }

    public RegisterNewUserCommand(String login, String password, String email, String firstName, String lastName, String confirmLink) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.confirmLink = confirmLink;
    }
}
