package DealOrganization.backend.Member;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.Optional;

@Primary
@Component
public class MemberRepositoryH2 implements MemberRepository{
    private final EntityManager em;
    public MemberRepositoryH2(EntityManager em) {
        this.em = em;
    }

    @Override
    public void save(Member member) {
        em.persist(member);
    }

    @Override
    public Optional<Member> findById(String id) {
        Member member = em.find(Member.class, id);
        return Optional.ofNullable(member);
    }
    @Override
    public int lookStar(String id){
        Optional<Member> member=findById(id);
        Member member1 = member.get();

        int one = (int)member1.getStar()/ member1.getNumber();
        return one;
    }

    @Override
    public String lookEpilogue(String id, int order){
        Optional<Member> member=findById(id);
        Member member1 = member.get();

        return member1.getEpilogue();
    }

    @Override
    public void updateAfter(Member member){
        Optional<Member> member1 = findById(member.getId());
        //진짜 member -> member2
        Member member2=member1.get();
        int star = member2.getStar();
        String epilogue=member2.getEpilogue();

        //지금 들어온 member ->member

        if(member2.getNumber()!=0){
            star += member.getStar();
            epilogue = epilogue + "/" + member.getEpilogue();
        }

        em.createQuery("update Member u set u.star=:star where u.id=:id")
                .setParameter("id",member2.getId())
                .setParameter("star",star).executeUpdate();
        em.createQuery("update Member u set u.epilogue=:epilogue where u.id=:id")
                .setParameter("id",member2.getId())
                .setParameter("epilogue",epilogue).executeUpdate();

        em.createQuery("update Member u set u.number=u.number+1 where u.id=:id")
                .setParameter("id",member2.getId()).executeUpdate();
    }

}
