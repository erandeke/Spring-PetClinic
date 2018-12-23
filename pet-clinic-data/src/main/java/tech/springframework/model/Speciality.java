package tech.springframework.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Speciality extends  BaseEntity {

    private String description;


}
