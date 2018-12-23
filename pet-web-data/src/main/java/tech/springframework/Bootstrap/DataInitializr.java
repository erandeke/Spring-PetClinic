package tech.springframework.Bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import tech.springframework.model.Owner;
import tech.springframework.model.Vet;
import tech.springframework.services.OwnerService;
import tech.springframework.services.VetService;


@Component
public class DataInitializr implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    @Autowired
    public DataInitializr(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }


    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Kedar");
        owner1.setLastName("Erande");

        ownerService.save(1L, owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("John");
        owner2.setLastName("Thompson");

        ownerService.save(2L, owner2);

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Rgeuu");
        vet1.setLastName("ash");

        vetService.save(1L, vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("rs");
        vet2.setLastName("ash");

        vetService.save(2L, vet2);




    }
}
