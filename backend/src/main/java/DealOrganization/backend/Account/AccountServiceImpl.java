package DealOrganization.backend.Account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

@Transactional
@Component
public class AccountServiceImpl implements AccountService{
    private final AccountRepository accountRepository;

    @Autowired
    public AccountServiceImpl(AccountRepository accountRepository){
        this.accountRepository=accountRepository;
    }
    @Override
    public Account findById(String id){
        Optional<Account> account=accountRepository.findById(id);
        Account account1=account.get();

        return account1;
    }
    @Override
    public void save(Account account){
        LocalDate now= LocalDate.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyyMMdd");
        int nowDay=Integer.parseInt(now.format(formatter));
        account.setDays(nowDay);
        accountRepository.save(account);
    }
    @Override
    public void save(String id,String name, int price, String platform, String seller){
        Account account=new Account();
        LocalDate now= LocalDate.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyyMMdd");
        int nowDay=Integer.parseInt(now.format(formatter));
        account.setDays(nowDay);

        account.setId(id);
        account.setName(name);
        account.setPrice(price);
        account.setPlatform(platform);
        account.setSeller(seller);
        accountRepository.save(account);
    }
    @Override
    public void save(String id,String name, int price, String seller){
        Account account=new Account();
        LocalDate now= LocalDate.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyyMMdd");
        int nowDay=Integer.parseInt(now.format(formatter));
        account.setDays(nowDay);

        account.setId(id);
        account.setName(name);
        account.setPrice(price);
        account.setPlatform("DOY");
        account.setSeller(seller);
        accountRepository.save(account);
    }

    @Override
    public List<Account> findAllAccount(String id){
        return accountRepository.findAllAccount(id);
    }
    @Override
    public void erase(String id, int cnt, int number){
        accountRepository.erase(id, cnt, number);
    }
    @Override
    public void erase(String id, int cnt, String company, int shipping){
        accountRepository.erase(id,cnt,company,shipping);
    }
}
