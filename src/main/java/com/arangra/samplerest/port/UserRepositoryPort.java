package com.arangra.samplerest.port;

import com.arangra.generated.jooq.model.tables.pojos.User;

import java.util.List;

public interface UserRepositoryPort {
    List<User> getUsers();
    void insertUser(User user);
}
