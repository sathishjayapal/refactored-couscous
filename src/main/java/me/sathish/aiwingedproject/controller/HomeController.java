package me.sathish.aiwingedproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller


public class HomeController {
    private static final Logger logger = org.slf4j.LoggerFactory.getLogger(HomeController.class);
    @GetMapping("/")
    public String index() {
        logger.info("Accessed the home page");
        return "home/index";
    }

}
