package org.example.useraccess.domain.UserAccess;

public class UserRole {

    public UserRole() {
    }

    private String Value;

    public String getValue() {
        return Value;
    }

    public UserRole(String Value) {
        this.Value = Value;
    }

    public UserRole member() {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
