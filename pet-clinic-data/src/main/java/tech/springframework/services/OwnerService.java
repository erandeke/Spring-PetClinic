package tech.springframework.services;

import tech.springframework.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByFirstName(String firstName);

}
