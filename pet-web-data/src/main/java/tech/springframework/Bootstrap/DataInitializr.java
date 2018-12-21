package tech.springframework.Bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import tech.springframework.model.Owner;
import tech.springframework.model.Vet;
import tech.springframework.services.OwnerService;
import tech.springframework.services.VetService;
import tech.springframework.services.mapservices.OwnerServiceMap;
import tech.springframework.services.mapservices.VetServiceMap;

@Component
public class DataInitializr implements CommandLineRunner {

    private final OwnerServiceMap ownerService;
    private final VetServiceMap vetService;

    public DataInitializr() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Kedar");
        owner1.setLastName("Erande");

        ownerService.save(1L, owner1);

        Owner owner2 = new Owner();
        owner1.setId(2L);
        owner1.setFirstName("John");
        owner1.setLastName("Thompson");

        ownerService.save(2L, owner2);

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Rgeuu");
        vet1.setLastName("ash");

        vetService.save(1L, vet1);

        Vet vet2 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("rs");
        vet1.setLastName("ash");

        vetService.save(2L, vet2);


    }
}
