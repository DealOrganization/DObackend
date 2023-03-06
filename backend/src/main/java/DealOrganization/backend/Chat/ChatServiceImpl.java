package DealOrganization.backend.Chat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.Optional;
//OIYUMA 작성
@Transactional
@Component
public class ChatServiceImpl implements ChatService{
    private final ChatRepository chatRepository;

    @Autowired
    public ChatServiceImpl(ChatRepository chatRepository) {
        this.chatRepository = chatRepository;
    }

    @Override
    public void join(Chat chat) {
        chatRepository.save(chat);
    }

    @Override
    public Chat findUser1(String id) {
        Optional<Chat> chat1 = chatRepository.findByUser1(id);
        Chat user1Chat  = chat1.get();

        return user1Chat;
    }

    @Override
    public Chat findUser2(String id) {
        Optional<Chat> chat2 = chatRepository.findByUser2(id);
        Chat user2Chat = chat2.get();

        return user2Chat;
    }
}