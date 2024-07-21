package DealOrganization.backend.Member;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Member {

    @Id
    private String id;  //회원 id
    private int star; //별점
    private String epilogue; //후기
    private int number; //별점 및 후기 남긴 사람 수
}
