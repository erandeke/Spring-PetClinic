package tech.springframework.model;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Builder
public class Owner extends Person {

    private String address;
    private Set<Pet> pets;

    @Builder
    public Owner(Long id, String firstName, String lastName, String address, Set<Pet>  pets
    ) {
        super(id, firstName, lastName);
        this.address=address;
        this.pets=pets;


    }
}