package DealOrganization.backend.Account;

import java.util.List;
import java.util.Optional;

public interface AccountService  {
    Account findById(String id);
    void save(Account account);
    void save(String id,String name, int price, String platform, String seller);
    void save(String id,String name, int price, String seller);

    List<Account> findAllAccount(String id);
    void erase(String id, int cnt, int number);
    void erase(String id, int cnt, String company, int shipping);
}
