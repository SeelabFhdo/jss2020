package org.example.meetings.domain.Meetings;

import java.util.Date;

public class MeetingAttendeeAddedDomainEvent {

    public MeetingAttendeeAddedDomainEvent() {
    }

    private Date rsvpDate;

    public Date getRsvpDate() {
        return rsvpDate;
    }

    private String role;

    public String getRole() {
        return role;
    }

    private int guestsNumber;

    public int getGuestsNumber() {
        return guestsNumber;
    }

    private double feeValue;

    public double getFeeValue() {
        return feeValue;
    }

    private String feeCurrency;

    public String getFeeCurrency() {
        return feeCurrency;
    }

    private MeetingId meetingid;

    public MeetingId getMeetingid() {
        return meetingid;
    }

    public void setMeetingid(MeetingId meetingid) {
        this.meetingid = meetingid;
    }

    private MemberId attendeeId;

    public MemberId getAttendeeId() {
        return attendeeId;
    }

    public void setAttendeeId(MemberId attendeeId) {
        this.attendeeId = attendeeId;
    }

    public MeetingAttendeeAddedDomainEvent(Date rsvpDate, String role, int guestsNumber, double feeValue, String feeCurrency, MeetingId meetingid, MemberId attendeeId) {
        this.rsvpDate = rsvpDate;
        this.role = role;
        this.guestsNumber = guestsNumber;
        this.feeValue = feeValue;
        this.feeCurrency = feeCurrency;
        this.meetingid = meetingid;
        this.attendeeId = attendeeId;
    }
}
