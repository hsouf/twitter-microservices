package ma.ensias.twitter.repositories;

import ma.ensias.twitter.entities.HashTag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HashTagRepository extends JpaRepository<HashTag,Long> {
}
