package DealOrganization.backend.Deal;

import DealOrganization.backend.Member.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
@Component
public class DealServiceImpl implements DealService{
    private final DealRepository dealRepository;

    @Autowired
    public DealServiceImpl(DealRepository dealRepository) {
        this.dealRepository=dealRepository;
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
}
