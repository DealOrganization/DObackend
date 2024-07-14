package DealOrganization.backend.Order;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Setter
@Getter
public class Ordering {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int checking;
    private int id;
    private String shipping;
    private int price;
}
