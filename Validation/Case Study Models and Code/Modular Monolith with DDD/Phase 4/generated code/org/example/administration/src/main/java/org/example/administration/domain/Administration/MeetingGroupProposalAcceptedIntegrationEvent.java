package org.example.administration.domain.Administration;

import java.util.Date;

public class MeetingGroupProposalAcceptedIntegrationEvent {

    public MeetingGroupProposalAcceptedIntegrationEvent() {
    }

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private Date occurredOn;

    public Date getOccurredOn() {
        return occurredOn;
    }

    public void setOccurredOn(Date occurredOn) {
        this.occurredOn = occurredOn;
    }

    private String meetingGroupProposalId;

    public String getMeetingGroupProposalId() {
        return meetingGroupProposalId;
    }

    public void setMeetingGroupProposalId(String meetingGroupProposalId) {
        this.meetingGroupProposalId = meetingGroupProposalId;
    }

    public MeetingGroupProposalAcceptedIntegrationEvent(String id, Date occurredOn, String meetingGroupProposalId) {
        this.id = id;
        this.occurredOn = occurredOn;
        this.meetingGroupProposalId = meetingGroupProposalId;
    }
}
