package tech.springframework.model;

import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Builder
public class Vet extends Person {

    private Set<Speciality> speciality;

}
