package tech.springframework.services;

import tech.springframework.model.Vet;

import java.util.Set;

public interface VetService {

    Vet save(Vet vet);

    Vet findById(Long id);

    Set<Vet> findAll();
}
