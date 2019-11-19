package io.github.Dev.login;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/task")
class UserServlet {

    private final Logger logger = LoggerFactory.getLogger(UserServlet.class);

    private UserService service;


    UserServlet(UserService service)
    {
        this.service = service;
    }

    @GetMapping("/languages")
    ResponseEntity<List<UserDTO>> findAllLangs()
    {
        logger.info("Got request");
        return ResponseEntity.ok(service.findAll());
    }
}
