package DealOrganization.backend.Order;

import java.util.List;

public interface OrderService {
    void save(Ordering order);
    List<Ordering> findAllOrder(int id);
}
