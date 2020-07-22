package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import web.CarService.CarService;
import web.model.Car;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarsController {

    @RequestMapping(method = RequestMethod.GET)
    public  String  printTable(ModelMap model) {

        model.addAttribute("cars", CarService.getListCars());
        return "cars";

    }
}
