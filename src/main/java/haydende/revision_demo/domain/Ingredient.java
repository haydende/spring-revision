package haydende.revision_demo.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ingredient extends BaseEntity {

    private final String name;
    private final Integer amount;
    private final Unit uom;

    @Builder
    public Ingredient(Long id, String name, Integer amount, Unit uom) {
        super(id);
        this.name = name;
        this.amount = amount;
        this.uom = uom;
    }
}
