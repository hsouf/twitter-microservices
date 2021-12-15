package ma.ensias.twitter.repositories;

import ma.ensias.twitter.entities.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TweetRepository extends JpaRepository<Tweet,Long> {
}
