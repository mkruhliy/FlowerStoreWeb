package flowershop.flowershopweb.flower;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import static flowershop.flowershopweb.flower.FlowerColor.BLUE;
import static flowershop.flowershopweb.flower.FlowerType.TULIP;

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
        List<Flower> a = flowerService.getflowers();
        System.out.println(a);
        return a;
    }

    @PostMapping
    public void addFlower(@RequestBody Flower flower) {
        flowerService.addFlower(flower);

    }
}
