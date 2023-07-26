package com.js9.js9petclinic.service;

import com.js9.js9petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findById(Long id);
    Set<Owner> findAll();
    Owner findByLastName(String lastName);
    void save(Owner owner);
}
