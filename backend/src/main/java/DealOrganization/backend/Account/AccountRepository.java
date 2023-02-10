package DealOrganization.backend.Account;

import java.util.List;
import java.util.Optional;

public interface AccountRepository {
    Optional<Account> findById(String id);
    void save(Account account);
    List<Account> findAllAccount(String id);
    void erase(String id, int cnt, int number);
    void erase(String id, int cnt, String company, int shipping);


}
