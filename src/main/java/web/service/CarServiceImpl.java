package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
    private final List<Car> carsList;

    {
        carsList = new ArrayList<>();

        carsList.add(new Car("Model-A", "lux", 2022));
        carsList.add(new Car("Model-B", "sunny", 2023));
        carsList.add(new Car("Model-C", "prelim", 2024));
        carsList.add(new Car("Model-D", "top", 2025));
        carsList.add(new Car("Model-E", "sky", 2026));
    }


    @Override
    public List<Car> getCarByCount(int count) {
        if (count > 0 && count < 5) {
            return carsList.stream().limit(count).toList();
        }
        return carsList;
    }

}
