package DealOrganization.backend.Member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/member")
public class MemberController {
    private final MemberService memberService;
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping("")
    public void join(@RequestBody Member member){
        memberService.join(member);
    }
    @PostMapping("/after")
    public void updateAfter(@RequestBody Member member){
        memberService.updateAfter(member);
    }

    @GetMapping("/star")
    public ResponseEntity lookStar(@RequestParam String id){
        return memberService.lookStar(id);
    }
    @GetMapping("/epilogue")
    public ResponseEntity lookEpilogue(@RequestParam String id,@RequestParam int order){ //몇 번째 후기인가
        return memberService.lookEpilogue(id, order);
    }

    @GetMapping("")
    public ResponseEntity findMember(@RequestParam String id){
        return memberService.findMember(id);
    }

}
