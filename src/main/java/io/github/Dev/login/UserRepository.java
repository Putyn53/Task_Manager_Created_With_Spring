package io.github.Dev.login;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Lang, Integer> {
    List<Lang> findByCodeAndWelcomeMsg(String code, String msg);

}
