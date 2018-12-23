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
    private String city;
    private String telephone;
    private Set<Pet> pets;

    @Builder
    public Owner(Long id, String firstName, String lastName, String address, Set<Pet>  pets,String city, String telephone
    ) {
        super(id, firstName, lastName);
        this.address=address;
        this.city=city;
        this.telephone=telephone;
        this.pets=pets;


    }
}