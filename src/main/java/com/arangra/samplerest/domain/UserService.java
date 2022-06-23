package com.arangra.samplerest.domain;

import com.arangra.generated.jooq.model.tables.pojos.User;
import com.arangra.samplerest.port.UserRepositoryPort;

import java.util.List;

public class UserService {
    private UserRepositoryPort userRepository;

    public UserService(UserRepositoryPort userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        return userRepository.getUsers();
    }

    public void addUser(User user) {
        userRepository.insertUser(user);
    }
}
