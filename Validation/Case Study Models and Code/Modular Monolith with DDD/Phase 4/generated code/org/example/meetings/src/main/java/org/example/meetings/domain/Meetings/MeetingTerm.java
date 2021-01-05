package org.example.meetings.domain.Meetings;

import java.util.Date;

public class MeetingTerm {

    public MeetingTerm() {
    }

    private Date StartDate;

    public Date getStartDate() {
        return StartDate;
    }

    private Date EndDate;

    public Date getEndDate() {
        return EndDate;
    }

    public MeetingTerm(Date StartDate, Date EndDate) {
        this.StartDate = StartDate;
        this.EndDate = EndDate;
    }

    public MeetingTerm createNewBetweenDates(Date startDate, Date endDate) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public boolean isAfterStart() {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
