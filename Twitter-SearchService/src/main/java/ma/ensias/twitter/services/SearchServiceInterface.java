package ma.ensias.twitter.services;

import ma.ensias.twitter.entities.HashTag;
import ma.ensias.twitter.entities.Tweet;
import ma.ensias.twitter.entities.User;

import java.util.Set;

public interface SearchServiceInterface {

    public static Set<User> searchUser(String usernameKeyWord) {
        return null;
    }

    public static Set<HashTag> searchHashTag(String hashTagKeyWord) {
        return null;
    }

    public static Set<Tweet> searchTweet(String TweetKeyWord) {
        return null;
    }

}
