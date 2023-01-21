package DealOrganization.backend.Member;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Member {

    @Id
    private String id;  //회원 id
    private int star; //별점
    private String epilogue; //후기

    private int number; //별점 및 후기 남긴 사람 수

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public String getEpilogue() {
        return epilogue;
    }

    public void setEpilogue(String epilogue) {
        this.epilogue = epilogue;
    }
}
