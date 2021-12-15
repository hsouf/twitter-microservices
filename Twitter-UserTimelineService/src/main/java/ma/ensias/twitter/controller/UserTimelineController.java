package ma.ensias.twitter.controller;


import ma.ensias.twitter.dto.Timeline;
import ma.ensias.twitter.services.UserTimelineInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserTimelineController {


    @GetMapping("user/{id}}")
    public Timeline account(@PathVariable int id)
    {
        return UserTimelineInterface.accountPage(id);
    }


}
