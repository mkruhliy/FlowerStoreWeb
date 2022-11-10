package flowershop.flowershopweb.flower;


import flowershop.flowershopweb.items.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/flower")
public class FlowerController {

    @Autowired
    private final FlowerService flowerService;

    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }

    @GetMapping
    public List<Flower> getflowers() {
        return flowerService.getflowers();
    }

    @PostMapping
    public void addFlower(@RequestBody Flower flower) {
        flowerService.addFlower(flower);

    }
}
