package DealOrganization.backend.Order;

import DealOrganization.backend.Deal.DealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Component
public class OrderServiceImpl implements OrderService{
    private final OrderRepository orderRepository;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository=orderRepository;
    }

    @Override
    public void save(Ordering order){
        orderRepository.save(order);
    }
    @Override
    public List<Ordering> findAllOrder(int id){
        return orderRepository.findAllOrder(id);
    }
}
