package com.js9.js9petclinic.bootstrap;

import com.js9.js9petclinic.model.Owner;
import com.js9.js9petclinic.model.Vet;
import com.js9.js9petclinic.service.OwnerService;
import com.js9.js9petclinic.service.VetService;
import com.js9.js9petclinic.service.mapBasedServiceImpl.OwnerServiceMapImpl;
import com.js9.js9petclinic.service.mapBasedServiceImpl.VetServiceMapImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataInitializer() {
        this.ownerService = new OwnerServiceMapImpl();
        this.vetService = new VetServiceMapImpl();
    }

    @Override
    public void run(String... args) throws Exception {
        var owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Owner1");
        owner1.setLastName("Joe");

        ownerService.save(owner1);

        var owner2 = new Owner();
        owner2.setId(1L);
        owner2.setFirstName("Owner2");
        owner2.setLastName("Doe");

        ownerService.save(owner2);

        var owner3 = new Owner();
        owner3.setId(1L);
        owner3.setFirstName("Owner3");
        owner3.setLastName("Doe");

        ownerService.save(owner3);

        System.out.println("Owners Loaded.......");


        var vet1 = new Vet();
        vet1.setFirstName("Vet1");
        vet1.setLastName("Neo");
        vet1.setId(1L);

        vetService.save(vet1);

        var vet2 = new Vet();
        vet2.setFirstName("Vet2");
        vet2.setLastName("Neo");
        vet2.setId(1L);

        vetService.save(vet2);

        var vet3 = new Vet();
        vet3.setFirstName("Vet3");
        vet3.setLastName("Neo");
        vet3.setId(1L);

        vetService.save(vet3);

        System.out.println("Vets Loaded.........");




    }
}
