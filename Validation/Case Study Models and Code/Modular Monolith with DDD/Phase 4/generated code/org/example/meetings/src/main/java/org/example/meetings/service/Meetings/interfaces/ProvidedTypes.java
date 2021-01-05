package org.example.meetings.service.Meetings.interfaces;

import org.example.meetings.domain.Meetings.Member;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

@Component()
@RestController()
public class ProvidedTypes {

    protected Member getMember() {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
