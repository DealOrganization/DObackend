package DealOrganization.backend.Member;

import java.util.Optional;

public interface MemberRepository {
    void save(Member member);
    Optional<Member> findById(String id);
    int lookStar(String id);
    String lookEpilogue(String id, int order);

    void updateAfter(Member member);

}
