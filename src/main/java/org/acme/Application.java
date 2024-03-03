package org.acme;

import io.quarkus.runtime.StartupEvent;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Singleton;
import jakarta.transaction.Transactional;
import org.acme.persistence.models.User;

@Singleton
public class Application {

    @Transactional
    public void loadUsers(@Observes StartupEvent evt) {
        User.deleteAll();
        User.add("admin", "admin", "admin", "admin@email.com");
        User.add("user", "user", "user", "user@email.com");
    }
}
