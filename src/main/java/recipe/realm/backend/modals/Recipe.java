package recipe.realm.backend.modals;

import lombok.*;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Recipe {
    // description
    private UUID recipeId;
    private String recipeName;
    private String imageURL;
    private String summary;
    private String sourceName;

    // time
    private RecipeTime recipeTime;

    // dish type
    private List<DishType> dishTypeList;

    // instructions
    private List<Instruction> intructionList;

    // ingredients
    private List<Ingredient> ingredientList;

    // equipments
    private List<Equipment> equipmentList;
}
