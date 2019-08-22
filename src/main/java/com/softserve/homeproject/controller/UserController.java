package com.softserve.homeproject.controller;

import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import static org.slf4j.LoggerFactory.getLogger;

@Controller
public class UserController {
    private final Logger log = getLogger(this.getClass());

    @GetMapping("/users")
    public String viewUsers() {
        log.debug("redirect to users");
        return "users";
    }
}
