package web.service;


import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
    public List<Car> cars;

    @Override
    public List<Car> getCars(int count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Tesla", "Silver"));
        cars.add(new Car("Lada", "Eggplant"));
        cars.add(new Car("Volkswagen", "Yellow"));
        cars.add(new Car("Ferrari","Red"));
        cars.add(new Car("Lexus","White"));
        if (count >= 5) {
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }
}
