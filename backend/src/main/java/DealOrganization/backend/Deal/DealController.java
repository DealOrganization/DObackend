package DealOrganization.backend.Deal;

import DealOrganization.backend.Member.Member;
import DealOrganization.backend.Member.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/deal")
public class DealController {
    private final DealService dealService;
    @Autowired
    public DealController(DealService dealService) {
        this.dealService=dealService;
    }

    @PostMapping("")
    public void join(@RequestBody Deal deal){
        dealService.join(deal);
    }
    @GetMapping("")
    public ResponseEntity findById(int id){
        return ResponseEntity.ok().body(dealService.findDeal(id));
    }
}
