package DealOrganization.backend.Account;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Account {
    private String id; // 사용자 id
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private int checking;
    private int days; //가계부 내역 추가 날짜 yyyyMMdd
    private int cnt;// 해당 사용자의 후기 개수
    private int category; //카테고리(변경가능)
    private String name;  //상품명         -->인공지능
    private int price;    //상품 가격      -->인공지능
    private int shipping;  //운송장번호(변경가능)
    private String company; //운송방법(변경가능)
    private String platform; //플랫폼      --> 인공지능
    private String seller;   //판매자 이름  -->인공지능
}
