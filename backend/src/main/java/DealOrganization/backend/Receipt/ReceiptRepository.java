package DealOrganization.backend.Receipt;

import DealOrganization.backend.Deal.Deal;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;

@Component
public class ReceiptRepository {
    private final EntityManager em;
    public ReceiptRepository(EntityManager em) {
        this.em = em;
    }

    public void save(Receipt receipt){
        em.persist(receipt);
    }
}
