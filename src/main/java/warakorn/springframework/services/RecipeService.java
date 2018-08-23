package warakorn.springframework.services;

import warakorn.springframework.domain.Recipe;

import java.util.Set;

public interface RecipeService  {
    Set<Recipe> getRecipes();
}
