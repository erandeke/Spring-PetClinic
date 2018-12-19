package tech.springframework.services;

import tech.springframework.model.Owner;

import java.util.Set;

public interface OwnerService {

   Owner save(Owner owner);

   Owner findById(Long id);

   Owner findByLastName(String lastName);

   Owner findByFirstName(String firstName);

   Set<Owner> findAllOwners();

}
