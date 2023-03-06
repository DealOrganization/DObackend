package DealOrganization.backend.Chat;

import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.Optional;
//OIYUMA 작성
@Component
public class ChatRepositoryImpl implements ChatRepository{
    private final EntityManager chatEM;

    public ChatRepositoryImpl(EntityManager chatEM) {
        this.chatEM = chatEM;
    }

    @Override
    public void save(Chat chat) {
        chatEM.persist(chat);
    }

    @Override
    public Optional<Chat> findByUser1(String id) {
        Chat chat = chatEM.find(Chat.class, id);
        return Optional.of(chat);
    }

    @Override
    public Optional<Chat> findByUser2(String id) {
        Chat chat = chatEM.find(Chat.class, id);
        return Optional.of(chat);
    }
}
