package DealOrganization.backend.Chat;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//OIYUMA 작성
@Entity
@Getter
@Setter
public class Chat {
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private int checking;

    private String user1_id; // 사용자1 id
    private String user2_id; // 사용자2 id
    private String user1_chat; // 채팅 내용1
    private String user2_chat; // 채팅 내용2
    private int goods_id; // 상품 id
}
