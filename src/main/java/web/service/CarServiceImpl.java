package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService{

    public List <Car> carList(Integer count) {
         List<Car> carList;

        {
            carList = new ArrayList<>();

            carList.add(new Car("VAZ", "white", 2110));
            carList.add(new Car("BMW", "black", 5));
            carList.add(new Car("GAZ", "silver", 3110));
            carList.add(new Car("UAZ", "brown", 1));
            carList.add(new Car("Audi", "red", 100));

            return carList.stream().limit(count).collect(Collectors.toList());
        }
    }


}
