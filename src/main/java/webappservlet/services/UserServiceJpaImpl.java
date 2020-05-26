package webappservlet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import webappservlet.data.User;
import webappservlet.forms.RegisterForm;
import webappservlet.repositories.UserRepository;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@Primary
public class UserServiceJpaImpl implements UserService {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private NotificationService notificationService;


    @Override
    public List<User> findAll() {
        return this.userRepo.findAll();
    }

    @Override
    public User findById(Long id) {
        return this.userRepo.getOne(id);
    }

    @Override
    public User create(User user) {
        return this.userRepo.save(user);
    }

    @Override
    public User edit(User user) {
        return this.userRepo.save(user);
    }

    @Override
    public void deleteById(Long id) {
        this.userRepo.deleteById(id);
    }

    @Override
    public boolean authenticate(String username, String password) { return Objects.equals(username, password); }

    @Override
    public User findByUsername(String username) {
        return this.userRepo.findByUsername(username);
    }

    @Override
    public String registerSuccessful(RegisterForm registerForm) {
        User user = new User();
        user.setUsername(registerForm.getUsername());
        user.setPassword(registerForm.getPassword());
        user.setEmail(registerForm.getEmail());
        create(user);

        notificationService.addInfoMessage("Register successful");
        return "redirect:/1";
    }

    @Override
    public boolean checkExistingUserInDatabase(RegisterForm registerForm, BindingResult bindingResult) {
        Optional<User> userExistInDataBase = Optional.ofNullable(findByUsername(registerForm.getUsername()));
        if (bindingResult.hasErrors() || userExistInDataBase.isPresent()) {
            notificationService.addErrorMessage("Error: user registration failed!");
            return true;
        }
        return false;
    }

}
