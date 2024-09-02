package web.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;
import web.Services.CarService;
import web.models.Car;

@Controller
public class CarController {
  final CarService carService;

  public CarController(CarService carService) {
    this.carService = carService;
  }

  @GetMapping(value = "/cars")
  public String printCars(ModelMap model, @RequestParam(value = "count", defaultValue = "5") int count) {
    List<Car> cars = new ArrayList<>(carService.getCars(count));
    model.addAttribute("showcars", cars);
    return "cars";
  }
}


