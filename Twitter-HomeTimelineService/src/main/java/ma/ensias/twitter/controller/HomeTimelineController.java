package ma.ensias.twitter.controller;



import ma.ensias.twitter.services.HomeTimelineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeTimelineController {

    @Autowired
    HomeTimelineService homeTimelineService;

    @GetMapping("/home")
    public String account()
    {
        return homeTimelineService.homeTimeLine();
    }


}
