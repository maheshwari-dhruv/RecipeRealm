package recipe.realm.backend.modals;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Instruction {
    private Long number;
    private String step;
}
