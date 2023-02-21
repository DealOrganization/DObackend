package DealOrganization.backend.Account;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
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

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }


    public int getChecking() {
        return checking;
    }

    public void setChecking(int checking) {
        this.checking = checking;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getShipping() {
        return shipping;
    }

    public void setShipping(int shipping) {
        this.shipping = shipping;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }



}
