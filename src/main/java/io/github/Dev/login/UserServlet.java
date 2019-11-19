package io.github.Dev.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
class UserServlet {

    private final Logger logger = LoggerFactory.getLogger(UserServlet.class);

    private UserService service;
    private UserRepository repository;


    UserServlet(UserService service, UserRepository repository)
    {
        this.service = service;
        this.repository = repository;
    }

    @GetMapping(value = "/task/login*")
    String logIn()
    {
        return logIn(null, null);
    }

    @GetMapping(value = "/task/login*", params = {"email", "password"})
    String logIn(@RequestParam("email") String email, @RequestParam String password)
    {
        logger.info("Got Request");
        if(repository.findByEmailAndPassword(email,password) != null)
        {
            return "granted";
        }
        else{
            return "You entered wrong email or password";
        }
    }
}
