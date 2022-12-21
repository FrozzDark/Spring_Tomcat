package web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.services.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarsController {

    private final CarService carService;
    private List<Car> cars;

    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping()
    public String index(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        cars = new ArrayList<>();
        if (count >= 5) {
            model.addAttribute("cars", carService.index());
        } else {
            for (int i = 0; i<count;i++) {
                cars.add(carService.index().get(i));
            }
            model.addAttribute("cars", cars);
        }
        return "cars";
    }
}
