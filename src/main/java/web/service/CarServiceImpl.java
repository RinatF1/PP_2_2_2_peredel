package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService{

    public List <Car> carListToTable(Integer count) {
         List<Car> carListToTable;

        {
            carListToTable = new ArrayList<>();

            carListToTable.add(new Car("VAZ", "white", 2110));
            carListToTable.add(new Car("BMW", "black", 5));
            carListToTable.add(new Car("GAZ", "silver", 3110));
            carListToTable.add(new Car("UAZ", "brown", 1));
            carListToTable.add(new Car("Audi", "red", 100));

            return carListToTable.stream().limit(count).collect(Collectors.toList());
        }
    }


}
