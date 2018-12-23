package tech.springframework.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Person extends BaseEntity {

    private String firstName;
    private String lastName;


    @Builder
    public Person(Long id,String firstName, String lastName) {
        super(id);
        this.firstName=firstName;
        this.lastName=lastName;


    }
}