package web.service;

import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarservImpl implements Carserv {

    @Override
    public List<Car> ans(Integer c) {
        List<Car> ans; {
            ans=new ArrayList<>();
            ans.add(new Car("mazda", (byte) 1,1));
            ans.add(new Car("honda", (byte) 2,2));
            ans.add(new Car("lada", (byte) 3,3));
            ans.add(new Car("mers", (byte) 4,4));
            ans.add(new Car("spogetti", (byte) 5,5));
        }
        return ans.stream().limit(c).collect(Collectors.toList());
    }
}
