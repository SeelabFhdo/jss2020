package org.example.meetings.domain.Meetings;

import java.util.Date;

public class MeetingCanceledDomainEvent {

    public MeetingCanceledDomainEvent() {
    }

    private Date cancelDate;

    public Date getCancelDate() {
        return cancelDate;
    }

    private MeetingId meetingid;

    public MeetingId getMeetingid() {
        return meetingid;
    }

    public void setMeetingid(MeetingId meetingid) {
        this.meetingid = meetingid;
    }

    private MemberId cancelMemberId;

    public MemberId getCancelMemberId() {
        return cancelMemberId;
    }

    public void setCancelMemberId(MemberId cancelMemberId) {
        this.cancelMemberId = cancelMemberId;
    }

    public MeetingCanceledDomainEvent(Date cancelDate, MeetingId meetingid, MemberId cancelMemberId) {
        this.cancelDate = cancelDate;
        this.meetingid = meetingid;
        this.cancelMemberId = cancelMemberId;
    }
}
