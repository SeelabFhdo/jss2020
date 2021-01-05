package org.example.administration.domain.Administration;

import java.util.Date;
import javax.persistence.Entity;

@Entity()
public class Member {

    public Member() {
    }

    private MemberId id;

    public MemberId getId() {
        return id;
    }

    private String _login;

    public String get_login() {
        return _login;
    }

    public void set_login(String _login) {
        this._login = _login;
    }

    private String _email;

    public String get_email() {
        return _email;
    }

    public void set_email(String _email) {
        this._email = _email;
    }

    private String _firstName;

    public String get_firstName() {
        return _firstName;
    }

    public void set_firstName(String _firstName) {
        this._firstName = _firstName;
    }

    private String _lastName;

    public String get_lastName() {
        return _lastName;
    }

    public void set_lastName(String _lastName) {
        this._lastName = _lastName;
    }

    private String _name;

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    private Date _createDate;

    public Date get_createDate() {
        return _createDate;
    }

    public void set_createDate(Date _createDate) {
        this._createDate = _createDate;
    }

    public Member(MemberId id, String _login, String _email, String _firstName, String _lastName, String _name, Date _createDate) {
        this.id = id;
        this._login = _login;
        this._email = _email;
        this._firstName = _firstName;
        this._lastName = _lastName;
        this._name = _name;
        this._createDate = _createDate;
    }

    private void Member(String id, String login, String email, String firstName, String lastName, String name) {
    }

    public Member create(String id, String login, String email, String firstName, String lastName, String name) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
