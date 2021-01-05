package org.example.useraccess.domain.UserAccess;

public class UserRegistrationStatus {

    public UserRegistrationStatus() {
    }

    private String Value;

    public String getValue() {
        return Value;
    }

    public UserRegistrationStatus(String Value) {
        this.Value = Value;
    }

    public UserRegistrationStatus waitingForConfirmation() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public UserRegistrationStatus confirmed() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public UserRegistrationStatus expired() {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
