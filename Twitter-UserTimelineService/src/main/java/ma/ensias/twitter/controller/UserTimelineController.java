package ma.ensias.twitter.controller;


import ma.ensias.twitter.services.SearchServiceInterface;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserTimelineController {


    @GetMapping("/test")
    public String testMethode()
    {
        return "hello";
    }


}
