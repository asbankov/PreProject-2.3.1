package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService{

    List<Car> cars = new ArrayList<>();

    @Override
    public void add(String model, int productionYear, int distance) {
        cars.add(new Car(model, productionYear, distance));
    }

    @Override
    public List<Car> carsList(int quantity) {
        return cars.subList(0, Math.min(quantity, cars.size()));
    }
}
