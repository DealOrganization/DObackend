package DealOrganization.backend.Order;

import DealOrganization.backend.Member.Member;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/order")
public class OrderController {
    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("")
    public void join(@RequestBody Ordering order){
        orderService.save(order);
    }

    @GetMapping("")
    public List<Ordering> findAllOrder(int id){
        return orderService.findAllOrder(id);
    }


}
