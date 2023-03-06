package DealOrganization.backend.Chat;

import java.util.Optional;
//OIYUMA 작성
public interface ChatRepository {
    void save(Chat chat);
    Optional<Chat> findByUser1(String id);
    Optional<Chat> findByUser2(String id);
}