package ma.ensias.twitter.controller;


import ma.ensias.twitter.model.CommentForm;
import ma.ensias.twitter.model.PostForm;
import ma.ensias.twitter.services.TweetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Path;

@RestController
@RequestMapping("/tweet")
public class UserTimelineController {

    @Autowired
    TweetService tweetService;

    @PostMapping("/post")
    public String postTweet(@RequestBody PostForm data)
    {
        return tweetService.newTweet(data);
    }
    @DeleteMapping("/delete/{idTweet}")
    public String deleteTweet(@PathVariable int idTweet)
    {
        return tweetService.deleteTweet(idTweet);
    }
    @PostMapping("/comment")
    public String commentTweet(@RequestBody CommentForm data)
    {
        return tweetService.commentTweet(data);
    }
    @GetMapping("/like/{idTweet}")
    public String likeTweet(@PathVariable int idTweet)
    {
        return tweetService.likeTweet(idTweet);
    }
    @GetMapping("/retweet/{idTweet}")
    public String retweetTweet(@PathVariable int idTweet)
    {
        return tweetService.retweetTweet(idTweet);
    }
    @GetMapping("/favorite/{idTweet}")
    public String favoriteTweet(@PathVariable int idTweet)
    {
        return tweetService.favoriteTweet(idTweet);
    }


}
