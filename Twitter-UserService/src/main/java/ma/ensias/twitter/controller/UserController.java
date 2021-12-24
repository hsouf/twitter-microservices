package ma.ensias.twitter.controller;


import ma.ensias.twitter.model.LoginForm;
import ma.ensias.twitter.model.SignUpForm;
import ma.ensias.twitter.services.UserInterface;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {


    @PostMapping("/signin")
    public  Object signin(@RequestBody LoginForm data)
    {
        System.out.print("User service - signin");
        return UserInterface.SignIn(data);
    }
    @PostMapping("/signup")
    public  Object signup(@RequestBody SignUpForm data)
    {
        System.out.print("User service - signup");
        return UserInterface.SignUp(data);
    }

}
