package web.service;

import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarservImpl implements Carserv {

    @Override
    public List<Car> ans(List<Car> ans,Integer c) {
        return ans.stream().limit(c).collect(Collectors.toList());
    }
}
