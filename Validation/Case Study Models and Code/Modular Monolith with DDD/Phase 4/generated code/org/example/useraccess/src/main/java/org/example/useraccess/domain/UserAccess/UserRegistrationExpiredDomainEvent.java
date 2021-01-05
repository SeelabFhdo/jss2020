package org.example.useraccess.domain.UserAccess;

public class UserRegistrationExpiredDomainEvent {

    public UserRegistrationExpiredDomainEvent() {
    }

    private UserRegistrationId userregistrationid;

    public UserRegistrationId getUserregistrationid() {
        return userregistrationid;
    }

    public void setUserregistrationid(UserRegistrationId userregistrationid) {
        this.userregistrationid = userregistrationid;
    }

    public UserRegistrationExpiredDomainEvent(UserRegistrationId userregistrationid) {
        this.userregistrationid = userregistrationid;
    }
}
