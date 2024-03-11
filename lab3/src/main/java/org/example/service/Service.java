package org.example.service;

import org.example.models.Car;
import org.example.repositories.CarRepository;

import java.util.ArrayList;
import java.util.List;

public class Service {
    CarRepository carRepo;

    public Service(CarRepository carRepo) {
        this.carRepo = carRepo;
    }

    public void addCar(String manufacturer, String model, int year) {
        carRepo.add(new Car(manufacturer, model, year));
    }

    public void updateCar(int id, String manufacturer, String model, int year) {
        Car car = new Car(manufacturer, model, year);
        carRepo.update(id, car);
    }
    public ArrayList<Car> findAllCars() {
        return (ArrayList<Car>) carRepo.findAll();
    }
}
