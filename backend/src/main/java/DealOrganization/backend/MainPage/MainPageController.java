package DealOrganization.backend.MainPage;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/main")
public class MainPageController {
    private final MainPageService mainPageService;
    public MainPageController(MainPageService mainPageService){
        this.mainPageService=mainPageService;
    }
    @GetMapping("")
    public List<MainPage> getLatest(){
        return mainPageService.getLatestMain();
    }
    @GetMapping("/mine")
    public List<MainPage> getMine(@RequestParam String id){
        return mainPageService.getMyPage(id);
    }
    @GetMapping("/category")
    public List<MainPage> getCategory(@RequestParam int cnt){
        return mainPageService.getCategory(cnt);
    }
    @GetMapping("/search")
    public List<MainPage> getSearch(@RequestParam String text){
        return mainPageService.getSearch(text);
    }

}
