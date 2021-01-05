package org.example.meetings.domain.Meetings;

public class MeetingAttendeeRole {

    public MeetingAttendeeRole() {
    }

    private String Value;

    public String getValue() {
        return Value;
    }

    public MeetingAttendeeRole(String Value) {
        this.Value = Value;
    }

    public MeetingAttendeeRole Host() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public MeetingAttendeeRole Attendee() {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
