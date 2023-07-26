package com.js9.js9petclinic.service;

import com.js9.js9petclinic.model.Owner;
import com.js9.js9petclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Set<Pet> findAll();
    void save(Pet owner);
}
