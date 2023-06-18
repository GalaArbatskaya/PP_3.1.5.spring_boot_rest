package com.galinaarbatskaya.PP_315.spring_boot_rest.service;

import com.galinaarbatskaya.PP_315.spring_boot_rest.models.User;
import java.util.List;
import java.util.Optional;

public interface UserService {

    void save(User user);
    void removeUserById(long id);

    List<User> getAllUsers();

    User getUserById(long id);

    void update(User user);
    Optional<User> findByUsername(String username);
}

