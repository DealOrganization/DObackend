package DealOrganization.backend.Order;

import DealOrganization.backend.Deal.Deal;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

@Component
public class OrderRepositoryImpl implements OrderRepository{
    private final EntityManager em;
    public OrderRepositoryImpl(EntityManager em) {
        this.em = em;
    }


    @Override
    public void save(Ordering order){
        em.persist(order);
    }

    @Override
    public List<Ordering> findAllOrder(int id){
        return em.createQuery("select u from Ordering u",Ordering.class)
                .getResultList();
    }
}
