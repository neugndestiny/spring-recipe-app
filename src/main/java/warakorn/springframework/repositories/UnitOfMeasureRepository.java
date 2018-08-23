package warakorn.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import warakorn.springframework.domain.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
