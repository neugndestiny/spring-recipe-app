package warakorn.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import warakorn.springframework.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
