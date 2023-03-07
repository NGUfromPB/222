package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.Carserv;
import web.service.CarservImpl;

import java.util.List;

@Controller
public class CarController {
    @GetMapping(value ="/cars")
    public String print(@RequestParam(defaultValue = "5") Integer c, ModelMap  model) {
        Carserv carserv=new CarservImpl();
        List<Car> ans = carserv.ans(c);
        model.addAttribute("cars",ans);
        return "cars";
    }
}
