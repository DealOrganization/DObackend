package DealOrganization.backend.Deal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMember_id() {
        return member_id;
    }

    public void setMember_id(String member_id) {
        this.member_id = member_id;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
