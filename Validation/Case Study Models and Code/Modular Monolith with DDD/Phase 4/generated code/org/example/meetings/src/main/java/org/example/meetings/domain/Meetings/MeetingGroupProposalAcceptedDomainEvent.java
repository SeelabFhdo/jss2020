package org.example.meetings.domain.Meetings;

public class MeetingGroupProposalAcceptedDomainEvent {

    public MeetingGroupProposalAcceptedDomainEvent() {
    }

    private MeetingGroupProposalId meetinggroupproposalid;

    public MeetingGroupProposalId getMeetinggroupproposalid() {
        return meetinggroupproposalid;
    }

    public void setMeetinggroupproposalid(MeetingGroupProposalId meetinggroupproposalid) {
        this.meetinggroupproposalid = meetinggroupproposalid;
    }

    public MeetingGroupProposalAcceptedDomainEvent(MeetingGroupProposalId meetinggroupproposalid) {
        this.meetinggroupproposalid = meetinggroupproposalid;
    }
}
