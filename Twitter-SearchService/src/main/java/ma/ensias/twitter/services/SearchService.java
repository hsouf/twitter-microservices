package ma.ensias.twitter.services;

import ma.ensias.twitter.entities.HashTag;
import ma.ensias.twitter.entities.Tweet;
import ma.ensias.twitter.entities.User;
import ma.ensias.twitter.repositories.HashTagRepository;
import ma.ensias.twitter.repositories.TweetRepository;
import ma.ensias.twitter.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SearchService {

    @Autowired
    HashTagRepository hashTagRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    TweetRepository tweetRepository;

    public String  searchUser(String usernameKeyWord)
    {
        return "Message from SearchUser -- searchUser";
    }

    public String searchHashTag(String hashTagKeyWord)
    {
        return "Message from SearchUser -- searchHashTag";
    }

    public String searchTweet(String TweetKeyWord)
    {
        return "Message from SearchUser -- searchTweet";
    }

}
