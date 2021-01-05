package org.example.meetings.domain.Meetings;

import java.util.ArrayList;

public class ListMeetingNotAttendee extends ArrayList<ListMeetingNotAttendee.ListMeetingNotAttendeeItem> {

    public static class ListMeetingNotAttendeeItem {

        public ListMeetingNotAttendeeItem() {
        }

        private MeetingNotAttendee meetingNotAttendee;

        public MeetingNotAttendee getMeetingNotAttendee() {
            return meetingNotAttendee;
        }

        public void setMeetingNotAttendee(MeetingNotAttendee meetingNotAttendee) {
            this.meetingNotAttendee = meetingNotAttendee;
        }

        public ListMeetingNotAttendeeItem(MeetingNotAttendee meetingNotAttendee) {
            this.meetingNotAttendee = meetingNotAttendee;
        }
    }
}
