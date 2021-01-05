package org.example.payments.domain.Payments;

public class NewUserRegisteredIntegrationEvent {

    public NewUserRegisteredIntegrationEvent() {
    }

    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String login;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    private String lastName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public NewUserRegisteredIntegrationEvent(String firstName, String name, String login, String lastName, String userId, String email) {
        this.firstName = firstName;
        this.name = name;
        this.login = login;
        this.lastName = lastName;
        this.userId = userId;
        this.email = email;
    }
}
