package ma.ensias.twitter.controller;


import ma.ensias.twitter.entities.HashTag;
import ma.ensias.twitter.entities.Tweet;
import ma.ensias.twitter.entities.User;
import ma.ensias.twitter.services.SearchServiceInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class ServiceSearchController {


    @GetMapping("/test")
    public String testMethode()
    {
        return "hello";
    }

    @GetMapping("/search-user/{username}")
    public Set<User> searchUserMethode(@PathVariable String username)
    {

       return SearchServiceInterface.searchUser(username);
    }
    @GetMapping("/search-hashtag/{hashtag}")
    public Set<HashTag> searchHashtagMethode(@PathVariable String hashTagName)
    {
        return SearchServiceInterface.searchHashTag(hashTagName);
    }
    @GetMapping("/search-tweet/{tweetContent}")
    public Set<Tweet> searchPostMethode(@PathVariable String tweetContent)
    {
        return SearchServiceInterface.searchTweet(tweetContent);
    }
}
