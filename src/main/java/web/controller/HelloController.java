package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Hello!");
		messages.add("I'm Spring MVC application");
		messages.add("5.2.0 version by sep'19 ");
		model.addAttribute("messages", messages);
		return "index";
	}

	@GetMapping(value = "/cars")
	public String printCars(@RequestParam(defaultValue = "5") int count, ModelMap model) {
		CarService carService = new CarServiceImpl();
		carService.add("Audi", 2013, 20000);
		carService.add("Opel", 2020, 10000);
		carService.add("Volkswagen", 2010, 100000);
		carService.add("BMW", 2019, 35000);
		carService.add("Mercedes", 2020, 30000);
		List<Car> cars = carService.carsList(count);
		model.addAttribute("cars", cars);
		return "cars";
	}
}