package ma.ensias.twitter.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceSearchController {

    @GetMapping("/test")
    public String testMethode()
    {
        return "hello";
    }
}
