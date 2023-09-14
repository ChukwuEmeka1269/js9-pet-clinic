package com.js9.js9petclinic.service.mapBasedServiceImpl;

import com.js9.js9petclinic.model.Specialty;
import com.js9.js9petclinic.service.SpecialtyService;
import org.springframework.stereotype.Service;

import java.util.Set;


@Service
public class SpecialtyServiceImpl extends AbstractMapService<Specialty, Long> implements SpecialtyService {
    @Override
    public Set<Specialty> findAll() {
        return super.findAll();
    }

    @Override
    public Specialty findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Specialty save(Specialty object) {
        return super.save(object);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public void delete(Specialty object) {
        super.delete(object);
    }
}
