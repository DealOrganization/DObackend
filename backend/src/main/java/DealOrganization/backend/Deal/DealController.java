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

    @PutMapping("/state")
    public void changeState(String id, String epilogue, int star,int deal_id,String my_id){// 산사람 아이디, 후기, 별점, 거래템 아이디, 내 아이디
        dealService.changeState(id, epilogue, star,deal_id,my_id);
    }
}
