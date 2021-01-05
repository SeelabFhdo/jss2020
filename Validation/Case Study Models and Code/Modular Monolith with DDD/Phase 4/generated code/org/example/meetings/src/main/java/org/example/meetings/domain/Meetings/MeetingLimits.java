package org.example.meetings.domain.Meetings;

public class MeetingLimits {

    public MeetingLimits() {
    }

    private int AttendeesLimit;

    public int getAttendeesLimit() {
        return AttendeesLimit;
    }

    private int GuestsLimit;

    public int getGuestsLimit() {
        return GuestsLimit;
    }

    public MeetingLimits(int AttendeesLimit, int GuestsLimit) {
        this.AttendeesLimit = AttendeesLimit;
        this.GuestsLimit = GuestsLimit;
    }

    public MeetingLimits create(int attendeesLimit, int guestsLimit) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
