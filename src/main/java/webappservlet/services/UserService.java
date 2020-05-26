package webappservlet.services;

import org.springframework.validation.BindingResult;
import webappservlet.data.User;
import webappservlet.forms.RegisterForm;

import javax.validation.Valid;
import java.util.List;

public interface UserService {

    List<User> findAll();
    User findById(Long id);
    User create(User user);
    User edit(User user);
    void deleteById(Long id);
    boolean authenticate(String username, String password);
    User findByUsername(String userName);
    String registerSuccessful(@Valid RegisterForm registerForm);
    boolean checkExistingUserInDatabase(@Valid RegisterForm registerForm, BindingResult bindingResult);

}
