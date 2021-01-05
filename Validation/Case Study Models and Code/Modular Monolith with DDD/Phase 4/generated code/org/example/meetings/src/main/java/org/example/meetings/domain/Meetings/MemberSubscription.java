package org.example.meetings.domain.Meetings;

import java.util.Date;
import javax.persistence.Entity;

@Entity()
public class MemberSubscription {

    public MemberSubscription() {
    }

    private MemberSubscriptionId Id;

    public MemberSubscriptionId getId() {
        return Id;
    }

    private Date _expirationDate;

    public MemberSubscription(MemberSubscriptionId Id, Date _expirationDate) {
        this.Id = Id;
        this._expirationDate = _expirationDate;
    }

    private void MemberSubscription(MemberId memberId, Date expirationDate) {
    }

    public MemberSubscription createForMember(MemberId memberId, Date expirationDate) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void changeExpirationDate(Date expirationDate) {
    }
}
