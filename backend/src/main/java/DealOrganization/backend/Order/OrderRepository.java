package DealOrganization.backend.Order;

import java.util.List;
import java.util.Optional;

public interface OrderRepository {
    void save(Ordering order);
    List<Ordering> findAllOrder(int id);
}
