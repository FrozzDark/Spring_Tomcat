package web.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
@Repository
public class CarServiceImpl implements CarService {
    private List<Car> cars;
    private static int CARS_COUNT;

    {
        cars = new ArrayList<>();

        cars.add(new Car(++CARS_COUNT, "model1", 1, 2001));
        cars.add(new Car(++CARS_COUNT, "model2", 2, 2002));
        cars.add(new Car(++CARS_COUNT, "model3", 3, 2003));
        cars.add(new Car(++CARS_COUNT, "model4", 4, 2004));
        cars.add(new Car(++CARS_COUNT, "model5", 5, 2005));
    }

    @Override
    public List<Car> index() {
        return cars;
    }
}
