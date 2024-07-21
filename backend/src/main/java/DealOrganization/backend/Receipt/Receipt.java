package DealOrganization.backend.Receipt;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Receipt {
    @Id
    private int deal_id;
    private String seller_id;
    private String buyer_id;
}
