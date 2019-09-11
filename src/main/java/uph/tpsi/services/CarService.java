package uph.tpsi.services;

import uph.tpsi.models.Car;
import uph.tpsi.models.CarType;

import java.util.List;

public interface CarService
{
        List<Car> findByUser();

        Car create(Car car);

        List<CarType> findAllCartTypes();
}
