package org.example.meetings.domain.Meetings;

import java.util.ArrayList;

public class MeetingGroupMembers extends ArrayList<MeetingGroupMembers.MeetingGroupMembersItem> {

    public static class MeetingGroupMembersItem {

        public MeetingGroupMembersItem() {
        }

        private MeetingGroupMember m;

        public MeetingGroupMember getM() {
            return m;
        }

        public void setM(MeetingGroupMember m) {
            this.m = m;
        }

        public MeetingGroupMembersItem(MeetingGroupMember m) {
            this.m = m;
        }
    }
}
