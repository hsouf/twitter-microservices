package ma.ensias.twitter.services;


import ma.ensias.twitter.repositories.TweetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class HomeTimelineService {

    @Autowired
    TweetRepository tweetRepository;

    public String homeTimeLine()
    {
          return "HOME TIME LINE SERVICE -- hometimeline";
    }

}
