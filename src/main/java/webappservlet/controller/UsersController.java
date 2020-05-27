package webappservlet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import webappservlet.services.UserServiceJpaImpl;

@Controller
public class UsersController {

    @Autowired
    private UserServiceJpaImpl userServiceJpa;

    @RequestMapping("/")
    public String getAllUsers(Model model) {
        model.addAttribute("user", userServiceJpa.findAll());

        return "user";
    }
}
