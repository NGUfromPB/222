package web.service;

import org.springframework.stereotype.Component;

import web.models.Car;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarservImpl implements Carserv {
    public CarservImpl() {

    }
    @Override
    public List<Car> ans(Integer c) {
        List<Car> carList; {
            carList=new ArrayList<>();
            carList.add(new Car("mazda", (byte) 1,1));
            carList.add(new Car("honda", (byte) 2,2));
            carList.add(new Car("lada", (byte) 3,3));
            carList.add(new Car("mers", (byte) 4,4));
            carList.add(new Car("spogetti", (byte) 5,5));
        }
        return carList.stream().limit(c).collect(Collectors.toList());
    }
}
