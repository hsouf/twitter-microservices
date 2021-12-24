package ma.ensias.twitter.controller;


import ma.ensias.twitter.services.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/search")
public class ServiceSearchController {

    @Autowired
    SearchService searchService;

    @GetMapping("/user/{username}")
    public String searchUserMethode(@PathVariable String username)
    {
       return searchService.searchUser(username);
    }
    @GetMapping("/hashtag/{hashtag}")
    public String searchHashtagMethode(@PathVariable String hashtag)
    {
        return searchService.searchHashTag(hashtag);
    }
    @GetMapping("/tweet/{tweetContent}")
    public String searchPostMethode(@PathVariable String tweetContent)
    {
        return searchService.searchTweet(tweetContent);
    }
}
