package webappservlet.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import webappservlet.forms.RegisterForm;
import webappservlet.services.NotificationService;
import webappservlet.services.UserService;

import javax.validation.Valid;

@Controller
public class RegisterController {

    @Autowired
    private UserService userService;

    @Autowired
    private NotificationService notificationService;

    @RequestMapping("/register")
    public String register(RegisterForm registerForm) {

        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String registerPage(@Valid RegisterForm registerForm, BindingResult bindingResult) {
        if (userService.checkExistingUserInDatabase(registerForm, bindingResult))
            return "/register";

        return userService.registerSuccessful(registerForm);
    }
}