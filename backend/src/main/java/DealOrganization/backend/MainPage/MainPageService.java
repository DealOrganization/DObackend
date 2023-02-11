package DealOrganization.backend.MainPage;

import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Component
public class MainPageService {
    private final MainPageRepository mainPageRepository;
    public MainPageService(MainPageRepository mainPageRepository){
        this.mainPageRepository=mainPageRepository;
    }
    public List<MainPage> getLatestMain(){
        return mainPageRepository.getLatestMain();
    }
    public List<MainPage> getMyPage(String id){
        return mainPageRepository.getMyDeal(id);
    }
    public List<MainPage> getCategory(int cnt){
        return mainPageRepository.getCategory(cnt);
    }
    public List<MainPage> getSearch(String text){
        return mainPageRepository.getSearch(text);
    }
}
