package org.example.useraccess.domain.UserAccess;

public class UserCreatedDomainEvent {

    public UserCreatedDomainEvent() {
    }

    private UserId userid;

    public UserId getUserid() {
        return userid;
    }

    public void setUserid(UserId userid) {
        this.userid = userid;
    }

    public UserCreatedDomainEvent(UserId userid) {
        this.userid = userid;
    }
}
