package org.example.payments.domain.Payments;

public class PayerCreatedDomainEvent {

    public PayerCreatedDomainEvent() {
    }

    private String payerId;

    public String getPayerId() {
        return payerId;
    }

    private String login;

    public String getLogin() {
        return login;
    }

    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    private String lastName;

    public String getLastName() {
        return lastName;
    }

    private String name;

    public String getName() {
        return name;
    }

    private String email;

    public String getEmail() {
        return email;
    }

    public PayerCreatedDomainEvent(String payerId, String login, String firstName, String lastName, String name, String email) {
        this.payerId = payerId;
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
        this.name = name;
        this.email = email;
    }
}
