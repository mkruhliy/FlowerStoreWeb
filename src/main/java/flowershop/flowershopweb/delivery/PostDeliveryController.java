package flowershop.flowershopweb.delivery;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/pdelivery")
public class PostDeliveryController {
    @GetMapping
    public String getDelivery() {
        return "Post delivery";
    }
}