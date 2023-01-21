package DealOrganization.backend.Member;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Component
public class MemberRepositoryImpl implements MemberRepository{

    private static Map<String, Member> store = new HashMap<>();

    @Override
    public void save(Member member) {
        store.put(member.getId(),member);
    }

    @Override
    public Optional<Member> findById(String memberId) {
        return Optional.ofNullable(store.get(memberId));
    }
    @Override
    public int lookStar(String memberId){
        Member member1 = store.get(memberId);
        return member1.getStar();
    }

    @Override
    public String lookEpilogue(String memberId, int order){
        Member member1 = store.get(memberId);
        return member1.getEpilogue();
    }
    @Override
    public void updateAfter(Member member){

    }
}
