package DealOrganization.backend.Analysis;

import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Component
public class AnalysisService {
    private final AnalysisRepository analysisRepository;
    public AnalysisService(AnalysisRepository analysisRepository){
        this.analysisRepository=analysisRepository;
    }
    public List<Analysis> getAll(String id){
        return analysisRepository.getAll(id);
    }
    public List<Analysis> getCategory(String id){
        return analysisRepository.getCategory(id);
    }
}
