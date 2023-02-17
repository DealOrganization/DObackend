package DealOrganization.backend.Member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import javax.persistence.OrderBy;
import javax.transaction.Transactional;

@Transactional
@Component
public class MemberServiceImpl implements  MemberService{
    private final MemberRepository memberRepository;

    @Autowired
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository; //ac.getBean(MemberRepository.class)
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public ResponseEntity findMember(String id) {
        return ResponseEntity.ok().body(memberRepository.findById(id));

    }
    @Override
    public ResponseEntity lookStar(String id){
        return ResponseEntity.ok().body(memberRepository.lookStar(id));
    }

    @Override
    public ResponseEntity lookEpilogue(String id, int order){
        String[] one=memberRepository.lookEpilogue(id,order).split("/");

        return ResponseEntity.ok().body(one[order-1]);
    }

    @Override
    public void updateAfter(Member member){
        memberRepository.updateAfter(member);
    }

}
