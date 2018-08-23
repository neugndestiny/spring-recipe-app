package warakorn.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import warakorn.springframework.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
