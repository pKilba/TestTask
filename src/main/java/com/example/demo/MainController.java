package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpSession;

@Controller
public class MainController {

    private static final String MAIN_PAGE = "index";

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String create(HttpSession session,
                         @RequestParam(name = "locale", required = false, defaultValue = "en") String locale) {
        processRequest(session, locale);

        return MAIN_PAGE;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String findAll(HttpSession session,
                          @RequestParam(name = "locale", required = false, defaultValue = "en") String locale) {
        processRequest(session, locale);
        return MAIN_PAGE;
    }

    private void processRequest(HttpSession session,
                                @RequestParam(name = "locale", required = false, defaultValue = "en") String locale) {
        session.setAttribute("lang", locale);
    }
}