package uph.tpsi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import uph.tpsi.models.CarType;

public interface CarTypeRepository extends JpaRepository<CarType, Long>
{
}
