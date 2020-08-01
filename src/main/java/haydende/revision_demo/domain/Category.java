package haydende.revision_demo.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class Category extends BaseEntity {

    private final String name;
    private Set<Recipe> recipes = new HashSet<>();

    @Builder
    public Category(Long id, String name, Set<Recipe> recipes) {
        super(id);
        this.name = name;
        this.recipes = recipes;
    }

    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }
}
