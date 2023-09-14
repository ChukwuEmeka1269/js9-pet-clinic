package com.js9.js9petclinic.service.mapBasedServiceImpl;

import com.js9.js9petclinic.model.Specialty;
import com.js9.js9petclinic.model.Vet;
import com.js9.js9petclinic.service.SpecialtyService;
import com.js9.js9petclinic.service.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMapImpl extends AbstractMapService<Vet, Long> implements VetService {
    private final SpecialtyService specialtyService;

    public VetServiceMapImpl(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Vet save(Vet vet) {
        if(vet.getSpecialties().size() > 0){
            vet.getSpecialties().forEach(specialty -> {
                if(specialty != null){
                    if(specialty.getId() == null){
                        Specialty savedSpecialty = specialtyService.save(specialty);
                        specialty.setId(savedSpecialty.getId());
                    }
                }else{
                    throw new RuntimeException("Specialty is required.");
                }
            });
            return super.save(vet);
        }else{
            return null;
        }

    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet findByLastName(String lastName) {
        return null;
    }
}
