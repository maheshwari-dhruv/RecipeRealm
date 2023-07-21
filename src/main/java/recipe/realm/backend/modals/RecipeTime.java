package recipe.realm.backend.modals;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RecipeTime {
    private String preparationTime;
    private String cookingTime;
    private String additionalTime;
    private String totalTime;
}
