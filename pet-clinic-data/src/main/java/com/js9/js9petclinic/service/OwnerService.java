package com.js9.js9petclinic.service;

import com.js9.js9petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);

}
