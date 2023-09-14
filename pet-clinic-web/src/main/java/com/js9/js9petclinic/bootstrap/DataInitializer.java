package com.js9.js9petclinic.bootstrap;

import com.js9.js9petclinic.model.Owner;
import com.js9.js9petclinic.model.Pet;
import com.js9.js9petclinic.model.PetType;
import com.js9.js9petclinic.model.Vet;
import com.js9.js9petclinic.service.OwnerService;
import com.js9.js9petclinic.service.PetTypeService;
import com.js9.js9petclinic.service.VetService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataInitializer implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    private final PetTypeService petTypeService;

    public DataInitializer(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        var cat = new PetType("Cat");
        PetType saveCatPetType = petTypeService.save(cat);
        var dog = new PetType("Dog");
        PetType savedDogPetType = petTypeService.save(dog);


        var owner1 = new Owner();
        owner1.setFirstName("Owner1");
        owner1.setLastName("Joe");
        ownerService.save(owner1);

        var owner2 = new Owner();
        owner2.setFirstName("Owner2");
        owner2.setLastName("Doe");

        ownerService.save(owner2);

        var owner3 = new Owner();
        owner3.setFirstName("Owner3");
        owner3.setLastName("Doe");

        ownerService.save(owner3);

        System.out.println("Owners Loaded.......");


        var dogPet = new Pet(savedDogPetType, owner1, LocalDate.now());


        var vet1 = new Vet();
        vet1.setFirstName("Vet1");
        vet1.setLastName("Neo");

        vetService.save(vet1);

        var vet2 = new Vet();
        vet2.setFirstName("Vet2");
        vet2.setLastName("Neo");

        vetService.save(vet2);

        var vet3 = new Vet();
        vet3.setFirstName("Vet3");
        vet3.setLastName("Neo");

        vetService.save(vet3);

        System.out.println("Vets Loaded.........");

        System.out.println("Vets.........");

        vetService.findAll().forEach(System.out::println);




    }
}
