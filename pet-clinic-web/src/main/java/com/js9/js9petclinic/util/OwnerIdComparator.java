package com.js9.js9petclinic.util;

import com.js9.js9petclinic.model.Owner;

import java.util.Comparator;

public class OwnerIdComparator implements Comparator<Owner> {
    @Override
    public int compare(Owner o1, Owner o2) {
        return Long.compare(o1.getId(), o2.getId());
    }
}
