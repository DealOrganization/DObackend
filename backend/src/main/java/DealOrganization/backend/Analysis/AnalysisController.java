package DealOrganization.backend.Analysis;

import DealOrganization.backend.MainPage.MainPage;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/analysis")
public class AnalysisController {
    private final AnalysisService analysisService;
    public AnalysisController(AnalysisService analysisService){
        this.analysisService=analysisService;
    }
    @GetMapping("")
    public ResponseEntity getAll(@RequestParam String id){
        return ResponseEntity.ok().body(analysisService.getAll(id));
    }

    @GetMapping("/category")
    public ResponseEntity getCategory(@RequestParam String id){
        return ResponseEntity.ok().body(analysisService.getCategory(id));
    }
}
