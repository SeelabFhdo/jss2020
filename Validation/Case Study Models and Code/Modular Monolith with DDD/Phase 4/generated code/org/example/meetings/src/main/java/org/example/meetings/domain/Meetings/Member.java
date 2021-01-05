package org.example.meetings.domain.Meetings;

import java.util.Date;
import javax.persistence.Entity;

@Entity()
public class Member {

    public Member() {
    }

    private MemberId Id;

    public MemberId getId() {
        return Id;
    }

    private String _login;

    private String _email;

    private String _firstName;

    private String _lastName;

    private String _name;

    private Date _createDate;

    public Member(MemberId Id, String _login, String _email, String _firstName, String _lastName, String _name, Date _createDate) {
        this.Id = Id;
        this._login = _login;
        this._email = _email;
        this._firstName = _firstName;
        this._lastName = _lastName;
        this._name = _name;
        this._createDate = _createDate;
    }

    public Member create(String id, String login, String email, String firstName, String lastName, String name) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private void Member(String id, String login, String email, String firstName, String lastName, String name) {
    }
}
