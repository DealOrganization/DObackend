package DealOrganization.backend.Analysis;

import DealOrganization.backend.Account.Account;
import DealOrganization.backend.Account.AccountRepository;
import DealOrganization.backend.MainPage.MainPage;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

@Component
public class AnalysisRepository {
    private AccountRepository accountRepository;
    private final EntityManager em;

    public AnalysisRepository(EntityManager em,AccountRepository accountRepository){
        this.em=em;
        this.accountRepository=accountRepository;
    }
    public List<Analysis> getAll(String id){
        List<Account> accounts=accountRepository.findAllAccount(id);
        int size=accounts.size();

        List<Analysis> show=new ArrayList<>();
        //Vector<Analysis> v=new Vector<Analysis>();
        for(int i=0;i<size;i++){
            Analysis analysis=new Analysis();
            int day=accounts.get(i).getDays(); //2023 02 13
            analysis.setYear(day/10000); //2023
            analysis.setMonth((day%1000)/100); //2
            analysis.setPrice(accounts.get(i).getPrice());
            analysis.setCategory(100);
            //show.add(analysis);
            //boolean isContained=v.contains(analysis);
            int cnt=0;
            for(int j=0;j<show.size();j++){
                Analysis a=show.get(j);
                if(analysis.getMonth()==a.getMonth() & analysis.getYear()==a.getYear()){
                    int pricing=a.getPrice()+analysis.getPrice();
                    a.setPrice(pricing);
                    cnt=1;
                }
            }
            if(cnt==0){
                show.add(analysis);
            }
        }
        return show;
    }
    public List<Analysis> getCategory(String id){
        List<Account> accounts=accountRepository.findAllAccount(id);
        //카테고리 별로 나누기
        int size=accounts.size();
        List<Analysis> show=new ArrayList<>();
        //Vector<Analysis> v=new Vector<Analysis>();
        for(int i=0;i<size;i++){
            Analysis analysis=new Analysis();
            int day=accounts.get(i).getDays(); //2023 02 13
            analysis.setYear(day/10000); //2023
            analysis.setMonth((day%1000)/100); //2
            analysis.setPrice(accounts.get(i).getPrice());
            analysis.setCategory(accounts.get(i).getCategory());
            int cnt=0;
            //boolean isContained=v.contains(analysis);
            for(int j=0;j<show.size();j++){
                Analysis a=show.get(j);
                if(analysis.getMonth()==a.getMonth() & analysis.getYear()==a.getYear()&analysis.getCategory()==a.getCategory()){
                    int pricing=a.getPrice()+analysis.getPrice();
                    a.setPrice(pricing);
                    cnt=1;
                }
            }

            if(cnt==0){
                show.add(analysis);
            }
        }

        return show;
    }
}
