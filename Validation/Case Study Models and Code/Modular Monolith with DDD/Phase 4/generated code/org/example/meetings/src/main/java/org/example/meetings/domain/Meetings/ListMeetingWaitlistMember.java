package org.example.meetings.domain.Meetings;

import java.util.ArrayList;

public class ListMeetingWaitlistMember extends ArrayList<ListMeetingWaitlistMember.ListMeetingWaitlistMemberItem> {

    public static class ListMeetingWaitlistMemberItem {

        public ListMeetingWaitlistMemberItem() {
        }

        private MeetingWaitlistMember meetingWaitlistMember;

        public MeetingWaitlistMember getMeetingWaitlistMember() {
            return meetingWaitlistMember;
        }

        public void setMeetingWaitlistMember(MeetingWaitlistMember meetingWaitlistMember) {
            this.meetingWaitlistMember = meetingWaitlistMember;
        }

        public ListMeetingWaitlistMemberItem(MeetingWaitlistMember meetingWaitlistMember) {
            this.meetingWaitlistMember = meetingWaitlistMember;
        }
    }
}
