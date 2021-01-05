package org.example.meetings.domain.Meetings;

public class MeetingAttendeeFeePaidDomainEvent {

    public MeetingAttendeeFeePaidDomainEvent() {
    }

    private MemberId attendeeId;

    public MemberId getAttendeeId() {
        return attendeeId;
    }

    public void setAttendeeId(MemberId attendeeId) {
        this.attendeeId = attendeeId;
    }

    private MeetingId meetingid;

    public MeetingId getMeetingid() {
        return meetingid;
    }

    public void setMeetingid(MeetingId meetingid) {
        this.meetingid = meetingid;
    }

    public MeetingAttendeeFeePaidDomainEvent(MemberId attendeeId, MeetingId meetingid) {
        this.attendeeId = attendeeId;
        this.meetingid = meetingid;
    }
}
