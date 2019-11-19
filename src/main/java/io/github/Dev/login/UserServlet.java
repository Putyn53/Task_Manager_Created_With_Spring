package io.github.Dev.login;
import io.github.Dev.hello.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping(value = "/task/login")
    String welcome()
    {
        return welcome(null, null);
    }

    @GetMapping(value = "/task/login", params = {"lang", "name"})
    String welcome(@RequestParam("lang") Integer langId, @RequestParam String name)
    {
        logger.info("Got Request");
        if(langId == null || name == null)
        {
            return service.prepareGreeting(HelloService.FALLBACK_NAME,HelloService.FALLBACK_LANG.getId());
        }else
            return service.prepareGreeting(name,langId);
    }
}
