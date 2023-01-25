package DealOrganization.backend.Deal;

import DealOrganization.backend.Member.Member;
import org.springframework.http.ResponseEntity;

public interface DealService {
    void join(Deal deal);
    Deal findDeal(int id);
}
