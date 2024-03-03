package org.acme.service;

import org.acme.persistence.models.User;

import java.util.List;

public interface UserService extends CrudService<Long, User> {

    User findByEmail(String email);
    User findByUsername(String username);

    List<User> listarUsuarioAtivos();

}
