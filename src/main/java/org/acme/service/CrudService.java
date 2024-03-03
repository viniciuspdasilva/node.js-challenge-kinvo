package org.acme.service;

import java.util.List;

public interface CrudService<Id, Entity> {

    List<Entity> listAll();
    Entity findById(Id id);

    Entity persist(Entity entity);

    Entity update(Id id, Entity entity);

    void deleteById(Id id);
}
