package org.example.interactionLog.service.InteractionLog;

import de.fhdo.lemma.msa.services.LemmaMicroservice;
import de.fhdo.lemma.msa.services.LemmaMicroserviceType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@LemmaMicroservice(type = LemmaMicroserviceType.FUNCTIONAL)
@SpringBootApplication(scanBasePackages = "org.example.interactionLog")
public class InteractionLog {

    public static void main(String[] args) {
        SpringApplication.run(InteractionLog.class, args);
    }
}
