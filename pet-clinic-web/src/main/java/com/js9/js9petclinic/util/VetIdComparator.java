package com.js9.js9petclinic.util;

import com.js9.js9petclinic.model.Vet;
import org.springframework.stereotype.Component;

import java.util.Comparator;

@Component
public class VetIdComparator implements Comparator<Vet> {
    @Override
    public int compare(Vet o1, Vet o2) {
        return Long.compare(o1.getId(), o2.getId());
    }
}
