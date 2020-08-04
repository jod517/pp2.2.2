package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import web.carService.CarService;

@Controller
@RequestMapping("/cars")
public class CarsController {

    @RequestMapping(method = RequestMethod.GET)
    public  String  printTable(ModelMap model) {

        model.addAttribute("cars", CarService.getListCars());
        return "cars";

    }
}
