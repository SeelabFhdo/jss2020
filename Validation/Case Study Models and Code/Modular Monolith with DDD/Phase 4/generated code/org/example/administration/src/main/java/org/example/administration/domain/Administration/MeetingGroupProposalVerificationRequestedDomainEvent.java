package org.example.administration.domain.Administration;

public class MeetingGroupProposalVerificationRequestedDomainEvent {

    public MeetingGroupProposalVerificationRequestedDomainEvent() {
    }

    private MeetingGroupProposalId meetinggroupproposalid;

    public MeetingGroupProposalId getMeetinggroupproposalid() {
        return meetinggroupproposalid;
    }

    public void setMeetinggroupproposalid(MeetingGroupProposalId meetinggroupproposalid) {
        this.meetinggroupproposalid = meetinggroupproposalid;
    }

    public MeetingGroupProposalVerificationRequestedDomainEvent(MeetingGroupProposalId meetinggroupproposalid) {
        this.meetinggroupproposalid = meetinggroupproposalid;
    }
}
