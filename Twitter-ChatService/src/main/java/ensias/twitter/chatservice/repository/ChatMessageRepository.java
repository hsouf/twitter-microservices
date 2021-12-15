package ensias.twitter.chatservice.repository;

import ensias.twitter.chatservice.model.ChatMessage;
import ensias.twitter.chatservice.model.MessageStatus;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface ChatMessageRepository
        extends JpaRepository<ChatMessage,String> {

    long countBySenderIdAndRecipientIdAndStatus(
            String senderId, String recipientId, MessageStatus status);

    List<ChatMessage> findByChatId(String chatId);
}