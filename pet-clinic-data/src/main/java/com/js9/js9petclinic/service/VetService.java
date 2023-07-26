package com.js9.js9petclinic.service;

import com.js9.js9petclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Set<Vet> findAll();
    Vet findByLastName(String lastName);
    void save(Vet owner);
}
