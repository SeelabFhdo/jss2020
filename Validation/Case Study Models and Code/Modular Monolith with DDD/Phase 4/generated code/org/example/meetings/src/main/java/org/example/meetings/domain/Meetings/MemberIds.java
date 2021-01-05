package org.example.meetings.domain.Meetings;

import java.util.ArrayList;

public class MemberIds extends ArrayList<MemberIds.MemberIdsItem> {

    public static class MemberIdsItem {

        public MemberIdsItem() {
        }

        private MemberId i;

        public MemberId getI() {
            return i;
        }

        public void setI(MemberId i) {
            this.i = i;
        }

        public MemberIdsItem(MemberId i) {
            this.i = i;
        }
    }
}
