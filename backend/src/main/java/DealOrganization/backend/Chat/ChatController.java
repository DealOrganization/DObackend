package DealOrganization.backend.Chat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
//OIYUMA 작성
@RestController
@RequestMapping("api/chat")
public class ChatController {
    private final ChatService chatService;

    @Autowired
    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @PostMapping("")
    public void join(@RequestBody Chat chat) {
        chatService.join(chat);
    }

    @GetMapping("")
    public ResponseEntity findUser1(@RequestParam String id) {
        return ResponseEntity.ok().body(chatService.findUser1(id));
    }

    @GetMapping("/user")
    public ResponseEntity findUser2(@RequestParam String id) {
        return ResponseEntity.ok().body(chatService.findUser2(id));
    }

    /* 채팅 api 수정사항 */
}
