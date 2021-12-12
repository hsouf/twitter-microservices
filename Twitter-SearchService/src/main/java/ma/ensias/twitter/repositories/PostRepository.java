package ma.ensias.twitter.repositories;

import ma.ensias.twitter.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}
