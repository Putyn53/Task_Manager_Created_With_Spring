package io.github.Dev.hello;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloServlet{

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
        if(langId == null || name == null)
        {
            return service.prepareGreeting(HelloService.FALLBACK_NAME,HelloService.FALLBACK_LANG.getId());
        }else
        return service.prepareGreeting(name,langId);
    }
}
