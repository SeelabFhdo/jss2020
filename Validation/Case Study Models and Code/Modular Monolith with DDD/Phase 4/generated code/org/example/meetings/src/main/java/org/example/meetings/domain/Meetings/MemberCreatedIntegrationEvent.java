package org.example.meetings.domain.Meetings;

import java.util.Date;

public class MemberCreatedIntegrationEvent {

    public MemberCreatedIntegrationEvent() {
    }

    private String memberId;

    public String getMemberId() {
        return memberId;
    }

    private String id;

    public String getId() {
        return id;
    }

    private Date occurredOn;

    public Date getOccurredOn() {
        return occurredOn;
    }

    public MemberCreatedIntegrationEvent(String memberId, String id, Date occurredOn) {
        this.memberId = memberId;
        this.id = id;
        this.occurredOn = occurredOn;
    }
}
