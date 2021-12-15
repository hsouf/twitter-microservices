package ma.ensias.twitter.repositories;

import ma.ensias.twitter.entities.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message,Long> {
}
