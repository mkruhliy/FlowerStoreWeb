package flowershop.flowershopweb.flower;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("api/v1/flower")
public class FlowerController {

    private final FlowerService flowerService;

    @Autowired
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
