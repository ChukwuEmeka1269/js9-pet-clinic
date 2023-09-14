package com.js9.js9petclinic.service.mapBasedServiceImpl;

import com.js9.js9petclinic.model.Owner;
import com.js9.js9petclinic.model.Pet;
import com.js9.js9petclinic.service.OwnerService;
import com.js9.js9petclinic.service.PetService;
import com.js9.js9petclinic.service.PetTypeService;
import org.springframework.stereotype.Service;


import java.util.Set;

@Service
public class OwnerServiceMapImpl extends AbstractMapService<Owner, Long> implements OwnerService {

    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerServiceMapImpl(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }

    @Override
    public Owner save(Owner owner) {
        if(owner != null){
            owner.getPets().forEach(pet -> {
                if(pet.getPetType() != null){
                    if(pet.getPetType().getId() == null){
                        pet.setPetType(petTypeService.save(pet.getPetType()));
                    }
                }else{
                    throw new RuntimeException("Pet Type is required");
                }

                if(pet.getId() == null){
                    Pet savedPet = petService.save(pet);
                    pet.setId(savedPet.getId());
                }
            });

            return super.save(owner);
        }else{
            return null;
        }

    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
