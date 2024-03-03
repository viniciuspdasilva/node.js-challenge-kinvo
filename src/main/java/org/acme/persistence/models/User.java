package org.acme.persistence.models;

import io.quarkus.elytron.security.common.BcryptUtil;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.security.jpa.Password;
import io.quarkus.security.jpa.Roles;
import io.quarkus.security.jpa.UserDefinition;
import io.quarkus.security.jpa.Username;
import jakarta.persistence.*;

@Entity
@Table(name = "test_user")
@UserDefinition
public class User extends PanacheEntity {
    @Username
    @Column(unique = true)
    public String username;
    @Password
    public String password;
    @Column(unique = true)
    private String email;
    @Roles
    public String role;

    public static void add(String username, String password, String role, String email) {
        User user = new User();

        user.username = username;
        user.password = BcryptUtil.bcryptHash(password);
        user.role = role;
        user.email = email;
        user.persist();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}