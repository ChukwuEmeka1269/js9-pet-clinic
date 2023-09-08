package com.js9.js9petclinic.service.mapBasedServiceImpl;

import com.js9.js9petclinic.model.Owner;
import com.js9.js9petclinic.service.OwnerService;
import org.springframework.stereotype.Service;


import java.util.Set;

@Service
public class OwnerServiceMapImpl extends AbstractMapService<Owner, Long> implements OwnerService {

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
        return super.save(owner.getId(), owner);
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
