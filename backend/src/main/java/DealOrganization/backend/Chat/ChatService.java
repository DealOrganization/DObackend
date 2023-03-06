package DealOrganization.backend.Chat;
//OIYUMA 작성
public interface ChatService {
    void join(Chat chat);
    Chat findUser1(String id);
    Chat findUser2(String id);
}