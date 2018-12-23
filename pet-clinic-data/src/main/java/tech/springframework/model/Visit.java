package tech.springframework.model;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Visit extends BaseEntity {

    private LocalDate date;
    private String description;
    private Pet pet;
}
