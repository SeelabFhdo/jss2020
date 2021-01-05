package org.example.policy.domain.policy;

import java.util.Date;
import org.springframework.stereotype.Service;

@Service()
public class RiskManagementService {

    public RiskManagementService() {
    }

    public PolicyEvent notifyRiskManagement(long originator, Date date, CustomerShared customer, PolicyAggregateRoot policy) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
