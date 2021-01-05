package org.example.meetings.domain.Meetings;

import java.util.ArrayList;

public class ListMeetingAttendee extends ArrayList<ListMeetingAttendee.ListMeetingAttendeeItem> {

    public static class ListMeetingAttendeeItem {

        public ListMeetingAttendeeItem() {
        }

        private MeetingAttendee meetingAttendee;

        public MeetingAttendee getMeetingAttendee() {
            return meetingAttendee;
        }

        public void setMeetingAttendee(MeetingAttendee meetingAttendee) {
            this.meetingAttendee = meetingAttendee;
        }

        public ListMeetingAttendeeItem(MeetingAttendee meetingAttendee) {
            this.meetingAttendee = meetingAttendee;
        }
    }
}
