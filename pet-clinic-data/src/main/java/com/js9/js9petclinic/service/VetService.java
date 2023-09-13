package com.js9.js9petclinic.service;

import com.js9.js9petclinic.model.Vet;


public interface VetService extends CrudService<Vet, Long>{
    Vet findByLastName(String lastName);

}
