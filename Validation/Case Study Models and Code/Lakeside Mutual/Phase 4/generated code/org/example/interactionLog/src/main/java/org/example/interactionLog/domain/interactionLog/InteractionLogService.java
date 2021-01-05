package org.example.interactionLog.domain.interactionLog;

import org.springframework.stereotype.Service;

@Service()
public class InteractionLogService {

    public InteractionLogService() {
    }

    private InteractionLogRepository repository;

    public InteractionLogRepository getRepository() {
        return repository;
    }

    public void setRepository(InteractionLogRepository repository) {
        this.repository = repository;
    }

    public InteractionLogService(InteractionLogRepository repository) {
        this.repository = repository;
    }

    public ListNotification getNotifications() {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
