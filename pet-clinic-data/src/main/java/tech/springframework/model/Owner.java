package tech.springframework.model;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Builder
public class Owner extends Person {

    private String address;

    @Builder
    public Owner(Long id, String firstName, String lastName, String address
    ) {
        super(id, firstName, lastName);
        this.address=address;


    }
}