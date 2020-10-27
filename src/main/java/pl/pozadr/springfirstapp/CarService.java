package pl.pozadr.springfirstapp;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private final List<Car> carList;

    public CarService() {
        carList = new ArrayList<>();
        carList.add(new Car("BMW", "i8"));
        carList.add(new Car("Fiat", "126p"));
        carList.add(new Car("Polonez", "Caro"));
    }

    public List<Car> getCars() {
        return carList;
    }
}
