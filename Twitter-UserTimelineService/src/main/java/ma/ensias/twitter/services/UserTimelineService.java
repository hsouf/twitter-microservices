package ma.ensias.twitter.services;


import ma.ensias.twitter.repositories.TweetRepository;
import ma.ensias.twitter.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserTimelineService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    TweetRepository tweetRepository;

  public String openaccountPage(int id)
  {
      return "USER TIMELINE SERVICE -- account page";
  }

}
