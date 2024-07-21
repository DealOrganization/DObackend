package DealOrganization.backend.Analysis;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
@Getter
@Setter
public class Analysis { //넘겨줄때만 필요하고 굳이 저장, 저장하려면 업뎃을 해야하는디
//    @Id@GeneratedValue(strategy = GenerationType.AUTO)
//    private int check;
//    private String member_id;
    private int year;
    private int month;
    private int price;
    private int category;
}
