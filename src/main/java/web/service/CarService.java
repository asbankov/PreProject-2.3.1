package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    void add(String model, int productionYear, int distance);
    List<Car> carsList(int quantity);
}
