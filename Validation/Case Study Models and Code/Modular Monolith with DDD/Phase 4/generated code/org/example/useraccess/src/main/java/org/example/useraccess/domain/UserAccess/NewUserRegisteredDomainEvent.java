package org.example.useraccess.domain.UserAccess;

import java.util.Date;

public class NewUserRegisteredDomainEvent {

    public NewUserRegisteredDomainEvent() {
    }

    private String login;

    public String getLogin() {
        return login;
    }

    private String email;

    public String getEmail() {
        return email;
    }

    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    private String lastName;

    public String getLastName() {
        return lastName;
    }

    private Date registerDate;

    public Date getRegisterDate() {
        return registerDate;
    }

    private String confirmLink;

    public String getConfirmLink() {
        return confirmLink;
    }

    private UserRegistrationId userregistrationid;

    public UserRegistrationId getUserregistrationid() {
        return userregistrationid;
    }

    public void setUserregistrationid(UserRegistrationId userregistrationid) {
        this.userregistrationid = userregistrationid;
    }

    public NewUserRegisteredDomainEvent(String login, String email, String firstName, String lastName, Date registerDate, String confirmLink, UserRegistrationId userregistrationid) {
        this.login = login;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.registerDate = registerDate;
        this.confirmLink = confirmLink;
        this.userregistrationid = userregistrationid;
    }
}
