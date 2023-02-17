package DealOrganization.backend.Member;

import org.springframework.http.ResponseEntity;

public interface MemberService {
    void join(Member member);
    ResponseEntity findMember(String id);

    ResponseEntity lookStar(String id);

    ResponseEntity lookEpilogue(String id, int order);

    void updateAfter(Member member);




}
