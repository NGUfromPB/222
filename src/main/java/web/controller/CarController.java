package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.Carserv;
import web.service.CarservImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping(value ="/cars")
    public String print(@RequestParam(defaultValue = "5") Integer c, ModelMap  model) {
        Carserv carserv=new CarservImpl();
        List<Car> carList; {
            carList=new ArrayList<>();
            carList.add(new Car("mazda", (byte) 1,1));
            carList.add(new Car("honda", (byte) 2,2));
            carList.add(new Car("lada", (byte) 3,3));
            carList.add(new Car("mers", (byte) 4,4));
            carList.add(new Car("spogetti", (byte) 5,5));
        }
        List<Car> ans = carserv.ans(carList,c);
        model.addAttribute("cars",ans);
        return "cars";
    }
}
