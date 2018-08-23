package warakorn.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import warakorn.springframework.domain.UnitOfMeasure;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);
}
