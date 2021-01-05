package org.example.meetings.domain.Meetings;

public class MemberCreatedDomainEvent {

    public MemberCreatedDomainEvent() {
    }

    private MemberId memberid;

    public MemberId getMemberid() {
        return memberid;
    }

    public void setMemberid(MemberId memberid) {
        this.memberid = memberid;
    }

    public MemberCreatedDomainEvent(MemberId memberid) {
        this.memberid = memberid;
    }
}
