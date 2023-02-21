package DealOrganization.backend.Account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/account")
public class AccountController {
    private  final AccountService accountService;
    @Autowired
    public AccountController(AccountService accountService){
        this.accountService =accountService;
    }

    //그냥 등록 API  (포카마켓)
    @PostMapping("")
    public void join(@RequestBody Account account){
        accountService.save(account);
    }
    //인공지능에서 받은 정보 등록 API(당근마켓,번개장터)  --> 서비스 차원
    @PutMapping("/AI")
    public void save(String id,String name, int price, String platform, String seller){
        accountService.save(id,name,price,platform,seller);
    }
    //거래 완료 자동 등록 API (DOY)                  --> 서비스 차원
    @PutMapping("/chat")
    public void save(String id,String name, int price,String seller){
        accountService.save(id,name,price,seller);
    }

    //카테고리 수정하는 API
    @PutMapping("/eraser")
    public void erase(@RequestParam String id, @RequestParam int cnt, @RequestParam int number){
        accountService.erase(id, cnt, number);
    }
    //운송장 번호, 택배사 수정하는 API
    @PutMapping("/shipping")
    public void shippingErase(@RequestParam String id, @RequestParam int cnt, @RequestParam int shipping, @RequestParam String company){
        accountService.erase(id,cnt,company,shipping);
    }
    //해당 사용자의 전체 보여주는 API
    @GetMapping("")
    public ResponseEntity findAllAccount(@RequestParam String id){
        return ResponseEntity.ok().body(accountService.findAllAccount(id));
    }
    @GetMapping("/check")
    public ResponseEntity findById(@RequestParam String id){
        return ResponseEntity.ok().body(accountService.findById(id));
    }


}
