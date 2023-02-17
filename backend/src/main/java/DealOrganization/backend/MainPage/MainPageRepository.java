package DealOrganization.backend.MainPage;

import DealOrganization.backend.Deal.Deal;
import DealOrganization.backend.Deal.DealRepository;
import DealOrganization.backend.Member.MemberRepository;
import DealOrganization.backend.Receipt.Receipt;
import DealOrganization.backend.Receipt.ReceiptRepository;
import org.jboss.jandex.Main;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class MainPageRepository {
    private DealRepository dealRepository;
    private ReceiptRepository receiptRepository;
    private final EntityManager em;
    public MainPageRepository(EntityManager em, DealRepository dealRepository, ReceiptRepository receiptRepository){
        this.em=em;
        this.dealRepository=dealRepository;
        this.receiptRepository=receiptRepository;
    }
    //최근 올라온 거래 내역
    public List<MainPage> getLatestMain(){
        List<Deal> check=em.createQuery("select v from Deal v where state=0",Deal.class).getResultList();
        int size=check.size();
        List<MainPage> show=new ArrayList<>();
        for(int i=0;i<size;i++){
            MainPage main=new MainPage();
            Deal deal=check.get(i);

            main.setName(deal.getMember_id());
            main.setPrice(deal.getPrice());
            main.setTitle(deal.getTitle());

            show.add(main);
        }

        List<MainPage> latest = new ArrayList<>();
        for(int i=show.size()-1;i>=0;i--)
            latest.add(show.get(i));
        return latest;
    }
    //카테고리 별 거래 내역
    public List<MainPage> getCategory(int cnt){
        List<Deal> check=em.createQuery("select v from Deal v where v.state=0 and v.category=:category",Deal.class)
                .setParameter("category",cnt)
                .getResultList();
        int size=check.size();
        List<MainPage> show=new ArrayList<>();
        for(int i=0;i<size;i++){
            MainPage main=new MainPage();
            Deal deal=check.get(i);

            main.setName(deal.getMember_id());
            main.setPrice(deal.getPrice());
            main.setTitle(deal.getTitle());

            show.add(main);
        }
        return show;
    }
    //내가 팔고 있는 거래 내역
    public List<MainPage> getMyDeal(String id){
        List<Deal> check=em.createQuery("select v from Deal v where v.state=0 and v.member_id=:member_id",Deal.class)
                .setParameter("member_id",id)
                .getResultList();
        int size=check.size();
        List<MainPage> show=new ArrayList<>();
        for(int i=0;i<size;i++){
            MainPage main=new MainPage();
            Deal deal=check.get(i);

            main.setName(deal.getMember_id());
            main.setPrice(deal.getPrice());
            main.setTitle(deal.getTitle());

            show.add(main);
        }
        return show;
    }
    //내가 산 거래 내역
    public List<MainPage> getYourDeal(String id){
        List<Receipt> check=em.createQuery("select v from Receipt v where v.seller_id=:buyer_id", Receipt.class)
                .setParameter("buyer_id",id)
                .getResultList();
        int size=check.size();
        List<MainPage> show=new ArrayList<>();
        for(int i=0;i<size;i++){
            MainPage main=new MainPage();
            Receipt receipt=check.get(i);
            Deal deal=dealRepository.findById(receipt.getDeal_id()).get();

            main.setName(deal.getMember_id());
            main.setPrice(deal.getPrice());
            main.setTitle(deal.getTitle());

            show.add(main);
        }
        return show;
    }
    //검색 페이지
    public List<MainPage> getSearch(String text){
        List<Deal> check=em.createQuery("select v from Deal v where state=0",Deal.class).getResultList();
        List<Deal> confirm=new ArrayList<>();
        for(int i=0;i<check.size();i++){
            if(check.get(i).getTitle().contains(text)){
                confirm.add(check.get(i));
            }
        }
        int size=confirm.size();
        List<MainPage> show=new ArrayList<>();
        for(int i=0;i<size;i++){
            MainPage main=new MainPage();
            Deal deal=confirm.get(i);

            main.setName(deal.getMember_id());
            main.setPrice(deal.getPrice());
            main.setTitle(deal.getTitle());

            show.add(main);
        }
        return show;
    }

}
