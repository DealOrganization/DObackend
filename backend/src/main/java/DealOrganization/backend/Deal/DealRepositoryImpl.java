package DealOrganization.backend.Deal;

import DealOrganization.backend.Member.Member;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.Optional;

@Component
public class DealRepositoryImpl implements DealRepository{
    private final EntityManager em;
    public DealRepositoryImpl(EntityManager em) {
        this.em = em;
    }


    @Override
    public void save(Deal deal){
        em.persist(deal);
    }

    @Override
    public Optional<Deal> findById(int id){
        Deal deal = em.find(Deal.class, id);
        return Optional.ofNullable(deal);
    }
    @Override
    public void changeState(int deal_id){
        em.createQuery("update Deal u set u.state=2 where u.id=:id")
                .setParameter("id",deal_id)
                .executeUpdate();

    }
}
