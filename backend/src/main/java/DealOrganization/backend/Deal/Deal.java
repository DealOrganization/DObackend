package DealOrganization.backend.Deal;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Deal {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String member_id;
    private int category;
    //0:아이돌, 1:의류, 2:잡화, 3:도서, 4:뷰티, 5:운동, 6:티켓, 7:가전, 8:가구
    private String text;
    private String title;
    private int state; //0:판매중, 1:예약중, 2: 거래완료
    private int price;
}
