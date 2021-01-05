package org.example.useraccess.domain.UserAccess;

public class UserRegistrationConfirmedDomainEvent {

    public UserRegistrationConfirmedDomainEvent() {
    }

    private UserRegistrationId userregistrationid;

    public UserRegistrationId getUserregistrationid() {
        return userregistrationid;
    }

    public void setUserregistrationid(UserRegistrationId userregistrationid) {
        this.userregistrationid = userregistrationid;
    }

    public UserRegistrationConfirmedDomainEvent(UserRegistrationId userregistrationid) {
        this.userregistrationid = userregistrationid;
    }
}
