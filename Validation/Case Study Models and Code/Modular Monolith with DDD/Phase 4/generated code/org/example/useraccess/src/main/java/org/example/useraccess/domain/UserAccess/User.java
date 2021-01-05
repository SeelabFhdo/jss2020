package org.example.useraccess.domain.UserAccess;

import javax.persistence.Entity;

@Entity()
public class User {

    public User() {
    }

    private UserId userId;

    public UserId getUserId() {
        return userId;
    }

    private String _login;

    private String _password;

    private String _email;

    private boolean _isActive;

    private String _firstName;

    private String _lastName;

    private String _name;

    private ListUserRole userrole;

    public ListUserRole getUserrole() {
        return userrole;
    }

    public void setUserrole(ListUserRole userrole) {
        this.userrole = userrole;
    }

    public User(UserId userId, String _login, String _password, String _email, boolean _isActive, String _firstName, String _lastName, String _name, ListUserRole userrole) {
        this.userId = userId;
        this._login = _login;
        this._password = _password;
        this._email = _email;
        this._isActive = _isActive;
        this._firstName = _firstName;
        this._lastName = _lastName;
        this._name = _name;
        this.userrole = userrole;
    }

    public void createFromUserRegistration(UserRegistrationId userRegistrationId, String login, String password, String email, String firstName, String lastName, String name) {
    }

    private void User(UserRegistrationId userRegistrationId, String login, String password, String email, String firstName, String lastName, String name) {
    }
}
