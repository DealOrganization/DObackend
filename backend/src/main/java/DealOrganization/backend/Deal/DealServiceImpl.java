package DealOrganization.backend.Deal;

import DealOrganization.backend.Member.Member;
import DealOrganization.backend.Member.MemberRepository;
import DealOrganization.backend.Member.MemberService;
import DealOrganization.backend.Receipt.Receipt;
import DealOrganization.backend.Receipt.ReceiptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
@Component
public class DealServiceImpl implements DealService{
    private final DealRepository dealRepository;
    private final MemberRepository memberRepository;
    private final ReceiptRepository receiptRepository;
    @Autowired
    public DealServiceImpl(DealRepository dealRepository,MemberRepository memberRepository,ReceiptRepository receiptRepository) {
        this.dealRepository=dealRepository;
        this.memberRepository=memberRepository;
        this.receiptRepository=receiptRepository;
    }

    @Override
    public void join(Deal deal){
        dealRepository.save(deal);
    }
    @Override
    public Deal findDeal(int id){
        Optional<Deal> deal1=dealRepository.findById(id);
        Deal deal2=deal1.get();

        return deal2;
    }
    @Override
    public void changeState(String id, String epilogue, int star,int deal_id,String my_id){ //상품에서 state 변경, receipt에서 DB 추가
        Member member=new Member();
        member.setId(id);
        member.setStar(star);
        member.setEpilogue(epilogue);
        memberRepository.updateAfter(member);

        dealRepository.changeState(deal_id);
        //dealRepository.changeState(id, deal_id, my_id);--> 따로 처리

        Receipt receipt =new Receipt();
        receipt.setDeal_id(deal_id);
        receipt.setBuyer_id(id);
        receipt.setSeller_id(my_id);
        receiptRepository.save(receipt);

    }
}
