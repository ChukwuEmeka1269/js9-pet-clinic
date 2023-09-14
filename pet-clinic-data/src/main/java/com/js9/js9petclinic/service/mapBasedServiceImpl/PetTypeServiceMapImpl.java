package com.js9.js9petclinic.service.mapBasedServiceImpl;

import com.js9.js9petclinic.model.PetType;
import com.js9.js9petclinic.service.PetTypeService;

import java.util.Set;

public class PetTypeServiceMapImpl extends AbstractMapService<PetType, Long> implements PetTypeService {
    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public PetType findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }
}
