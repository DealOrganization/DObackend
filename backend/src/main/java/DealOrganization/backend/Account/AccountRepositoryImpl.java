package DealOrganization.backend.Account;

import DealOrganization.backend.Member.Member;
import DealOrganization.backend.Order.Ordering;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

@Component
public class AccountRepositoryImpl implements AccountRepository {

    private final EntityManager em;
    public AccountRepositoryImpl(EntityManager em){
        this.em=em;
    }
    @Override
    public Optional<Account> findById(String id) {
        Account account = em.find(Account.class, id);
        return Optional.ofNullable(account);
    }
    @Override
    public void save(Account account){
        List<Account> accounts =em.createQuery("select u from Account u where u.id=:id",Account.class)
                .setParameter("id",account.getId())
                .getResultList();

        if (accounts.isEmpty()){
            em.persist(account);
        }
        else{
            int max=0;
            for(int i=0;i<accounts.size();i++){
                if(accounts.get(i).getCnt()>max){
                    max=accounts.get(i).getCnt();
                }
            }
            account.setCnt(max+1);
            em.persist(account);
        }


    }

    @Override
    public List<Account> findAllAccount(String id){
        return em.createQuery("select u from Account u where u.id=:id", Account.class)
                .setParameter("id",id)
                .getResultList();
    }
    @Override
    public void erase(String id, int cnt, int number){
        em.createQuery("update Account u set u.category=:category where u.id=:id and u.cnt=:cnt")
                .setParameter("id",id)
                .setParameter("cnt",cnt)
                .setParameter("category",number)
                .executeUpdate();
    }
    @Override
    public void erase(String id, int cnt,String company,int shipping){
        em.createQuery("update Account u set u.shipping=:shipping where u.id=:id and u.cnt=:cnt")
                .setParameter("id",id)
                .setParameter("cnt",cnt)
                .setParameter("shipping",shipping)
                .executeUpdate();

        em.createQuery("update Account u set u.company=:company where u.id=:id and u.cnt=:cnt")
                .setParameter("id",id)
                .setParameter("cnt",cnt)
                .setParameter("company",company)
                .executeUpdate();
    }

}
