package io.github.Dev.hello;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class HelloServlet{

    private static final String NAME_PARAM = "name";
    private static final String LANG_PARAM = "lang";
    private final Logger logger = LoggerFactory.getLogger(HelloServlet.class);

    private HelloService service;


    HelloServlet(HelloService service)
    {
        this.service = service;
    }

    @GetMapping(value = "/task")
    String welcome()
    {
        return welcome(null, null);
    }

    @GetMapping(value = "/task", params = {"lang", "name"})
    String welcome(@RequestParam("lang") Integer langId, @RequestParam String name)
    {
        logger.info("Got Request");
        return service.prepareGreeting(name,langId);
    }
}