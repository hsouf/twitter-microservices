package ma.ensias.twitter.services;

import ma.ensias.twitter.model.LoginForm;
import ma.ensias.twitter.model.SignUpForm;
import ma.ensias.twitter.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public String SignIn(LoginForm data)
    {
      return "Message from UserService -- Fonction : SignIn ";
    }
    public String SignUp(SignUpForm data)
    {
        return "Message from UserService -- Fonction : SignUp ";
    }

}
