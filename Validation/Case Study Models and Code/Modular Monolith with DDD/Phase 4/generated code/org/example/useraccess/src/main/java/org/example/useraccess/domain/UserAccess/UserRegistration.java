package org.example.useraccess.domain.UserAccess;

import java.util.Date;
import javax.persistence.Entity;

@Entity()
public class UserRegistration {

    public UserRegistration() {
    }

    private UserRegistrationId id;

    public UserRegistrationId getId() {
        return id;
    }

    private String _login;

    private String _password;

    private String _email;

    private String _firstName;

    private String _lastName;

    private String _name;

    private Date _registerDate;

    private UserRegistrationStatus userregistrationstatus;

    public UserRegistrationStatus getUserregistrationstatus() {
        return userregistrationstatus;
    }

    public void setUserregistrationstatus(UserRegistrationStatus userregistrationstatus) {
        this.userregistrationstatus = userregistrationstatus;
    }

    private Date _confirmedDate;

    public UserRegistration(UserRegistrationId id, String _login, String _password, String _email, String _firstName, String _lastName, String _name, Date _registerDate, UserRegistrationStatus userregistrationstatus, Date _confirmedDate) {
        this.id = id;
        this._login = _login;
        this._password = _password;
        this._email = _email;
        this._firstName = _firstName;
        this._lastName = _lastName;
        this._name = _name;
        this._registerDate = _registerDate;
        this.userregistrationstatus = userregistrationstatus;
        this._confirmedDate = _confirmedDate;
    }

    private void UserRegistration(String login, String password, String email, String firstName, String lastName, UsersCounter usersCounter, String confirmLink) {
    }

    public void registerNewUser(String login, String password, String email, String firstName, String lastName, UsersCounter usersCounter, String confirmLink) {
    }

    public User createUser() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void confirm() {
    }

    public void expire() {
    }
}
