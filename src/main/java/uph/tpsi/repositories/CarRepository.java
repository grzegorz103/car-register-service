package uph.tpsi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import uph.tpsi.models.Car;

public interface CarRepository extends JpaRepository<Car, Long>
{
}
