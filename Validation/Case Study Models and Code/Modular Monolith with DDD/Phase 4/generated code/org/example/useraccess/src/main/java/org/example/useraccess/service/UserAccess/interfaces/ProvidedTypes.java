package org.example.useraccess.service.UserAccess.interfaces;

import org.example.useraccess.domain.UserAccess.User;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

@Component()
@RestController()
public class ProvidedTypes {

    protected User getUser() {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
