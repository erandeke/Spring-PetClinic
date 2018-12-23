package tech.springframework.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PetType extends BaseEntity {

    private String name;

}
