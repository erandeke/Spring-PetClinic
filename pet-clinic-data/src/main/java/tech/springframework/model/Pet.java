package tech.springframework.model;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pet extends BaseEntity {

    private PetType petType;

    private Owner owner;

    private LocalDate birthDate;


}
