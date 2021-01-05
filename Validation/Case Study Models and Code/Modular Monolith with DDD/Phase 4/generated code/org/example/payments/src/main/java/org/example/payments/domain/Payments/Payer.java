package org.example.payments.domain.Payments;

import java.util.Date;
import javax.persistence.Entity;

@Entity()
public class Payer {

    public Payer() {
    }

    private String _login;

    private String _email;

    private String _firstName;

    private String _lastName;

    private String _name;

    private Date _createDate;

    public Payer(String _login, String _email, String _firstName, String _lastName, String _name, Date _createDate) {
        this._login = _login;
        this._email = _email;
        this._firstName = _firstName;
        this._lastName = _lastName;
        this._name = _name;
        this._createDate = _createDate;
    }

    public Payer create(long id, String login, String email, String firstName, String lastName, String name) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private void whenPayerCreated(PayerCreatedDomainEvent event) {
    }
}
