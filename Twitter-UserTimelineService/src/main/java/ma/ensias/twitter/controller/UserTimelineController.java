package ma.ensias.twitter.controller;


import com.netflix.discovery.converters.Auto;
import ma.ensias.twitter.services.UserTimelineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/timeline")
public class UserTimelineController {

    @Autowired
    UserTimelineService userTimelineService;

    @GetMapping("/user/{id}")
    public String account(@PathVariable int id)
    {
        return userTimelineService.openaccountPage(id);
    }


}
