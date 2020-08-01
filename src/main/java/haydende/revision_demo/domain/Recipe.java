package haydende.revision_demo.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Recipe extends BaseEntity {

    private final String name;
    private final String description;
    private final String directions;
    private final int cookTime;
    private final int prepTime;
    private final int servings;
    private final Category category;

    @Builder
    public Recipe(Long id, String name, String description, String directions, int cookTime, int prepTime, int servings,
                  Category category) {
        super(id);
        this.name = name;
        this.description = description;
        this.directions = directions;
        this.cookTime = cookTime;
        this.prepTime = prepTime;
        this.servings = servings;
        this.category = category;
    }
}
