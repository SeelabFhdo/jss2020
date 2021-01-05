package org.example.meetings.domain.Meetings;

import java.util.Date;

public class MemberSubscriptionExpirationDateChangedDomainEvent {

    public MemberSubscriptionExpirationDateChangedDomainEvent() {
    }

    private Date expirationDate;

    public Date getExpirationDate() {
        return expirationDate;
    }

    private MemberId memberid;

    public MemberId getMemberid() {
        return memberid;
    }

    public void setMemberid(MemberId memberid) {
        this.memberid = memberid;
    }

    public MemberSubscriptionExpirationDateChangedDomainEvent(Date expirationDate, MemberId memberid) {
        this.expirationDate = expirationDate;
        this.memberid = memberid;
    }
}
