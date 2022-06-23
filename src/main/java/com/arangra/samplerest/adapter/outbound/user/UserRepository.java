package com.arangra.samplerest.adapter.outbound.user;

import com.arangra.generated.jooq.model.Tables;
import com.arangra.generated.jooq.model.tables.pojos.User;
import com.arangra.samplerest.port.UserRepositoryPort;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository implements UserRepositoryPort {
    @Autowired
    DSLContext context;

    public List<User> getUsers(){
        return context
                .selectFrom(Tables.USER)
                .fetchInto(User.class);
    }

    public void insertUser(User user){
        context
                .insertInto(Tables.USER, Tables.USER.EMAIL, Tables.USER.USERNAME)
                .values(user.getEmail(), user.getUsername())
                .execute();
    }
}
