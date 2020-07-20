package web.CarService;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.LinkedList;
import java.util.List;

@Service
public class CarService {


    public static List<Car> getListCars() {
        List<Car> listCar = new LinkedList<>();
        listCar.add(new Car(1, "Lodan", 3));
        listCar.add(new Car(2, "Calina", 4));
        listCar.add(new Car(3, "ModelX", 7));

        return listCar;
    }
}
