package com.js9.js9petclinic.service.mapBasedServiceImpl;

import com.js9.js9petclinic.model.Pet;
import com.js9.js9petclinic.service.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetServiceImpl extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Pet save(Long aLong, Pet object) {
        return super.save(aLong, object);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet pet) {
        return super.save(pet.getId(), pet);
    }
}
