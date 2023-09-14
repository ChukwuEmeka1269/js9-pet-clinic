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
import java.util.List;

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
        owner1.setAddress("address for owner1");
        owner1.setCity("City for owner1");
        owner1.setPhone("09087654324");
        var owner1DogPet = new Pet("Rosco",savedDogPetType, owner1, LocalDate.now());
        var owner1CatPet = new Pet("Ruby", saveCatPetType, owner1, LocalDate.now());
        owner1.getPets().addAll(List.of(owner1DogPet, owner1CatPet));
        ownerService.save(owner1);

        var owner2 = new Owner();
        owner2.setFirstName("Owner2");
        owner2.setLastName("Doe");
        owner2.setAddress("Address for Owner2");
        owner2.setCity("City for owner2");
        owner2.setPhone("0123567489");

        var owner2DogPet = new Pet("Turbo", savedDogPetType, owner2, LocalDate.now());
        var owner2CatPet = new Pet("Melanine", saveCatPetType, owner2, LocalDate.now());
        owner2.getPets().addAll(List.of(owner2DogPet,owner2CatPet));

        ownerService.save(owner2);

        var owner3 = new Owner();
        owner3.setFirstName("Owner3");
        owner3.setLastName("Doe");
        owner3.setAddress("Address for Owner3");
        owner3.setCity("City for Owner3");
        owner3.setPhone("234709856738");

        var owner3DogPet = new Pet("Spike", savedDogPetType, owner3, LocalDate.now());
        var owner3CatPet = new Pet("Fluffy", saveCatPetType, owner3, LocalDate.now());

        owner3.getPets().addAll(List.of(owner3DogPet, owner3CatPet));

        ownerService.save(owner3);

        System.out.println("Owners Loaded.......");

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
