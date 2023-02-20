package tyler.loginregdemo.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import tyler.loginregdemo.models.LoginUser;
import tyler.loginregdemo.models.User;
import tyler.loginregdemo.repositories.UserRepository;
    
@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepo;
    
    // TO-DO: Write register and login methods!
    public User register(User newUser, BindingResult result) {
        Optional<User> user = userRepo.findByEmail(newUser.getEmail());
        // checks to see if the user is in the DB
        if(user.isPresent()){
            result.rejectValue("email", "Email", "Email already registered.");
        }
        // checks to see if password and confirm match
        if(!newUser.getPassword().equals(newUser.getConfirm())){
            result.rejectValue("confirm", "Confirm", "Passwords must match");
        }
        if(result.hasErrors()){
            return null;
        }

        // ! at this point everything is okay
        // TO-DO: Additional validations!

        // hash the password
        String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
        newUser.setPassword(hashed);
        return userRepo.save(newUser);
    }
    public User login(LoginUser newLoginObject, BindingResult result) {
        // TO-DO: Additional validations!
        if(!this.checkEmail(newLoginObject.getEmail())){
            result.rejectValue("email", "noEmail", "Invalid Credentials");;
        }
        if(result.hasErrors()){
            return null;
        }
        // ! at this point we found the email
        User user = userRepo.findByEmail(newLoginObject.getEmail()).orElse(null);
        if(!BCrypt.checkpw(newLoginObject.getPassword(), user.getPassword())){
            result.rejectValue("password", "Password", "Invalid Credentials");
        } 
        if(result.hasErrors()){
            return null;
        }
        return user;



    }

    public boolean checkEmail(String email){
        Optional<User> user = userRepo.findByEmail(email);
        if(user.isPresent()){
            return true;
        } else {
            return false;
        }
    }
}
