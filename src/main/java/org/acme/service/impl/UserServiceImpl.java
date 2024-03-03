package org.acme.service.impl;

import io.quarkus.elytron.security.common.BcryptUtil;
import io.quarkus.logging.Log;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.LockModeType;
import jakarta.transaction.Transactional;
import org.acme.persistence.models.User;
import org.acme.service.UserService;

import java.util.List;

@ApplicationScoped
public class UserServiceImpl implements UserService {

    @Override
    public List<User> listAll() {
        return User.listAll();
    }

    @Override
    public User findById(Long aLong) {
        return User.findById(aLong, LockModeType.OPTIMISTIC_FORCE_INCREMENT);
    }

    @Transactional
    @Override
    public User persist(User user) {
        Log.info("Cadastrando o novo usuario: ".concat(user.username));
        User.add(user.username, user.password, user.password, user.getEmail());
        Log.info("Usuario cadastrado: ".concat(user.username));
        return User.find("username", user.username).firstResult();
    }
    @Transactional
    @Override
    public User update(Long aLong, User user) {
        User byId = findById(aLong);
        byId.username = user.username;
        byId.setEmail(user.getEmail());
        byId.password = BcryptUtil.bcryptHash(user.password);
        byId.role = user.role;
        byId.persist();
        return byId;
    }
    @Transactional
    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public User findByEmail(String email) {
        return null;
    }

    @Override
    public User findByUsername(String username) {
        return null;
    }

    @Override
    public List<User> listarUsuarioAtivos() {
        return null;
    }
}
