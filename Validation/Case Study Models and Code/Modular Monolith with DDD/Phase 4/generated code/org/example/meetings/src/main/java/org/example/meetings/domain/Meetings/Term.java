package org.example.meetings.domain.Meetings;

import java.util.Date;

public class Term {

    public Term() {
    }

    private Date StartDate;

    public Date getStartDate() {
        return StartDate;
    }

    private Date EndDate;

    public Date getEndDate() {
        return EndDate;
    }

    public Term(Date StartDate, Date EndDate) {
        this.StartDate = StartDate;
        this.EndDate = EndDate;
    }

    public Term noTerm() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public Term createNewBetweenDates(Date startDate, Date endDate) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public boolean isInTerm(Date date) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
