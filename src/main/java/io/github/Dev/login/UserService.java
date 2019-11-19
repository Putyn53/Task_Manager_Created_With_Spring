package io.github.Dev.login;

import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
class UserService {
    private UserRepository repository;

    UserService(UserRepository repository)
    {
        this.repository = repository;
    }
    List<UserDTO> findAll()
    {
        return repository
                .findAll()
                .stream()
                .map(UserDTO::new)
                .collect(toList());
    }
}
