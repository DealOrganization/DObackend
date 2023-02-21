package DealOrganization.backend.Analysis;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
public class Analysis { //넘겨줄때만 필요하고 굳이 저장, 저장하려면 업뎃을 해야하는디
//    @Id@GeneratedValue(strategy = GenerationType.AUTO)
//    private int check;
//    private String member_id;
    private int year;
    private int month;
    private int price;
    private int category;

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
