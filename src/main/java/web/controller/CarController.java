package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.Carserv;

import java.util.List;

@Controller
public class CarController {
    @Autowired
    private Carserv carserv;
    @GetMapping(value ="/cars")
    public String print(@RequestParam(defaultValue = "5") Integer c, ModelMap  model) {
        List<Car> ans = carserv.ans(c);
        model.addAttribute("cars",ans);
        return "cars";
    }
}
