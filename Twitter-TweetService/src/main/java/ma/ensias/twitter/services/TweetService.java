package ma.ensias.twitter.services;


import com.netflix.discovery.converters.Auto;
import ma.ensias.twitter.model.CommentForm;
import ma.ensias.twitter.model.PostForm;
import ma.ensias.twitter.repositories.TweetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TweetService {

    @Autowired
    TweetRepository tweetRepository;

    public String commentTweet(CommentForm data)
    {
        return "TWEET SERVICE -- commentTweet";
    }
    public String deleteTweet(int idTweet)
    {
        return "TWEET SERVICE -- deleteTweet";
    }
    public String favoriteTweet(int idTweet)
    {
        return "TWEET SERVICE -- favoriteTweet";
    }
    public String likeTweet(int idTweet)
    {
        return "TWEET SERVICE -- likeTweet";
    }
    public String newTweet(PostForm data)
    {
        return "TWEET SERVICE -- newTweet";
    }
    public String retweetTweet(int idTweet)
    {
        return "TWEET SERVICE -- retTweet";
    }
}
