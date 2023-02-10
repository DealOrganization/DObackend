package DealOrganization.backend;

import DealOrganization.backend.Account.Account;
import DealOrganization.backend.Account.AccountService;
import DealOrganization.backend.Account.AccountServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class saveTest {
    AccountService accountService;

    @Test
    void join(){//findById
        accountService.save("two","안경",20000,"빨리판매");
//        Account account=accountService.findById("two");
//
//        Assertions.assertThat(account.getPlatform()).isEqualTo("DOY");
    }
}
