package org.example.administration.domain.Administration;

public class MeetingGroupProposalRejectedDomainEvent {

    public MeetingGroupProposalRejectedDomainEvent() {
    }

    private MeetingGroupProposalId meetinggroupproposalid;

    public MeetingGroupProposalId getMeetinggroupproposalid() {
        return meetinggroupproposalid;
    }

    public void setMeetinggroupproposalid(MeetingGroupProposalId meetinggroupproposalid) {
        this.meetinggroupproposalid = meetinggroupproposalid;
    }

    public MeetingGroupProposalRejectedDomainEvent(MeetingGroupProposalId meetinggroupproposalid) {
        this.meetinggroupproposalid = meetinggroupproposalid;
    }
}
