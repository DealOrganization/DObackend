package DealOrganization.backend.Chat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//OIYUMA 작성
@Entity
public class Chat {
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private int checking;

    private String user1_id; // 사용자1 id
    private String user2_id; // 사용자2 id
    private String user1_chat; // 채팅 내용1
    private String user2_chat; // 채팅 내용2
    private int goods_id; // 상품 id

    public String getUser1_id() {
        return user1_id;
    }

    public void setUser1_id(String user1_id) {
        this.user1_id = user1_id;
    }

    public String getUser2_id() {
        return user2_id;
    }

    public void setUser2_id(String user2_id) {
        this.user2_id = user2_id;
    }

    public String getUser1_chat() {
        return user1_chat;
    }

    public void setUser1_chat(String user1_chat) {
        this.user1_chat = user1_chat;
    }

    public String getUser2_chat() {
        return user2_chat;
    }

    public void setUser2_chat(String user2_chat) {
        this.user2_chat = user2_chat;
    }

    public int getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(int goods_id) {
        this.goods_id = goods_id;
    }
}
