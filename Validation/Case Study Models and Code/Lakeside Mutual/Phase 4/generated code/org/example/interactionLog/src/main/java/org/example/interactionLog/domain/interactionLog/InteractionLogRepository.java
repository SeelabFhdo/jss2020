package org.example.interactionLog.domain.interactionLog;

import org.springframework.stereotype.Repository;

@Repository()
public class InteractionLogRepository {

    public InteractionLogRepository() {
    }

    private ListInteractionLogAggregateRoot interactions;

    public ListInteractionLogAggregateRoot getInteractions() {
        return interactions;
    }

    public void setInteractions(ListInteractionLogAggregateRoot interactions) {
        this.interactions = interactions;
    }

    public InteractionLogRepository(ListInteractionLogAggregateRoot interactions) {
        this.interactions = interactions;
    }
}
